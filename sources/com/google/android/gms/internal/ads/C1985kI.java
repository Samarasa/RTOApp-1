package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kI  reason: case insensitive filesystem */
final class C1985kI implements AY<C0583Ar> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1914jI f11044a;

    C1985kI(C1914jI jIVar) {
        this.f11044a = jIVar;
    }

    public final /* synthetic */ void a(Object obj) {
        ((C0583Ar) obj).b();
    }

    public final void a(Throwable th) {
        C1824hqa a2 = this.f11044a.f10894a.a().a(th);
        this.f11044a.f10897d.a(a2);
        C1713gT.a(a2.f10744a, th, "DelayedBannerAd.onFailure");
    }
}
