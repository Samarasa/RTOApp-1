package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Xw  reason: case insensitive filesystem */
public final class C1186Xw implements Xga<Set<C3108zx<C1540dqa>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1004Qw f9308a;

    private C1186Xw(C1004Qw qw) {
        this.f9308a = qw;
    }

    public static C1186Xw a(C1004Qw qw) {
        return new C1186Xw(qw);
    }

    public final /* synthetic */ Object get() {
        Set<C3108zx<C1540dqa>> g2 = this.f9308a.g();
        C1452cha.a(g2, "Cannot return null from a non-@Nullable @Provides method");
        return g2;
    }
}
