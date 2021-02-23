package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.eV  reason: case insensitive filesystem */
public final class C1573eV implements Xga<C1730gf> {

    /* renamed from: a  reason: collision with root package name */
    private final C1361bV f10271a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f10272b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C1200Yk> f10273c;

    public C1573eV(C1361bV bVVar, C1876iha<Context> iha, C1876iha<C1200Yk> iha2) {
        this.f10271a = bVVar;
        this.f10272b = iha;
        this.f10273c = iha2;
    }

    public final /* synthetic */ Object get() {
        C1730gf b2 = new C1194Ye().b(this.f10272b.get(), this.f10273c.get());
        C1452cha.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
