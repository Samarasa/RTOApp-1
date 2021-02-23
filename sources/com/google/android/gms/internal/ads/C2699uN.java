package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.uN  reason: case insensitive filesystem */
public final class C2699uN implements Xga<C2557sN> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f12314a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<PY> f12315b;

    private C2699uN(C1876iha<Context> iha, C1876iha<PY> iha2) {
        this.f12314a = iha;
        this.f12315b = iha2;
    }

    public static C2699uN a(C1876iha<Context> iha, C1876iha<PY> iha2) {
        return new C2699uN(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return new C2557sN(this.f12314a.get(), this.f12315b.get());
    }
}
