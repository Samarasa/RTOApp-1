package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.fv  reason: case insensitive filesystem */
public final class C1688fv implements Xga<C1546dv> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Set<C3108zx<C1900iv>>> f10474a;

    private C1688fv(C1876iha<Set<C3108zx<C1900iv>>> iha) {
        this.f10474a = iha;
    }

    public static C1688fv a(C1876iha<Set<C3108zx<C1900iv>>> iha) {
        return new C1688fv(iha);
    }

    public final /* synthetic */ Object get() {
        return new C1546dv(this.f10474a.get());
    }
}
