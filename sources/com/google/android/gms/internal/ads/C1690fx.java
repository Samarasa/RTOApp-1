package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.fx  reason: case insensitive filesystem */
public final class C1690fx implements Xga<Set<C3108zx<C0613Bv>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1004Qw f10476a;

    private C1690fx(C1004Qw qw) {
        this.f10476a = qw;
    }

    public static C1690fx a(C1004Qw qw) {
        return new C1690fx(qw);
    }

    public final /* synthetic */ Object get() {
        Set<C3108zx<C0613Bv>> j = this.f10476a.j();
        C1452cha.a(j, "Cannot return null from a non-@Nullable @Provides method");
        return j;
    }
}
