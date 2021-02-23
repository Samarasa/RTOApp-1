package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.b.a;
import java.util.concurrent.atomic.AtomicReference;

public final class MK implements a, C2608su, C2963xu, C0872Lu, C1900iv, C0613Bv, C1540dqa {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<Tqa> f7821a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<C2322ora> f7822b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<Mra> f7823c = new AtomicReference<>();

    public final void H() {
        C1569eR.a(this.f7821a, PK.f8204a);
    }

    public final void I() {
        C1569eR.a(this.f7821a, UK.f8883a);
    }

    public final synchronized Tqa J() {
        return this.f7821a.get();
    }

    public final void K() {
    }

    public final void L() {
    }

    public final void M() {
        C1569eR.a(this.f7821a, SK.f8601a);
    }

    public final void N() {
        C1569eR.a(this.f7821a, QK.f8316a);
    }

    public final void O() {
        C1569eR.a(this.f7821a, LK.f7662a);
    }

    public final synchronized C2322ora X() {
        return this.f7822b.get();
    }

    public final void a(C0886Mi mi, String str, String str2) {
    }

    public final void a(Mra mra) {
        this.f7823c.set(mra);
    }

    public final void a(Tqa tqa) {
        this.f7821a.set(tqa);
    }

    public final void a(C1824hqa hqa) {
        C1569eR.a(this.f7821a, new OK(hqa));
        C1569eR.a(this.f7821a, new NK(hqa));
    }

    public final void a(C2322ora ora) {
        this.f7822b.set(ora);
    }

    public final void a(C2603sqa sqa) {
        C1569eR.a(this.f7823c, new TK(sqa));
    }

    public final void a(String str, String str2) {
        C1569eR.a(this.f7822b, new XK(str, str2));
    }

    public final void onAdClicked() {
        C1569eR.a(this.f7821a, RK.f8455a);
    }
}
