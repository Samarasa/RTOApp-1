package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.zt  reason: case insensitive filesystem */
public final class C3104zt implements Xga<C3108zx<C0768Hu>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C0873Lv> f13135a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f13136b;

    private C3104zt(C1876iha<C0873Lv> iha, C1876iha<Executor> iha2) {
        this.f13135a = iha;
        this.f13136b = iha2;
    }

    public static C3104zt a(C1876iha<C0873Lv> iha, C1876iha<Executor> iha2) {
        return new C3104zt(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f13135a.get(), this.f13136b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
