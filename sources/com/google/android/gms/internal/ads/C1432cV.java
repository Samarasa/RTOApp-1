package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.cV  reason: case insensitive filesystem */
public final class C1432cV implements Xga<UU> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Set<C3108zx<C1290aV>>> f10045a;

    private C1432cV(C1876iha<Set<C3108zx<C1290aV>>> iha) {
        this.f10045a = iha;
    }

    public static C1432cV a(C1876iha<Set<C3108zx<C1290aV>>> iha) {
        return new C1432cV(iha);
    }

    public final /* synthetic */ Object get() {
        return new UU(this.f10045a.get());
    }
}
