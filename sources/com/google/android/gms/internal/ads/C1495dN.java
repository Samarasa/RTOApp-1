package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;

/* renamed from: com.google.android.gms.internal.ads.dN  reason: case insensitive filesystem */
public final class C1495dN implements Xga<C2846wS> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<e> f10140a;

    public C1495dN(C1876iha<e> iha) {
        this.f10140a = iha;
    }

    public final /* synthetic */ Object get() {
        C2846wS wSVar = new C2846wS(this.f10140a.get());
        C1452cha.a(wSVar, "Cannot return null from a non-@Nullable @Provides method");
        return wSVar;
    }
}
