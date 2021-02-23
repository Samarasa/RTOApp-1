package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import com.google.android.gms.ads.C0491b;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.mediation.A;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.i;
import com.google.android.gms.ads.mediation.k;
import com.google.android.gms.ads.mediation.l;
import com.google.android.gms.ads.mediation.n;
import com.google.android.gms.ads.mediation.p;
import com.google.android.gms.ads.mediation.q;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.y;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Lg  reason: case insensitive filesystem */
public final class C0858Lg extends C0702Fg {

    /* renamed from: a  reason: collision with root package name */
    private final RtbAdapter f7699a;

    /* renamed from: b  reason: collision with root package name */
    private k f7700b;

    /* renamed from: c  reason: collision with root package name */
    private p f7701c;

    /* renamed from: d  reason: collision with root package name */
    private String f7702d = BuildConfig.FLAVOR;

    public C0858Lg(RtbAdapter rtbAdapter) {
        this.f7699a = rtbAdapter;
    }

    private static Bundle D(String str) {
        String valueOf = String.valueOf(str);
        C1018Rk.d(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
            throw new RemoteException();
        }
    }

    private final d<p, Object> a(C0598Bg bg, C0831Kf kf) {
        return new C0962Pg(this, bg, kf);
    }

    private static String a(String str, C2249nqa nqa) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return nqa.u;
        }
    }

    private static boolean c(C2249nqa nqa) {
        if (nqa.f11539f) {
            return true;
        }
        Qqa.a();
        return C0758Hk.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r2.getBundle(r1.f7699a.getClass().getName());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Bundle d(com.google.android.gms.internal.ads.C2249nqa r2) {
        /*
            r1 = this;
            android.os.Bundle r2 = r2.m
            if (r2 == 0) goto L_0x0015
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r0 = r1.f7699a
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            android.os.Bundle r2 = r2.getBundle(r0)
            if (r2 == 0) goto L_0x0015
            return r2
        L_0x0015:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0858Lg.d(com.google.android.gms.internal.ads.nqa):android.os.Bundle");
    }

    public final boolean L(a aVar) {
        p pVar = this.f7701c;
        if (pVar == null) {
            return false;
        }
        try {
            pVar.a((Context) b.Q(aVar));
            return true;
        } catch (Throwable th) {
            C1018Rk.b(BuildConfig.FLAVOR, th);
            return true;
        }
    }

    public final void a(a aVar, String str, Bundle bundle, Bundle bundle2, C2462qqa qqa, C0754Hg hg) {
        C0491b bVar;
        try {
            C0988Qg qg = new C0988Qg(this, hg);
            RtbAdapter rtbAdapter = this.f7699a;
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                bVar = C0491b.BANNER;
            } else if (c2 == 1) {
                bVar = C0491b.INTERSTITIAL;
            } else if (c2 == 2) {
                bVar = C0491b.REWARDED;
            } else if (c2 == 3) {
                bVar = C0491b.NATIVE;
            } else {
                throw new IllegalArgumentException("Internal Error");
            }
            i iVar = new i(bVar, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(iVar);
            rtbAdapter.collectSignals(new com.google.android.gms.ads.mediation.rtb.a((Context) b.Q(aVar), arrayList, bundle, y.a(qqa.f11918e, qqa.f11915b, qqa.f11914a)), qg);
        } catch (Throwable th) {
            C1018Rk.b("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    public final void a(String str, String str2, C2249nqa nqa, a aVar, C0598Bg bg, C0831Kf kf) {
        C2249nqa nqa2 = nqa;
        try {
            this.f7699a.loadRewardedAd(new q((Context) b.Q(aVar), str, D(str2), d(nqa2), c(nqa), nqa2.k, nqa2.f11540g, nqa2.t, a(str2, nqa), this.f7702d), a(bg, kf));
        } catch (Throwable th) {
            C1018Rk.b("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    public final void a(String str, String str2, C2249nqa nqa, a aVar, C2441qg qgVar, C0831Kf kf, C2462qqa qqa) {
        C2249nqa nqa2 = nqa;
        C2462qqa qqa2 = qqa;
        try {
            C0832Kg kg = new C0832Kg(this, qgVar, kf);
            RtbAdapter rtbAdapter = this.f7699a;
            Bundle D = D(str2);
            Bundle d2 = d(nqa2);
            boolean c2 = c(nqa);
            Location location = nqa2.k;
            int i = nqa2.f11540g;
            int i2 = nqa2.t;
            String a2 = a(str2, nqa);
            f a3 = y.a(qqa2.f11918e, qqa2.f11915b, qqa2.f11914a);
            String str3 = this.f7702d;
            g gVar = r5;
            g gVar2 = new g((Context) b.Q(aVar), str, D, d2, c2, location, i, i2, a2, a3, str3);
            rtbAdapter.loadBannerAd(gVar, kg);
        } catch (Throwable th) {
            C1018Rk.b("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    public final void a(String str, String str2, C2249nqa nqa, a aVar, C2795vg vgVar, C0831Kf kf) {
        C2249nqa nqa2 = nqa;
        try {
            this.f7699a.loadInterstitialAd(new l((Context) b.Q(aVar), str, D(str2), d(nqa2), c(nqa), nqa2.k, nqa2.f11540g, nqa2.t, a(str2, nqa), this.f7702d), new C0910Ng(this, vgVar, kf));
        } catch (Throwable th) {
            C1018Rk.b("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    public final void a(String str, String str2, C2249nqa nqa, a aVar, C2866wg wgVar, C0831Kf kf) {
        C2249nqa nqa2 = nqa;
        try {
            this.f7699a.loadNativeAd(new n((Context) b.Q(aVar), str, D(str2), d(nqa2), c(nqa), nqa2.k, nqa2.f11540g, nqa2.t, a(str2, nqa), this.f7702d), new C0884Mg(this, wgVar, kf));
        } catch (Throwable th) {
            C1018Rk.b("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    public final void a(String[] strArr, Bundle[] bundleArr) {
    }

    public final void b(String str, String str2, C2249nqa nqa, a aVar, C0598Bg bg, C0831Kf kf) {
        C2249nqa nqa2 = nqa;
        try {
            this.f7699a.loadRewardedInterstitialAd(new q((Context) b.Q(aVar), str, D(str2), d(nqa2), c(nqa), nqa2.k, nqa2.f11540g, nqa2.t, a(str2, nqa), this.f7702d), a(bg, kf));
        } catch (Throwable th) {
            C1018Rk.b("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    public final Sra getVideoController() {
        RtbAdapter rtbAdapter = this.f7699a;
        if (!(rtbAdapter instanceof A)) {
            return null;
        }
        try {
            return ((A) rtbAdapter).getVideoController();
        } catch (Throwable th) {
            C1018Rk.b(BuildConfig.FLAVOR, th);
            return null;
        }
    }

    public final void k(String str) {
        this.f7702d = str;
    }

    public final void m(a aVar) {
    }

    public final boolean p(a aVar) {
        k kVar = this.f7700b;
        if (kVar == null) {
            return false;
        }
        try {
            kVar.a((Context) b.Q(aVar));
            return true;
        } catch (Throwable th) {
            C1018Rk.b(BuildConfig.FLAVOR, th);
            return true;
        }
    }

    public final C1014Rg ta() {
        C1014Rg.a(this.f7699a.getSDKVersionInfo());
        throw null;
    }

    public final C1014Rg ua() {
        C1014Rg.a(this.f7699a.getVersionInfo());
        throw null;
    }
}
