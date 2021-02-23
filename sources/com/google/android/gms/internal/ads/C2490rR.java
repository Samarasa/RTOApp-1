package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.rR  reason: case insensitive filesystem */
public final class C2490rR implements Xga<C2278oR<C2037kr, C2463qr>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f11966a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<GT> f11967b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<XT> f11968c;

    public C2490rR(C1876iha<Context> iha, C1876iha<GT> iha2, C1876iha<XT> iha3) {
        this.f11966a = iha;
        this.f11967b = iha2;
        this.f11968c = iha3;
    }

    public final /* synthetic */ Object get() {
        C2278oR<C2037kr, C2463qr> b2 = C2561sR.b(this.f11966a.get(), this.f11967b.get(), this.f11968c.get());
        C1452cha.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
