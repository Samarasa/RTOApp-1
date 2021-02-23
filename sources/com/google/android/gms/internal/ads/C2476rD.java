package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.rD  reason: case insensitive filesystem */
public final class C2476rD implements Xga<C3108zx<C0872Lu>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2973yD> f11938a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f11939b;

    private C2476rD(C1876iha<C2973yD> iha, C1876iha<Executor> iha2) {
        this.f11938a = iha;
        this.f11939b = iha2;
    }

    public static C2476rD a(C1876iha<C2973yD> iha, C1876iha<Executor> iha2) {
        return new C2476rD(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f11938a.get(), this.f11939b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
