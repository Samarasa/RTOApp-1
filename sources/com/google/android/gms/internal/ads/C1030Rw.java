package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Rw  reason: case insensitive filesystem */
public final class C1030Rw implements Xga<C2821vu> {

    /* renamed from: a  reason: collision with root package name */
    private final C1004Qw f8558a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Set<C3108zx<C2963xu>>> f8559b;

    private C1030Rw(C1004Qw qw, C1876iha<Set<C3108zx<C2963xu>>> iha) {
        this.f8558a = qw;
        this.f8559b = iha;
    }

    public static C1030Rw a(C1004Qw qw, C1876iha<Set<C3108zx<C2963xu>>> iha) {
        return new C1030Rw(qw, iha);
    }

    public final /* synthetic */ Object get() {
        C2821vu a2 = this.f8558a.a(this.f8559b.get());
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
