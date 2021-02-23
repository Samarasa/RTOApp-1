package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.mha  reason: case insensitive filesystem */
final class C2160mha implements C2373pha {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f11347a;

    C2160mha(C2298ofa ofa, Activity activity) {
        this.f11347a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f11347a);
    }
}
