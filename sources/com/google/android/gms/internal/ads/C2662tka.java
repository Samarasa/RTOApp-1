package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tka  reason: case insensitive filesystem */
final class C2662tka {

    /* renamed from: a  reason: collision with root package name */
    public final int f12236a;

    /* renamed from: b  reason: collision with root package name */
    public int f12237b;

    /* renamed from: c  reason: collision with root package name */
    public int f12238c;

    /* renamed from: d  reason: collision with root package name */
    public long f12239d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f12240e;

    /* renamed from: f  reason: collision with root package name */
    private final Nma f12241f;

    /* renamed from: g  reason: collision with root package name */
    private final Nma f12242g;

    /* renamed from: h  reason: collision with root package name */
    private int f12243h;
    private int i;

    public C2662tka(Nma nma, Nma nma2, boolean z) {
        this.f12242g = nma;
        this.f12241f = nma2;
        this.f12240e = z;
        nma2.c(12);
        this.f12236a = nma2.o();
        nma.c(12);
        this.i = nma.o();
        Cma.b(nma.d() != 1 ? false : true, "first_chunk must be 1");
        this.f12237b = -1;
    }

    public final boolean a() {
        int i2 = this.f12237b + 1;
        this.f12237b = i2;
        if (i2 == this.f12236a) {
            return false;
        }
        this.f12239d = this.f12240e ? this.f12241f.p() : this.f12241f.l();
        if (this.f12237b == this.f12243h) {
            this.f12238c = this.f12242g.o();
            this.f12242g.d(4);
            int i3 = this.i - 1;
            this.i = i3;
            this.f12243h = i3 > 0 ? this.f12242g.o() - 1 : -1;
        }
        return true;
    }
}
