package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oQ  reason: case insensitive filesystem */
final class C2277oQ implements AY<AppOpenAd> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1917jL f11586a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2419qQ f11587b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C2206nQ f11588c;

    C2277oQ(C2206nQ nQVar, C1917jL jLVar, C2419qQ qQVar) {
        this.f11588c = nQVar;
        this.f11586a = jLVar;
        this.f11587b = qQVar;
    }

    public final /* synthetic */ void a(Object obj) {
        C3103zs zsVar = (C3103zs) obj;
        synchronized (this.f11588c) {
            LY unused = this.f11588c.f11463h = null;
            if (((Boolean) Qqa.e().a(F.vf)).booleanValue()) {
                zsVar.f().a(this.f11588c.f11459d);
            }
            this.f11586a.a(zsVar);
        }
    }

    public final void a(Throwable th) {
        C1825hr hrVar = (C1825hr) this.f11588c.f11460e.a();
        C1824hqa a2 = hrVar == null ? C2209nT.a(th, (C3048zH) null) : hrVar.b().a(th);
        synchronized (this.f11588c) {
            LY unused = this.f11588c.f11463h = null;
            if (hrVar != null) {
                hrVar.d().a(a2);
                if (((Boolean) Qqa.e().a(F.vf)).booleanValue()) {
                    this.f11588c.f11457b.execute(new C2489rQ(this, a2));
                }
            } else {
                this.f11588c.f11459d.a(a2);
                ((C1825hr) this.f11588c.a((C2207nR) this.f11587b).a()).b().c().O();
            }
            C1713gT.a(a2.f10744a, th, "AppOpenAdLoader.onFailure");
            this.f11586a.a();
        }
    }
}
