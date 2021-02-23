package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

final class Qea implements C2373pha {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f8365a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f8366b;

    Qea(C2298ofa ofa, Activity activity, Bundle bundle) {
        this.f8365a = activity;
        this.f8366b = bundle;
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f8365a, this.f8366b);
    }
}
