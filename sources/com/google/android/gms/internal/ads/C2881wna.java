package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.wna  reason: case insensitive filesystem */
final class C2881wna implements Gna {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f12688a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f12689b;

    C2881wna(C2952xna xna, Activity activity, Bundle bundle) {
        this.f12688a = activity;
        this.f12689b = bundle;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f12688a, this.f12689b);
    }
}
