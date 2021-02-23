package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.ofa  reason: case insensitive filesystem */
final class C2298ofa implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final Application f11603a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f11604b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11605c = false;

    public C2298ofa(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f11604b = new WeakReference<>(activityLifecycleCallbacks);
        this.f11603a = application;
    }

    private final void a(C2373pha pha) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f11604b.get();
            if (activityLifecycleCallbacks != null) {
                pha.a(activityLifecycleCallbacks);
            } else if (!this.f11605c) {
                this.f11603a.unregisterActivityLifecycleCallbacks(this);
                this.f11605c = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new Qea(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        a(new C2160mha(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        a(new C2089lha(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        a(new Pfa(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new C2231nha(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        a(new C2371pga(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        a(new Rga(this, activity));
    }
}
