package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.tH  reason: case insensitive filesystem */
public final class C2622tH implements Xga<C2410qH> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f12169a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1701gH> f12170b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C1122Vk> f12171c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C1627fE> f12172d;

    public C2622tH(C1876iha<Context> iha, C1876iha<C1701gH> iha2, C1876iha<C1122Vk> iha3, C1876iha<C1627fE> iha4) {
        this.f12169a = iha;
        this.f12170b = iha2;
        this.f12171c = iha3;
        this.f12172d = iha4;
    }

    public final /* synthetic */ Object get() {
        return new C2410qH(this.f12169a.get(), this.f12170b.get(), this.f12171c.get(), this.f12172d.get());
    }
}
