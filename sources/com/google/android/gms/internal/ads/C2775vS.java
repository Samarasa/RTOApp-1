package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vS  reason: case insensitive filesystem */
final class C2775vS implements C1917jL<C2405qC> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2562sS f12499a;

    C2775vS(C2562sS sSVar) {
        this.f12499a = sSVar;
    }

    public final void a() {
        synchronized (this.f12499a) {
            C2405qC unused = this.f12499a.f12086d = null;
        }
    }

    public final /* synthetic */ void a(Object obj) {
        C2405qC qCVar = (C2405qC) obj;
        synchronized (this.f12499a) {
            C2405qC unused = this.f12499a.f12086d = qCVar;
            this.f12499a.f12086d.b();
        }
    }
}
