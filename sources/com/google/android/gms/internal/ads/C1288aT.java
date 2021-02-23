package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.aT  reason: case insensitive filesystem */
final /* synthetic */ class C1288aT implements C1088Uc {

    /* renamed from: a  reason: collision with root package name */
    private final C1644fV f9786a;

    /* renamed from: b  reason: collision with root package name */
    private final C1701gH f9787b;

    C1288aT(C1644fV fVVar, C1701gH gHVar) {
        this.f9786a = fVVar;
        this.f9787b = gHVar;
    }

    public final void a(Object obj, Map map) {
        C1644fV fVVar = this.f9786a;
        C1701gH gHVar = this.f9787b;
        C1534dn dnVar = (C1534dn) obj;
        String str = (String) map.get("u");
        if (str == null) {
            C1018Rk.d("URL missing from httpTrack GMSG.");
        } else if (!dnVar.s().ea) {
            fVVar.a(str);
        } else {
            gHVar.a(new C2197nH(p.j().a(), ((C0839Kn) dnVar).n().f6547b, str, C1489dH.f10122b));
        }
    }
}
