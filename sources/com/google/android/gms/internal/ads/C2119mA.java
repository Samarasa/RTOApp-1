package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;

/* renamed from: com.google.android.gms.internal.ads.mA  reason: case insensitive filesystem */
public final class C2119mA implements Xga<C1977kA> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<VB> f11270a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<e> f11271b;

    public C2119mA(C1876iha<VB> iha, C1876iha<e> iha2) {
        this.f11270a = iha;
        this.f11271b = iha2;
    }

    public final /* synthetic */ Object get() {
        return new C1977kA(this.f11270a.get(), this.f11271b.get());
    }
}
