package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Aq  reason: case insensitive filesystem */
public final class C0582Aq implements Xga<C0608Bq> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f6201a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2526rna> f6202b;

    private C0582Aq(C1876iha<Context> iha, C1876iha<C2526rna> iha2) {
        this.f6201a = iha;
        this.f6202b = iha2;
    }

    public static C0582Aq a(C1876iha<Context> iha, C1876iha<C2526rna> iha2) {
        return new C0582Aq(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return new C0608Bq(this.f6201a.get(), this.f6202b.get());
    }
}
