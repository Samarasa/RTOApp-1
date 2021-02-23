package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.nha  reason: case insensitive filesystem */
final class C2231nha implements C2373pha {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f11488a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f11489b;

    C2231nha(C2298ofa ofa, Activity activity, Bundle bundle) {
        this.f11488a = activity;
        this.f11489b = bundle;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f11488a, this.f11489b);
    }
}
