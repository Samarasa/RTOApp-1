package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Zt  reason: case insensitive filesystem */
public final class C1235Zt implements Xga<C1131Vt> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f9607a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2988yS> f9608b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C0651Dh> f9609c;

    private C1235Zt(C1876iha<Context> iha, C1876iha<C2988yS> iha2, C1876iha<C0651Dh> iha3) {
        this.f9607a = iha;
        this.f9608b = iha2;
        this.f9609c = iha3;
    }

    public static C1235Zt a(C1876iha<Context> iha, C1876iha<C2988yS> iha2, C1876iha<C0651Dh> iha3) {
        return new C1235Zt(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        return new C1131Vt(this.f9607a.get(), this.f9608b.get(), this.f9609c.get());
    }
}
