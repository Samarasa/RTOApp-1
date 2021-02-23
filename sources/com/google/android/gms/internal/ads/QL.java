package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeUnit;

public final class QL implements Xga<LY<UL>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<VU> f8317a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<PL> f8318b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C1183Xt> f8319c;

    public QL(C1876iha<VU> iha, C1876iha<PL> iha2, C1876iha<C1183Xt> iha3) {
        this.f8317a = iha;
        this.f8318b = iha2;
        this.f8319c = iha3;
    }

    public final /* synthetic */ Object get() {
        DU<E, O2> a2 = this.f8317a.get().a(SU.GENERATE_SIGNALS, this.f8319c.get().b()).a(this.f8318b.get()).a((long) ((Integer) Qqa.e().a(F.Pd)).intValue(), TimeUnit.SECONDS).a();
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
