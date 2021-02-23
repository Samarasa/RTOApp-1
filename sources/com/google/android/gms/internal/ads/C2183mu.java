package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mu  reason: case insensitive filesystem */
public final class C2183mu implements Xga<C2254nu> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2988yS> f11410a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<String> f11411b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C3048zH> f11412c;

    private C2183mu(C1876iha<C2988yS> iha, C1876iha<String> iha2, C1876iha<C3048zH> iha3) {
        this.f11410a = iha;
        this.f11411b = iha2;
        this.f11412c = iha3;
    }

    public static C2183mu a(C1876iha<C2988yS> iha, C1876iha<String> iha2, C1876iha<C3048zH> iha3) {
        return new C2183mu(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        return new C2254nu(this.f11410a.get(), this.f11411b.get(), this.f11412c.get());
    }
}
