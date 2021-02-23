package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.vy  reason: case insensitive filesystem */
public final class C2825vy implements Xga<C3108zx<C2610sw>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1762gy f12600a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f12601b;

    private C2825vy(C1762gy gyVar, C1876iha<Executor> iha) {
        this.f12600a = gyVar;
        this.f12601b = iha;
    }

    public static C2825vy a(C1762gy gyVar, C1876iha<Executor> iha) {
        return new C2825vy(gyVar, iha);
    }

    public final /* synthetic */ Object get() {
        C3108zx<C2610sw> a2 = this.f12600a.a(this.f12601b.get());
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
