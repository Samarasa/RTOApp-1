package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.aO  reason: case insensitive filesystem */
public final class C1283aO implements JO<C1354bO> {

    /* renamed from: a  reason: collision with root package name */
    private final PY f9778a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f9779b;

    public C1283aO(PY py, Bundle bundle) {
        this.f9778a = py;
        this.f9779b = bundle;
    }

    public final LY<C1354bO> a() {
        return this.f9778a.a(new C1496dO(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C1354bO b() {
        return new C1354bO(this.f9779b);
    }
}
