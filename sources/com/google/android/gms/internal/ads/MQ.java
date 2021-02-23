package com.google.android.gms.internal.ads;

final class MQ implements C1917jL<C2463qr> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ IQ f7839a;

    MQ(IQ iq) {
        this.f7839a = iq;
    }

    public final void a() {
        synchronized (this.f7839a) {
            this.f7839a.i = null;
        }
    }

    public final /* synthetic */ void a(Object obj) {
        C2463qr qrVar = (C2463qr) obj;
        synchronized (this.f7839a) {
            if (this.f7839a.i != null) {
                this.f7839a.i.a();
            }
            this.f7839a.i = qrVar;
            this.f7839a.a(qrVar);
            this.f7839a.f7290f.a((C1749goa) new C2675tr(qrVar, this.f7839a, this.f7839a.f7290f));
            qrVar.b();
        }
    }
}
