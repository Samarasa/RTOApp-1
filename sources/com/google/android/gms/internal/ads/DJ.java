package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.wa;

final /* synthetic */ class DJ implements UW {

    /* renamed from: a  reason: collision with root package name */
    private final C3050zJ f6522a;

    /* renamed from: b  reason: collision with root package name */
    private final C2313on f6523b;

    /* renamed from: c  reason: collision with root package name */
    private final C2988yS f6524c;

    /* renamed from: d  reason: collision with root package name */
    private final C2546sC f6525d;

    DJ(C3050zJ zJVar, C2313on onVar, C2988yS ySVar, C2546sC sCVar) {
        this.f6522a = zJVar;
        this.f6523b = onVar;
        this.f6524c = ySVar;
        this.f6525d = sCVar;
    }

    public final Object apply(Object obj) {
        C2313on onVar = this.f6523b;
        C2988yS ySVar = this.f6524c;
        C2546sC sCVar = this.f6525d;
        if (ySVar.H) {
            onVar.y();
        }
        onVar.A();
        if (((Boolean) Qqa.e().a(F.la)).booleanValue()) {
            p.e();
            wa.a(onVar);
        }
        return sCVar.k();
    }
}
