package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;

public final class Zda extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f9566a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    private final int f9567b = 128;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<Lda> f9568c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private int f9569d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f9570e = new byte[128];

    /* renamed from: f  reason: collision with root package name */
    private int f9571f;

    Zda(int i) {
    }

    private final void b(int i) {
        this.f9568c.add(new Wda(this.f9570e));
        this.f9569d += this.f9570e.length;
        this.f9570e = new byte[Math.max(this.f9567b, Math.max(i, this.f9569d >>> 1))];
        this.f9571f = 0;
    }

    private final synchronized int size() {
        return this.f9569d + this.f9571f;
    }

    public final synchronized Lda a() {
        if (this.f9571f >= this.f9570e.length) {
            this.f9568c.add(new Wda(this.f9570e));
            this.f9570e = f9566a;
        } else if (this.f9571f > 0) {
            byte[] bArr = this.f9570e;
            int i = this.f9571f;
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            this.f9568c.add(new Wda(bArr2));
        }
        this.f9569d += this.f9571f;
        this.f9571f = 0;
        return Lda.a((Iterable<Lda>) this.f9568c);
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public final synchronized void write(int i) {
        if (this.f9571f == this.f9570e.length) {
            b(1);
        }
        byte[] bArr = this.f9570e;
        int i2 = this.f9571f;
        this.f9571f = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        if (i2 <= this.f9570e.length - this.f9571f) {
            System.arraycopy(bArr, i, this.f9570e, this.f9571f, i2);
            this.f9571f += i2;
            return;
        }
        int length = this.f9570e.length - this.f9571f;
        System.arraycopy(bArr, i, this.f9570e, this.f9571f, length);
        int i3 = i2 - length;
        b(i3);
        System.arraycopy(bArr, i + length, this.f9570e, 0, i3);
        this.f9571f = i3;
    }
}
