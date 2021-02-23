package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;

/* renamed from: com.google.android.gms.internal.ads.jU  reason: case insensitive filesystem */
final class C1926jU {

    /* renamed from: a  reason: collision with root package name */
    private final long f10927a = p.j().a();

    /* renamed from: b  reason: collision with root package name */
    private final C2139mU f10928b = new C2139mU();

    /* renamed from: c  reason: collision with root package name */
    private long f10929c = this.f10927a;

    /* renamed from: d  reason: collision with root package name */
    private int f10930d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f10931e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f10932f = 0;

    public final long a() {
        return this.f10927a;
    }

    public final long b() {
        return this.f10929c;
    }

    public final int c() {
        return this.f10930d;
    }

    public final String d() {
        return "Created: " + this.f10927a + " Last accessed: " + this.f10929c + " Accesses: " + this.f10930d + "\nEntries retrieved: Valid: " + this.f10931e + " Stale: " + this.f10932f;
    }

    public final void e() {
        this.f10929c = p.j().a();
        this.f10930d++;
    }

    public final void f() {
        this.f10931e++;
        this.f10928b.f11311a = true;
    }

    public final void g() {
        this.f10932f++;
        this.f10928b.f11312b++;
    }

    public final C2139mU h() {
        C2139mU mUVar = (C2139mU) this.f10928b.clone();
        C2139mU mUVar2 = this.f10928b;
        mUVar2.f11311a = false;
        mUVar2.f11312b = 0;
        return mUVar;
    }
}
