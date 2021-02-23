package com.google.android.gms.internal.ads;

import android.os.Bundle;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import java.util.List;

public final class MB extends C0619Cb {

    /* renamed from: a  reason: collision with root package name */
    private final String f7797a;

    /* renamed from: b  reason: collision with root package name */
    private final C3110zz f7798b;

    /* renamed from: c  reason: collision with root package name */
    private final C0877Lz f7799c;

    public MB(String str, C3110zz zzVar, C0877Lz lz) {
        this.f7797a = str;
        this.f7798b = zzVar;
        this.f7799c = lz;
    }

    public final a B() {
        return b.a(this.f7798b);
    }

    public final String R() {
        return this.f7799c.b();
    }

    public final void d(Bundle bundle) {
        this.f7798b.a(bundle);
    }

    public final void destroy() {
        this.f7798b.a();
    }

    public final boolean e(Bundle bundle) {
        return this.f7798b.c(bundle);
    }

    public final void f(Bundle bundle) {
        this.f7798b.b(bundle);
    }

    public final Bundle getExtras() {
        return this.f7799c.f();
    }

    public final Sra getVideoController() {
        return this.f7799c.n();
    }

    public final String o() {
        return this.f7797a;
    }

    public final String r() {
        return this.f7799c.g();
    }

    public final C2076lb ra() {
        return this.f7799c.C();
    }

    public final String s() {
        return this.f7799c.d();
    }

    public final String v() {
        return this.f7799c.c();
    }

    public final a w() {
        return this.f7799c.B();
    }

    public final C1580eb x() {
        return this.f7799c.A();
    }

    public final List<?> y() {
        return this.f7799c.h();
    }
}
