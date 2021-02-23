package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.cI  reason: case insensitive filesystem */
public final class C1419cI implements Xga<ZH> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f10006a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1181Xr> f10007b;

    public C1419cI(C1876iha<Context> iha, C1876iha<C1181Xr> iha2) {
        this.f10006a = iha;
        this.f10007b = iha2;
    }

    public final /* synthetic */ Object get() {
        return new ZH(this.f10006a.get(), this.f10007b.get());
    }
}
