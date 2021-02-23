package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.C1538dpa;

/* renamed from: com.google.android.gms.internal.ads.Qy  reason: case insensitive filesystem */
public final class C1006Qy implements Xga<C0928Ny> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f8434a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2313on> f8435b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C2988yS> f8436c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C1200Yk> f8437d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<C1538dpa.a> f8438e;

    private C1006Qy(C1876iha<Context> iha, C1876iha<C2313on> iha2, C1876iha<C2988yS> iha3, C1876iha<C1200Yk> iha4, C1876iha<C1538dpa.a> iha5) {
        this.f8434a = iha;
        this.f8435b = iha2;
        this.f8436c = iha3;
        this.f8437d = iha4;
        this.f8438e = iha5;
    }

    public static C1006Qy a(C1876iha<Context> iha, C1876iha<C2313on> iha2, C1876iha<C2988yS> iha3, C1876iha<C1200Yk> iha4, C1876iha<C1538dpa.a> iha5) {
        return new C1006Qy(iha, iha2, iha3, iha4, iha5);
    }

    public final /* synthetic */ Object get() {
        return new C0928Ny(this.f8434a.get(), this.f8435b.get(), this.f8436c.get(), this.f8437d.get(), this.f8438e.get());
    }
}
