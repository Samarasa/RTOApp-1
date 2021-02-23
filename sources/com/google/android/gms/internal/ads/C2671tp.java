package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.gms.internal.ads.tp  reason: case insensitive filesystem */
public final class C2671tp extends ByteArrayOutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final C1665fi f12267a;

    public C2671tp(C1665fi fiVar, int i) {
        this.f12267a = fiVar;
        this.buf = this.f12267a.a(Math.max(i, 256));
    }

    private final void b(int i) {
        int i2 = this.count;
        if (i2 + i > this.buf.length) {
            byte[] a2 = this.f12267a.a((i2 + i) << 1);
            System.arraycopy(this.buf, 0, a2, 0, this.count);
            this.f12267a.a(this.buf);
            this.buf = a2;
        }
    }

    public final void close() {
        this.f12267a.a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f12267a.a(this.buf);
    }

    public final synchronized void write(int i) {
        b(1);
        super.write(i);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        b(i2);
        super.write(bArr, i, i2);
    }
}
