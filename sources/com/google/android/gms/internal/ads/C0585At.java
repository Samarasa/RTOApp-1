package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.At  reason: case insensitive filesystem */
public final class C0585At implements Xga<C3108zx<C2892wu>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<UD> f6217a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f6218b;

    private C0585At(C1876iha<UD> iha, C1876iha<Executor> iha2) {
        this.f6217a = iha;
        this.f6218b = iha2;
    }

    public static C0585At a(C1876iha<UD> iha, C1876iha<Executor> iha2) {
        return new C0585At(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f6217a.get(), this.f6218b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
