package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Ht  reason: case insensitive filesystem */
public final class C0767Ht implements Xga<C3108zx<C0872Lu>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<UD> f7227a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f7228b;

    private C0767Ht(C1876iha<UD> iha, C1876iha<Executor> iha2) {
        this.f7227a = iha;
        this.f7228b = iha2;
    }

    public static C0767Ht a(C1876iha<UD> iha, C1876iha<Executor> iha2) {
        return new C0767Ht(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f7227a.get(), this.f7228b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
