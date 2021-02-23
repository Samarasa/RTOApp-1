package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jda  reason: case insensitive filesystem */
public final class C1939jda {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f10960a;

    private C1939jda(byte[] bArr, int i, int i2) {
        this.f10960a = new byte[i2];
        System.arraycopy(bArr, 0, this.f10960a, 0, i2);
    }

    public static C1939jda a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new C1939jda(bArr, 0, bArr.length);
    }

    public final byte[] a() {
        byte[] bArr = this.f10960a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
