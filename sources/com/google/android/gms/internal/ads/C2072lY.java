package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.C1766hB;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.lY  reason: case insensitive filesystem */
public abstract class C2072lY implements HW {

    /* renamed from: a  reason: collision with root package name */
    protected static volatile C2869wha f11188a;

    /* renamed from: b  reason: collision with root package name */
    protected MotionEvent f11189b;

    /* renamed from: c  reason: collision with root package name */
    protected LinkedList<MotionEvent> f11190c = new LinkedList<>();

    /* renamed from: d  reason: collision with root package name */
    protected long f11191d = 0;

    /* renamed from: e  reason: collision with root package name */
    protected long f11192e = 0;

    /* renamed from: f  reason: collision with root package name */
    protected long f11193f = 0;

    /* renamed from: g  reason: collision with root package name */
    protected long f11194g = 0;

    /* renamed from: h  reason: collision with root package name */
    protected long f11195h = 0;
    protected long i = 0;
    protected long j = 0;
    protected double k;
    private double l;
    private double m;
    protected float n;
    protected float o;
    protected float p;
    protected float q;
    private boolean r = false;
    protected boolean s = false;
    protected DisplayMetrics t;

    protected C2072lY(Context context) {
        try {
            if (((Boolean) Qqa.e().a(F.Ob)).booleanValue()) {
                C2767vK.a();
            } else {
                C3082zha.a(f11188a);
            }
            this.t = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    private final String a(Context context, String str, int i2, View view, Activity activity, byte[] bArr) {
        String str2;
        HV hv;
        int i3;
        Context context2 = context;
        int i4 = i2;
        View view2 = view;
        Activity activity2 = activity;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) Qqa.e().a(F.Eb)).booleanValue();
        C1766hB.a aVar = null;
        if (booleanValue) {
            hv = f11188a != null ? f11188a.j() : null;
            str2 = ((Boolean) Qqa.e().a(F.Ob)).booleanValue() ? "be" : "te";
        } else {
            hv = null;
            str2 = null;
        }
        try {
            if (i4 == VJ.f9031g) {
                aVar = c(context2, view2, activity2);
                this.r = true;
                i3 = 1002;
            } else if (i4 == VJ.f9030f) {
                aVar = b(context2, view2, activity2);
                i3 = 1008;
            } else {
                aVar = a(context2, (C0615Bx) null);
                i3 = 1000;
            }
            if (booleanValue && hv != null) {
                hv.a(i3, -1, System.currentTimeMillis() - currentTimeMillis, str2);
            }
        } catch (Exception e2) {
            Exception exc = e2;
            if (booleanValue && hv != null) {
                hv.a(i4 == VJ.f9031g ? 1003 : i4 == VJ.f9030f ? 1009 : i4 == VJ.f9029e ? 1001 : -1, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (aVar != null) {
            try {
                if (((C1766hB) ((C2934xea) aVar.k())).c() != 0) {
                    String a2 = C2767vK.a((C1766hB) ((C2934xea) aVar.k()), str);
                    if (!booleanValue || hv == null) {
                        return a2;
                    }
                    hv.a(i4 == VJ.f9031g ? 1006 : i4 == VJ.f9030f ? 1010 : i4 == VJ.f9029e ? 1004 : -1, -1, System.currentTimeMillis() - currentTimeMillis2, str2);
                    return a2;
                }
            } catch (Exception e3) {
                Exception exc2 = e3;
                String num = Integer.toString(7);
                if (!booleanValue || hv == null) {
                    return num;
                }
                hv.a(i4 == VJ.f9031g ? 1007 : i4 == VJ.f9030f ? 1011 : i4 == VJ.f9029e ? 1005 : -1, -1, System.currentTimeMillis() - currentTimeMillis2, str2, exc2);
                return num;
            }
        }
        return Integer.toString(5);
    }

    private final void a() {
        this.f11195h = 0;
        this.f11191d = 0;
        this.f11192e = 0;
        this.f11193f = 0;
        this.f11194g = 0;
        this.i = 0;
        this.j = 0;
        if (this.f11190c.size() > 0) {
            Iterator it = this.f11190c.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f11190c.clear();
        } else {
            MotionEvent motionEvent = this.f11189b;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.f11189b = null;
    }

    /* access modifiers changed from: protected */
    public abstract long a(StackTraceElement[] stackTraceElementArr);

    /* access modifiers changed from: protected */
    public abstract C1766hB.a a(Context context, C0615Bx bx);

    public String a(Context context) {
        if (!Bha.a()) {
            return a(context, (String) null, VJ.f9029e, (View) null, (Activity) null, (byte[]) null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    public String a(Context context, View view, Activity activity) {
        return a(context, (String) null, VJ.f9030f, view, activity, (byte[]) null);
    }

    public final String a(Context context, String str, View view) {
        return a(context, str, view, (Activity) null);
    }

    public String a(Context context, String str, View view, Activity activity) {
        return a(context, str, VJ.f9031g, view, activity, (byte[]) null);
    }

    public void a(int i2, int i3, int i4) {
        MotionEvent motionEvent;
        if (this.f11189b != null) {
            if (((Boolean) Qqa.e().a(F.Cb)).booleanValue()) {
                a();
            } else {
                this.f11189b.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.t;
        if (displayMetrics != null) {
            float f2 = displayMetrics.density;
            motionEvent = MotionEvent.obtain(0, (long) i4, 1, ((float) i2) * f2, ((float) i3) * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            motionEvent = null;
        }
        this.f11189b = motionEvent;
        this.s = false;
    }

    public void a(MotionEvent motionEvent) {
        boolean z = false;
        if (this.r) {
            a();
            this.r = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.k = 0.0d;
            this.l = (double) motionEvent.getRawX();
            this.m = (double) motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = (double) motionEvent.getRawX();
            double rawY = (double) motionEvent.getRawY();
            double d2 = this.l;
            Double.isNaN(rawX);
            double d3 = rawX - d2;
            double d4 = this.m;
            Double.isNaN(rawY);
            double d5 = rawY - d4;
            this.k += Math.sqrt((d3 * d3) + (d5 * d5));
            this.l = rawX;
            this.m = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            this.n = motionEvent.getX();
            this.o = motionEvent.getY();
            this.p = motionEvent.getRawX();
            this.q = motionEvent.getRawY();
            this.f11191d++;
        } else if (action2 == 1) {
            this.f11189b = MotionEvent.obtain(motionEvent);
            this.f11190c.add(this.f11189b);
            if (this.f11190c.size() > 6) {
                this.f11190c.remove().recycle();
            }
            this.f11193f++;
            this.f11195h = a(new Throwable().getStackTrace());
        } else if (action2 == 2) {
            this.f11192e += (long) (motionEvent.getHistorySize() + 1);
            try {
                Cha b2 = b(motionEvent);
                if ((b2 == null || b2.f6446e == null || b2.f6449h == null) ? false : true) {
                    this.i += b2.f6446e.longValue() + b2.f6449h.longValue();
                }
                if (!(this.t == null || b2 == null || b2.f6447f == null || b2.i == null)) {
                    z = true;
                }
                if (z) {
                    this.j += b2.f6447f.longValue() + b2.i.longValue();
                }
            } catch (C2302oha unused) {
            }
        } else if (action2 == 3) {
            this.f11194g++;
        }
        this.s = true;
    }

    /* access modifiers changed from: protected */
    public abstract Cha b(MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    public abstract C1766hB.a b(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    public abstract C1766hB.a c(Context context, View view, Activity activity);
}
