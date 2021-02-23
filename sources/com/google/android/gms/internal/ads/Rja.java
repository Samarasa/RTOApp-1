package com.google.android.gms.internal.ads;

public final class Rja implements C1458cka {

    /* renamed from: a  reason: collision with root package name */
    private final int f8516a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f8517b;

    /* renamed from: c  reason: collision with root package name */
    private final long[] f8518c;

    /* renamed from: d  reason: collision with root package name */
    private final long[] f8519d;

    /* renamed from: e  reason: collision with root package name */
    private final long[] f8520e;

    /* renamed from: f  reason: collision with root package name */
    private final long f8521f;

    public Rja(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f8517b = iArr;
        this.f8518c = jArr;
        this.f8519d = jArr2;
        this.f8520e = jArr3;
        this.f8516a = iArr.length;
        int i = this.f8516a;
        if (i > 0) {
            this.f8521f = jArr2[i - 1] + jArr3[i - 1];
        } else {
            this.f8521f = 0;
        }
    }

    public final long a(long j) {
        return this.f8518c[Tma.a(this.f8520e, j, true, true)];
    }

    public final boolean b() {
        return true;
    }

    public final long c() {
        return this.f8521f;
    }
}
