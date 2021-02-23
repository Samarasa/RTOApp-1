package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Uu  reason: case insensitive filesystem */
public final class C1106Uu implements Xga<C0924Nu> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Set<C3108zx<C0950Ou>>> f8978a;

    private C1106Uu(C1876iha<Set<C3108zx<C0950Ou>>> iha) {
        this.f8978a = iha;
    }

    public static C1106Uu a(C1876iha<Set<C3108zx<C0950Ou>>> iha) {
        return new C1106Uu(iha);
    }

    public final /* synthetic */ Object get() {
        return new C0924Nu(this.f8978a.get());
    }
}
