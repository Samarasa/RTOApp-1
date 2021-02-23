package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aea  reason: case insensitive filesystem */
public abstract class C1304aea {

    /* renamed from: a  reason: collision with root package name */
    int f9806a;

    /* renamed from: b  reason: collision with root package name */
    int f9807b;

    /* renamed from: c  reason: collision with root package name */
    int f9808c;

    /* renamed from: d  reason: collision with root package name */
    C1517dea f9809d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9810e;

    private C1304aea() {
        this.f9807b = 100;
        this.f9808c = Integer.MAX_VALUE;
        this.f9810e = false;
    }

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    static C1304aea a(byte[] bArr, int i, int i2, boolean z) {
        C1446cea cea = new C1446cea(bArr, i, i2, z);
        try {
            cea.c(i2);
            return cea;
        } catch (Iea e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract double a();

    public abstract void a(int i);

    public abstract float b();

    public abstract boolean b(int i);

    public abstract int c(int i);

    public abstract String c();

    public abstract int d();

    public abstract void d(int i);

    public abstract long e();

    public abstract long f();

    public abstract int g();

    public abstract long h();

    public abstract int i();

    public abstract boolean j();

    public abstract String k();

    public abstract Lda l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract boolean s();

    public abstract int t();
}
