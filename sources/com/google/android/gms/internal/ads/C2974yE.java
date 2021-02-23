package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.yE  reason: case insensitive filesystem */
public final class C2974yE implements Xga<Set<C3108zx<C0950Ou>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C2619tE f12880a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<DE> f12881b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Executor> f12882c;

    private C2974yE(C2619tE tEVar, C1876iha<DE> iha, C1876iha<Executor> iha2) {
        this.f12880a = tEVar;
        this.f12881b = iha;
        this.f12882c = iha2;
    }

    public static C2974yE a(C2619tE tEVar, C1876iha<DE> iha, C1876iha<Executor> iha2) {
        return new C2974yE(tEVar, iha, iha2);
    }

    public final /* synthetic */ Object get() {
        Set<C3108zx<C0950Ou>> a2 = C2619tE.a(this.f12881b.get(), this.f12882c.get());
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
