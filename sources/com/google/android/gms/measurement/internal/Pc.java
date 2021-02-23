package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import c.b.b.b.d.f.C0467ze;
import java.util.concurrent.atomic.AtomicReference;

final class Pc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f13383a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Hc f13384b;

    Pc(Hc hc, long j) {
        this.f13384b = hc;
        this.f13383a = j;
    }

    public final void run() {
        Hc hc = this.f13384b;
        long j = this.f13383a;
        hc.c();
        hc.a();
        hc.x();
        hc.h().A().a("Resetting analytics data (FE)");
        Ud u = hc.u();
        u.c();
        u.f13436e.a();
        boolean c2 = hc.f13807a.c();
        Lb l = hc.l();
        l.k.a(j);
        if (!TextUtils.isEmpty(l.l().C.a())) {
            l.C.a((String) null);
        }
        if (C0467ze.b() && l.m().a(C3202q.Qa)) {
            l.w.a(0);
        }
        if (!l.m().p()) {
            l.c(!c2);
        }
        hc.r().D();
        if (C0467ze.b() && hc.m().a(C3202q.Qa)) {
            hc.u().f13435d.a();
        }
        hc.f13288h = !c2;
        this.f13384b.r().a((AtomicReference<String>) new AtomicReference());
    }
}
