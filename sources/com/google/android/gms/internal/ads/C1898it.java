package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;

/* renamed from: com.google.android.gms.internal.ads.it  reason: case insensitive filesystem */
public final class C1898it implements Xga<C2803vk> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<e> f10860a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C0732Gk> f10861b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<SS> f10862c;

    private C1898it(C1876iha<e> iha, C1876iha<C0732Gk> iha2, C1876iha<SS> iha3) {
        this.f10860a = iha;
        this.f10861b = iha2;
        this.f10862c = iha3;
    }

    public static C1898it a(C1876iha<e> iha, C1876iha<C0732Gk> iha2, C1876iha<SS> iha3) {
        return new C1898it(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        C2803vk a2 = this.f10861b.get().a(this.f10860a.get(), this.f10862c.get().f8620f);
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
