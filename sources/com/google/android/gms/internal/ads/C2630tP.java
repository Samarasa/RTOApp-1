package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.tP  reason: case insensitive filesystem */
public final class C2630tP implements Xga<C2488rP> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Hoa> f12192a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<PY> f12193b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Context> f12194c;

    public C2630tP(C1876iha<Hoa> iha, C1876iha<PY> iha2, C1876iha<Context> iha3) {
        this.f12192a = iha;
        this.f12193b = iha2;
        this.f12194c = iha3;
    }

    public final /* synthetic */ Object get() {
        return new C2488rP(this.f12192a.get(), this.f12193b.get(), this.f12194c.get());
    }
}
