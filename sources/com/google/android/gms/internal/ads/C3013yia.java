package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yia  reason: case insensitive filesystem */
public abstract class C3013yia implements Tia, Uia {

    /* renamed from: a  reason: collision with root package name */
    private final int f12953a;

    /* renamed from: b  reason: collision with root package name */
    private Xia f12954b;

    /* renamed from: c  reason: collision with root package name */
    private int f12955c;

    /* renamed from: d  reason: collision with root package name */
    private int f12956d;

    /* renamed from: e  reason: collision with root package name */
    private Mla f12957e;

    /* renamed from: f  reason: collision with root package name */
    private long f12958f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f12959g = true;

    /* renamed from: h  reason: collision with root package name */
    private boolean f12960h;

    public C3013yia(int i) {
        this.f12953a = i;
    }

    public final void A() {
        boolean z = true;
        if (this.f12956d != 1) {
            z = false;
        }
        Cma.b(z);
        this.f12956d = 0;
        this.f12957e = null;
        this.f12960h = false;
        h();
    }

    public final boolean B() {
        return this.f12960h;
    }

    public final void C() {
        this.f12957e.a();
    }

    public final int a() {
        return this.f12953a;
    }

    /* access modifiers changed from: protected */
    public final int a(Nia nia, Ija ija, boolean z) {
        int a2 = this.f12957e.a(nia, ija, z);
        if (a2 == -4) {
            if (ija.c()) {
                this.f12959g = true;
                return this.f12960h ? -4 : -3;
            }
            ija.f7323d += this.f12958f;
        } else if (a2 == -5) {
            Lia lia = nia.f7998a;
            long j = lia.w;
            if (j != Long.MAX_VALUE) {
                nia.f7998a = lia.a(j + this.f12958f);
            }
        }
        return a2;
    }

    public void a(int i, Object obj) {
    }

    public final void a(long j) {
        this.f12960h = false;
        this.f12959g = false;
        a(j, false);
    }

    /* access modifiers changed from: protected */
    public abstract void a(long j, boolean z);

    public final void a(Xia xia, Lia[] liaArr, Mla mla, long j, boolean z, long j2) {
        Cma.b(this.f12956d == 0);
        this.f12954b = xia;
        this.f12956d = 1;
        a(z);
        a(liaArr, mla, j2);
        a(j, z);
    }

    /* access modifiers changed from: protected */
    public abstract void a(boolean z);

    /* access modifiers changed from: protected */
    public void a(Lia[] liaArr, long j) {
    }

    public final void a(Lia[] liaArr, Mla mla, long j) {
        Cma.b(!this.f12960h);
        this.f12957e = mla;
        this.f12959g = false;
        this.f12958f = j;
        a(liaArr, j);
    }

    /* access modifiers changed from: protected */
    public final void b(long j) {
        this.f12957e.a(j - this.f12958f);
    }

    /* access modifiers changed from: protected */
    public final int e() {
        return this.f12955c;
    }

    /* access modifiers changed from: protected */
    public abstract void f();

    /* access modifiers changed from: protected */
    public abstract void g();

    public final int getState() {
        return this.f12956d;
    }

    /* access modifiers changed from: protected */
    public abstract void h();

    /* access modifiers changed from: protected */
    public final Xia i() {
        return this.f12954b;
    }

    /* access modifiers changed from: protected */
    public final boolean j() {
        return this.f12959g ? this.f12960h : this.f12957e.t();
    }

    public final void setIndex(int i) {
        this.f12955c = i;
    }

    public final void start() {
        boolean z = true;
        if (this.f12956d != 1) {
            z = false;
        }
        Cma.b(z);
        this.f12956d = 2;
        f();
    }

    public final void stop() {
        Cma.b(this.f12956d == 2);
        this.f12956d = 1;
        g();
    }

    public final boolean v() {
        return this.f12959g;
    }

    public final void w() {
        this.f12960h = true;
    }

    public final Tia x() {
        return this;
    }

    public Gma y() {
        return null;
    }

    public final Mla z() {
        return this.f12957e;
    }
}
