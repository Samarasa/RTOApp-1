package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.tB  reason: case insensitive filesystem */
public final class C2616tB implements Xga<C2333pB> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Executor> f12163a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<_A> f12164b;

    public C2616tB(C1876iha<Executor> iha, C1876iha<_A> iha2) {
        this.f12163a = iha;
        this.f12164b = iha2;
    }

    public final /* synthetic */ Object get() {
        return new C2333pB(this.f12163a.get(), this.f12164b.get());
    }
}
