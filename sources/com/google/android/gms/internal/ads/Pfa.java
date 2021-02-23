package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class Pfa implements C2373pha {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f8231a;

    Pfa(C2298ofa ofa, Activity activity) {
        this.f8231a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f8231a);
    }
}
