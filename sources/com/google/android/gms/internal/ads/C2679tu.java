package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.tu  reason: case insensitive filesystem */
public final class C2679tu implements Xga<C2537ru> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Set<C3108zx<C1540dqa>>> f12286a;

    private C2679tu(C1876iha<Set<C3108zx<C1540dqa>>> iha) {
        this.f12286a = iha;
    }

    public static C2679tu a(C1876iha<Set<C3108zx<C1540dqa>>> iha) {
        return new C2679tu(iha);
    }

    public final /* synthetic */ Object get() {
        return new C2537ru(this.f12286a.get());
    }
}
