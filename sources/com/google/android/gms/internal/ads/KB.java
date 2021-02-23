package com.google.android.gms.internal.ads;

import android.os.Bundle;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import java.util.List;

public final class KB extends C2927xb {

    /* renamed from: a  reason: collision with root package name */
    private final String f7528a;

    /* renamed from: b  reason: collision with root package name */
    private final C3110zz f7529b;

    /* renamed from: c  reason: collision with root package name */
    private final C0877Lz f7530c;

    public KB(String str, C3110zz zzVar, C0877Lz lz) {
        this.f7528a = str;
        this.f7529b = zzVar;
        this.f7530c = lz;
    }

    public final a B() {
        return b.a(this.f7529b);
    }

    public final String E() {
        return this.f7530c.k();
    }

    public final double G() {
        return this.f7530c.l();
    }

    public final String S() {
        return this.f7530c.m();
    }

    public final C2076lb U() {
        return this.f7530c.z();
    }

    public final void d(Bundle bundle) {
        this.f7529b.a(bundle);
    }

    public final void destroy() {
        this.f7529b.a();
    }

    public final boolean e(Bundle bundle) {
        return this.f7529b.c(bundle);
    }

    public final void f(Bundle bundle) {
        this.f7529b.b(bundle);
    }

    public final Bundle getExtras() {
        return this.f7530c.f();
    }

    public final Sra getVideoController() {
        return this.f7530c.n();
    }

    public final String o() {
        return this.f7528a;
    }

    public final String r() {
        return this.f7530c.g();
    }

    public final String s() {
        return this.f7530c.d();
    }

    public final String v() {
        return this.f7530c.c();
    }

    public final a w() {
        return this.f7530c.B();
    }

    public final C1580eb x() {
        return this.f7530c.A();
    }

    public final List<?> y() {
        return this.f7530c.h();
    }
}
