package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Us  reason: case insensitive filesystem */
public final class C1104Us implements Xga<C3108zx<C0872Lu>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2822vv> f8975a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f8976b;

    private C1104Us(C1876iha<C2822vv> iha, C1876iha<Executor> iha2) {
        this.f8975a = iha;
        this.f8976b = iha2;
    }

    public static C1104Us a(C1876iha<C2822vv> iha, C1876iha<Executor> iha2) {
        return new C1104Us(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f8975a.get(), this.f8976b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
