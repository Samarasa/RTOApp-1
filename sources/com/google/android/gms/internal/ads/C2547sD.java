package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.sD  reason: case insensitive filesystem */
public final class C2547sD implements Xga<C3108zx<C0795Iv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2973yD> f12062a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f12063b;

    private C2547sD(C1876iha<C2973yD> iha, C1876iha<Executor> iha2) {
        this.f12062a = iha;
        this.f12063b = iha2;
    }

    public static C2547sD a(C1876iha<C2973yD> iha, C1876iha<Executor> iha2) {
        return new C2547sD(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f12062a.get(), this.f12063b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
