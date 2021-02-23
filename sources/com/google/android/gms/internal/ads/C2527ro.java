package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ro  reason: case insensitive filesystem */
final class C2527ro implements C1088Uc<C2313on> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2386po f12037a;

    C2527ro(C2386po poVar) {
        this.f12037a = poVar;
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        C2313on onVar = (C2313on) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f12037a) {
                        if (this.f12037a.H != parseInt) {
                            int unused = this.f12037a.H = parseInt;
                            this.f12037a.requestLayout();
                        }
                    }
                } catch (Exception e2) {
                    C1018Rk.c("Exception occurred while getting webview content height", e2);
                }
            }
        }
    }
}
