package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

final class Yma extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f9488a = new int[1];

    /* renamed from: b  reason: collision with root package name */
    private Handler f9489b;

    /* renamed from: c  reason: collision with root package name */
    private SurfaceTexture f9490c;

    /* renamed from: d  reason: collision with root package name */
    private Error f9491d;

    /* renamed from: e  reason: collision with root package name */
    private RuntimeException f9492e;

    /* renamed from: f  reason: collision with root package name */
    private Wma f9493f;

    public Yma() {
        super("dummySurface");
    }

    public final Wma a(boolean z) {
        boolean z2;
        start();
        this.f9489b = new Handler(getLooper(), this);
        synchronized (this) {
            z2 = false;
            this.f9489b.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            while (this.f9493f == null && this.f9492e == null && this.f9491d == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f9492e;
        if (runtimeException == null) {
            Error error = this.f9491d;
            if (error == null) {
                return this.f9493f;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void a() {
        this.f9489b.sendEmptyMessage(3);
    }

    public final boolean handleMessage(Message message) {
        Message message2 = message;
        int i = message2.what;
        if (i == 1) {
            try {
                boolean z = message2.arg1 != 0;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                Cma.b(eglGetDisplay != null, "eglGetDisplay failed");
                int[] iArr = new int[2];
                Cma.b(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                EGLConfig[] eGLConfigArr2 = eGLConfigArr;
                Cma.b(EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr2[0] != null, "eglChooseConfig failed");
                EGLConfig eGLConfig = eGLConfigArr2[0];
                EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, z ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
                Cma.b(eglCreateContext != null, "eglCreateContext failed");
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, z ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                Cma.b(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                Cma.b(EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
                GLES20.glGenTextures(1, this.f9488a, 0);
                this.f9490c = new SurfaceTexture(this.f9488a[0]);
                this.f9490c.setOnFrameAvailableListener(this);
                this.f9493f = new Wma(this, this.f9490c, z);
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e2) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                this.f9492e = e2;
                synchronized (this) {
                    notify();
                }
            } catch (Error e3) {
                try {
                    Log.e("DummySurface", "Failed to initialize dummy surface", e3);
                    this.f9491d = e3;
                    synchronized (this) {
                        notify();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            }
            return true;
        } else if (i == 2) {
            this.f9490c.updateTexImage();
            return true;
        } else if (i != 3) {
            return true;
        } else {
            try {
                this.f9490c.release();
                this.f9493f = null;
                this.f9490c = null;
                GLES20.glDeleteTextures(1, this.f9488a, 0);
            } catch (Throwable th2) {
                try {
                    Log.e("DummySurface", "Failed to release dummy surface", th2);
                } catch (Throwable th3) {
                    quit();
                    throw th3;
                }
            }
            quit();
            return true;
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f9489b.sendEmptyMessage(2);
    }
}
