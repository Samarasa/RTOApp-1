package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Bt  reason: case insensitive filesystem */
public final class C0611Bt implements Xga<C3108zx<C2255nv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C0873Lv> f6376a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f6377b;

    private C0611Bt(C1876iha<C0873Lv> iha, C1876iha<Executor> iha2) {
        this.f6376a = iha;
        this.f6377b = iha2;
    }

    public static C0611Bt a(C1876iha<C0873Lv> iha, C1876iha<Executor> iha2) {
        return new C0611Bt(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f6376a.get(), this.f6377b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
