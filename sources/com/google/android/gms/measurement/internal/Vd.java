package com.google.android.gms.measurement.internal;

import c.b.b.b.d.f.C0461ye;

final class Vd {

    /* renamed from: a  reason: collision with root package name */
    private _d f13448a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f13449b = new Yd(this);

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Ud f13450c;

    Vd(Ud ud) {
        this.f13450c = ud;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f13450c.c();
        if (!this.f13450c.m().a(C3202q.Ga)) {
            return;
        }
        if (!C0461ye.b() || !this.f13450c.m().e(this.f13450c.q().B(), C3202q.Ua)) {
            this.f13450c.f13434c.removeCallbacks(this.f13449b);
        } else if (this.f13448a != null) {
            this.f13450c.f13434c.removeCallbacks(this.f13448a);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (!this.f13450c.m().a(C3202q.Ga)) {
            return;
        }
        if (!C0461ye.b() || !this.f13450c.m().e(this.f13450c.q().B(), C3202q.Ua)) {
            this.f13450c.f13434c.postDelayed(this.f13449b, 2000);
            return;
        }
        this.f13448a = new _d(this, this.f13450c.j().a());
        this.f13450c.f13434c.postDelayed(this.f13448a, 2000);
    }
}
