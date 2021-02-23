package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class BE implements Xga<Set<C3108zx<C0872Lu>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C2619tE f6249a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<DE> f6250b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Executor> f6251c;

    private BE(C2619tE tEVar, C1876iha<DE> iha, C1876iha<Executor> iha2) {
        this.f6249a = tEVar;
        this.f6250b = iha;
        this.f6251c = iha2;
    }

    public static BE a(C2619tE tEVar, C1876iha<DE> iha, C1876iha<Executor> iha2) {
        return new BE(tEVar, iha, iha2);
    }

    public final /* synthetic */ Object get() {
        Set<C3108zx<C0872Lu>> f2 = C2619tE.f(this.f6250b.get(), this.f6251c.get());
        C1452cha.a(f2, "Cannot return null from a non-@Nullable @Provides method");
        return f2;
    }
}
