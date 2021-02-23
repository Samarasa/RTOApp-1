package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ov  reason: case insensitive filesystem */
public final class C2326ov implements Xga<C2184mv> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Set<C3108zx<C2255nv>>> f11656a;

    private C2326ov(C1876iha<Set<C3108zx<C2255nv>>> iha) {
        this.f11656a = iha;
    }

    public static C2326ov a(C1876iha<Set<C3108zx<C2255nv>>> iha) {
        return new C2326ov(iha);
    }

    public final /* synthetic */ Object get() {
        return new C2184mv(this.f11656a.get());
    }
}
