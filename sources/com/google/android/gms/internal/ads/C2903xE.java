package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.xE  reason: case insensitive filesystem */
public final class C2903xE implements Xga<Set<C3108zx<C1900iv>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C2619tE f12731a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<DE> f12732b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Executor> f12733c;

    private C2903xE(C2619tE tEVar, C1876iha<DE> iha, C1876iha<Executor> iha2) {
        this.f12731a = tEVar;
        this.f12732b = iha;
        this.f12733c = iha2;
    }

    public static C2903xE a(C2619tE tEVar, C1876iha<DE> iha, C1876iha<Executor> iha2) {
        return new C2903xE(tEVar, iha, iha2);
    }

    public static Set<C3108zx<C1900iv>> a(C2619tE tEVar, DE de, Executor executor) {
        Set<C3108zx<C1900iv>> c2 = C2619tE.c(de, executor);
        C1452cha.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }

    public final /* synthetic */ Object get() {
        return a(this.f12731a, this.f12732b.get(), this.f12733c.get());
    }
}
