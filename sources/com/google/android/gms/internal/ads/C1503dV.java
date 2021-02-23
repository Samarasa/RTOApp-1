package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.e;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.dV  reason: case insensitive filesystem */
public final class C1503dV {

    /* renamed from: a  reason: collision with root package name */
    private final C1703gJ f10148a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10149b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10150c;

    /* renamed from: d  reason: collision with root package name */
    private final String f10151d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f10152e;

    /* renamed from: f  reason: collision with root package name */
    private final NS f10153f;

    /* renamed from: g  reason: collision with root package name */
    private final e f10154g;

    /* renamed from: h  reason: collision with root package name */
    private final Qba f10155h;

    public C1503dV(C1703gJ gJVar, C1200Yk yk, String str, String str2, Context context, NS ns, e eVar, Qba qba) {
        this.f10148a = gJVar;
        this.f10149b = yk.f9456a;
        this.f10150c = str;
        this.f10151d = str2;
        this.f10152e = context;
        this.f10153f = ns;
        this.f10154g = eVar;
        this.f10155h = qba;
    }

    private static String a(String str) {
        return (TextUtils.isEmpty(str) || !C0836Kk.a()) ? str : "fakeForAdDebugLog";
    }

    private static String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = BuildConfig.FLAVOR;
        }
        return str.replaceAll(str2, str3);
    }

    public static List<String> a(int i, int i2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String a2 : list) {
            StringBuilder sb = new StringBuilder(23);
            sb.append(2);
            sb.append(".");
            sb.append(i2);
            arrayList.add(a(a2, "@gw_mpe@", sb.toString()));
        }
        return arrayList;
    }

    public final List<String> a(OS os, C2988yS ySVar, List<String> list) {
        return a(os, ySVar, false, BuildConfig.FLAVOR, BuildConfig.FLAVOR, list);
    }

    public final List<String> a(OS os, C2988yS ySVar, boolean z, String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str3 = z ? "1" : "0";
        for (String a2 : list) {
            String a3 = a(a(a(a2, "@gw_adlocid@", os.f8087a.f7415a.f8620f), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.f10149b);
            if (ySVar != null) {
                a3 = C1740gk.a(a(a(a(a3, "@gw_qdata@", ySVar.x), "@gw_adnetid@", ySVar.w), "@gw_allocid@", ySVar.v), this.f10152e, ySVar.Q);
            }
            String a4 = a(a(a(a3, "@gw_adnetstatus@", this.f10148a.a()), "@gw_seqnum@", this.f10150c), "@gw_sessid@", this.f10151d);
            boolean z2 = ((Boolean) Qqa.e().a(F.Xb)).booleanValue() && !TextUtils.isEmpty(str);
            boolean isEmpty = true ^ TextUtils.isEmpty(str2);
            if (z2 || isEmpty) {
                if (this.f10155h.a(Uri.parse(a4))) {
                    Uri.Builder buildUpon = Uri.parse(a4).buildUpon();
                    if (z2) {
                        buildUpon = buildUpon.appendQueryParameter("ms", str);
                    }
                    if (isEmpty) {
                        buildUpon = buildUpon.appendQueryParameter("attok", str2);
                    }
                    a4 = buildUpon.build().toString();
                }
            }
            arrayList.add(a4);
        }
        return arrayList;
    }

    public final List<String> a(C2988yS ySVar, List<String> list, C0886Mi mi) {
        ArrayList arrayList = new ArrayList();
        long a2 = this.f10154g.a();
        try {
            String type = mi.getType();
            String num = Integer.toString(mi.F());
            NS ns = this.f10153f;
            String str = BuildConfig.FLAVOR;
            String a3 = ns == null ? str : a(ns.f7965a);
            NS ns2 = this.f10153f;
            if (ns2 != null) {
                str = a(ns2.f7966b);
            }
            for (String a4 : list) {
                arrayList.add(C1740gk.a(a(a(a(a(a(a(a4, "@gw_rwd_userid@", Uri.encode(a3)), "@gw_rwd_custom_data@", Uri.encode(str)), "@gw_tmstmp@", Long.toString(a2)), "@gw_rwd_itm@", Uri.encode(type)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.f10149b), this.f10152e, ySVar.Q));
            }
            return arrayList;
        } catch (RemoteException e2) {
            C1018Rk.b("Unable to determine award type and amount.", e2);
            return arrayList;
        }
    }
}
