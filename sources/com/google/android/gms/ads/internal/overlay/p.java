package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.common.util.m;
import com.google.android.gms.internal.ads.C1540dqa;

public final class p {
    public static void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.k == 4 && adOverlayInfoParcel.f5479c == null) {
            C1540dqa dqa = adOverlayInfoParcel.f5478b;
            if (dqa != null) {
                dqa.onAdClicked();
            }
            com.google.android.gms.ads.internal.p.a();
            C0492a.a(context, adOverlayInfoParcel.f5477a, adOverlayInfoParcel.i);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.m.f9459d);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.a(intent, adOverlayInfoParcel);
        if (!m.h()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        com.google.android.gms.ads.internal.p.c();
        oa.a(context, intent);
    }
}
