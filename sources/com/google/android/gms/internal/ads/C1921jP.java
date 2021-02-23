package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.jP  reason: case insensitive filesystem */
public final class C1921jP implements Xga<C1780hP> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2728ui> f10917a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f10918b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<String> f10919c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<PY> f10920d;

    public C1921jP(C1876iha<C2728ui> iha, C1876iha<Context> iha2, C1876iha<String> iha3, C1876iha<PY> iha4) {
        this.f10917a = iha;
        this.f10918b = iha2;
        this.f10919c = iha3;
        this.f10920d = iha4;
    }

    public final /* synthetic */ Object get() {
        return new C1780hP(this.f10917a.get(), this.f10918b.get(), this.f10919c.get(), this.f10920d.get());
    }
}
