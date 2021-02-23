package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class EE implements Xga<Set<C3108zx<C1290aV>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C2619tE f6672a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<DE> f6673b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Executor> f6674c;

    private EE(C2619tE tEVar, C1876iha<DE> iha, C1876iha<Executor> iha2) {
        this.f6672a = tEVar;
        this.f6673b = iha;
        this.f6674c = iha2;
    }

    public static EE a(C2619tE tEVar, C1876iha<DE> iha, C1876iha<Executor> iha2) {
        return new EE(tEVar, iha, iha2);
    }

    public final /* synthetic */ Object get() {
        Set<C3108zx<C1290aV>> h2 = C2619tE.h(this.f6673b.get(), this.f6674c.get());
        C1452cha.a(h2, "Cannot return null from a non-@Nullable @Provides method");
        return h2;
    }
}
