package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C0563t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.ec  reason: case insensitive filesystem */
final class C3138ec {
    private long A;
    private long B;
    private long C;
    private String D;
    private boolean E;
    private long F;
    private long G;

    /* renamed from: a  reason: collision with root package name */
    private final C3144fc f13549a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13550b;

    /* renamed from: c  reason: collision with root package name */
    private String f13551c;

    /* renamed from: d  reason: collision with root package name */
    private String f13552d;

    /* renamed from: e  reason: collision with root package name */
    private String f13553e;

    /* renamed from: f  reason: collision with root package name */
    private String f13554f;

    /* renamed from: g  reason: collision with root package name */
    private long f13555g;

    /* renamed from: h  reason: collision with root package name */
    private long f13556h;
    private long i;
    private String j;
    private long k;
    private String l;
    private long m;
    private long n;
    private boolean o;
    private long p;
    private boolean q;
    private boolean r;
    private String s;
    private Boolean t;
    private long u;
    private List<String> v;
    private String w;
    private long x;
    private long y;
    private long z;

    C3138ec(C3144fc fcVar, String str) {
        C0563t.a(fcVar);
        C0563t.b(str);
        this.f13549a = fcVar;
        this.f13550b = str;
        this.f13549a.g().c();
    }

    public final boolean A() {
        this.f13549a.g().c();
        return this.o;
    }

    public final long B() {
        this.f13549a.g().c();
        return this.f13555g;
    }

    public final long C() {
        this.f13549a.g().c();
        return this.F;
    }

    public final long D() {
        this.f13549a.g().c();
        return this.G;
    }

    public final void E() {
        this.f13549a.g().c();
        long j2 = this.f13555g + 1;
        if (j2 > 2147483647L) {
            this.f13549a.h().w().a("Bundle index overflow. appId", Bb.a(this.f13550b));
            j2 = 0;
        }
        this.E = true;
        this.f13555g = j2;
    }

    public final long F() {
        this.f13549a.g().c();
        return this.x;
    }

    public final long G() {
        this.f13549a.g().c();
        return this.y;
    }

    public final long H() {
        this.f13549a.g().c();
        return this.z;
    }

    public final long I() {
        this.f13549a.g().c();
        return this.A;
    }

    public final void a(long j2) {
        this.f13549a.g().c();
        this.E |= this.f13556h != j2;
        this.f13556h = j2;
    }

    public final void a(Boolean bool) {
        this.f13549a.g().c();
        this.E |= !se.a(this.t, bool);
        this.t = bool;
    }

    public final void a(String str) {
        this.f13549a.g().c();
        this.E |= !se.c(this.f13551c, str);
        this.f13551c = str;
    }

    public final void a(List<String> list) {
        this.f13549a.g().c();
        if (!se.a(this.v, list)) {
            this.E = true;
            this.v = list != null ? new ArrayList(list) : null;
        }
    }

    public final void a(boolean z2) {
        this.f13549a.g().c();
        this.E |= this.o != z2;
        this.o = z2;
    }

    public final boolean a() {
        this.f13549a.g().c();
        return this.E;
    }

    public final long b() {
        this.f13549a.g().c();
        return this.C;
    }

    public final void b(long j2) {
        this.f13549a.g().c();
        this.E |= this.i != j2;
        this.i = j2;
    }

    public final void b(String str) {
        this.f13549a.g().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !se.c(this.f13552d, str);
        this.f13552d = str;
    }

    public final void b(boolean z2) {
        this.f13549a.g().c();
        this.E |= this.q != z2;
        this.q = z2;
    }

    public final long c() {
        this.f13549a.g().c();
        return this.B;
    }

    public final void c(long j2) {
        this.f13549a.g().c();
        this.E |= this.k != j2;
        this.k = j2;
    }

    public final void c(String str) {
        this.f13549a.g().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !se.c(this.s, str);
        this.s = str;
    }

    public final void c(boolean z2) {
        this.f13549a.g().c();
        this.E |= this.r != z2;
        this.r = z2;
    }

    public final String d() {
        this.f13549a.g().c();
        return this.D;
    }

    public final void d(long j2) {
        this.f13549a.g().c();
        this.E |= this.m != j2;
        this.m = j2;
    }

    public final void d(String str) {
        this.f13549a.g().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !se.c(this.w, str);
        this.w = str;
    }

    public final String e() {
        this.f13549a.g().c();
        String str = this.D;
        i((String) null);
        return str;
    }

    public final void e(long j2) {
        this.f13549a.g().c();
        this.E |= this.n != j2;
        this.n = j2;
    }

    public final void e(String str) {
        this.f13549a.g().c();
        this.E |= !se.c(this.f13553e, str);
        this.f13553e = str;
    }

    public final long f() {
        this.f13549a.g().c();
        return this.p;
    }

    public final void f(long j2) {
        this.f13549a.g().c();
        this.E |= this.u != j2;
        this.u = j2;
    }

    public final void f(String str) {
        this.f13549a.g().c();
        this.E |= !se.c(this.f13554f, str);
        this.f13554f = str;
    }

    public final void g(long j2) {
        boolean z2 = true;
        C0563t.a(j2 >= 0);
        this.f13549a.g().c();
        boolean z3 = this.E;
        if (this.f13555g == j2) {
            z2 = false;
        }
        this.E = z2 | z3;
        this.f13555g = j2;
    }

    public final void g(String str) {
        this.f13549a.g().c();
        this.E |= !se.c(this.j, str);
        this.j = str;
    }

    public final boolean g() {
        this.f13549a.g().c();
        return this.q;
    }

    public final void h(long j2) {
        this.f13549a.g().c();
        this.E |= this.F != j2;
        this.F = j2;
    }

    public final void h(String str) {
        this.f13549a.g().c();
        this.E |= !se.c(this.l, str);
        this.l = str;
    }

    public final boolean h() {
        this.f13549a.g().c();
        return this.r;
    }

    public final Boolean i() {
        this.f13549a.g().c();
        return this.t;
    }

    public final void i(long j2) {
        this.f13549a.g().c();
        this.E |= this.G != j2;
        this.G = j2;
    }

    public final void i(String str) {
        this.f13549a.g().c();
        this.E |= !se.c(this.D, str);
        this.D = str;
    }

    public final List<String> j() {
        this.f13549a.g().c();
        return this.v;
    }

    public final void j(long j2) {
        this.f13549a.g().c();
        this.E |= this.x != j2;
        this.x = j2;
    }

    public final void k() {
        this.f13549a.g().c();
        this.E = false;
    }

    public final void k(long j2) {
        this.f13549a.g().c();
        this.E |= this.y != j2;
        this.y = j2;
    }

    public final String l() {
        this.f13549a.g().c();
        return this.f13550b;
    }

    public final void l(long j2) {
        this.f13549a.g().c();
        this.E |= this.z != j2;
        this.z = j2;
    }

    public final String m() {
        this.f13549a.g().c();
        return this.f13551c;
    }

    public final void m(long j2) {
        this.f13549a.g().c();
        this.E |= this.A != j2;
        this.A = j2;
    }

    public final String n() {
        this.f13549a.g().c();
        return this.f13552d;
    }

    public final void n(long j2) {
        this.f13549a.g().c();
        this.E |= this.C != j2;
        this.C = j2;
    }

    public final String o() {
        this.f13549a.g().c();
        return this.s;
    }

    public final void o(long j2) {
        this.f13549a.g().c();
        this.E |= this.B != j2;
        this.B = j2;
    }

    public final String p() {
        this.f13549a.g().c();
        return this.w;
    }

    public final void p(long j2) {
        this.f13549a.g().c();
        this.E |= this.p != j2;
        this.p = j2;
    }

    public final String q() {
        this.f13549a.g().c();
        return this.f13553e;
    }

    public final String r() {
        this.f13549a.g().c();
        return this.f13554f;
    }

    public final long s() {
        this.f13549a.g().c();
        return this.f13556h;
    }

    public final long t() {
        this.f13549a.g().c();
        return this.i;
    }

    public final String u() {
        this.f13549a.g().c();
        return this.j;
    }

    public final long v() {
        this.f13549a.g().c();
        return this.k;
    }

    public final String w() {
        this.f13549a.g().c();
        return this.l;
    }

    public final long x() {
        this.f13549a.g().c();
        return this.m;
    }

    public final long y() {
        this.f13549a.g().c();
        return this.n;
    }

    public final long z() {
        this.f13549a.g().c();
        return this.u;
    }
}
