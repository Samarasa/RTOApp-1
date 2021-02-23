package com.google.android.gms.internal.ads;

public final class Nla extends Via {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f8005b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final long f8006c;

    /* renamed from: d  reason: collision with root package name */
    private final long f8007d;

    /* renamed from: e  reason: collision with root package name */
    private final long f8008e;

    /* renamed from: f  reason: collision with root package name */
    private final long f8009f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f8010g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f8011h;

    private Nla(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.f8006c = j;
        this.f8007d = j2;
        this.f8008e = 0;
        this.f8009f = 0;
        this.f8010g = z;
        this.f8011h = false;
    }

    public Nla(long j, boolean z) {
        this(j, j, 0, 0, z, false);
    }

    public final int a(Object obj) {
        return f8005b.equals(obj) ? 0 : -1;
    }

    public final Yia a(int i, Yia yia, boolean z) {
        Cma.a(i, 0, 1);
        Object obj = z ? f8005b : null;
        yia.a(obj, obj, 0, this.f8006c, 0, false);
        return yia;
    }

    public final C1314aja a(int i, C1314aja aja, boolean z, long j) {
        Cma.a(i, 0, 1);
        boolean z2 = this.f8010g;
        long j2 = this.f8007d;
        aja.f9828a = null;
        aja.f9829b = -9223372036854775807L;
        aja.f9830c = -9223372036854775807L;
        aja.f9831d = z2;
        aja.f9832e = false;
        aja.f9835h = 0;
        aja.i = j2;
        aja.f9833f = 0;
        aja.f9834g = 0;
        aja.j = 0;
        return aja;
    }

    public final int b() {
        return 1;
    }

    public final int c() {
        return 1;
    }
}
