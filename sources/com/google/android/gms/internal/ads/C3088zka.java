package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zka  reason: case insensitive filesystem */
final class C3088zka implements C2875wka {

    /* renamed from: a  reason: collision with root package name */
    private final int f13104a = this.f13106c.o();

    /* renamed from: b  reason: collision with root package name */
    private final int f13105b = this.f13106c.o();

    /* renamed from: c  reason: collision with root package name */
    private final Nma f13106c;

    public C3088zka(C2520rka rka) {
        this.f13106c = rka.Qa;
        this.f13106c.c(12);
    }

    public final int a() {
        int i = this.f13104a;
        return i == 0 ? this.f13106c.o() : i;
    }

    public final boolean b() {
        return this.f13104a != 0;
    }

    public final int c() {
        return this.f13105b;
    }
}
