package com.google.android.gms.internal.ads;

final class LJ implements C0979Px {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ OS f7658a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2988yS f7659b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C2693uH f7660c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ JJ f7661d;

    LJ(JJ jj, OS os, C2988yS ySVar, C2693uH uHVar) {
        this.f7661d = jj;
        this.f7658a = os;
        this.f7659b = ySVar;
        this.f7660c = uHVar;
    }

    public final void a(int i) {
        String valueOf = String.valueOf(this.f7660c.f12305a);
        C1018Rk.d(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "));
    }

    public final void da() {
        this.f7661d.f7396b.execute(new KJ(this, this.f7658a, this.f7659b, this.f7660c));
    }
}
