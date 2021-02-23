package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class Dna implements Gna {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f6629a;

    Dna(C2952xna xna, Activity activity) {
        this.f6629a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f6629a);
    }
}
