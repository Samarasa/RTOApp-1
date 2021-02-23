package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.zO  reason: case insensitive filesystem */
public final class C3055zO implements Xga<C2913xO> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<PY> f13040a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f13041b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C1200Yk> f13042c;

    private C3055zO(C1876iha<PY> iha, C1876iha<Context> iha2, C1876iha<C1200Yk> iha3) {
        this.f13040a = iha;
        this.f13041b = iha2;
        this.f13042c = iha3;
    }

    public static C3055zO a(C1876iha<PY> iha, C1876iha<Context> iha2, C1876iha<C1200Yk> iha3) {
        return new C3055zO(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        return new C2913xO(this.f13040a.get(), this.f13041b.get(), this.f13042c.get());
    }
}
