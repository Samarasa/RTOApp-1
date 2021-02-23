package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.google.android.gms.internal.ads.Ul  reason: case insensitive filesystem */
final class C1097Ul implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    private final SensorManager f8934a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f8935b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Display f8936c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f8937d = new float[9];

    /* renamed from: e  reason: collision with root package name */
    private final float[] f8938e = new float[9];

    /* renamed from: f  reason: collision with root package name */
    private float[] f8939f;

    /* renamed from: g  reason: collision with root package name */
    private Handler f8940g;

    /* renamed from: h  reason: collision with root package name */
    private C1149Wl f8941h;

    C1097Ul(Context context) {
        this.f8934a = (SensorManager) context.getSystemService("sensor");
        this.f8936c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    private final void a(int i, int i2) {
        float[] fArr = this.f8938e;
        float f2 = fArr[i];
        fArr[i] = fArr[i2];
        fArr[i2] = f2;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.f8940g == null) {
            Sensor defaultSensor = this.f8934a.getDefaultSensor(11);
            if (defaultSensor == null) {
                C1018Rk.b("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            this.f8940g = new DW(handlerThread.getLooper());
            if (!this.f8934a.registerListener(this, defaultSensor, 0, this.f8940g)) {
                C1018Rk.b("SensorManager.registerListener failed.");
                b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(C1149Wl wl) {
        this.f8941h = wl;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(float[] fArr) {
        synchronized (this.f8935b) {
            if (this.f8939f == null) {
                return false;
            }
            System.arraycopy(this.f8939f, 0, fArr, 0, this.f8939f.length);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.f8940g != null) {
            this.f8934a.unregisterListener(this);
            this.f8940g.post(new C1071Tl(this));
            this.f8940g = null;
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f8935b) {
                if (this.f8939f == null) {
                    this.f8939f = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.f8937d, fArr);
            int rotation = this.f8936c.getRotation();
            if (rotation == 1) {
                SensorManager.remapCoordinateSystem(this.f8937d, 2, 129, this.f8938e);
            } else if (rotation == 2) {
                SensorManager.remapCoordinateSystem(this.f8937d, 129, 130, this.f8938e);
            } else if (rotation != 3) {
                System.arraycopy(this.f8937d, 0, this.f8938e, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(this.f8937d, 130, 1, this.f8938e);
            }
            a(1, 3);
            a(2, 6);
            a(5, 7);
            synchronized (this.f8935b) {
                System.arraycopy(this.f8938e, 0, this.f8939f, 0, 9);
            }
            C1149Wl wl = this.f8941h;
            if (wl != null) {
                wl.a();
            }
        }
    }
}
