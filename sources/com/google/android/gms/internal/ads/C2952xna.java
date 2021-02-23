package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.xna  reason: case insensitive filesystem */
final class C2952xna implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final Application f12844a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f12845b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12846c = false;

    public C2952xna(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f12845b = new WeakReference<>(activityLifecycleCallbacks);
        this.f12844a = application;
    }

    private final void a(Gna gna) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f12845b.get();
            if (activityLifecycleCallbacks != null) {
                gna.a(activityLifecycleCallbacks);
            } else if (!this.f12846c) {
                this.f12844a.unregisterActivityLifecycleCallbacks(this);
                this.f12846c = true;
            }
        } catch (Exception e2) {
            C1018Rk.b("Error while dispatching lifecycle callback.", e2);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new C2881wna(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        a(new Dna(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        a(new Cna(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        a(new C3023yna(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new Ena(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        a(new C3094zna(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        a(new Bna(this, activity));
    }
}
