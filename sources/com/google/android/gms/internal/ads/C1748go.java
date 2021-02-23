package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import b.h.j.y;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.q;
import com.google.android.gms.ads.internal.overlay.v;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.fa;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.common.util.n;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.go  reason: case insensitive filesystem */
public final class C1748go extends C2669to implements C1323ao {
    private boolean A;
    private View.OnAttachStateChangeListener B;

    /* renamed from: d  reason: collision with root package name */
    protected C2313on f10582d;

    /* renamed from: e  reason: collision with root package name */
    private final C1799he<C2313on> f10583e = new C1799he<>();

    /* renamed from: f  reason: collision with root package name */
    private final Object f10584f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private C1540dqa f10585g;

    /* renamed from: h  reason: collision with root package name */
    private q f10586h;
    private Cdo i;
    private C1465co j;
    private C2858wc k;
    private C3071zc l;
    private C1677fo m;
    private boolean n = false;
    private volatile boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private v s;
    private C1805hh t;
    private a u;
    private C1170Xg v;
    private C0835Kj w;
    private boolean x;
    private boolean y;
    private int z;

    /* access modifiers changed from: private */
    public final void a(View view, C0835Kj kj, int i2) {
        if (kj.c() && i2 > 0) {
            kj.a(view);
            if (kj.c()) {
                oa.f5628a.postDelayed(new C1889io(this, view, kj, i2), 100);
            }
        }
    }

    private final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        c cVar;
        C1170Xg xg = this.v;
        boolean z2 = false;
        boolean a2 = xg != null ? xg.a() : false;
        p.b();
        Context context = this.f10582d.getContext();
        if (!a2) {
            z2 = true;
        }
        com.google.android.gms.ads.internal.overlay.p.a(context, adOverlayInfoParcel, z2);
        if (this.w != null) {
            String str = adOverlayInfoParcel.l;
            if (str == null && (cVar = adOverlayInfoParcel.f5477a) != null) {
                str = cVar.f5486b;
            }
            this.w.a(str);
        }
    }

    private final WebResourceResponse e(C2598so soVar) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(soVar.f12135a);
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry next : soVar.f12138d.entrySet()) {
                    openConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    p.c().a(this.f10582d.getContext(), this.f10582d.B().f9456a, false, httpURLConnection);
                    C0836Kk kk = new C0836Kk();
                    kk.a(httpURLConnection, (byte[]) null);
                    int responseCode = httpURLConnection.getResponseCode();
                    kk.a(httpURLConnection, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        p.c();
                    } else {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField == null) {
                            throw new IOException("Missing Location header in redirect");
                        } else if (headerField.startsWith("tel:")) {
                            return null;
                        } else {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                C1018Rk.d("Protocol is null");
                                return h();
                            } else if (protocol.equals("http") || protocol.equals("https")) {
                                String valueOf = String.valueOf(headerField);
                                C1018Rk.a(valueOf.length() != 0 ? "Redirecting to ".concat(valueOf) : new String("Redirecting to "));
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                String valueOf2 = String.valueOf(protocol);
                                C1018Rk.d(valueOf2.length() != 0 ? "Unsupported scheme: ".concat(valueOf2) : new String("Unsupported scheme: "));
                                return h();
                            }
                        }
                    }
                } else {
                    throw new IOException("Invalid protocol.");
                }
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Too many redirects (20)");
                throw new IOException(sb.toString());
            }
        }
        p.c();
        return oa.a(httpURLConnection);
    }

    private final void f() {
        if (this.B != null) {
            this.f10582d.getView().removeOnAttachStateChangeListener(this.B);
        }
    }

    private final void g() {
        if (this.i != null && ((this.x && this.z <= 0) || this.y)) {
            if (((Boolean) Qqa.e().a(F.vb)).booleanValue() && this.f10582d.x() != null) {
                N.a(this.f10582d.x().a(), this.f10582d.H(), "awfllc");
            }
            this.i.a(!this.y);
            this.i = null;
        }
        this.f10582d.l();
    }

    private static WebResourceResponse h() {
        if (((Boolean) Qqa.e().a(F.ka)).booleanValue()) {
            return new WebResourceResponse(BuildConfig.FLAVOR, BuildConfig.FLAVOR, new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public final void P() {
        synchronized (this.f10584f) {
            this.r = true;
        }
        this.z++;
        g();
    }

    public final void Q() {
        this.z--;
        g();
    }

    public final void R() {
        this.y = true;
        g();
    }

    public final a S() {
        return this.u;
    }

    public final boolean T() {
        return this.o;
    }

    public final C0835Kj U() {
        return this.w;
    }

    public final void V() {
        synchronized (this.f10584f) {
            this.n = false;
            this.o = true;
            C1252_k.f9703e.execute(new C1960jo(this));
        }
    }

    public final void W() {
        C0835Kj kj = this.w;
        if (kj != null) {
            WebView webView = this.f10582d.getWebView();
            if (y.z(webView)) {
                a((View) webView, kj, 10);
                return;
            }
            f();
            this.B = new C2102lo(this, kj);
            this.f10582d.getView().addOnAttachStateChangeListener(this.B);
        }
    }

    public final void a() {
        C0835Kj kj = this.w;
        if (kj != null) {
            kj.a();
            this.w = null;
        }
        f();
        this.f10583e.a();
        this.f10583e.a(null);
        synchronized (this.f10584f) {
            this.f10585g = null;
            this.f10586h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.s = null;
            this.m = null;
            if (this.v != null) {
                this.v.a(true);
                this.v = null;
            }
        }
    }

    public final void a(int i2, int i3) {
        C1170Xg xg = this.v;
        if (xg != null) {
            xg.a(i2, i3);
        }
    }

    public final void a(int i2, int i3, boolean z2) {
        this.t.a(i2, i3);
        C1170Xg xg = this.v;
        if (xg != null) {
            xg.a(i2, i3, false);
        }
    }

    public final void a(Uri uri) {
        this.f10583e.b(uri);
    }

    public final void a(c cVar) {
        boolean j2 = this.f10582d.j();
        a(new AdOverlayInfoParcel(cVar, (!j2 || this.f10582d.m().e()) ? this.f10585g : null, j2 ? null : this.f10586h, this.s, this.f10582d.B()));
    }

    public final void a(C1465co coVar) {
        this.j = coVar;
    }

    public final void a(Cdo doVar) {
        this.i = doVar;
    }

    public final void a(C1540dqa dqa, C2858wc wcVar, q qVar, C3071zc zcVar, v vVar, boolean z2, C1062Tc tc, a aVar, C1946jh jhVar, C0835Kj kj, C1701gH gHVar, C1644fV fVVar, C1627fE fEVar) {
        C1088Uc<C2313on> uc;
        if (aVar == null) {
            aVar = new a(this.f10582d.getContext(), kj, (C1382bi) null);
        }
        this.v = new C1170Xg(this.f10582d, jhVar);
        this.w = kj;
        if (((Boolean) Qqa.e().a(F.va)).booleanValue()) {
            a("/adMetadata", (C1088Uc<? super C2313on>) new C2929xc(wcVar));
        }
        a("/appEvent", (C1088Uc<? super C2313on>) new C0568Ac(zcVar));
        a("/backButton", (C1088Uc<? super C2313on>) C0594Bc.k);
        a("/refresh", (C1088Uc<? super C2313on>) C0594Bc.l);
        a("/canOpenApp", (C1088Uc<? super C2313on>) C0594Bc.f6319b);
        a("/canOpenURLs", (C1088Uc<? super C2313on>) C0594Bc.f6318a);
        a("/canOpenIntents", (C1088Uc<? super C2313on>) C0594Bc.f6320c);
        a("/close", (C1088Uc<? super C2313on>) C0594Bc.f6322e);
        a("/customClose", (C1088Uc<? super C2313on>) C0594Bc.f6323f);
        a("/instrument", (C1088Uc<? super C2313on>) C0594Bc.o);
        a("/delayPageLoaded", (C1088Uc<? super C2313on>) C0594Bc.q);
        a("/delayPageClosed", (C1088Uc<? super C2313on>) C0594Bc.r);
        a("/getLocationInfo", (C1088Uc<? super C2313on>) C0594Bc.s);
        a("/log", (C1088Uc<? super C2313on>) C0594Bc.f6325h);
        a("/mraid", (C1088Uc<? super C2313on>) new C1114Vc(aVar, this.v, jhVar));
        a("/mraidLoaded", (C1088Uc<? super C2313on>) this.t);
        a("/open", (C1088Uc<? super C2313on>) new C1192Yc(aVar, this.v, gHVar, fEVar));
        a("/precache", (C1088Uc<? super C2313on>) new C1150Wm());
        a("/touch", (C1088Uc<? super C2313on>) C0594Bc.j);
        a("/video", (C1088Uc<? super C2313on>) C0594Bc.m);
        a("/videoMeta", (C1088Uc<? super C2313on>) C0594Bc.n);
        if (gHVar == null || fVVar == null) {
            a("/click", (C1088Uc<? super C2313on>) C0594Bc.f6321d);
            uc = C0594Bc.f6324g;
        } else {
            a("/click", (C1088Uc<? super C2313on>) ZS.a(gHVar, fVVar));
            uc = ZS.b(gHVar, fVVar);
        }
        a("/httpTrack", (C1088Uc<? super C2313on>) uc);
        if (p.A().g(this.f10582d.getContext())) {
            a("/logScionEvent", (C1088Uc<? super C2313on>) new C1140Wc(this.f10582d.getContext()));
        }
        this.f10585g = dqa;
        this.f10586h = qVar;
        this.k = wcVar;
        this.l = zcVar;
        this.s = vVar;
        this.u = aVar;
        this.n = z2;
    }

    /* access modifiers changed from: package-private */
    public final void a(C2313on onVar, boolean z2) {
        C1805hh hhVar = new C1805hh(onVar, onVar.E(), new C2047l(onVar.getContext()));
        this.f10582d = onVar;
        this.o = z2;
        this.t = hhVar;
        this.v = null;
        this.f10583e.a(onVar);
    }

    public final void a(C2598so soVar) {
        this.x = true;
        C1465co coVar = this.j;
        if (coVar != null) {
            coVar.a();
            this.j = null;
        }
        g();
    }

    public final void a(String str, n<C1088Uc<? super C2313on>> nVar) {
        this.f10583e.a(str, nVar);
    }

    public final void a(String str, C1088Uc<? super C2313on> uc) {
        this.f10583e.b(str, uc);
    }

    public final void a(boolean z2) {
        this.n = z2;
    }

    public final void a(boolean z2, int i2) {
        C1540dqa dqa = (!this.f10582d.j() || this.f10582d.m().e()) ? this.f10585g : null;
        q qVar = this.f10586h;
        v vVar = this.s;
        C2313on onVar = this.f10582d;
        a(new AdOverlayInfoParcel(dqa, qVar, vVar, onVar, z2, i2, onVar.B()));
    }

    public final void a(boolean z2, int i2, String str) {
        boolean j2 = this.f10582d.j();
        C1540dqa dqa = (!j2 || this.f10582d.m().e()) ? this.f10585g : null;
        C2031ko koVar = j2 ? null : new C2031ko(this.f10582d, this.f10586h);
        C2858wc wcVar = this.k;
        C3071zc zcVar = this.l;
        v vVar = this.s;
        C2313on onVar = this.f10582d;
        a(new AdOverlayInfoParcel(dqa, (q) koVar, wcVar, zcVar, vVar, onVar, z2, i2, str, onVar.B()));
    }

    public final void a(boolean z2, int i2, String str, String str2) {
        boolean j2 = this.f10582d.j();
        C1540dqa dqa = (!j2 || this.f10582d.m().e()) ? this.f10585g : null;
        C2031ko koVar = j2 ? null : new C2031ko(this.f10582d, this.f10586h);
        C2858wc wcVar = this.k;
        C3071zc zcVar = this.l;
        v vVar = this.s;
        C2313on onVar = this.f10582d;
        a(new AdOverlayInfoParcel(dqa, koVar, wcVar, zcVar, vVar, onVar, z2, i2, str, str2, onVar.B()));
    }

    public final void b(C2598so soVar) {
        this.f10583e.a(soVar.f12136b);
    }

    public final void b(String str, C1088Uc<? super C2313on> uc) {
        this.f10583e.a(str, uc);
    }

    public final void b(boolean z2) {
        this.A = z2;
    }

    public final boolean b() {
        boolean z2;
        synchronized (this.f10584f) {
            z2 = this.p;
        }
        return z2;
    }

    public final boolean c() {
        boolean z2;
        synchronized (this.f10584f) {
            z2 = this.q;
        }
        return z2;
    }

    public final boolean c(C2598so soVar) {
        String valueOf = String.valueOf(soVar.f12135a);
        fa.f(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri uri = soVar.f12136b;
        if (this.f10583e.a(uri)) {
            return true;
        }
        if (this.n) {
            String scheme = uri.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                C1540dqa dqa = this.f10585g;
                if (dqa != null) {
                    dqa.onAdClicked();
                    C0835Kj kj = this.w;
                    if (kj != null) {
                        kj.a(soVar.f12135a);
                    }
                    this.f10585g = null;
                }
                return false;
            }
        }
        if (!this.f10582d.getWebView().willNotDraw()) {
            try {
                Qba G = this.f10582d.G();
                if (G != null && G.a(uri)) {
                    uri = G.a(uri, this.f10582d.getContext(), this.f10582d.getView(), this.f10582d.f());
                }
            } catch (C2506rda unused) {
                String valueOf2 = String.valueOf(soVar.f12135a);
                C1018Rk.d(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
            }
            a aVar = this.u;
            if (aVar == null || aVar.b()) {
                a(new c("android.intent.action.VIEW", uri.toString(), (String) null, (String) null, (String) null, (String) null, (String) null));
            } else {
                this.u.a(soVar.f12135a);
            }
        } else {
            String valueOf3 = String.valueOf(soVar.f12135a);
            C1018Rk.d(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
        }
        return true;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener d() {
        synchronized (this.f10584f) {
        }
        return null;
    }

    public final WebResourceResponse d(C2598so soVar) {
        WebResourceResponse webResourceResponse;
        Aoa a2;
        C0835Kj kj = this.w;
        if (kj != null) {
            kj.a(soVar.f12135a, soVar.f12138d, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(soVar.f12135a).getName())) {
            webResourceResponse = null;
        } else {
            V();
            String str = (String) Qqa.e().a(this.f10582d.m().e() ? F.I : this.f10582d.j() ? F.H : F.G);
            p.c();
            webResourceResponse = oa.c(this.f10582d.getContext(), this.f10582d.B().f9456a, str);
        }
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        try {
            if (!C1740gk.a(soVar.f12135a, this.f10582d.getContext(), this.A).equals(soVar.f12135a)) {
                return e(soVar);
            }
            Foa a3 = Foa.a(soVar.f12135a);
            if (a3 != null && (a2 = p.i().a(a3)) != null && a2.g()) {
                return new WebResourceResponse(BuildConfig.FLAVOR, BuildConfig.FLAVOR, a2.h());
            }
            if (!C0836Kk.a() || !C2996ya.f12927b.a().booleanValue()) {
                return null;
            }
            return e(soVar);
        } catch (Exception | NoClassDefFoundError e2) {
            p.g().a(e2, "AdWebViewClient.interceptRequest");
            return h();
        }
    }

    public final ViewTreeObserver.OnScrollChangedListener e() {
        synchronized (this.f10584f) {
        }
        return null;
    }

    public final void f(boolean z2) {
        synchronized (this.f10584f) {
            this.q = z2;
        }
    }

    public final void g(boolean z2) {
        synchronized (this.f10584f) {
            this.p = true;
        }
    }

    public final void onAdClicked() {
        C1540dqa dqa = this.f10585g;
        if (dqa != null) {
            dqa.onAdClicked();
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C2670toa c2 = this.f10582d.c();
        if (c2 != null && webView == c2.getWebView()) {
            c2.a(webView, str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f10582d.a(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }
}
