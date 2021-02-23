package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zm  reason: case insensitive filesystem */
final /* synthetic */ class C3091zm implements C2099lma {

    /* renamed from: a  reason: collision with root package name */
    private final C2099lma f13108a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f13109b;

    C3091zm(C2099lma lma, byte[] bArr) {
        this.f13108a = lma;
        this.f13109b = bArr;
    }

    public final C2170mma a() {
        C2099lma lma = this.f13108a;
        byte[] bArr = this.f13109b;
        return new C0734Gm(new C1957jma(bArr), bArr.length, lma.a());
    }
}
