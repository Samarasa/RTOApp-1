package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;

/* renamed from: com.google.android.gms.internal.ads.lx  reason: case insensitive filesystem */
public final class C2115lx implements Xga<C1703gJ> {

    /* renamed from: a  reason: collision with root package name */
    private final C1004Qw f11265a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<e> f11266b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C1845iJ> f11267c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C3048zH> f11268d;

    private C2115lx(C1004Qw qw, C1876iha<e> iha, C1876iha<C1845iJ> iha2, C1876iha<C3048zH> iha3) {
        this.f11265a = qw;
        this.f11266b = iha;
        this.f11267c = iha2;
        this.f11268d = iha3;
    }

    public static C2115lx a(C1004Qw qw, C1876iha<e> iha, C1876iha<C1845iJ> iha2, C1876iha<C3048zH> iha3) {
        return new C2115lx(qw, iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        C1703gJ a2 = this.f11265a.a(this.f11266b.get(), this.f11267c.get(), this.f11268d.get());
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
