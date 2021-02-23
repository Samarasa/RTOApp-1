package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.bO  reason: case insensitive filesystem */
public final class C1354bO implements KO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f9902a;

    public C1354bO(Bundle bundle) {
        this.f9902a = bundle;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.f9902a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}
