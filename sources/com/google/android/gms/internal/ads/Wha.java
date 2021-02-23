package com.google.android.gms.internal.ads;

import java.security.cert.X509Certificate;

final class Wha extends C2873wja {

    /* renamed from: b  reason: collision with root package name */
    private byte[] f9162b;

    public Wha(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f9162b = bArr;
    }

    public final byte[] getEncoded() {
        return this.f9162b;
    }
}
