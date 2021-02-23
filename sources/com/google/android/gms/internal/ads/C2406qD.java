package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.qD  reason: case insensitive filesystem */
public final class C2406qD implements Xga<C3108zx<C0900Mw>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2973yD> f11814a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f11815b;

    private C2406qD(C1876iha<C2973yD> iha, C1876iha<Executor> iha2) {
        this.f11814a = iha;
        this.f11815b = iha2;
    }

    public static C2406qD a(C1876iha<C2973yD> iha, C1876iha<Executor> iha2) {
        return new C2406qD(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f11814a.get(), this.f11815b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
