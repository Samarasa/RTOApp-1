package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bL  reason: case insensitive filesystem */
final class C1351bL implements C1917jL<C1337ay> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1422cL f9898a;

    C1351bL(C1422cL cLVar) {
        this.f9898a = cLVar;
    }

    public final void a() {
        synchronized (this.f9898a) {
            C1337ay unused = this.f9898a.f10018g = null;
        }
    }

    public final /* synthetic */ void a(Object obj) {
        C1337ay ayVar = (C1337ay) obj;
        synchronized (this.f9898a) {
            C1337ay unused = this.f9898a.f10018g = ayVar;
            this.f9898a.f10018g.b();
        }
    }
}
