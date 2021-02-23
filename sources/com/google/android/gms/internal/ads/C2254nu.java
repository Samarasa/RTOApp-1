package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.nu  reason: case insensitive filesystem */
public final class C2254nu extends Qra {

    /* renamed from: a  reason: collision with root package name */
    private final String f11550a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11551b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C2745uqa> f11552c;

    public C2254nu(C2988yS ySVar, String str, C3048zH zHVar) {
        this.f11551b = ySVar == null ? null : ySVar.W;
        String a2 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) ? a(ySVar) : null;
        this.f11550a = a2 == null ? str : a2;
        this.f11552c = zHVar.a();
    }

    private static String a(C2988yS ySVar) {
        try {
            return ySVar.u.getString("class_name");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String Cb() {
        return this.f11551b;
    }

    public final String o() {
        return this.f11550a;
    }

    public final List<C2745uqa> ob() {
        if (!((Boolean) Qqa.e().a(F.Ff)).booleanValue()) {
            return null;
        }
        return this.f11552c;
    }
}
