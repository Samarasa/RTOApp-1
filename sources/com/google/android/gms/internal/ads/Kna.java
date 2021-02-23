package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@TargetApi(14)
final class Kna implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private Activity f7613a;

    /* renamed from: b  reason: collision with root package name */
    private Context f7614b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Object f7615c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f7616d = true;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f7617e = false;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final List<Mna> f7618f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final List<Xna> f7619g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private Runnable f7620h;
    private boolean i = false;
    private long j;

    Kna() {
    }

    private final void a(Activity activity) {
        synchronized (this.f7615c) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f7613a = activity;
            }
        }
    }

    public final Activity a() {
        return this.f7613a;
    }

    public final void a(Application application, Context context) {
        if (!this.i) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                a((Activity) context);
            }
            this.f7614b = application;
            this.j = ((Long) Qqa.e().a(F.xa)).longValue();
            this.i = true;
        }
    }

    public final void a(Mna mna) {
        synchronized (this.f7615c) {
            this.f7618f.add(mna);
        }
    }

    public final Context b() {
        return this.f7614b;
    }

    public final void b(Mna mna) {
        synchronized (this.f7615c) {
            this.f7618f.remove(mna);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f7615c) {
            if (this.f7613a != null) {
                if (this.f7613a.equals(activity)) {
                    this.f7613a = null;
                }
                Iterator<Xna> it = this.f7619g.iterator();
                while (it.hasNext()) {
                    try {
                        if (it.next().a(activity)) {
                            it.remove();
                        }
                    } catch (Exception e2) {
                        p.g().a((Throwable) e2, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        C1018Rk.b(BuildConfig.FLAVOR, e2);
                    }
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        a(activity);
        synchronized (this.f7615c) {
            for (Xna onActivityPaused : this.f7619g) {
                try {
                    onActivityPaused.onActivityPaused(activity);
                } catch (Exception e2) {
                    p.g().a((Throwable) e2, "AppActivityTracker.ActivityListener.onActivityPaused");
                    C1018Rk.b(BuildConfig.FLAVOR, e2);
                }
            }
        }
        this.f7617e = true;
        Runnable runnable = this.f7620h;
        if (runnable != null) {
            oa.f5628a.removeCallbacks(runnable);
        }
        DW dw = oa.f5628a;
        Jna jna = new Jna(this);
        this.f7620h = jna;
        dw.postDelayed(jna, this.j);
    }

    public final void onActivityResumed(Activity activity) {
        a(activity);
        this.f7617e = false;
        boolean z = !this.f7616d;
        this.f7616d = true;
        Runnable runnable = this.f7620h;
        if (runnable != null) {
            oa.f5628a.removeCallbacks(runnable);
        }
        synchronized (this.f7615c) {
            for (Xna onActivityResumed : this.f7619g) {
                try {
                    onActivityResumed.onActivityResumed(activity);
                } catch (Exception e2) {
                    p.g().a((Throwable) e2, "AppActivityTracker.ActivityListener.onActivityResumed");
                    C1018Rk.b(BuildConfig.FLAVOR, e2);
                }
            }
            if (z) {
                for (Mna a2 : this.f7618f) {
                    try {
                        a2.a(true);
                    } catch (Exception e3) {
                        C1018Rk.b(BuildConfig.FLAVOR, e3);
                    }
                }
            } else {
                C1018Rk.a("App is still foreground.");
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        a(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }
}
