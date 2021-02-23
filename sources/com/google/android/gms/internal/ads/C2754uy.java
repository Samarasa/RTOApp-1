package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.uy  reason: case insensitive filesystem */
public final class C2754uy implements Xga<C3108zx<C2608su>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1762gy f12453a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1032Ry> f12454b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Executor> f12455c;

    private C2754uy(C1762gy gyVar, C1876iha<C1032Ry> iha, C1876iha<Executor> iha2) {
        this.f12453a = gyVar;
        this.f12454b = iha;
        this.f12455c = iha2;
    }

    public static C2754uy a(C1762gy gyVar, C1876iha<C1032Ry> iha, C1876iha<Executor> iha2) {
        return new C2754uy(gyVar, iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f12454b.get(), this.f12455c.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
