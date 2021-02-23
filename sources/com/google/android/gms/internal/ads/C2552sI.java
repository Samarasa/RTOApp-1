package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.wa;

/* renamed from: com.google.android.gms.internal.ads.sI  reason: case insensitive filesystem */
final /* synthetic */ class C2552sI implements UW {

    /* renamed from: a  reason: collision with root package name */
    private final C2269oI f12068a;

    /* renamed from: b  reason: collision with root package name */
    private final C2313on f12069b;

    /* renamed from: c  reason: collision with root package name */
    private final C2988yS f12070c;

    /* renamed from: d  reason: collision with root package name */
    private final C1479cy f12071d;

    C2552sI(C2269oI oIVar, C2313on onVar, C2988yS ySVar, C1479cy cyVar) {
        this.f12068a = oIVar;
        this.f12069b = onVar;
        this.f12070c = ySVar;
        this.f12071d = cyVar;
    }

    public final Object apply(Object obj) {
        C2313on onVar = this.f12069b;
        C2988yS ySVar = this.f12070c;
        C1479cy cyVar = this.f12071d;
        if (ySVar.H) {
            onVar.y();
        }
        onVar.A();
        if (((Boolean) Qqa.e().a(F.la)).booleanValue()) {
            p.e();
            wa.a(onVar);
        }
        return cyVar.j();
    }
}
