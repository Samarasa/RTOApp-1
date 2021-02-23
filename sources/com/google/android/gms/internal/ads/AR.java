package com.google.android.gms.internal.ads;

final class AR implements AY<C1337ay> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1917jL f6110a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0616By f6111b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C2987yR f6112c;

    AR(C2987yR yRVar, C1917jL jLVar, C0616By by) {
        this.f6112c = yRVar;
        this.f6110a = jLVar;
        this.f6111b = by;
    }

    public final /* synthetic */ void a(Object obj) {
        C1337ay ayVar = (C1337ay) obj;
        synchronized (this.f6112c) {
            LY unused = this.f6112c.f12913h = null;
            if (((Boolean) Qqa.e().a(F.wf)).booleanValue()) {
                C2256nw f2 = ayVar.f();
                f2.a(this.f6112c.f12909d);
                f2.a(this.f6112c.f12910e);
            }
            this.f6110a.a(ayVar);
            if (((Boolean) Qqa.e().a(F.wf)).booleanValue()) {
                this.f6112c.f12907b.execute(new C3058zR(this));
                this.f6112c.f12907b.execute(new CR(this));
            }
        }
    }

    public final void a(Throwable th) {
        C1824hqa a2 = this.f6111b.a().a(th);
        synchronized (this.f6112c) {
            LY unused = this.f6112c.f12913h = null;
            this.f6111b.b().a(a2);
            if (((Boolean) Qqa.e().a(F.wf)).booleanValue()) {
                this.f6112c.f12907b.execute(new BR(this, a2));
                this.f6112c.f12907b.execute(new FR(this, a2));
            }
            C1713gT.a(a2.f10744a, th, "InterstitialAdLoader.onFailure");
            this.f6110a.a();
        }
    }
}
