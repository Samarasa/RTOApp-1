package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.nt  reason: case insensitive filesystem */
public final class C2253nt implements Xga<C3108zx<C0771Hx>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C0849Kx> f11548a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f11549b;

    private C2253nt(C1876iha<C0849Kx> iha, C1876iha<Executor> iha2) {
        this.f11548a = iha;
        this.f11549b = iha2;
    }

    public static C2253nt a(C1876iha<C0849Kx> iha, C1876iha<Executor> iha2) {
        return new C2253nt(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f11548a.get(), this.f11549b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
