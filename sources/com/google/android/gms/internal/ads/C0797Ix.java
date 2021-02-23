package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Ix  reason: case insensitive filesystem */
public final class C0797Ix implements Xga<C0745Gx> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Set<C3108zx<C0771Hx>>> f7369a;

    private C0797Ix(C1876iha<Set<C3108zx<C0771Hx>>> iha) {
        this.f7369a = iha;
    }

    public static C0797Ix a(C1876iha<Set<C3108zx<C0771Hx>>> iha) {
        return new C0797Ix(iha);
    }

    public final /* synthetic */ Object get() {
        return new C0745Gx(this.f7369a.get());
    }
}
