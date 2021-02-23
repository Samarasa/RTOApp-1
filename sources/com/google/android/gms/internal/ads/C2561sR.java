package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.sR  reason: case insensitive filesystem */
public final class C2561sR {
    public static C2278oR<C1400br, C1754gr> a(Context context, GT gt, XT xt) {
        return c(context, gt, xt);
    }

    public static C2278oR<C2037kr, C2463qr> b(Context context, GT gt, XT xt) {
        return c(context, gt, xt);
    }

    private static <AppOpenAdRequestComponent extends C1475cu<AppOpenAd>, AppOpenAd extends C3103zs> C2278oR<AppOpenAdRequestComponent, AppOpenAd> c(Context context, GT gt, XT xt) {
        if (((Integer) Qqa.e().a(F.Ue)).intValue() <= 0) {
            return new C1711gR();
        }
        _T a2 = xt.a(PT.AppOpen, context, gt, new WQ(new NQ()));
        return new SQ(new C1640fR(new C1711gR()), new XQ(a2.f9661a, C1252_k.f9699a), a2.f9662b, C1252_k.f9699a);
    }
}
