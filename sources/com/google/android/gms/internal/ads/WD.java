package com.google.android.gms.internal.ads;

public final class WD implements C2963xu, C1900iv, C0795Iv {

    /* renamed from: a  reason: collision with root package name */
    private final C1486dE f9112a;

    /* renamed from: b  reason: collision with root package name */
    private final C1981kE f9113b;

    public WD(C1486dE dEVar, C1981kE kEVar) {
        this.f9112a = dEVar;
        this.f9113b = kEVar;
    }

    public final void H() {
        this.f9112a.a().put("action", "loaded");
        this.f9113b.a(this.f9112a.a());
    }

    public final void a(OS os) {
        this.f9112a.a(os);
    }

    public final void a(C1824hqa hqa) {
        this.f9112a.a().put("action", "ftl");
        this.f9112a.a().put("ftl", String.valueOf(hqa.f10744a));
        this.f9112a.a().put("ed", hqa.f10746c);
        this.f9113b.a(this.f9112a.a());
    }

    public final void a(C2515ri riVar) {
        this.f9112a.a(riVar.f12015a);
    }
}
