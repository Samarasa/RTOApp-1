package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.qN  reason: case insensitive filesystem */
public final class C2416qN implements Xga<C2132mN> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f11841a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<PY> f11842b;

    private C2416qN(C1876iha<Context> iha, C1876iha<PY> iha2) {
        this.f11841a = iha;
        this.f11842b = iha2;
    }

    public static C2132mN a(Context context, PY py) {
        return new C2132mN(context, py);
    }

    public static C2416qN a(C1876iha<Context> iha, C1876iha<PY> iha2) {
        return new C2416qN(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return a(this.f11841a.get(), this.f11842b.get());
    }
}
