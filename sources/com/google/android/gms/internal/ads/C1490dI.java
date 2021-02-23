package com.google.android.gms.internal.ads;

import android.view.View;
import c.b.b.b.c.a;
import c.b.b.b.c.b;

/* renamed from: com.google.android.gms.internal.ads.dI  reason: case insensitive filesystem */
final class C1490dI extends C2653tg {

    /* renamed from: a  reason: collision with root package name */
    private C2693uH<C0624Cg, C2127mI> f10124a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ZH f10125b;

    private C1490dI(ZH zh, C2693uH<C0624Cg, C2127mI> uHVar) {
        this.f10125b = zh;
        this.f10124a = uHVar;
    }

    public final void a(C1824hqa hqa) {
        ((C2127mI) this.f10124a.f12307c).b(hqa);
    }

    public final void e(String str) {
        ((C2127mI) this.f10124a.f12307c).a(0, str);
    }

    public final void t(a aVar) {
        View unused = this.f10125b.f9530c = (View) b.Q(aVar);
        ((C2127mI) this.f10124a.f12307c).H();
    }
}
