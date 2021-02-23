package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import c.b.a.c;
import c.b.b.b.c.a;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.b;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;
import com.google.android.gms.ads.y;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ig  reason: case insensitive filesystem */
public final class C1873ig<NETWORK_EXTRAS extends f, SERVER_PARAMETERS extends e> extends C0779If {

    /* renamed from: a  reason: collision with root package name */
    private final b<NETWORK_EXTRAS, SERVER_PARAMETERS> f10824a;

    /* renamed from: b  reason: collision with root package name */
    private final NETWORK_EXTRAS f10825b;

    public C1873ig(b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar, NETWORK_EXTRAS network_extras) {
        this.f10824a = bVar;
        this.f10825b = network_extras;
    }

    private final SERVER_PARAMETERS D(String str) {
        HashMap hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } catch (Throwable th) {
                C1018Rk.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class<SERVER_PARAMETERS> serverParametersType = this.f10824a.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        SERVER_PARAMETERS server_parameters = (e) serverParametersType.newInstance();
        server_parameters.a(hashMap);
        return server_parameters;
    }

    private static boolean c(C2249nqa nqa) {
        if (nqa.f11539f) {
            return true;
        }
        Qqa.a();
        return C0758Hk.a();
    }

    public final C1195Yf Ba() {
        return null;
    }

    public final void K(a aVar) {
    }

    public final a Lb() {
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f10824a;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            C1018Rk.d(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return c.b.b.b.c.b.a(((MediationBannerAdapter) bVar).getBannerView());
        } catch (Throwable th) {
            C1018Rk.b(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    public final C0749Hb Oa() {
        return null;
    }

    public final void X() {
        throw new RemoteException();
    }

    public final boolean _a() {
        return false;
    }

    public final void a(a aVar, C0595Bd bd, List<C0803Jd> list) {
    }

    public final void a(a aVar, C1455cj cjVar, List<String> list) {
    }

    public final void a(a aVar, C2249nqa nqa, String str, C0831Kf kf) {
        a(aVar, nqa, str, (String) null, kf);
    }

    public final void a(a aVar, C2249nqa nqa, String str, C1455cj cjVar, String str2) {
    }

    public final void a(a aVar, C2249nqa nqa, String str, String str2, C0831Kf kf) {
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f10824a;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            C1018Rk.d(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        C1018Rk.a("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f10824a).requestInterstitialAd(new C2015kg(kf), (Activity) c.b.b.b.c.b.Q(aVar), D(str), C2370pg.a(nqa, c(nqa)), this.f10825b);
        } catch (Throwable th) {
            C1018Rk.b(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    public final void a(a aVar, C2249nqa nqa, String str, String str2, C0831Kf kf, C1368bb bbVar, List<String> list) {
    }

    public final void a(a aVar, C2462qqa qqa, C2249nqa nqa, String str, C0831Kf kf) {
        a(aVar, qqa, nqa, str, (String) null, kf);
    }

    public final void a(a aVar, C2462qqa qqa, C2249nqa nqa, String str, String str2, C0831Kf kf) {
        c cVar;
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f10824a;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            C1018Rk.d(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        C1018Rk.a("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f10824a;
            C2015kg kgVar = new C2015kg(kf);
            Activity activity = (Activity) c.b.b.b.c.b.Q(aVar);
            e D = D(str);
            int i = 0;
            c[] cVarArr = {c.f3694a, c.f3695b, c.f3696c, c.f3697d, c.f3698e, c.f3699f};
            while (true) {
                if (i < 6) {
                    if (cVarArr[i].b() == qqa.f11918e && cVarArr[i].a() == qqa.f11915b) {
                        cVar = cVarArr[i];
                        break;
                    }
                    i++;
                } else {
                    cVar = new c(y.a(qqa.f11918e, qqa.f11915b, qqa.f11914a));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(kgVar, activity, D, cVar, C2370pg.a(nqa, c(nqa)), this.f10825b);
        } catch (Throwable th) {
            C1018Rk.b(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    public final void a(C2249nqa nqa, String str) {
    }

    public final void a(C2249nqa nqa, String str, String str2) {
    }

    public final void b(a aVar, C2249nqa nqa, String str, C0831Kf kf) {
    }

    public final void b(boolean z) {
    }

    public final void c(a aVar, C2249nqa nqa, String str, C0831Kf kf) {
    }

    public final void destroy() {
        try {
            this.f10824a.destroy();
        } catch (Throwable th) {
            C1018Rk.b(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    public final Sra getVideoController() {
        return null;
    }

    public final Bundle ib() {
        return new Bundle();
    }

    public final boolean isInitialized() {
        return true;
    }

    public final C1039Sf kb() {
        return null;
    }

    public final void pause() {
        throw new RemoteException();
    }

    public final void showInterstitial() {
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f10824a;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            C1018Rk.d(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        C1018Rk.a("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f10824a).showInterstitial();
        } catch (Throwable th) {
            C1018Rk.b(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    public final void showVideo() {
    }

    public final C1014Rg ta() {
        return null;
    }

    public final C1014Rg ua() {
        return null;
    }

    public final C1013Rf xb() {
        return null;
    }

    public final void y(a aVar) {
    }

    public final Bundle zzug() {
        return new Bundle();
    }
}
