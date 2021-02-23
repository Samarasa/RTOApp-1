package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jS  reason: case insensitive filesystem */
final class C1924jS implements AY<C2405qC> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1917jL f10923a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1995kS f10924b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C1570eS f10925c;

    C1924jS(C1570eS eSVar, C1917jL jLVar, C1995kS kSVar) {
        this.f10925c = eSVar;
        this.f10923a = jLVar;
        this.f10924b = kSVar;
    }

    public final /* synthetic */ void a(Object obj) {
        C2405qC qCVar = (C2405qC) obj;
        synchronized (this.f10925c) {
            if (((Boolean) Qqa.e().a(F.uf)).booleanValue()) {
                qCVar.f().a(this.f10925c.f10263d);
            }
            this.f10923a.a(qCVar);
            if (((Boolean) Qqa.e().a(F.uf)).booleanValue()) {
                this.f10925c.f10261b.execute(new C1854iS(this));
            }
            this.f10925c.f10263d.X();
        }
    }

    public final void a(Throwable th) {
        C2617tC tCVar = (C2617tC) this.f10925c.f10264e.a();
        C1824hqa a2 = tCVar == null ? C2209nT.a(th, (C3048zH) null) : tCVar.b().a(th);
        synchronized (this.f10925c) {
            if (tCVar != null) {
                tCVar.d().a(a2);
                if (((Boolean) Qqa.e().a(F.uf)).booleanValue()) {
                    this.f10925c.f10261b.execute(new C2066lS(this, a2));
                }
            } else {
                this.f10925c.f10263d.a(a2);
                this.f10925c.a((C2207nR) this.f10924b).d().b().c().O();
            }
            C1713gT.a(a2.f10744a, th, "RewardedAdLoader.onFailure");
            this.f10923a.a();
        }
    }
}
