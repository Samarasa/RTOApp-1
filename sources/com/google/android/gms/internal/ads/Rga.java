package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class Rga implements C2373pha {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f8501a;

    Rga(C2298ofa ofa, Activity activity) {
        this.f8501a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f8501a);
    }
}
