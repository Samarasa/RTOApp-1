package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Jw  reason: case insensitive filesystem */
public final class C0822Jw implements Xga<C0692Ew> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Set<C3108zx<C0900Mw>>> f7515a;

    private C0822Jw(C1876iha<Set<C3108zx<C0900Mw>>> iha) {
        this.f7515a = iha;
    }

    public static C0822Jw a(C1876iha<Set<C3108zx<C0900Mw>>> iha) {
        return new C0822Jw(iha);
    }

    public final /* synthetic */ Object get() {
        return new C0692Ew(this.f7515a.get());
    }
}
