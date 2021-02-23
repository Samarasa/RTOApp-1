package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.ls  reason: case insensitive filesystem */
public final class C2110ls implements Xga<C1756gs> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C3032ys> f11253a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1653fc> f11254b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Runnable> f11255c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<Executor> f11256d;

    public C2110ls(C1876iha<C3032ys> iha, C1876iha<C1653fc> iha2, C1876iha<Runnable> iha3, C1876iha<Executor> iha4) {
        this.f11253a = iha;
        this.f11254b = iha2;
        this.f11255c = iha3;
        this.f11256d = iha4;
    }

    public final /* synthetic */ Object get() {
        return new C1756gs(this.f11253a.get(), this.f11254b.get(), this.f11255c.get(), this.f11256d.get());
    }
}
