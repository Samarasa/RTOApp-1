package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Ct  reason: case insensitive filesystem */
public final class C0637Ct implements Xga<C3108zx<C0872Lu>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C0873Lv> f6486a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f6487b;

    private C0637Ct(C1876iha<C0873Lv> iha, C1876iha<Executor> iha2) {
        this.f6486a = iha;
        this.f6487b = iha2;
    }

    public static C0637Ct a(C1876iha<C0873Lv> iha, C1876iha<Executor> iha2) {
        return new C0637Ct(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f6486a.get(), this.f6487b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
