package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.p;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Cc  reason: case insensitive filesystem */
public final class C0620Cc implements C1088Uc<C2313on> {
    public final /* synthetic */ void a(Object obj, Map map) {
        C2313on onVar = (C2313on) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                C1018Rk.d("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                C1018Rk.d("No timestamp given for CSI tick.");
            } else {
                try {
                    long b2 = p.j().b() + (Long.parseLong(str4) - p.j().a());
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    onVar.x().a(str2, str3, b2);
                } catch (NumberFormatException e2) {
                    C1018Rk.c("Malformed timestamp for CSI tick.", e2);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                C1018Rk.d("No value given for CSI experiment.");
                return;
            }
            T a2 = onVar.x().a();
            if (a2 == null) {
                C1018Rk.d("No ticker for WebView, dropping experiment ID.");
            } else {
                a2.a("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                C1018Rk.d("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                C1018Rk.d("No name given for CSI extra.");
            } else {
                T a3 = onVar.x().a();
                if (a3 == null) {
                    C1018Rk.d("No ticker for WebView, dropping extra parameter.");
                } else {
                    a3.a(str6, str7);
                }
            }
        }
    }
}
