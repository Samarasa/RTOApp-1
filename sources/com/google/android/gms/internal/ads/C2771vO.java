package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.vO  reason: case insensitive filesystem */
public final class C2771vO implements Xga<C2629tO> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C1017Rj> f12493a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<PY> f12494b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Context> f12495c;

    private C2771vO(C1876iha<C1017Rj> iha, C1876iha<PY> iha2, C1876iha<Context> iha3) {
        this.f12493a = iha;
        this.f12494b = iha2;
        this.f12495c = iha3;
    }

    public static C2771vO a(C1876iha<C1017Rj> iha, C1876iha<PY> iha2, C1876iha<Context> iha3) {
        return new C2771vO(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        return new C2629tO(this.f12493a.get(), this.f12494b.get(), this.f12495c.get());
    }
}
