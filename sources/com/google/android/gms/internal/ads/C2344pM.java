package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.pM  reason: case insensitive filesystem */
public final class C2344pM implements KO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f11696a;

    private C2344pM(Bundle bundle) {
        this.f11696a = bundle;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.f11696a.isEmpty()) {
            bundle.putBundle("installed_adapter_data", this.f11696a);
        }
    }
}
