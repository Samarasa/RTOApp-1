package com.google.android.gms.internal.ads;

import java.io.InputStream;

final class Dfa extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private Afa f6588a;

    /* renamed from: b  reason: collision with root package name */
    private Xda f6589b;

    /* renamed from: c  reason: collision with root package name */
    private int f6590c;

    /* renamed from: d  reason: collision with root package name */
    private int f6591d;

    /* renamed from: e  reason: collision with root package name */
    private int f6592e;

    /* renamed from: f  reason: collision with root package name */
    private int f6593f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ C3078zfa f6594g;

    public Dfa(C3078zfa zfa) {
        this.f6594g = zfa;
        a();
    }

    private final int a(byte[] bArr, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        while (i4 > 0) {
            r();
            if (this.f6589b == null) {
                break;
            }
            int min = Math.min(this.f6590c - this.f6591d, i4);
            if (bArr != null) {
                this.f6589b.a(bArr, this.f6591d, i3, min);
                i3 += min;
            }
            this.f6591d += min;
            i4 -= min;
        }
        return i2 - i4;
    }

    private final void a() {
        this.f6588a = new Afa(this.f6594g, (C3007yfa) null);
        this.f6589b = (Xda) this.f6588a.next();
        this.f6590c = this.f6589b.size();
        this.f6591d = 0;
        this.f6592e = 0;
    }

    private final void r() {
        int i;
        if (this.f6589b != null && this.f6591d == (i = this.f6590c)) {
            this.f6592e += i;
            this.f6591d = 0;
            if (this.f6588a.hasNext()) {
                this.f6589b = (Xda) this.f6588a.next();
                this.f6590c = this.f6589b.size();
                return;
            }
            this.f6589b = null;
            this.f6590c = 0;
        }
    }

    public final int available() {
        return this.f6594g.size() - (this.f6592e + this.f6591d);
    }

    public final void mark(int i) {
        this.f6593f = this.f6592e + this.f6591d;
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        r();
        Xda xda = this.f6589b;
        if (xda == null) {
            return -1;
        }
        int i = this.f6591d;
        this.f6591d = i + 1;
        return xda.j(i) & 255;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException();
        } else if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else {
            int a2 = a(bArr, i, i2);
            if (a2 == 0) {
                return -1;
            }
            return a2;
        }
    }

    public final synchronized void reset() {
        a();
        a((byte[]) null, 0, this.f6593f);
    }

    public final long skip(long j) {
        if (j >= 0) {
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return (long) a((byte[]) null, 0, (int) j);
        }
        throw new IndexOutOfBoundsException();
    }
}
