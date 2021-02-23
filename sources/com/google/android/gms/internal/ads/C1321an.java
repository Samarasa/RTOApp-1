package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.an  reason: case insensitive filesystem */
public final class C1321an extends C0994Qm {
    public C1321an(C1175Xl xl) {
        super(xl);
    }

    public final boolean a(String str) {
        C1175Xl xl = (C1175Xl) this.f8388c.get();
        if (xl != null) {
            xl.a(b(str), (C0994Qm) this);
        }
        C1018Rk.d("VideoStreamNoopCache is doing nothing.");
        a(str, b(str), "noop", "Noop cache is a noop.");
        return false;
    }

    public final void b() {
    }
}
