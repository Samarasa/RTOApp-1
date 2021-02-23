package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.C0758Hk;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.C1200Yk;
import com.google.android.gms.internal.ads.C1252_k;
import com.google.android.gms.internal.ads.C2434qca;
import com.google.android.gms.internal.ads.F;
import com.google.android.gms.internal.ads.FT;
import com.google.android.gms.internal.ads.HW;
import com.google.android.gms.internal.ads.Qqa;
import com.google.android.gms.internal.ads.VJ;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public final class f implements HW, Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final List<Object[]> f5448a = new Vector();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<HW> f5449b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<HW> f5450c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private final int f5451d;

    /* renamed from: e  reason: collision with root package name */
    private Context f5452e;

    /* renamed from: f  reason: collision with root package name */
    private C1200Yk f5453f;

    /* renamed from: g  reason: collision with root package name */
    private CountDownLatch f5454g = new CountDownLatch(1);

    public f(Context context, C1200Yk yk) {
        this.f5452e = context;
        this.f5453f = yk;
        int intValue = ((Integer) Qqa.e().a(F.Bb)).intValue();
        this.f5451d = intValue != 1 ? intValue != 2 ? VJ.f9025a : VJ.f9027c : VJ.f9026b;
        if (!((Boolean) Qqa.e().a(F.Qb)).booleanValue()) {
            Qqa.a();
            if (!C0758Hk.b()) {
                run();
                return;
            }
        }
        C1252_k.f9699a.execute(this);
    }

    private final HW a() {
        return (this.f5451d == VJ.f9026b ? this.f5450c : this.f5449b).get();
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private final boolean b() {
        try {
            this.f5454g.await();
            return true;
        } catch (InterruptedException e2) {
            C1018Rk.c("Interrupted during GADSignals creation.", e2);
            return false;
        }
    }

    private final void c() {
        HW a2 = a();
        if (!this.f5448a.isEmpty() && a2 != null) {
            for (Object[] next : this.f5448a) {
                if (next.length == 1) {
                    a2.a((MotionEvent) next[0]);
                } else if (next.length == 3) {
                    a2.a(((Integer) next[0]).intValue(), ((Integer) next[1]).intValue(), ((Integer) next[2]).intValue());
                }
            }
            this.f5448a.clear();
        }
    }

    public final String a(Context context) {
        if (!b()) {
            return BuildConfig.FLAVOR;
        }
        int i = this.f5451d;
        HW hw = ((i == VJ.f9026b || i == VJ.f9027c) ? this.f5450c : this.f5449b).get();
        if (hw == null) {
            return BuildConfig.FLAVOR;
        }
        c();
        return hw.a(b(context));
    }

    public final String a(Context context, View view, Activity activity) {
        HW a2 = a();
        return a2 != null ? a2.a(context, view, activity) : BuildConfig.FLAVOR;
    }

    public final String a(Context context, String str, View view) {
        return a(context, str, view, (Activity) null);
    }

    public final String a(Context context, String str, View view, Activity activity) {
        HW a2;
        if (!b() || (a2 = a()) == null) {
            return BuildConfig.FLAVOR;
        }
        c();
        return a2.a(b(context), str, view, activity);
    }

    public final void a(int i, int i2, int i3) {
        HW a2 = a();
        if (a2 != null) {
            c();
            a2.a(i, i2, i3);
            return;
        }
        this.f5448a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public final void a(MotionEvent motionEvent) {
        HW a2 = a();
        if (a2 != null) {
            c();
            a2.a(motionEvent);
            return;
        }
        this.f5448a.add(new Object[]{motionEvent});
    }

    public final void a(View view) {
        HW a2 = a();
        if (a2 != null) {
            a2.a(view);
        }
    }

    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.f5453f.f9459d;
            if (!((Boolean) Qqa.e().a(F.Ba)).booleanValue() && z2) {
                z = true;
            }
            if (this.f5451d != VJ.f9026b) {
                this.f5449b.set(C2434qca.b(this.f5453f.f9456a, b(this.f5452e), z, this.f5451d));
            }
            if (this.f5451d != VJ.f9025a) {
                this.f5450c.set(FT.a(this.f5453f.f9456a, b(this.f5452e), z));
            }
        } finally {
            this.f5454g.countDown();
            this.f5452e = null;
            this.f5453f = null;
        }
    }
}
