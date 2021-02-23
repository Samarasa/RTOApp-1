package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h.a;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.dx  reason: case insensitive filesystem */
public final class C1548dx implements Xga<Set<C3108zx<a>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1004Qw f10214a;

    private C1548dx(C1004Qw qw) {
        this.f10214a = qw;
    }

    public static C1548dx a(C1004Qw qw) {
        return new C1548dx(qw);
    }

    public final /* synthetic */ Object get() {
        Set<C3108zx<a>> e2 = this.f10214a.e();
        C1452cha.a(e2, "Cannot return null from a non-@Nullable @Provides method");
        return e2;
    }
}
