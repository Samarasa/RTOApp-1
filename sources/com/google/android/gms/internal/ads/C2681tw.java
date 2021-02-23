package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.tw  reason: case insensitive filesystem */
public final class C2681tw implements Xga<C2539rw> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Set<C3108zx<C2610sw>>> f12288a;

    private C2681tw(C1876iha<Set<C3108zx<C2610sw>>> iha) {
        this.f12288a = iha;
    }

    public static C2681tw a(C1876iha<Set<C3108zx<C2610sw>>> iha) {
        return new C2681tw(iha);
    }

    public final /* synthetic */ Object get() {
        return new C2539rw(this.f12288a.get());
    }
}
