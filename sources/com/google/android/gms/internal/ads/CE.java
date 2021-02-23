package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class CE implements Xga<Set<C3108zx<C1540dqa>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C2619tE f6386a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<DE> f6387b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Executor> f6388c;

    private CE(C2619tE tEVar, C1876iha<DE> iha, C1876iha<Executor> iha2) {
        this.f6386a = tEVar;
        this.f6387b = iha;
        this.f6388c = iha2;
    }

    public static CE a(C2619tE tEVar, C1876iha<DE> iha, C1876iha<Executor> iha2) {
        return new CE(tEVar, iha, iha2);
    }

    public final /* synthetic */ Object get() {
        Set<C3108zx<C1540dqa>> g2 = C2619tE.g(this.f6387b.get(), this.f6388c.get());
        C1452cha.a(g2, "Cannot return null from a non-@Nullable @Provides method");
        return g2;
    }
}
