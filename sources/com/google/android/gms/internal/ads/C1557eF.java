package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.eF  reason: case insensitive filesystem */
public final class C1557eF implements Xga<LY<String>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Qba> f10232a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f10233b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<PY> f10234c;

    private C1557eF(C1876iha<Qba> iha, C1876iha<Context> iha2, C1876iha<PY> iha3) {
        this.f10232a = iha;
        this.f10233b = iha2;
        this.f10234c = iha3;
    }

    public static C1557eF a(C1876iha<Qba> iha, C1876iha<Context> iha2, C1876iha<PY> iha3) {
        return new C1557eF(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        LY a2 = this.f10234c.get().a(new C1345bF(this.f10232a.get(), this.f10233b.get()));
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
