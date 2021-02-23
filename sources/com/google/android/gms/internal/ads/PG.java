package com.google.android.gms.internal.ads;

public final class PG {

    /* renamed from: a  reason: collision with root package name */
    private int f8186a = 0;

    /* renamed from: b  reason: collision with root package name */
    private long f8187b = 0;

    /* renamed from: c  reason: collision with root package name */
    private long f8188c = 0;

    /* renamed from: d  reason: collision with root package name */
    private long f8189d = 0;

    /* renamed from: e  reason: collision with root package name */
    private final Object f8190e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final Object f8191f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private final Object f8192g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private final Object f8193h = new Object();

    public final int a() {
        int i;
        synchronized (this.f8190e) {
            i = this.f8186a;
        }
        return i;
    }

    public final void a(int i) {
        synchronized (this.f8190e) {
            this.f8186a = i;
        }
    }

    public final void a(long j) {
        synchronized (this.f8191f) {
            this.f8187b = j;
        }
    }

    public final long b() {
        long j;
        synchronized (this.f8191f) {
            j = this.f8187b;
        }
        return j;
    }

    public final synchronized void b(long j) {
        synchronized (this.f8193h) {
            this.f8189d = j;
        }
    }

    public final synchronized long c() {
        long j;
        synchronized (this.f8192g) {
            j = this.f8188c;
        }
        return j;
    }

    public final synchronized void c(long j) {
        synchronized (this.f8192g) {
            this.f8188c = j;
        }
    }

    public final synchronized long d() {
        long j;
        synchronized (this.f8193h) {
            j = this.f8189d;
        }
        return j;
    }
}
