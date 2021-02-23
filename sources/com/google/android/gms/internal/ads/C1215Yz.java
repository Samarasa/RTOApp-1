package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Yz  reason: case insensitive filesystem */
public final class C1215Yz implements Xga<C3108zx<C0613Bv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<YK> f9513a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f9514b;

    private C1215Yz(C1876iha<YK> iha, C1876iha<Executor> iha2) {
        this.f9513a = iha;
        this.f9514b = iha2;
    }

    public static C1215Yz a(C1876iha<YK> iha, C1876iha<Executor> iha2) {
        return new C1215Yz(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f9513a.get(), this.f9514b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
