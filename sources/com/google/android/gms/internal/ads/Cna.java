package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class Cna implements Gna {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f6468a;

    Cna(C2952xna xna, Activity activity) {
        this.f6468a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f6468a);
    }
}
