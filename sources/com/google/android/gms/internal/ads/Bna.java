package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class Bna implements Gna {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f6365a;

    Bna(C2952xna xna, Activity activity) {
        this.f6365a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f6365a);
    }
}
