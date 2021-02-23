package com.google.android.gms.internal.ads;

import java.security.interfaces.ECPrivateKey;

public final class Oca implements C1931jZ {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f8110a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    private final ECPrivateKey f8111b;

    /* renamed from: c  reason: collision with root package name */
    private final Qca f8112c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8113d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f8114e;

    /* renamed from: f  reason: collision with root package name */
    private final Xca f8115f;

    /* renamed from: g  reason: collision with root package name */
    private final Pca f8116g;

    public Oca(ECPrivateKey eCPrivateKey, byte[] bArr, String str, Xca xca, Pca pca) {
        this.f8111b = eCPrivateKey;
        this.f8112c = new Qca(eCPrivateKey);
        this.f8114e = bArr;
        this.f8113d = str;
        this.f8115f = xca;
        this.f8116g = pca;
    }
}
