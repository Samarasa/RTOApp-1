package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.interfaces.ECPublicKey;

public final class Sca implements C2286oZ {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f8645a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    private final Uca f8646b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8647c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f8648d;

    /* renamed from: e  reason: collision with root package name */
    private final Xca f8649e;

    /* renamed from: f  reason: collision with root package name */
    private final Pca f8650f;

    public Sca(ECPublicKey eCPublicKey, byte[] bArr, String str, Xca xca, Pca pca) {
        Wca.a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f8646b = new Uca(eCPublicKey);
        this.f8648d = bArr;
        this.f8647c = str;
        this.f8649e = xca;
        this.f8650f = pca;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        Tca a2 = this.f8646b.a(this.f8647c, this.f8648d, bArr2, this.f8650f.a(), this.f8649e);
        byte[] a3 = this.f8650f.a(a2.b()).a(bArr, f8645a);
        byte[] a4 = a2.a();
        return ByteBuffer.allocate(a4.length + a3.length).put(a4).put(a3).array();
    }
}
