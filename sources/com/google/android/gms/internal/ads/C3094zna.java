package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.zna  reason: case insensitive filesystem */
final class C3094zna implements Gna {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f13120a;

    C3094zna(C2952xna xna, Activity activity) {
        this.f13120a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f13120a);
    }
}
