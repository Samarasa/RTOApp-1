package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import c.b.b.b.d.f.Fd;
import com.google.android.gms.common.util.e;

public final class Ud extends C3137eb {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Handler f13434c;

    /* renamed from: d  reason: collision with root package name */
    protected C3134de f13435d = new C3134de(this);

    /* renamed from: e  reason: collision with root package name */
    protected C3122be f13436e = new C3122be(this);

    /* renamed from: f  reason: collision with root package name */
    private Vd f13437f = new Vd(this);

    Ud(C3144fc fcVar) {
        super(fcVar);
    }

    /* access modifiers changed from: private */
    public final void C() {
        c();
        if (this.f13434c == null) {
            this.f13434c = new Fd(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: private */
    public final void a(long j) {
        c();
        C();
        h().B().a("Activity resumed, time", Long.valueOf(j));
        this.f13437f.a();
        this.f13436e.a(j);
        C3134de deVar = this.f13435d;
        deVar.f13545a.c();
        if (deVar.f13545a.f13807a.c()) {
            if (deVar.f13545a.m().a(C3202q.U)) {
                deVar.f13545a.l().z.a(false);
            }
            deVar.a(deVar.f13545a.j().a(), false);
        }
    }

    /* access modifiers changed from: private */
    public final void b(long j) {
        c();
        C();
        h().B().a("Activity paused, time", Long.valueOf(j));
        this.f13437f.b();
        this.f13436e.b(j);
        C3134de deVar = this.f13435d;
        if (deVar.f13545a.m().a(C3202q.U)) {
            deVar.f13545a.l().z.a(true);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean A() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void B() {
        g().a((Runnable) new Td(this, j().b()));
    }

    public final boolean a(boolean z, boolean z2) {
        return this.f13436e.a(z, z2);
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ C3159i d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C3248zb e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ Context f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ Zb g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ Bb h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ He i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ e j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ se k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Lb l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Ie m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ B o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ Hc p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ C3223ub q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ C3191nd s() {
        return super.s();
    }
}
