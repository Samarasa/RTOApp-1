package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.ads.internal.util.X;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.xn  reason: case insensitive filesystem */
public final class C2951xn {
    public static LY<C2313on> a(Context context, C1200Yk yk, String str, Qba qba, b bVar) {
        return DY.a(DY.a(null), new C2880wn(context, qba, yk, bVar, str), (Executor) C1252_k.f9703e);
    }

    public static C2313on a(Context context, C1819ho hoVar, String str, boolean z, boolean z2, Qba qba, C1862ia iaVar, C1200Yk yk, T t, k kVar, b bVar, Soa soa, C2670toa toa, boolean z3, C2988yS ySVar, DS ds) {
        F.a(context);
        if (C0956Pa.f8225b.a().booleanValue()) {
            return C2244no.a(context, hoVar, str, z, z2, qba, iaVar, yk, (T) null, kVar, bVar, soa, toa, z3, ySVar, ds);
        }
        try {
            return (C2313on) X.a(new C3093zn(context, hoVar, str, z, z2, qba, iaVar, yk, (T) null, kVar, bVar, soa, toa, z3, ySVar, ds));
        } catch (Throwable th) {
            throw new C0605Bn("Webview initialization failed.", th);
        }
    }
}
