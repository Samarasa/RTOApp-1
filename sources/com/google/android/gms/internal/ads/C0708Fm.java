package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.Fm  reason: case insensitive filesystem */
final class C0708Fm implements Iga {

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f6910a;

    C0708Fm(ByteBuffer byteBuffer) {
        this.f6910a = byteBuffer.duplicate();
    }

    public final ByteBuffer a(long j, long j2) {
        int position = this.f6910a.position();
        this.f6910a.position((int) j);
        ByteBuffer slice = this.f6910a.slice();
        slice.limit((int) j2);
        this.f6910a.position(position);
        return slice;
    }

    public final void close() {
    }

    public final void e(long j) {
        this.f6910a.position((int) j);
    }

    public final long position() {
        return (long) this.f6910a.position();
    }

    public final int read(ByteBuffer byteBuffer) {
        if (this.f6910a.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.f6910a.remaining());
        byte[] bArr = new byte[min];
        this.f6910a.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    public final long size() {
        return (long) this.f6910a.limit();
    }
}
