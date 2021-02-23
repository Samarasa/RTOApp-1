package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Ww  reason: case insensitive filesystem */
public final class C1160Ww implements Xga<Set<C3108zx<C2963xu>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1004Qw f9190a;

    private C1160Ww(C1004Qw qw) {
        this.f9190a = qw;
    }

    public static C1160Ww a(C1004Qw qw) {
        return new C1160Ww(qw);
    }

    public final /* synthetic */ Object get() {
        Set<C3108zx<C2963xu>> c2 = this.f9190a.c();
        C1452cha.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }
}
