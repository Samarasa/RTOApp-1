package com.google.android.gms.internal.ads;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.tla  reason: case insensitive filesystem */
final class C2664tla implements Bma {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f12245a;

    /* renamed from: b  reason: collision with root package name */
    private final C2170mma f12246b;

    /* renamed from: c  reason: collision with root package name */
    private final C2593sla f12247c;

    /* renamed from: d  reason: collision with root package name */
    private final Ema f12248d;

    /* renamed from: e  reason: collision with root package name */
    private final _ja f12249e = new _ja();

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f12250f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f12251g = true;

    /* renamed from: h  reason: collision with root package name */
    private long f12252h;
    /* access modifiers changed from: private */
    public long i = -1;
    private final /* synthetic */ C2168mla j;

    public C2664tla(C2168mla mla, Uri uri, C2170mma mma, C2593sla sla, Ema ema) {
        this.j = mla;
        Cma.a(uri);
        this.f12245a = uri;
        Cma.a(mma);
        this.f12246b = mma;
        Cma.a(sla);
        this.f12247c = sla;
        this.f12248d = ema;
    }

    public final void a() {
        Uja uja;
        int i2 = 0;
        while (i2 == 0 && !this.f12250f) {
            try {
                long j2 = this.f12249e.f9698a;
                this.i = this.f12246b.a(new C2241nma(this.f12245a, j2, -1, this.j.f11365h));
                if (this.i != -1) {
                    this.i += j2;
                }
                uja = new Uja(this.f12246b, j2, this.i);
                try {
                    Tja a2 = this.f12247c.a(uja, this.f12246b.getUri());
                    if (this.f12251g) {
                        a2.a(j2, this.f12252h);
                        this.f12251g = false;
                    }
                    while (i2 == 0 && !this.f12250f) {
                        this.f12248d.a();
                        i2 = a2.a((Wja) uja, this.f12249e);
                        if (uja.getPosition() > this.j.i + j2) {
                            j2 = uja.getPosition();
                            this.f12248d.c();
                            this.j.o.post(this.j.n);
                        }
                    }
                    if (i2 == 1) {
                        i2 = 0;
                    } else {
                        this.f12249e.f9698a = uja.getPosition();
                    }
                    Tma.a(this.f12246b);
                } catch (Throwable th) {
                    th = th;
                    if (!(i2 == 1 || uja == null)) {
                        this.f12249e.f9698a = uja.getPosition();
                    }
                    Tma.a(this.f12246b);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                uja = null;
                this.f12249e.f9698a = uja.getPosition();
                Tma.a(this.f12246b);
                throw th;
            }
        }
    }

    public final void a(long j2, long j3) {
        this.f12249e.f9698a = j2;
        this.f12252h = j3;
        this.f12251g = true;
    }

    public final void b() {
        this.f12250f = true;
    }

    public final boolean c() {
        return this.f12250f;
    }
}
