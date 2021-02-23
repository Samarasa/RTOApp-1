package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.X;

/* renamed from: com.google.android.gms.internal.ads.no  reason: case insensitive filesystem */
public final class C2244no {
    public static C2313on a(Context context, C1819ho hoVar, String str, boolean z, boolean z2, Qba qba, C1862ia iaVar, C1200Yk yk, T t, k kVar, b bVar, Soa soa, C2670toa toa, boolean z3, C2988yS ySVar, DS ds) {
        try {
            return (C2313on) X.a(new C2173mo(context, hoVar, str, z, z2, qba, iaVar, yk, (T) null, kVar, bVar, soa, toa, z3, ySVar, ds));
        } catch (Throwable th) {
            p.g().a(th, "AdWebViewFactory.newAdWebView2");
            throw new C0605Bn("Webview initialization failed.", th);
        }
    }
}
