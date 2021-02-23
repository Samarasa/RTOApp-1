package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.ads.pda  reason: case insensitive filesystem */
public final class C2365pda implements C2995yZ {

    /* renamed from: a  reason: collision with root package name */
    private final Raa f11735a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11736b;

    public C2365pda(Raa raa, int i) {
        this.f11735a = raa;
        this.f11736b = i;
        if (i >= 10) {
            raa.a(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    public final byte[] a(byte[] bArr) {
        return this.f11735a.a(bArr, this.f11736b);
    }
}
