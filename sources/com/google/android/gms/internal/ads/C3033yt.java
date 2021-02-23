package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.yt  reason: case insensitive filesystem */
public final class C3033yt implements Xga<C3108zx<C1540dqa>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C0873Lv> f13001a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f13002b;

    private C3033yt(C1876iha<C0873Lv> iha, C1876iha<Executor> iha2) {
        this.f13001a = iha;
        this.f13002b = iha2;
    }

    public static C3033yt a(C1876iha<C0873Lv> iha, C1876iha<Executor> iha2) {
        return new C3033yt(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f13001a.get(), this.f13002b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
