package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ss  reason: case insensitive filesystem */
public final class C2606ss implements Xga<C2394ps> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2988yS> f12152a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C0846Ku> f12153b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C2184mv> f12154c;

    private C2606ss(C1876iha<C2988yS> iha, C1876iha<C0846Ku> iha2, C1876iha<C2184mv> iha3) {
        this.f12152a = iha;
        this.f12153b = iha2;
        this.f12154c = iha3;
    }

    public static C2606ss a(C1876iha<C2988yS> iha, C1876iha<C0846Ku> iha2, C1876iha<C2184mv> iha3) {
        return new C2606ss(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        return new C2394ps(this.f12152a.get(), this.f12153b.get(), this.f12154c.get());
    }
}
