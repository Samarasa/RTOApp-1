package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Rr  reason: case insensitive filesystem */
public final class C1025Rr implements Xga<C3108zx<C2739una>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0661Dr f8551a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2677ts> f8552b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Executor> f8553c;

    public C1025Rr(C0661Dr dr, C1876iha<C2677ts> iha, C1876iha<Executor> iha2) {
        this.f8551a = dr;
        this.f8552b = iha;
        this.f8553c = iha2;
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f8552b.get(), this.f8553c.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
