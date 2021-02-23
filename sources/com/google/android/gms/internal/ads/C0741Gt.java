package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Gt  reason: case insensitive filesystem */
public final class C0741Gt implements Xga<C3108zx<C0613Bv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C0873Lv> f7109a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f7110b;

    private C0741Gt(C1876iha<C0873Lv> iha, C1876iha<Executor> iha2) {
        this.f7109a = iha;
        this.f7110b = iha2;
    }

    public static C0741Gt a(C1876iha<C0873Lv> iha, C1876iha<Executor> iha2) {
        return new C0741Gt(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f7109a.get(), this.f7110b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
