package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class UM implements JO<KO<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    private final YQ f8887a;

    UM(YQ yq) {
        this.f8887a = yq;
    }

    public final LY<KO<Bundle>> a() {
        YQ yq = this.f8887a;
        return DY.a((yq == null || yq.a() == null || this.f8887a.a().isEmpty()) ? null : new TM(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bundle bundle) {
        bundle.putString("key_schema", this.f8887a.a());
    }
}
