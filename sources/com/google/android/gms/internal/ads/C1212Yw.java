package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Yw  reason: case insensitive filesystem */
public final class C1212Yw implements Xga<Set<C3108zx<C0872Lu>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1004Qw f9510a;

    private C1212Yw(C1004Qw qw) {
        this.f9510a = qw;
    }

    public static C1212Yw a(C1004Qw qw) {
        return new C1212Yw(qw);
    }

    public final /* synthetic */ Object get() {
        Set<C3108zx<C0872Lu>> h2 = this.f9510a.h();
        C1452cha.a(h2, "Cannot return null from a non-@Nullable @Provides method");
        return h2;
    }
}
