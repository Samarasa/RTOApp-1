package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.jaa  reason: case insensitive filesystem */
public final class C1933jaa implements C1648fZ {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f10956a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    private final C1513dca f10957b;

    /* renamed from: c  reason: collision with root package name */
    private final C1648fZ f10958c;

    public C1933jaa(C1513dca dca, C1648fZ fZVar) {
        this.f10957b = dca;
        this.f10958c = fZVar;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] f2 = DZ.b(this.f10957b).f();
        byte[] a2 = this.f10958c.a(f2, f10956a);
        byte[] a3 = ((C1648fZ) DZ.a(this.f10957b.o(), f2, C1648fZ.class)).a(bArr, bArr2);
        return ByteBuffer.allocate(a2.length + 4 + a3.length).putInt(a2.length).put(a2).put(a3).array();
    }
}
