package com.google.android.gms.internal.ads;

import android.os.Bundle;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import java.util.Collections;
import java.util.List;

public final class UB extends C1936jc {

    /* renamed from: a  reason: collision with root package name */
    private final String f8855a;

    /* renamed from: b  reason: collision with root package name */
    private final C3110zz f8856b;

    /* renamed from: c  reason: collision with root package name */
    private final C0877Lz f8857c;

    public UB(String str, C3110zz zzVar, C0877Lz lz) {
        this.f8855a = str;
        this.f8856b = zzVar;
        this.f8857c = lz;
    }

    public final Nra A() {
        if (!((Boolean) Qqa.e().a(F._e)).booleanValue()) {
            return null;
        }
        return this.f8856b.d();
    }

    public final a B() {
        return b.a(this.f8856b);
    }

    public final void C() {
        this.f8856b.g();
    }

    public final void D() {
        this.f8856b.p();
    }

    public final String E() {
        return this.f8857c.k();
    }

    public final double G() {
        return this.f8857c.l();
    }

    public final String R() {
        return this.f8857c.b();
    }

    public final void Rb() {
        this.f8856b.i();
    }

    public final String S() {
        return this.f8857c.m();
    }

    public final boolean T() {
        return this.f8856b.h();
    }

    public final C2076lb U() {
        return this.f8857c.z();
    }

    public final boolean Va() {
        return !this.f8857c.j().isEmpty() && this.f8857c.r() != null;
    }

    public final void a(Era era) {
        this.f8856b.a(era);
    }

    public final void a(Mra mra) {
        this.f8856b.a(mra);
    }

    public final void a(C1724gc gcVar) {
        this.f8856b.a(gcVar);
    }

    public final void a(C3102zra zra) {
        this.f8856b.a(zra);
    }

    public final void d(Bundle bundle) {
        this.f8856b.a(bundle);
    }

    public final void destroy() {
        this.f8856b.a();
    }

    public final boolean e(Bundle bundle) {
        return this.f8856b.c(bundle);
    }

    public final void f(Bundle bundle) {
        this.f8856b.b(bundle);
    }

    public final Bundle getExtras() {
        return this.f8857c.f();
    }

    public final Sra getVideoController() {
        return this.f8857c.n();
    }

    public final C1793hb ja() {
        return this.f8856b.m().a();
    }

    public final String o() {
        return this.f8855a;
    }

    public final String r() {
        return this.f8857c.g();
    }

    public final String s() {
        return this.f8857c.d();
    }

    public final String v() {
        return this.f8857c.c();
    }

    public final List<?> vb() {
        return Va() ? this.f8857c.j() : Collections.emptyList();
    }

    public final a w() {
        return this.f8857c.B();
    }

    public final C1580eb x() {
        return this.f8857c.A();
    }

    public final List<?> y() {
        return this.f8857c.h();
    }
}
