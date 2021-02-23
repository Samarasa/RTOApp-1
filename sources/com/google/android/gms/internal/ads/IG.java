package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class IG implements Xga<C3108zx<C1290aV>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<VG> f7253a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f7254b;

    private IG(C1876iha<VG> iha, C1876iha<Executor> iha2) {
        this.f7253a = iha;
        this.f7254b = iha2;
    }

    public static IG a(C1876iha<VG> iha, C1876iha<Executor> iha2) {
        return new IG(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f7253a.get(), this.f7254b.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
