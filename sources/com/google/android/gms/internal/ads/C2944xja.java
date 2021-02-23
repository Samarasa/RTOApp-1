package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.xja  reason: case insensitive filesystem */
final class C2944xja implements C1385bja {

    /* renamed from: a  reason: collision with root package name */
    private int f12816a = -1;

    /* renamed from: b  reason: collision with root package name */
    private int f12817b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int[] f12818c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12819d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f12820e;

    /* renamed from: f  reason: collision with root package name */
    private ByteBuffer f12821f;

    /* renamed from: g  reason: collision with root package name */
    private ByteBuffer f12822g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f12823h;

    public C2944xja() {
        ByteBuffer byteBuffer = C1385bja.f9951a;
        this.f12821f = byteBuffer;
        this.f12822g = byteBuffer;
    }

    public final void a() {
        this.f12823h = true;
    }

    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = (((limit - position) / (this.f12816a * 2)) * this.f12820e.length) << 1;
        if (this.f12821f.capacity() < length) {
            this.f12821f = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f12821f.clear();
        }
        while (position < limit) {
            for (int i : this.f12820e) {
                this.f12821f.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f12816a << 1;
        }
        byteBuffer.position(limit);
        this.f12821f.flip();
        this.f12822g = this.f12821f;
    }

    public final void a(int[] iArr) {
        this.f12818c = iArr;
    }

    public final boolean a(int i, int i2, int i3) {
        boolean z = !Arrays.equals(this.f12818c, this.f12820e);
        this.f12820e = this.f12818c;
        if (this.f12820e == null) {
            this.f12819d = false;
            return z;
        } else if (i3 != 2) {
            throw new C1597eja(i, i2, i3);
        } else if (!z && this.f12817b == i && this.f12816a == i2) {
            return false;
        } else {
            this.f12817b = i;
            this.f12816a = i2;
            this.f12819d = i2 != this.f12820e.length;
            int i4 = 0;
            while (true) {
                int[] iArr = this.f12820e;
                if (i4 >= iArr.length) {
                    return true;
                }
                int i5 = iArr[i4];
                if (i5 < i2) {
                    this.f12819d = (i5 != i4) | this.f12819d;
                    i4++;
                } else {
                    throw new C1597eja(i, i2, i3);
                }
            }
        }
    }

    public final ByteBuffer b() {
        ByteBuffer byteBuffer = this.f12822g;
        this.f12822g = C1385bja.f9951a;
        return byteBuffer;
    }

    public final int c() {
        int[] iArr = this.f12820e;
        return iArr == null ? this.f12816a : iArr.length;
    }

    public final boolean d() {
        return this.f12819d;
    }

    public final int e() {
        return 2;
    }

    public final void flush() {
        this.f12822g = C1385bja.f9951a;
        this.f12823h = false;
    }

    public final void reset() {
        flush();
        this.f12821f = C1385bja.f9951a;
        this.f12816a = -1;
        this.f12817b = -1;
        this.f12820e = null;
        this.f12819d = false;
    }

    public final boolean u() {
        return this.f12823h && this.f12822g == C1385bja.f9951a;
    }
}
