package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yka  reason: case insensitive filesystem */
final class C3017yka implements C2875wka {

    /* renamed from: a  reason: collision with root package name */
    private final Nma f12962a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12963b = this.f12962a.o();

    /* renamed from: c  reason: collision with root package name */
    private final int f12964c = (this.f12962a.o() & 255);

    /* renamed from: d  reason: collision with root package name */
    private int f12965d;

    /* renamed from: e  reason: collision with root package name */
    private int f12966e;

    public C3017yka(C2520rka rka) {
        this.f12962a = rka.Qa;
        this.f12962a.c(12);
    }

    public final int a() {
        int i = this.f12964c;
        if (i == 8) {
            return this.f12962a.g();
        }
        if (i == 16) {
            return this.f12962a.h();
        }
        int i2 = this.f12965d;
        this.f12965d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f12966e & 15;
        }
        this.f12966e = this.f12962a.g();
        return (this.f12966e & 240) >> 4;
    }

    public final boolean b() {
        return false;
    }

    public final int c() {
        return this.f12963b;
    }
}
