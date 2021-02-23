package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ww  reason: case insensitive filesystem */
public final class C2894ww implements Xga<C2823vw> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Set<C3108zx<C3107zw>>> f12721a;

    private C2894ww(C1876iha<Set<C3108zx<C3107zw>>> iha) {
        this.f12721a = iha;
    }

    public static C2894ww a(C1876iha<Set<C3108zx<C3107zw>>> iha) {
        return new C2894ww(iha);
    }

    public final /* synthetic */ Object get() {
        return new C2823vw(this.f12721a.get());
    }
}
