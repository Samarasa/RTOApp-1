package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.yna  reason: case insensitive filesystem */
final class C3023yna implements Gna {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f12981a;

    C3023yna(C2952xna xna, Activity activity) {
        this.f12981a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f12981a);
    }
}
