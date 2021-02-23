package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import b.c.a.i;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.v;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.m;

public final class zzaqe implements MediationInterstitialAdapter {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Activity f13143a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public m f13144b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f13145c;

    public final void onDestroy() {
        C1018Rk.a("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        C1018Rk.a("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        C1018Rk.a("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public final void requestInterstitialAd(Context context, m mVar, Bundle bundle, e eVar, Bundle bundle2) {
        this.f13144b = mVar;
        if (this.f13144b == null) {
            C1018Rk.d("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            C1018Rk.d("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f13144b.a((MediationInterstitialAdapter) this, 0);
        } else {
            if (!(com.google.android.gms.common.util.m.b() && C1791ha.a(context))) {
                C1018Rk.d("Default browser does not support custom tabs. Bailing out.");
                this.f13144b.a((MediationInterstitialAdapter) this, 0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                C1018Rk.d("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f13144b.a((MediationInterstitialAdapter) this, 0);
                return;
            }
            this.f13143a = (Activity) context;
            this.f13145c = Uri.parse(string);
            this.f13144b.c(this);
        }
    }

    public final void showInterstitial() {
        i a2 = new i.a().a();
        a2.f2182a.setData(this.f13145c);
        oa.f5628a.post(new C1066Tg(this, new AdOverlayInfoParcel(new c(a2.f2182a), (C1540dqa) null, new C1092Ug(this), (v) null, new C1200Yk(0, 0, false))));
        p.g().e();
    }
}
