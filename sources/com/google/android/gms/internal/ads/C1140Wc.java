package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.p;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Wc  reason: case insensitive filesystem */
public final class C1140Wc implements C1088Uc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9149a;

    public C1140Wc(Context context) {
        this.f9149a = context;
    }

    public final void a(Object obj, Map<String, String> map) {
        if (p.A().g(this.f9149a)) {
            String str = map.get("eventName");
            String str2 = map.get("eventId");
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 94399) {
                if (hashCode != 94401) {
                    if (hashCode == 94407 && str.equals("_ai")) {
                        c2 = 1;
                    }
                } else if (str.equals("_ac")) {
                    c2 = 0;
                }
            } else if (str.equals("_aa")) {
                c2 = 2;
            }
            if (c2 == 0) {
                p.A().d(this.f9149a, str2);
            } else if (c2 == 1) {
                p.A().e(this.f9149a, str2);
            } else if (c2 != 2) {
                C1018Rk.b("logScionEvent gmsg contained unsupported eventName");
            } else {
                p.A().g(this.f9149a, str2);
            }
        }
    }
}
