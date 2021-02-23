package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final /* synthetic */ class Zd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final _d f13484a;

    Zd(_d _dVar) {
        this.f13484a = _dVar;
    }

    public final void run() {
        _d _dVar = this.f13484a;
        Vd vd = _dVar.f13494b;
        long j = _dVar.f13493a;
        vd.f13450c.c();
        vd.f13450c.h().A().a("Application going to the background");
        vd.f13450c.p().a("auto", "_ab", j, new Bundle());
    }
}
