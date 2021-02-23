package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qL  reason: case insensitive filesystem */
final class C2414qL implements AY<C3103zs> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1917jL f11837a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1240Zy f11838b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C2059lL f11839c;

    C2414qL(C2059lL lLVar, C1917jL jLVar, C1240Zy zy) {
        this.f11839c = lLVar;
        this.f11837a = jLVar;
        this.f11838b = zy;
    }

    public final /* synthetic */ void a(Object obj) {
        C3103zs zsVar = (C3103zs) obj;
        synchronized (this.f11839c) {
            if (((Boolean) Qqa.e().a(F.xf)).booleanValue()) {
                zsVar.f().a(this.f11839c.f11160d.b());
            }
            this.f11837a.a(zsVar);
            if (((Boolean) Qqa.e().a(F.xf)).booleanValue()) {
                this.f11839c.f11158b.a().execute(new C2343pL(this));
            }
        }
    }

    public final void a(Throwable th) {
        C1824hqa a2 = this.f11838b.a().a(th);
        this.f11838b.b().a(a2);
        if (((Boolean) Qqa.e().a(F.xf)).booleanValue()) {
            this.f11839c.f11158b.a().execute(new C2555sL(this, a2));
        }
        C1713gT.a(a2.f10744a, th, "NativeAdLoader.onFailure");
        this.f11837a.a();
    }
}
