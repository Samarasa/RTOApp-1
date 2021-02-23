package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.cx  reason: case insensitive filesystem */
public final class C1478cx implements Xga<Set<C3108zx<C2255nv>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1004Qw f10104a;

    private C1478cx(C1004Qw qw) {
        this.f10104a = qw;
    }

    public static C1478cx a(C1004Qw qw) {
        return new C1478cx(qw);
    }

    public final /* synthetic */ Object get() {
        Set<C3108zx<C2255nv>> i = this.f10104a.i();
        C1452cha.a(i, "Cannot return null from a non-@Nullable @Provides method");
        return i;
    }
}
