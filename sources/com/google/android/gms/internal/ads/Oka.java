package com.google.android.gms.internal.ads;

final class Oka {

    /* renamed from: a  reason: collision with root package name */
    public Aka f8134a;

    /* renamed from: b  reason: collision with root package name */
    public long f8135b;

    /* renamed from: c  reason: collision with root package name */
    public long f8136c;

    /* renamed from: d  reason: collision with root package name */
    public long f8137d;

    /* renamed from: e  reason: collision with root package name */
    public int f8138e;

    /* renamed from: f  reason: collision with root package name */
    public int f8139f;

    /* renamed from: g  reason: collision with root package name */
    public long[] f8140g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f8141h;
    public int[] i;
    public int[] j;
    public long[] k;
    public boolean[] l;
    public boolean m;
    public boolean[] n;
    public Pka o;
    public int p;
    public Nma q;
    public boolean r;
    public long s;

    Oka() {
    }

    public final void a(int i2) {
        Nma nma = this.q;
        if (nma == null || nma.c() < i2) {
            this.q = new Nma(i2);
        }
        this.p = i2;
        this.m = true;
        this.r = true;
    }

    public final long b(int i2) {
        return this.k[i2] + ((long) this.j[i2]);
    }
}
