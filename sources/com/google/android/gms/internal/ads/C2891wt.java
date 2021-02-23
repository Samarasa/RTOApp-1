package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.wt  reason: case insensitive filesystem */
public final class C2891wt implements Xga<C3108zx<C2608su>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C0873Lv> f12718a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f12719b;

    private C2891wt(C1876iha<C0873Lv> iha, C1876iha<Executor> iha2) {
        this.f12718a = iha;
        this.f12719b = iha2;
    }

    public static C2891wt a(C1876iha<C0873Lv> iha, C1876iha<Executor> iha2) {
        return new C2891wt(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f12718a.get(), this.f12719b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
