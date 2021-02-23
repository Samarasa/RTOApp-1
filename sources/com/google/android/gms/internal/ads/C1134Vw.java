package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.q;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Vw  reason: case insensitive filesystem */
public final class C1134Vw implements Xga<Set<C3108zx<q>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1004Qw f9099a;

    private C1134Vw(C1004Qw qw) {
        this.f9099a = qw;
    }

    public static C1134Vw a(C1004Qw qw) {
        return new C1134Vw(qw);
    }

    public final /* synthetic */ Object get() {
        Set<C3108zx<q>> k = this.f9099a.k();
        C1452cha.a(k, "Cannot return null from a non-@Nullable @Provides method");
        return k;
    }
}
