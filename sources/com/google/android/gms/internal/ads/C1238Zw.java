package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Zw  reason: case insensitive filesystem */
public final class C1238Zw implements Xga<Set<C3108zx<C0768Hu>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1004Qw f9611a;

    private C1238Zw(C1004Qw qw) {
        this.f9611a = qw;
    }

    public static C1238Zw a(C1004Qw qw) {
        return new C1238Zw(qw);
    }

    public final /* synthetic */ Object get() {
        Set<C3108zx<C0768Hu>> d2 = this.f9611a.d();
        C1452cha.a(d2, "Cannot return null from a non-@Nullable @Provides method");
        return d2;
    }
}
