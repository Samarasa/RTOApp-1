package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.wE  reason: case insensitive filesystem */
public final class C2832wE implements Xga<Set<C3108zx<C2608su>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C2619tE f12607a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<DE> f12608b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Executor> f12609c;

    private C2832wE(C2619tE tEVar, C1876iha<DE> iha, C1876iha<Executor> iha2) {
        this.f12607a = tEVar;
        this.f12608b = iha;
        this.f12609c = iha2;
    }

    public static C2832wE a(C2619tE tEVar, C1876iha<DE> iha, C1876iha<Executor> iha2) {
        return new C2832wE(tEVar, iha, iha2);
    }

    public final /* synthetic */ Object get() {
        Set<C3108zx<C2608su>> e2 = C2619tE.e(this.f12608b.get(), this.f12609c.get());
        C1452cha.a(e2, "Cannot return null from a non-@Nullable @Provides method");
        return e2;
    }
}
