package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.pga  reason: case insensitive filesystem */
final class C2371pga implements C2373pha {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f11740a;

    C2371pga(C2298ofa ofa, Activity activity) {
        this.f11740a = activity;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f11740a);
    }
}
