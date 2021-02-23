package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C0491b;
import com.google.android.gms.ads.formats.h;
import com.google.android.gms.ads.mediation.A;
import com.google.android.gms.ads.mediation.C0520a;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.i;
import com.google.android.gms.ads.mediation.p;
import com.google.android.gms.ads.mediation.q;
import com.google.android.gms.ads.mediation.r;
import com.google.android.gms.ads.mediation.s;
import com.google.android.gms.ads.mediation.t;
import com.google.android.gms.ads.mediation.w;
import com.google.android.gms.ads.mediation.x;
import com.google.android.gms.ads.mediation.y;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ag  reason: case insensitive filesystem */
public final class C1307ag extends C0779If {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Object f9811a;

    /* renamed from: b  reason: collision with root package name */
    private C1661fg f9812b;

    /* renamed from: c  reason: collision with root package name */
    private C1455cj f9813c;

    /* renamed from: d  reason: collision with root package name */
    private a f9814d;

    /* renamed from: e  reason: collision with root package name */
    private p f9815e;

    public C1307ag(C0520a aVar) {
        this.f9811a = aVar;
    }

    public C1307ag(f fVar) {
        this.f9811a = fVar;
    }

    private final Bundle a(String str, C2249nqa nqa, String str2) {
        Bundle bundle;
        String valueOf = String.valueOf(str);
        C1018Rk.a(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle2 = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                bundle = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            } else {
                bundle = bundle2;
            }
            if (this.f9811a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (nqa != null) {
                    bundle.putInt("tagForChildDirectedTreatment", nqa.f11540g);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            C1018Rk.b(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    private final d<p, Object> a(C0831Kf kf) {
        return new C1449cg(this, kf);
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
        r2 = r2.getBundle(r1.f9811a.getClass().getName());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Bundle d(com.google.android.gms.internal.ads.C2249nqa r2) {
        /*
            r1 = this;
            android.os.Bundle r2 = r2.m
            if (r2 == 0) goto L_0x0015
            java.lang.Object r0 = r1.f9811a
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1307ag.d(com.google.android.gms.internal.ads.nqa):android.os.Bundle");
    }

    public final C1195Yf Ba() {
        y b2 = this.f9812b.b();
        if (b2 != null) {
            return new C2511rg(b2);
        }
        return null;
    }

    public final void K(a aVar) {
        if (this.f9811a instanceof C0520a) {
            C1018Rk.a("Show rewarded ad from adapter.");
            p pVar = this.f9815e;
            if (pVar != null) {
                pVar.a((Context) b.Q(aVar));
            } else {
                C1018Rk.b("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = C0520a.class.getCanonicalName();
            String canonicalName2 = this.f9811a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            C1018Rk.d(sb.toString());
            throw new RemoteException();
        }
    }

    public final a Lb() {
        Object obj = this.f9811a;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return b.a(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                C1018Rk.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.f9811a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            C1018Rk.d(sb.toString());
            throw new RemoteException();
        }
    }

    public final C0749Hb Oa() {
        h c2 = this.f9812b.c();
        if (c2 instanceof C0775Ib) {
            return ((C0775Ib) c2).a();
        }
        return null;
    }

    public final void X() {
        Object obj = this.f9811a;
        if (obj instanceof f) {
            try {
                ((f) obj).onResume();
            } catch (Throwable th) {
                C1018Rk.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        }
    }

    public final boolean _a() {
        return this.f9811a instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    public final void a(a aVar, C0595Bd bd, List<C0803Jd> list) {
        C0491b bVar;
        if (this.f9811a instanceof C0520a) {
            C1520dg dgVar = new C1520dg(this, bd);
            ArrayList arrayList = new ArrayList();
            for (C0803Jd next : list) {
                String str = next.f7442a;
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
                    throw new RemoteException();
                }
                arrayList.add(new i(bVar, next.f7443b));
            }
            ((C0520a) this.f9811a).initialize((Context) b.Q(aVar), dgVar, arrayList);
            return;
        }
        throw new RemoteException();
    }

    public final void a(a aVar, C1455cj cjVar, List<String> list) {
        if (this.f9811a instanceof InitializableMediationRewardedVideoAdAdapter) {
            C1018Rk.a("Initialize rewarded video adapter.");
            try {
                InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.f9811a;
                ArrayList arrayList = new ArrayList();
                for (String a2 : list) {
                    arrayList.add(a(a2, (C2249nqa) null, (String) null));
                }
                initializableMediationRewardedVideoAdAdapter.initialize((Context) b.Q(aVar), new C1879ij(cjVar), arrayList);
            } catch (Throwable th) {
                C1018Rk.c("Could not initialize rewarded video adapter.", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = InitializableMediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = this.f9811a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            C1018Rk.d(sb.toString());
            throw new RemoteException();
        }
    }

    public final void a(a aVar, C2249nqa nqa, String str, C0831Kf kf) {
        a(aVar, nqa, str, (String) null, kf);
    }

    public final void a(a aVar, C2249nqa nqa, String str, C1455cj cjVar, String str2) {
        Bundle bundle;
        C1378bg bgVar;
        C2249nqa nqa2 = nqa;
        C1455cj cjVar2 = cjVar;
        String str3 = str2;
        Object obj = this.f9811a;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            C1018Rk.a("Initialize rewarded video adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f9811a;
                Bundle a2 = a(str3, nqa2, (String) null);
                if (nqa2 != null) {
                    C1378bg bgVar2 = new C1378bg(nqa2.f11535b == -1 ? null : new Date(nqa2.f11535b), nqa2.f11537d, nqa2.f11538e != null ? new HashSet(nqa2.f11538e) : null, nqa2.k, c(nqa), nqa2.f11540g, nqa2.r, nqa2.t, a(str3, nqa2));
                    bundle = nqa2.m != null ? nqa2.m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                    bgVar = bgVar2;
                } else {
                    bgVar = null;
                    bundle = null;
                }
                mediationRewardedVideoAdAdapter.initialize((Context) b.Q(aVar), bgVar, str, new C1879ij(cjVar2), a2, bundle);
            } catch (Throwable th) {
                C1018Rk.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else if (obj instanceof C0520a) {
            this.f9814d = aVar;
            this.f9813c = cjVar2;
            cjVar2.v(b.a(obj));
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = C0520a.class.getCanonicalName();
            String canonicalName3 = this.f9811a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            C1018Rk.d(sb.toString());
            throw new RemoteException();
        }
    }

    public final void a(a aVar, C2249nqa nqa, String str, String str2, C0831Kf kf) {
        C2249nqa nqa2 = nqa;
        String str3 = str;
        if (this.f9811a instanceof MediationInterstitialAdapter) {
            C1018Rk.a("Requesting interstitial ad from adapter.");
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.f9811a;
                Bundle bundle = null;
                C1378bg bgVar = new C1378bg(nqa2.f11535b == -1 ? null : new Date(nqa2.f11535b), nqa2.f11537d, nqa2.f11538e != null ? new HashSet(nqa2.f11538e) : null, nqa2.k, c(nqa), nqa2.f11540g, nqa2.r, nqa2.t, a(str3, nqa2));
                if (nqa2.m != null) {
                    bundle = nqa2.m.getBundle(mediationInterstitialAdapter.getClass().getName());
                }
                mediationInterstitialAdapter.requestInterstitialAd((Context) b.Q(aVar), new C1661fg(kf), a(str3, nqa2, str2), bgVar, bundle);
            } catch (Throwable th) {
                C1018Rk.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.f9811a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            C1018Rk.d(sb.toString());
            throw new RemoteException();
        }
    }

    public final void a(a aVar, C2249nqa nqa, String str, String str2, C0831Kf kf, C1368bb bbVar, List<String> list) {
        C2249nqa nqa2 = nqa;
        String str3 = str;
        Object obj = this.f9811a;
        if (obj instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                Bundle bundle = null;
                HashSet hashSet = nqa2.f11538e != null ? new HashSet(nqa2.f11538e) : null;
                C1944jg jgVar = new C1944jg(nqa2.f11535b == -1 ? null : new Date(nqa2.f11535b), nqa2.f11537d, hashSet, nqa2.k, c(nqa), nqa2.f11540g, bbVar, list, nqa2.r, nqa2.t, a(str3, nqa2));
                if (nqa2.m != null) {
                    bundle = nqa2.m.getBundle(mediationNativeAdapter.getClass().getName());
                }
                this.f9812b = new C1661fg(kf);
                mediationNativeAdapter.requestNativeAd((Context) b.Q(aVar), this.f9812b, a(str3, nqa2, str2), jgVar, bundle);
            } catch (Throwable th) {
                C1018Rk.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = this.f9811a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            C1018Rk.d(sb.toString());
            throw new RemoteException();
        }
    }

    public final void a(a aVar, C2462qqa qqa, C2249nqa nqa, String str, C0831Kf kf) {
        a(aVar, qqa, nqa, str, (String) null, kf);
    }

    public final void a(a aVar, C2462qqa qqa, C2249nqa nqa, String str, String str2, C0831Kf kf) {
        C2462qqa qqa2 = qqa;
        C2249nqa nqa2 = nqa;
        String str3 = str;
        if (this.f9811a instanceof MediationBannerAdapter) {
            C1018Rk.a("Requesting banner ad from adapter.");
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f9811a;
                Bundle bundle = null;
                C1378bg bgVar = new C1378bg(nqa2.f11535b == -1 ? null : new Date(nqa2.f11535b), nqa2.f11537d, nqa2.f11538e != null ? new HashSet(nqa2.f11538e) : null, nqa2.k, c(nqa), nqa2.f11540g, nqa2.r, nqa2.t, a(str3, nqa2));
                if (nqa2.m != null) {
                    bundle = nqa2.m.getBundle(mediationBannerAdapter.getClass().getName());
                }
                mediationBannerAdapter.requestBannerAd((Context) b.Q(aVar), new C1661fg(kf), a(str3, nqa2, str2), qqa2.n ? com.google.android.gms.ads.y.a(qqa2.f11918e, qqa2.f11915b) : com.google.android.gms.ads.y.a(qqa2.f11918e, qqa2.f11915b, qqa2.f11914a), bgVar, bundle);
            } catch (Throwable th) {
                C1018Rk.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.f9811a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            C1018Rk.d(sb.toString());
            throw new RemoteException();
        }
    }

    public final void a(C2249nqa nqa, String str) {
        a(nqa, str, (String) null);
    }

    public final void a(C2249nqa nqa, String str, String str2) {
        C2249nqa nqa2 = nqa;
        String str3 = str;
        Object obj = this.f9811a;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            C1018Rk.a("Requesting rewarded video ad from adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f9811a;
                Bundle bundle = null;
                C1378bg bgVar = new C1378bg(nqa2.f11535b == -1 ? null : new Date(nqa2.f11535b), nqa2.f11537d, nqa2.f11538e != null ? new HashSet(nqa2.f11538e) : null, nqa2.k, c(nqa), nqa2.f11540g, nqa2.r, nqa2.t, a(str3, nqa2));
                if (nqa2.m != null) {
                    bundle = nqa2.m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
                }
                mediationRewardedVideoAdAdapter.loadAd(bgVar, a(str3, nqa2, str2), bundle);
            } catch (Throwable th) {
                C1018Rk.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else if (obj instanceof C0520a) {
            b(this.f9814d, nqa2, str3, new C1590eg((C0520a) obj, this.f9813c));
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = C0520a.class.getCanonicalName();
            String canonicalName3 = this.f9811a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            C1018Rk.d(sb.toString());
            throw new RemoteException();
        }
    }

    public final void b(a aVar, C2249nqa nqa, String str, C0831Kf kf) {
        C2249nqa nqa2 = nqa;
        String str2 = str;
        if (this.f9811a instanceof C0520a) {
            C1018Rk.a("Requesting rewarded ad from adapter.");
            try {
                d<p, Object> a2 = a(kf);
                Bundle a3 = a(str2, nqa2, (String) null);
                Bundle d2 = d(nqa2);
                boolean c2 = c(nqa);
                Location location = nqa2.k;
                int i = nqa2.f11540g;
                int i2 = nqa2.t;
                String a4 = a(str2, nqa2);
                q qVar = r5;
                q qVar2 = new q((Context) b.Q(aVar), BuildConfig.FLAVOR, a3, d2, c2, location, i, i2, a4, BuildConfig.FLAVOR);
                ((C0520a) this.f9811a).loadRewardedAd(qVar, a2);
            } catch (Exception e2) {
                C1018Rk.b(BuildConfig.FLAVOR, e2);
                throw new RemoteException();
            }
        } else {
            String canonicalName = C0520a.class.getCanonicalName();
            String canonicalName2 = this.f9811a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            C1018Rk.d(sb.toString());
            throw new RemoteException();
        }
    }

    public final void b(boolean z) {
        Object obj = this.f9811a;
        if (!(obj instanceof x)) {
            String canonicalName = x.class.getCanonicalName();
            String canonicalName2 = this.f9811a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            C1018Rk.a(sb.toString());
            return;
        }
        try {
            ((x) obj).onImmersiveModeUpdated(z);
        } catch (Throwable th) {
            C1018Rk.b(BuildConfig.FLAVOR, th);
        }
    }

    public final void c(a aVar, C2249nqa nqa, String str, C0831Kf kf) {
        C2249nqa nqa2 = nqa;
        String str2 = str;
        if (this.f9811a instanceof C0520a) {
            C1018Rk.a("Requesting rewarded interstitial ad from adapter.");
            try {
                d<p, Object> a2 = a(kf);
                Bundle a3 = a(str2, nqa2, (String) null);
                Bundle d2 = d(nqa2);
                boolean c2 = c(nqa);
                Location location = nqa2.k;
                int i = nqa2.f11540g;
                int i2 = nqa2.t;
                String a4 = a(str2, nqa2);
                q qVar = r5;
                q qVar2 = new q((Context) b.Q(aVar), BuildConfig.FLAVOR, a3, d2, c2, location, i, i2, a4, BuildConfig.FLAVOR);
                ((C0520a) this.f9811a).loadRewardedInterstitialAd(qVar, a2);
            } catch (Exception e2) {
                C1018Rk.b(BuildConfig.FLAVOR, e2);
                throw new RemoteException();
            }
        } else {
            String canonicalName = C0520a.class.getCanonicalName();
            String canonicalName2 = this.f9811a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            C1018Rk.d(sb.toString());
            throw new RemoteException();
        }
    }

    public final void destroy() {
        Object obj = this.f9811a;
        if (obj instanceof f) {
            try {
                ((f) obj).onDestroy();
            } catch (Throwable th) {
                C1018Rk.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        }
    }

    public final Bundle getInterstitialAdapterInfo() {
        Object obj = this.f9811a;
        if (obj instanceof zzbgj) {
            return ((zzbgj) obj).getInterstitialAdapterInfo();
        }
        String canonicalName = zzbgj.class.getCanonicalName();
        String canonicalName2 = this.f9811a.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        C1018Rk.d(sb.toString());
        return new Bundle();
    }

    public final Sra getVideoController() {
        Object obj = this.f9811a;
        if (!(obj instanceof A)) {
            return null;
        }
        try {
            return ((A) obj).getVideoController();
        } catch (Throwable th) {
            C1018Rk.b(BuildConfig.FLAVOR, th);
            return null;
        }
    }

    public final Bundle ib() {
        return new Bundle();
    }

    public final boolean isInitialized() {
        Object obj = this.f9811a;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            C1018Rk.a("Check if adapter is initialized.");
            try {
                return ((MediationRewardedVideoAdAdapter) this.f9811a).isInitialized();
            } catch (Throwable th) {
                C1018Rk.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else if (obj instanceof C0520a) {
            return this.f9813c != null;
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = C0520a.class.getCanonicalName();
            String canonicalName3 = this.f9811a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            C1018Rk.d(sb.toString());
            throw new RemoteException();
        }
    }

    public final C1039Sf kb() {
        r a2 = this.f9812b.a();
        if (a2 instanceof t) {
            return new C1732gg((t) a2);
        }
        return null;
    }

    public final void pause() {
        Object obj = this.f9811a;
        if (obj instanceof f) {
            try {
                ((f) obj).onPause();
            } catch (Throwable th) {
                C1018Rk.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        }
    }

    public final void showInterstitial() {
        if (this.f9811a instanceof MediationInterstitialAdapter) {
            C1018Rk.a("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f9811a).showInterstitial();
            } catch (Throwable th) {
                C1018Rk.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.f9811a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            C1018Rk.d(sb.toString());
            throw new RemoteException();
        }
    }

    public final void showVideo() {
        Object obj = this.f9811a;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            C1018Rk.a("Show rewarded video ad from adapter.");
            try {
                ((MediationRewardedVideoAdAdapter) this.f9811a).showVideo();
            } catch (Throwable th) {
                C1018Rk.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else if (obj instanceof C0520a) {
            p pVar = this.f9815e;
            if (pVar != null) {
                pVar.a((Context) b.Q(this.f9814d));
            } else {
                C1018Rk.b("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = C0520a.class.getCanonicalName();
            String canonicalName3 = this.f9811a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            C1018Rk.d(sb.toString());
            throw new RemoteException();
        }
    }

    public final C1014Rg ta() {
        Object obj = this.f9811a;
        if (!(obj instanceof C0520a)) {
            return null;
        }
        C1014Rg.a(((C0520a) obj).getSDKVersionInfo());
        throw null;
    }

    public final C1014Rg ua() {
        Object obj = this.f9811a;
        if (!(obj instanceof C0520a)) {
            return null;
        }
        C1014Rg.a(((C0520a) obj).getVersionInfo());
        throw null;
    }

    public final C1013Rf xb() {
        r a2 = this.f9812b.a();
        if (a2 instanceof s) {
            return new C1803hg((s) a2);
        }
        return null;
    }

    public final void y(a aVar) {
        Context context = (Context) b.Q(aVar);
        Object obj = this.f9811a;
        if (obj instanceof w) {
            ((w) obj).a(context);
        }
    }

    public final Bundle zzug() {
        Object obj = this.f9811a;
        if (obj instanceof zzbgk) {
            return ((zzbgk) obj).zzug();
        }
        String canonicalName = zzbgk.class.getCanonicalName();
        String canonicalName2 = this.f9811a.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        C1018Rk.d(sb.toString());
        return new Bundle();
    }
}
