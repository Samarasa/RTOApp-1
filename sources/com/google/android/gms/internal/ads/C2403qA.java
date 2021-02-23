package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qA  reason: case insensitive filesystem */
final /* synthetic */ class C2403qA implements C1088Uc {

    /* renamed from: a  reason: collision with root package name */
    private final C2332pA f11808a;

    C2403qA(C2332pA pAVar) {
        this.f11808a = pAVar;
    }

    public final void a(Object obj, Map map) {
        C2313on onVar = (C2313on) obj;
        onVar.t().a((Cdo) new C2757vA(this.f11808a, map));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            onVar.loadData(str, "text/html", "UTF-8");
        } else {
            onVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", (String) null);
        }
    }
}
