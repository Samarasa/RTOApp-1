package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class _ca implements C1648fZ {

    /* renamed from: a  reason: collision with root package name */
    private final C1869ida f9673a;

    /* renamed from: b  reason: collision with root package name */
    private final C2995yZ f9674b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9675c;

    public _ca(C1869ida ida, C2995yZ yZVar, int i) {
        this.f9673a = ida;
        this.f9674b = yZVar;
        this.f9675c = i;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a2 = this.f9673a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return Ica.a(a2, this.f9674b.a(Ica.a(bArr2, a2, copyOf)));
    }
}
