package com.google.android.gms.internal.ads;

final class OT {

    /* renamed from: a  reason: collision with root package name */
    private final NT f8089a = new NT();

    /* renamed from: b  reason: collision with root package name */
    private int f8090b;

    /* renamed from: c  reason: collision with root package name */
    private int f8091c;

    /* renamed from: d  reason: collision with root package name */
    private int f8092d;

    /* renamed from: e  reason: collision with root package name */
    private int f8093e;

    /* renamed from: f  reason: collision with root package name */
    private int f8094f;

    OT() {
    }

    public final void a() {
        this.f8092d++;
    }

    public final void b() {
        this.f8093e++;
    }

    public final void c() {
        this.f8090b++;
        this.f8089a.f7967a = true;
    }

    public final void d() {
        this.f8091c++;
        this.f8089a.f7968b = true;
    }

    public final void e() {
        this.f8094f++;
    }

    public final NT f() {
        NT nt = (NT) this.f8089a.clone();
        NT nt2 = this.f8089a;
        nt2.f7967a = false;
        nt2.f7968b = false;
        return nt;
    }

    public final String g() {
        return "\n\tPool does not exist: " + this.f8092d + "\n\tNew pools created: " + this.f8090b + "\n\tPools removed: " + this.f8091c + "\n\tEntries added: " + this.f8094f + "\n\tNo entries retrieved: " + this.f8093e + "\n";
    }
}
