package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final /* synthetic */ class Xd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Vd f13462a;

    Xd(Vd vd) {
        this.f13462a = vd;
    }

    public final void run() {
        Vd vd = this.f13462a;
        vd.f13450c.c();
        vd.f13450c.h().A().a("Application backgrounded");
        vd.f13450c.p().b("auto", "_ab", new Bundle());
    }
}
