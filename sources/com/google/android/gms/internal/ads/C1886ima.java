package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ima  reason: case insensitive filesystem */
public final class C1886ima {

    /* renamed from: a  reason: collision with root package name */
    public final Pla f10839a;

    /* renamed from: b  reason: collision with root package name */
    public final C1533dma f10840b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f10841c;

    /* renamed from: d  reason: collision with root package name */
    public final Xia[] f10842d;

    public C1886ima(Pla pla, C1533dma dma, Object obj, Xia[] xiaArr) {
        this.f10839a = pla;
        this.f10840b = dma;
        this.f10841c = obj;
        this.f10842d = xiaArr;
    }

    public final boolean a(C1886ima ima, int i) {
        return ima != null && Tma.a((Object) this.f10840b.a(i), (Object) ima.f10840b.a(i)) && Tma.a((Object) this.f10842d[i], (Object) ima.f10842d[i]);
    }
}
