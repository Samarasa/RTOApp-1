package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import java.util.Map;

final /* synthetic */ class YS implements C1088Uc {

    /* renamed from: a  reason: collision with root package name */
    private final C1644fV f9355a;

    /* renamed from: b  reason: collision with root package name */
    private final C1701gH f9356b;

    YS(C1644fV fVVar, C1701gH gHVar) {
        this.f9355a = fVVar;
        this.f9356b = gHVar;
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [com.google.android.gms.internal.ads.Rn, com.google.android.gms.internal.ads.dn] */
    public final void a(Object obj, Map map) {
        C1644fV fVVar = this.f9355a;
        C1701gH gHVar = this.f9356b;
        ? r9 = (C1534dn) obj;
        String str = (String) map.get("u");
        if (str == null) {
            C1018Rk.d("URL missing from click GMSG.");
            return;
        }
        String a2 = C0594Bc.a(r9, str);
        if (!r9.s().ea) {
            fVVar.a(a2);
            return;
        }
        long a3 = p.j().a();
        String str2 = r9.n().f6547b;
        p.c();
        gHVar.a(new C2197nH(a3, str2, a2, oa.p(((C1021Rn) r9).getContext()) ? C1489dH.f10122b : C1489dH.f10121a));
    }
}
