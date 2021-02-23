package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

final class Ena implements Gna {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f6755a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f6756b;

    Ena(C2952xna xna, Activity activity, Bundle bundle) {
        this.f6755a = activity;
        this.f6756b = bundle;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f6755a, this.f6756b);
    }
}
