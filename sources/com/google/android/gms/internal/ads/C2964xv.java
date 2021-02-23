package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.xv  reason: case insensitive filesystem */
public final class C2964xv implements Xga<C2822vv> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Set<C3108zx<C0613Bv>>> f12860a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2988yS> f12861b;

    private C2964xv(C1876iha<Set<C3108zx<C0613Bv>>> iha, C1876iha<C2988yS> iha2) {
        this.f12860a = iha;
        this.f12861b = iha2;
    }

    public static C2964xv a(C1876iha<Set<C3108zx<C0613Bv>>> iha, C1876iha<C2988yS> iha2) {
        return new C2964xv(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return new C2822vv(this.f12860a.get(), this.f12861b.get());
    }
}
