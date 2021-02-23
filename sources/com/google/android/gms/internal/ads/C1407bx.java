package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.bx  reason: case insensitive filesystem */
public final class C1407bx implements Xga<Set<C3108zx<C2608su>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1004Qw f9991a;

    private C1407bx(C1004Qw qw) {
        this.f9991a = qw;
    }

    public static C1407bx a(C1004Qw qw) {
        return new C1407bx(qw);
    }

    public final /* synthetic */ Object get() {
        Set<C3108zx<C2608su>> a2 = this.f9991a.a();
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
