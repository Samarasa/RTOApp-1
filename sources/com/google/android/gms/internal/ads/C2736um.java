package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.um  reason: case insensitive filesystem */
public final class C2736um implements Pia {

    /* renamed from: a  reason: collision with root package name */
    private final C2454qma f12403a;

    /* renamed from: b  reason: collision with root package name */
    private long f12404b;

    /* renamed from: c  reason: collision with root package name */
    private long f12405c;

    /* renamed from: d  reason: collision with root package name */
    private long f12406d;

    /* renamed from: e  reason: collision with root package name */
    private long f12407e;

    /* renamed from: f  reason: collision with root package name */
    private int f12408f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f12409g;

    C2736um() {
        this(15000, 30000, 2500, 5000);
    }

    private C2736um(int i, int i2, long j, long j2) {
        this.f12403a = new C2454qma(true, 65536);
        this.f12404b = 15000000;
        this.f12405c = 30000000;
        this.f12406d = 2500000;
        this.f12407e = 5000000;
    }

    private final void a(boolean z) {
        this.f12408f = 0;
        this.f12409g = false;
        if (z) {
            this.f12403a.a();
        }
    }

    public final void a() {
        a(false);
    }

    public final synchronized void a(int i) {
        this.f12406d = ((long) i) * 1000;
    }

    public final void a(Uia[] uiaArr, Pla pla, C1533dma dma) {
        this.f12408f = 0;
        for (int i = 0; i < uiaArr.length; i++) {
            if (dma.a(i) != null) {
                this.f12408f += Tma.b(uiaArr[i].a());
            }
        }
        this.f12403a.a(this.f12408f);
    }

    public final synchronized boolean a(long j) {
        boolean z = false;
        char c2 = j > this.f12405c ? 0 : j < this.f12404b ? (char) 2 : 1;
        boolean z2 = this.f12403a.b() >= this.f12408f;
        if (c2 == 2 || (c2 == 1 && this.f12409g && !z2)) {
            z = true;
        }
        this.f12409g = z;
        return this.f12409g;
    }

    public final synchronized boolean a(long j, boolean z) {
        long j2;
        j2 = z ? this.f12407e : this.f12406d;
        return j2 <= 0 || j >= j2;
    }

    public final C2028kma b() {
        return this.f12403a;
    }

    public final synchronized void b(int i) {
        this.f12407e = ((long) i) * 1000;
    }

    public final void c() {
        a(true);
    }

    public final synchronized void c(int i) {
        this.f12404b = ((long) i) * 1000;
    }

    public final void d() {
        a(true);
    }

    public final synchronized void d(int i) {
        this.f12405c = ((long) i) * 1000;
    }
}
