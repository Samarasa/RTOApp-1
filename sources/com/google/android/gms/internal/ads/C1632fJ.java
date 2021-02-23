package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.fJ  reason: case insensitive filesystem */
final class C1632fJ implements AY<T> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f10373a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f10374b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C2988yS f10375c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ DS f10376d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C1703gJ f10377e;

    C1632fJ(C1703gJ gJVar, long j, String str, C2988yS ySVar, DS ds) {
        this.f10377e = gJVar;
        this.f10373a = j;
        this.f10374b = str;
        this.f10375c = ySVar;
        this.f10376d = ds;
    }

    public final void a(T t) {
        long b2 = this.f10377e.f10517a.b() - this.f10373a;
        this.f10377e.a(this.f10374b, 0, b2, this.f10375c.ba);
        if (this.f10377e.f10520d) {
            this.f10377e.f10518b.a(this.f10376d, this.f10375c, 0, (C2835wH) null, b2);
        }
        if (((Boolean) Qqa.e().a(F.Ff)).booleanValue()) {
            this.f10377e.f10521e.a(this.f10375c, b2, (C1824hqa) null);
        }
    }

    public final void a(Throwable th) {
        C1824hqa hqa;
        long b2 = this.f10377e.f10517a.b() - this.f10373a;
        int i = th instanceof TimeoutException ? 2 : th instanceof XI ? 3 : th instanceof CancellationException ? 4 : th instanceof WS ? 5 : (!(th instanceof VE) || C2209nT.a(th).f10744a != 3) ? 6 : 1;
        this.f10377e.a(this.f10374b, i, b2, this.f10375c.ba);
        if (this.f10377e.f10520d) {
            this.f10377e.f10518b.a(this.f10376d, this.f10375c, i, th instanceof C2835wH ? (C2835wH) th : null, b2);
        }
        if (((Boolean) Qqa.e().a(F.Ff)).booleanValue()) {
            C1824hqa a2 = C2209nT.a(th);
            int i2 = a2.f10744a;
            if ((i2 == 3 || i2 == 0) && (hqa = a2.f10747d) != null && !hqa.f10746c.equals("com.google.android.gms.ads")) {
                a2 = C2209nT.a(new C2835wH(C2351pT.MEDIATION_NO_FILL, a2.f10747d));
            }
            this.f10377e.f10521e.a(this.f10375c, b2, a2);
        }
    }
}
