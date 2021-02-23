package com.google.android.gms.internal.ads;

final class Rka {

    /* renamed from: a  reason: collision with root package name */
    public final int f8522a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f8523b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f8524c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8525d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f8526e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f8527f;

    public Rka(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        boolean z = true;
        Cma.a(iArr.length == jArr2.length);
        Cma.a(jArr.length == jArr2.length);
        Cma.a(iArr2.length != jArr2.length ? false : z);
        this.f8523b = jArr;
        this.f8524c = iArr;
        this.f8525d = i;
        this.f8526e = jArr2;
        this.f8527f = iArr2;
        this.f8522a = jArr.length;
    }

    public final int a(long j) {
        for (int a2 = Tma.a(this.f8526e, j, true, false); a2 >= 0; a2--) {
            if ((this.f8527f[a2] & 1) != 0) {
                return a2;
            }
        }
        return -1;
    }

    public final int b(long j) {
        for (int b2 = Tma.b(this.f8526e, j, true, false); b2 < this.f8526e.length; b2++) {
            if ((this.f8527f[b2] & 1) != 0) {
                return b2;
            }
        }
        return -1;
    }
}
