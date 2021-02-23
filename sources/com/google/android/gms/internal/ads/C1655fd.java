package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.fd  reason: case insensitive filesystem */
public final class C1655fd implements C1088Uc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final C1868id f10419a;

    private C1655fd(C1868id idVar) {
        this.f10419a = idVar;
    }

    public static void a(C2313on onVar, C1868id idVar) {
        onVar.b("/reward", new C1655fd(idVar));
    }

    public final void a(Object obj, Map<String, String> map) {
        String str = map.get("action");
        if ("grant".equals(str)) {
            C1809hj hjVar = null;
            try {
                int parseInt = Integer.parseInt(map.get("amount"));
                String str2 = map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    hjVar = new C1809hj(str2, parseInt);
                }
            } catch (NumberFormatException e2) {
                C1018Rk.c("Unable to parse reward amount.", e2);
            }
            this.f10419a.a(hjVar);
        } else if ("video_start".equals(str)) {
            this.f10419a.N();
        } else if ("video_complete".equals(str)) {
            this.f10419a.M();
        }
    }
}
