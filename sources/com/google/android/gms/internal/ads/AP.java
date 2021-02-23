package com.google.android.gms.internal.ads;

public final class AP implements JO<C2914xP> {

    /* renamed from: a  reason: collision with root package name */
    private C2236nk f6106a;

    /* renamed from: b  reason: collision with root package name */
    private PY f6107b;

    /* renamed from: c  reason: collision with root package name */
    private String f6108c;

    public AP(C2236nk nkVar, PY py, String str) {
        this.f6106a = nkVar;
        this.f6107b = py;
        this.f6108c = str;
    }

    public final LY<C2914xP> a() {
        new C1742gl();
        LY<String> a2 = DY.a(null);
        if (((Boolean) Qqa.e().a(F.ce)).booleanValue()) {
            a2 = this.f6106a.a(this.f6108c);
        }
        LY<String> b2 = this.f6106a.b(this.f6108c);
        return DY.b((LY<? extends V>[]) new LY[]{a2, b2}).a(new C3056zP(a2, b2), C1252_k.f9699a);
    }
}
