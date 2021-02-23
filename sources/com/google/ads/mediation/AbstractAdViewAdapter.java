package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.formats.f;
import com.google.android.gms.ads.formats.g;
import com.google.android.gms.ads.formats.h;
import com.google.android.gms.ads.formats.j;
import com.google.android.gms.ads.h;
import com.google.android.gms.ads.m;
import com.google.android.gms.ads.mediation.A;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.o;
import com.google.android.gms.ads.mediation.r;
import com.google.android.gms.ads.mediation.s;
import com.google.android.gms.ads.mediation.t;
import com.google.android.gms.ads.mediation.u;
import com.google.android.gms.ads.mediation.x;
import com.google.android.gms.ads.mediation.y;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.v;
import com.google.android.gms.internal.ads.C0758Hk;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.C1540dqa;
import com.google.android.gms.internal.ads.Qqa;
import com.google.android.gms.internal.ads.Sra;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, x, A, MediationRewardedVideoAdAdapter, zzbgj {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private h zzmf;
    private m zzmg;
    private com.google.android.gms.ads.d zzmh;
    private Context zzmi;
    /* access modifiers changed from: private */
    public m zzmj;
    /* access modifiers changed from: private */
    public com.google.android.gms.ads.reward.mediation.a zzmk;
    private final com.google.android.gms.ads.h.d zzml = new h(this);

    static class a extends t {
        private final g n;

        public a(g gVar) {
            this.n = gVar;
            d(gVar.e().toString());
            a(gVar.f());
            b(gVar.c().toString());
            if (gVar.g() != null) {
                a(gVar.g());
            }
            c(gVar.d().toString());
            a(gVar.b().toString());
            b(true);
            a(true);
            a(gVar.h());
        }

        public final void b(View view) {
            if (view instanceof com.google.android.gms.ads.formats.d) {
                ((com.google.android.gms.ads.formats.d) view).setNativeAd(this.n);
            }
            com.google.android.gms.ads.formats.e eVar = com.google.android.gms.ads.formats.e.f5421a.get(view);
            if (eVar != null) {
                eVar.a((com.google.android.gms.ads.formats.b) this.n);
            }
        }
    }

    static class b extends s {
        private final com.google.android.gms.ads.formats.f p;

        public b(com.google.android.gms.ads.formats.f fVar) {
            this.p = fVar;
            c(fVar.d().toString());
            a(fVar.f());
            a(fVar.b().toString());
            a(fVar.e());
            b(fVar.c().toString());
            if (fVar.h() != null) {
                a(fVar.h().doubleValue());
            }
            if (fVar.i() != null) {
                e(fVar.i().toString());
            }
            if (fVar.g() != null) {
                d(fVar.g().toString());
            }
            b(true);
            a(true);
            a(fVar.j());
        }

        public final void b(View view) {
            if (view instanceof com.google.android.gms.ads.formats.d) {
                ((com.google.android.gms.ads.formats.d) view).setNativeAd(this.p);
            }
            com.google.android.gms.ads.formats.e eVar = com.google.android.gms.ads.formats.e.f5421a.get(view);
            if (eVar != null) {
                eVar.a((com.google.android.gms.ads.formats.b) this.p);
            }
        }
    }

    static final class c extends com.google.android.gms.ads.c implements com.google.android.gms.ads.b.a, C1540dqa {

        /* renamed from: a  reason: collision with root package name */
        private final AbstractAdViewAdapter f5129a;

        /* renamed from: b  reason: collision with root package name */
        private final com.google.android.gms.ads.mediation.h f5130b;

        public c(AbstractAdViewAdapter abstractAdViewAdapter, com.google.android.gms.ads.mediation.h hVar) {
            this.f5129a = abstractAdViewAdapter;
            this.f5130b = hVar;
        }

        public final void a(String str, String str2) {
            this.f5130b.a(this.f5129a, str, str2);
        }

        public final void onAdClicked() {
            this.f5130b.b(this.f5129a);
        }

        public final void onAdClosed() {
            this.f5130b.a(this.f5129a);
        }

        public final void onAdFailedToLoad(int i) {
            this.f5130b.a((MediationBannerAdapter) this.f5129a, i);
        }

        public final void onAdLeftApplication() {
            this.f5130b.d(this.f5129a);
        }

        public final void onAdLoaded() {
            this.f5130b.c(this.f5129a);
        }

        public final void onAdOpened() {
            this.f5130b.e(this.f5129a);
        }
    }

    static class d extends y {
        private final j s;

        public d(j jVar) {
            this.s = jVar;
            d(jVar.e());
            a(jVar.g());
            b(jVar.c());
            a(jVar.f());
            c(jVar.d());
            a(jVar.b());
            a(jVar.i());
            f(jVar.j());
            e(jVar.h());
            a(jVar.m());
            b(true);
            a(true);
            a(jVar.k());
        }

        public final void a(View view, Map<String, View> map, Map<String, View> map2) {
            if (view instanceof UnifiedNativeAdView) {
                ((UnifiedNativeAdView) view).setNativeAd(this.s);
                return;
            }
            com.google.android.gms.ads.formats.e eVar = com.google.android.gms.ads.formats.e.f5421a.get(view);
            if (eVar != null) {
                eVar.a(this.s);
            }
        }
    }

    static final class e extends com.google.android.gms.ads.c implements f.a, g.a, h.a, h.b, j.a {

        /* renamed from: a  reason: collision with root package name */
        private final AbstractAdViewAdapter f5131a;

        /* renamed from: b  reason: collision with root package name */
        private final o f5132b;

        public e(AbstractAdViewAdapter abstractAdViewAdapter, o oVar) {
            this.f5131a = abstractAdViewAdapter;
            this.f5132b = oVar;
        }

        public final void a(com.google.android.gms.ads.formats.f fVar) {
            this.f5132b.a((MediationNativeAdapter) this.f5131a, (r) new b(fVar));
        }

        public final void a(g gVar) {
            this.f5132b.a((MediationNativeAdapter) this.f5131a, (r) new a(gVar));
        }

        public final void a(com.google.android.gms.ads.formats.h hVar) {
            this.f5132b.a((MediationNativeAdapter) this.f5131a, hVar);
        }

        public final void a(com.google.android.gms.ads.formats.h hVar, String str) {
            this.f5132b.a(this.f5131a, hVar, str);
        }

        public final void onAdClicked() {
            this.f5132b.c(this.f5131a);
        }

        public final void onAdClosed() {
            this.f5132b.b(this.f5131a);
        }

        public final void onAdFailedToLoad(int i) {
            this.f5132b.a((MediationNativeAdapter) this.f5131a, i);
        }

        public final void onAdImpression() {
            this.f5132b.e(this.f5131a);
        }

        public final void onAdLeftApplication() {
            this.f5132b.d(this.f5131a);
        }

        public final void onAdLoaded() {
        }

        public final void onAdOpened() {
            this.f5132b.a(this.f5131a);
        }

        public final void onUnifiedNativeAdLoaded(j jVar) {
            this.f5132b.a((MediationNativeAdapter) this.f5131a, (y) new d(jVar));
        }
    }

    static final class f extends com.google.android.gms.ads.c implements C1540dqa {

        /* renamed from: a  reason: collision with root package name */
        private final AbstractAdViewAdapter f5133a;

        /* renamed from: b  reason: collision with root package name */
        private final com.google.android.gms.ads.mediation.m f5134b;

        public f(AbstractAdViewAdapter abstractAdViewAdapter, com.google.android.gms.ads.mediation.m mVar) {
            this.f5133a = abstractAdViewAdapter;
            this.f5134b = mVar;
        }

        public final void onAdClicked() {
            this.f5134b.b(this.f5133a);
        }

        public final void onAdClosed() {
            this.f5134b.d(this.f5133a);
        }

        public final void onAdFailedToLoad(int i) {
            this.f5134b.a((MediationInterstitialAdapter) this.f5133a, i);
        }

        public final void onAdLeftApplication() {
            this.f5134b.a(this.f5133a);
        }

        public final void onAdLoaded() {
            this.f5134b.c(this.f5133a);
        }

        public final void onAdOpened() {
            this.f5134b.e(this.f5133a);
        }
    }

    private final com.google.android.gms.ads.e zza(Context context, com.google.android.gms.ads.mediation.e eVar, Bundle bundle, Bundle bundle2) {
        e.a aVar = new e.a();
        Date e2 = eVar.e();
        if (e2 != null) {
            aVar.a(e2);
        }
        int l = eVar.l();
        if (l != 0) {
            aVar.a(l);
        }
        Set<String> h2 = eVar.h();
        if (h2 != null) {
            for (String a2 : h2) {
                aVar.a(a2);
            }
        }
        Location location = eVar.getLocation();
        if (location != null) {
            aVar.a(location);
        }
        if (eVar.g()) {
            Qqa.a();
            aVar.b(C0758Hk.a(context));
        }
        if (eVar.a() != -1) {
            boolean z = true;
            if (eVar.a() != 1) {
                z = false;
            }
            aVar.b(z);
        }
        aVar.a(eVar.c());
        aVar.a(AdMobAdapter.class, zza(bundle, bundle2));
        return aVar.a();
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    public View getBannerView() {
        return this.zzmf;
    }

    public Bundle getInterstitialAdapterInfo() {
        f.a aVar = new f.a();
        aVar.a(1);
        return aVar.a();
    }

    public Sra getVideoController() {
        v videoController;
        com.google.android.gms.ads.h hVar = this.zzmf;
        if (hVar == null || (videoController = hVar.getVideoController()) == null) {
            return null;
        }
        return videoController.a();
    }

    public void initialize(Context context, com.google.android.gms.ads.mediation.e eVar, String str, com.google.android.gms.ads.reward.mediation.a aVar, Bundle bundle, Bundle bundle2) {
        this.zzmi = context.getApplicationContext();
        this.zzmk = aVar;
        this.zzmk.f(this);
    }

    public boolean isInitialized() {
        return this.zzmk != null;
    }

    public void loadAd(com.google.android.gms.ads.mediation.e eVar, Bundle bundle, Bundle bundle2) {
        Context context = this.zzmi;
        if (context == null || this.zzmk == null) {
            C1018Rk.b("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        this.zzmj = new m(context);
        this.zzmj.b(true);
        this.zzmj.a(getAdUnitId(bundle));
        this.zzmj.a(this.zzml);
        this.zzmj.a((com.google.android.gms.ads.h.a) new g(this));
        this.zzmj.a(zza(this.zzmi, eVar, bundle2, bundle));
    }

    public void onDestroy() {
        com.google.android.gms.ads.h hVar = this.zzmf;
        if (hVar != null) {
            hVar.a();
            this.zzmf = null;
        }
        if (this.zzmg != null) {
            this.zzmg = null;
        }
        if (this.zzmh != null) {
            this.zzmh = null;
        }
        if (this.zzmj != null) {
            this.zzmj = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z) {
        m mVar = this.zzmg;
        if (mVar != null) {
            mVar.a(z);
        }
        m mVar2 = this.zzmj;
        if (mVar2 != null) {
            mVar2.a(z);
        }
    }

    public void onPause() {
        com.google.android.gms.ads.h hVar = this.zzmf;
        if (hVar != null) {
            hVar.b();
        }
    }

    public void onResume() {
        com.google.android.gms.ads.h hVar = this.zzmf;
        if (hVar != null) {
            hVar.c();
        }
    }

    public void requestBannerAd(Context context, com.google.android.gms.ads.mediation.h hVar, Bundle bundle, com.google.android.gms.ads.f fVar, com.google.android.gms.ads.mediation.e eVar, Bundle bundle2) {
        this.zzmf = new com.google.android.gms.ads.h(context);
        this.zzmf.setAdSize(new com.google.android.gms.ads.f(fVar.b(), fVar.a()));
        this.zzmf.setAdUnitId(getAdUnitId(bundle));
        this.zzmf.setAdListener(new c(this, hVar));
        this.zzmf.a(zza(context, eVar, bundle2, bundle));
    }

    public void requestInterstitialAd(Context context, com.google.android.gms.ads.mediation.m mVar, Bundle bundle, com.google.android.gms.ads.mediation.e eVar, Bundle bundle2) {
        this.zzmg = new m(context);
        this.zzmg.a(getAdUnitId(bundle));
        this.zzmg.a((com.google.android.gms.ads.c) new f(this, mVar));
        this.zzmg.a(zza(context, eVar, bundle2, bundle));
    }

    public void requestNativeAd(Context context, o oVar, Bundle bundle, u uVar, Bundle bundle2) {
        e eVar = new e(this, oVar);
        d.a aVar = new d.a(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        aVar.a((com.google.android.gms.ads.c) eVar);
        com.google.android.gms.ads.formats.c i = uVar.i();
        if (i != null) {
            aVar.a(i);
        }
        if (uVar.b()) {
            aVar.a((j.a) eVar);
        }
        if (uVar.d()) {
            aVar.a((f.a) eVar);
        }
        if (uVar.k()) {
            aVar.a((g.a) eVar);
        }
        if (uVar.j()) {
            for (String next : uVar.f().keySet()) {
                aVar.a(next, eVar, uVar.f().get(next).booleanValue() ? eVar : null);
            }
        }
        this.zzmh = aVar.a();
        this.zzmh.a(zza(context, uVar, bundle2, bundle));
    }

    public void showInterstitial() {
        this.zzmg.c();
    }

    public void showVideo() {
        this.zzmj.c();
    }

    /* access modifiers changed from: protected */
    public abstract Bundle zza(Bundle bundle, Bundle bundle2);
}
