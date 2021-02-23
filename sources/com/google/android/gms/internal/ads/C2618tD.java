package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.tD  reason: case insensitive filesystem */
public final class C2618tD implements Xga<C3108zx<C1900iv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2973yD> f12165a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f12166b;

    private C2618tD(C1876iha<C2973yD> iha, C1876iha<Executor> iha2) {
        this.f12165a = iha;
        this.f12166b = iha2;
    }

    public static C2618tD a(C1876iha<C2973yD> iha, C1876iha<Executor> iha2) {
        return new C2618tD(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f12165a.get(), this.f12166b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
