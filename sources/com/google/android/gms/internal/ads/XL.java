package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class XL implements C0694Ey {

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f9227a;

    public XL(ByteBuffer byteBuffer) {
        this.f9227a = byteBuffer.slice();
    }

    public final void a(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer slice;
        synchronized (this.f9227a) {
            int i2 = (int) j;
            this.f9227a.position(i2);
            this.f9227a.limit(i2 + i);
            slice = this.f9227a.slice();
        }
        for (MessageDigest update : messageDigestArr) {
            slice.position(0);
            update.update(slice);
        }
    }

    public final long size() {
        return (long) this.f9227a.capacity();
    }
}
