package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Ir  reason: case insensitive filesystem */
public final class C0791Ir implements Xga<C1546dv> {

    /* renamed from: a  reason: collision with root package name */
    private final C0661Dr f7358a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Set<C3108zx<C1900iv>>> f7359b;

    public C0791Ir(C0661Dr dr, C1876iha<Set<C3108zx<C1900iv>>> iha) {
        this.f7358a = dr;
        this.f7359b = iha;
    }

    public static C1546dv a(C0661Dr dr, Set<C3108zx<C1900iv>> set) {
        C1546dv a2 = dr.a(set);
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public final /* synthetic */ Object get() {
        return a(this.f7358a, this.f7359b.get());
    }
}
