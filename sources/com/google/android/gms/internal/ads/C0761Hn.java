package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Hn  reason: case insensitive filesystem */
final class C0761Hn implements C1088Uc<C2313on> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C0709Fn f7208a;

    C0761Hn(C0709Fn fn) {
        this.f7208a = fn;
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        C2313on onVar = (C2313on) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f7208a) {
                        if (this.f7208a.J != parseInt) {
                            int unused = this.f7208a.J = parseInt;
                            this.f7208a.requestLayout();
                        }
                    }
                } catch (Exception e2) {
                    C1018Rk.c("Exception occurred while getting webview content height", e2);
                }
            }
        }
    }
}
