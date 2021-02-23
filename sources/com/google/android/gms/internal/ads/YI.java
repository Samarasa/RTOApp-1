package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class YI<AdT> implements C2480rH<AdT> {
    private static Bundle a(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    /* access modifiers changed from: protected */
    public abstract LY<AdT> a(SS ss, Bundle bundle);

    public final boolean a(OS os, C2988yS ySVar) {
        return !TextUtils.isEmpty(ySVar.u.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, BuildConfig.FLAVOR));
    }

    public final LY<AdT> b(OS os, C2988yS ySVar) {
        C2988yS ySVar2 = ySVar;
        String optString = ySVar2.u.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, BuildConfig.FLAVOR);
        SS ss = os.f8087a.f7415a;
        US us = new US();
        us.a(ss);
        us.a(optString);
        Bundle a2 = a(ss.f8618d.m);
        Bundle a3 = a(a2.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        a3.putInt("gw", 1);
        String optString2 = ySVar2.u.optString("mad_hac", (String) null);
        if (optString2 != null) {
            a3.putString("mad_hac", optString2);
        }
        String optString3 = ySVar2.u.optString("adJson", (String) null);
        if (optString3 != null) {
            a3.putString("_ad", optString3);
        }
        a3.putBoolean("_noRefresh", true);
        Iterator<String> keys = ySVar2.C.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = ySVar2.C.optString(next, (String) null);
            if (next != null) {
                a3.putString(next, optString4);
            }
        }
        a2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", a3);
        C2249nqa nqa = ss.f8618d;
        C2249nqa nqa2 = r5;
        C2249nqa nqa3 = new C2249nqa(nqa.f11534a, nqa.f11535b, a3, nqa.f11537d, nqa.f11538e, nqa.f11539f, nqa.f11540g, nqa.f11541h, nqa.i, nqa.j, nqa.k, nqa.l, a2, nqa.n, nqa.o, nqa.p, nqa.q, nqa.r, nqa.s, nqa.t, nqa.u, nqa.v, nqa.w);
        us.a(nqa2);
        SS d2 = us.d();
        Bundle bundle = new Bundle();
        OS os2 = os;
        DS ds = os2.f8088b.f7844b;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList(ds.f6546a));
        bundle2.putInt("refresh_interval", ds.f6548c);
        bundle2.putString("gws_query_id", ds.f6547b);
        bundle.putBundle("parent_common_config", bundle2);
        String str = os2.f8087a.f7415a.f8620f;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        C2988yS ySVar3 = ySVar;
        bundle3.putString("allocation_id", ySVar3.v);
        bundle3.putStringArrayList("click_urls", new ArrayList(ySVar3.f12916c));
        bundle3.putStringArrayList("imp_urls", new ArrayList(ySVar3.f12917d));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList(ySVar3.o));
        bundle3.putStringArrayList("fill_urls", new ArrayList(ySVar3.m));
        bundle3.putStringArrayList("video_start_urls", new ArrayList(ySVar3.f12920g));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList(ySVar3.f12921h));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList(ySVar3.i));
        bundle3.putString("transaction_id", ySVar3.j);
        bundle3.putString("valid_from_timestamp", ySVar3.k);
        bundle3.putBoolean("is_closable_area_disabled", ySVar3.K);
        if (ySVar3.l != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", ySVar3.l.f10715b);
            bundle4.putString("rb_type", ySVar3.l.f10714a);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return a(d2, bundle);
    }
}
