package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.tK  reason: case insensitive filesystem */
public final class C2625tK implements Xga<C2342pK> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f12174a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C0616By> f12175b;

    public C2625tK(C1876iha<Context> iha, C1876iha<C0616By> iha2) {
        this.f12174a = iha;
        this.f12175b = iha2;
    }

    public final /* synthetic */ Object get() {
        return new C2342pK(this.f12174a.get(), this.f12175b.get());
    }
}
