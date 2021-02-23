package com.google.android.gms.measurement.internal;

final class _d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    long f13493a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Vd f13494b;

    _d(Vd vd, long j) {
        this.f13494b = vd;
        this.f13493a = j;
    }

    public final void run() {
        this.f13494b.f13450c.g().a((Runnable) new Zd(this));
    }
}
