package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.i.a;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.ads.mediation.v;
import com.google.android.gms.ads.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class asa {

    /* renamed from: a  reason: collision with root package name */
    private final Date f9847a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9848b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f9849c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9850d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<String> f9851e;

    /* renamed from: f  reason: collision with root package name */
    private final Location f9852f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f9853g;

    /* renamed from: h  reason: collision with root package name */
    private final Bundle f9854h;
    private final Map<Class<? extends v>, v> i;
    private final String j;
    private final String k;
    private final a l;
    private final int m;
    private final Set<String> n;
    private final Bundle o;
    private final Set<String> p;
    private final boolean q;
    private final com.google.android.gms.ads.g.a r;
    private final int s;
    private final String t;
    private final int u;

    public asa(Zra zra) {
        this(zra, (a) null);
    }

    public asa(Zra zra, a aVar) {
        this.f9847a = zra.f9603g;
        this.f9848b = zra.f9604h;
        this.f9849c = zra.i;
        this.f9850d = zra.j;
        this.f9851e = Collections.unmodifiableSet(zra.f9597a);
        this.f9852f = zra.k;
        this.f9853g = zra.l;
        this.f9854h = zra.f9598b;
        this.i = Collections.unmodifiableMap(zra.f9599c);
        this.j = zra.m;
        this.k = zra.n;
        this.l = aVar;
        this.m = zra.o;
        this.n = Collections.unmodifiableSet(zra.f9600d);
        this.o = zra.f9601e;
        this.p = Collections.unmodifiableSet(zra.f9602f);
        this.q = zra.p;
        this.r = zra.q;
        this.s = zra.r;
        this.t = zra.s;
        this.u = zra.t;
    }

    public final Bundle a(Class<? extends j> cls) {
        return this.f9854h.getBundle(cls.getName());
    }

    @Deprecated
    public final Date a() {
        return this.f9847a;
    }

    public final boolean a(Context context) {
        t b2 = dsa.d().b();
        Qqa.a();
        String a2 = C0758Hk.a(context);
        return this.n.contains(a2) || b2.d().contains(a2);
    }

    public final String b() {
        return this.f9848b;
    }

    public final Bundle c() {
        return this.o;
    }

    @Deprecated
    public final int d() {
        return this.f9850d;
    }

    public final Set<String> e() {
        return this.f9851e;
    }

    public final Location f() {
        return this.f9852f;
    }

    public final boolean g() {
        return this.f9853g;
    }

    public final String h() {
        return this.t;
    }

    public final String i() {
        return this.j;
    }

    @Deprecated
    public final boolean j() {
        return this.q;
    }

    public final List<String> k() {
        return new ArrayList(this.f9849c);
    }

    public final String l() {
        return this.k;
    }

    public final a m() {
        return this.l;
    }

    public final Map<Class<? extends v>, v> n() {
        return this.i;
    }

    public final Bundle o() {
        return this.f9854h;
    }

    public final int p() {
        return this.m;
    }

    public final Set<String> q() {
        return this.p;
    }

    public final com.google.android.gms.ads.g.a r() {
        return this.r;
    }

    public final int s() {
        return this.s;
    }

    public final int t() {
        return this.u;
    }
}
