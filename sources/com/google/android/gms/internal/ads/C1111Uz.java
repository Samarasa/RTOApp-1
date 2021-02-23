package com.google.android.gms.internal.ads;

import b.e.i;

/* renamed from: com.google.android.gms.internal.ads.Uz  reason: case insensitive filesystem */
public final class C1111Uz {

    /* renamed from: a  reason: collision with root package name */
    C0879Mb f8987a;

    /* renamed from: b  reason: collision with root package name */
    C0853Lb f8988b;

    /* renamed from: c  reason: collision with root package name */
    C1243_b f8989c;

    /* renamed from: d  reason: collision with root package name */
    C1217Zb f8990d;

    /* renamed from: e  reason: collision with root package name */
    C1037Sd f8991e;

    /* renamed from: f  reason: collision with root package name */
    final i<String, C1035Sb> f8992f = new i<>();

    /* renamed from: g  reason: collision with root package name */
    final i<String, C1009Rb> f8993g = new i<>();

    public final C1059Sz a() {
        return new C1059Sz(this);
    }

    public final C1111Uz a(C0853Lb lb) {
        this.f8988b = lb;
        return this;
    }

    public final C1111Uz a(C0879Mb mb) {
        this.f8987a = mb;
        return this;
    }

    public final C1111Uz a(C1037Sd sd) {
        this.f8991e = sd;
        return this;
    }

    public final C1111Uz a(C1217Zb zb) {
        this.f8990d = zb;
        return this;
    }

    public final C1111Uz a(C1243_b _bVar) {
        this.f8989c = _bVar;
        return this;
    }

    public final C1111Uz a(String str, C1035Sb sb, C1009Rb rb) {
        this.f8992f.put(str, sb);
        this.f8993g.put(str, rb);
        return this;
    }
}
