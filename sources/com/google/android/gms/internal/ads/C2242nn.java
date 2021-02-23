package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
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
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.nn  reason: case insensitive filesystem */
public class C2242nn extends WebViewClient implements C1323ao {

    /* renamed from: a  reason: collision with root package name */
    protected C2313on f11514a;

    /* renamed from: b  reason: collision with root package name */
    private final Soa f11515b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, List<C1088Uc<? super C2313on>>> f11516c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f11517d;

    /* renamed from: e  reason: collision with root package name */
    private C1540dqa f11518e;

    /* renamed from: f  reason: collision with root package name */
    private q f11519f;

    /* renamed from: g  reason: collision with root package name */
    private Cdo f11520g;

    /* renamed from: h  reason: collision with root package name */
    private C1465co f11521h;
    private C2858wc i;
    private C3071zc j;
    private C1677fo k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private v q;
    private final C1805hh r;
    private a s;
    private C1170Xg t;
    protected C0835Kj u;
    private boolean v;
    private boolean w;
    private int x;
    private boolean y;
    private View.OnAttachStateChangeListener z;

    public C2242nn(C2313on onVar, Soa soa, boolean z2) {
        this(onVar, soa, z2, new C1805hh(onVar, onVar.E(), new C2047l(onVar.getContext())), (C1170Xg) null);
    }

    private C2242nn(C2313on onVar, Soa soa, boolean z2, C1805hh hhVar, C1170Xg xg) {
        this.f11516c = new HashMap<>();
        this.f11517d = new Object();
        this.l = false;
        this.f11515b = soa;
        this.f11514a = onVar;
        this.m = z2;
        this.r = hhVar;
        this.t = null;
    }

    /* access modifiers changed from: private */
    public final void a(View view, C0835Kj kj, int i2) {
        if (kj.c() && i2 > 0) {
            kj.a(view);
            if (kj.c()) {
                oa.f5628a.postDelayed(new C2596sn(this, view, kj, i2), 100);
            }
        }
    }

    private final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        c cVar;
        C1170Xg xg = this.t;
        boolean z2 = false;
        boolean a2 = xg != null ? xg.a() : false;
        p.b();
        Context context = this.f11514a.getContext();
        if (!a2) {
            z2 = true;
        }
        com.google.android.gms.ads.internal.overlay.p.a(context, adOverlayInfoParcel, z2);
        if (this.u != null) {
            String str = adOverlayInfoParcel.l;
            if (str == null && (cVar = adOverlayInfoParcel.f5477a) != null) {
                str = cVar.f5486b;
            }
            this.u.a(str);
        }
    }

    /* access modifiers changed from: private */
    public final void a(Map<String, String> map, List<C1088Uc<? super C2313on>> list, String str) {
        if (C1018Rk.a(2)) {
            String valueOf = String.valueOf(str);
            fa.f(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
            for (String next : map.keySet()) {
                String str2 = map.get(next);
                StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 4 + String.valueOf(str2).length());
                sb.append("  ");
                sb.append(next);
                sb.append(": ");
                sb.append(str2);
                fa.f(sb.toString());
            }
        }
        for (C1088Uc<? super C2313on> a2 : list) {
            a2.a(this.f11514a, map);
        }
    }

    private final WebResourceResponse b(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry next : map.entrySet()) {
                    openConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    p.c().a(this.f11514a.getContext(), this.f11514a.B().f9456a, false, httpURLConnection);
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
        if (this.z != null) {
            this.f11514a.getView().removeOnAttachStateChangeListener(this.z);
        }
    }

    private final void g() {
        if (this.f11520g != null && ((this.v && this.x <= 0) || this.w)) {
            if (((Boolean) Qqa.e().a(F.vb)).booleanValue() && this.f11514a.x() != null) {
                N.a(this.f11514a.x().a(), this.f11514a.H(), "awfllc");
            }
            this.f11520g.a(!this.w);
            this.f11520g = null;
        }
        this.f11514a.l();
    }

    private static WebResourceResponse h() {
        if (((Boolean) Qqa.e().a(F.ka)).booleanValue()) {
            return new WebResourceResponse(BuildConfig.FLAVOR, BuildConfig.FLAVOR, new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public final void P() {
        synchronized (this.f11517d) {
            this.p = true;
        }
        this.x++;
        g();
    }

    public final void Q() {
        this.x--;
        g();
    }

    public final void R() {
        Soa soa = this.f11515b;
        if (soa != null) {
            soa.a(Uoa.DELAY_PAGE_LOAD_CANCELLED_AD);
        }
        this.w = true;
        g();
        if (((Boolean) Qqa.e().a(F.Xd)).booleanValue()) {
            this.f11514a.destroy();
        }
    }

    public final a S() {
        return this.s;
    }

    public final boolean T() {
        boolean z2;
        synchronized (this.f11517d) {
            z2 = this.m;
        }
        return z2;
    }

    public final C0835Kj U() {
        return this.u;
    }

    public final void V() {
        synchronized (this.f11517d) {
            this.l = false;
            this.m = true;
            C1252_k.f9703e.execute(new C2455qn(this));
        }
    }

    public final void W() {
        C0835Kj kj = this.u;
        if (kj != null) {
            WebView webView = this.f11514a.getWebView();
            if (y.z(webView)) {
                a((View) webView, kj, 10);
                return;
            }
            f();
            this.z = new C2525rn(this, kj);
            this.f11514a.getView().addOnAttachStateChangeListener(this.z);
        }
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse a(String str, Map<String, String> map) {
        Aoa a2;
        try {
            String a3 = C1740gk.a(str, this.f11514a.getContext(), this.y);
            if (!a3.equals(str)) {
                return b(a3, map);
            }
            Foa a4 = Foa.a(str);
            if (a4 != null && (a2 = p.i().a(a4)) != null && a2.g()) {
                return new WebResourceResponse(BuildConfig.FLAVOR, BuildConfig.FLAVOR, a2.h());
            }
            if (!C0836Kk.a() || !C2996ya.f12927b.a().booleanValue()) {
                return null;
            }
            return b(str, map);
        } catch (Exception | NoClassDefFoundError e2) {
            p.g().a(e2, "AdWebViewClient.interceptRequest");
            return h();
        }
    }

    public final void a() {
        C0835Kj kj = this.u;
        if (kj != null) {
            kj.a();
            this.u = null;
        }
        f();
        synchronized (this.f11517d) {
            this.f11516c.clear();
            this.f11518e = null;
            this.f11519f = null;
            this.f11520g = null;
            this.f11521h = null;
            this.i = null;
            this.j = null;
            this.l = false;
            this.m = false;
            this.n = false;
            this.p = false;
            this.q = null;
            this.k = null;
            if (this.t != null) {
                this.t.a(true);
                this.t = null;
            }
        }
    }

    public final void a(int i2, int i3) {
        C1170Xg xg = this.t;
        if (xg != null) {
            xg.a(i2, i3);
        }
    }

    public final void a(int i2, int i3, boolean z2) {
        this.r.a(i2, i3);
        C1170Xg xg = this.t;
        if (xg != null) {
            xg.a(i2, i3, false);
        }
    }

    public final void a(Uri uri) {
        String path = uri.getPath();
        List list = this.f11516c.get(path);
        if (list != null) {
            if (!((Boolean) Qqa.e().a(F.Td)).booleanValue()) {
                p.c();
                a(oa.b(uri), (List<C1088Uc<? super C2313on>>) list, path);
                return;
            }
            DY.a(p.c().a(uri), new C2809vn(this, list, path), (Executor) C1252_k.f9704f);
            return;
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("No GMSG handler found for GMSG: ");
        sb.append(valueOf);
        fa.f(sb.toString());
        if (((Boolean) Qqa.e().a(F.Ze)).booleanValue() && p.g().c() != null) {
            C1252_k.f9699a.execute(new C2384pn(path));
        }
    }

    public final void a(c cVar) {
        boolean j2 = this.f11514a.j();
        a(new AdOverlayInfoParcel(cVar, (!j2 || this.f11514a.m().e()) ? this.f11518e : null, j2 ? null : this.f11519f, this.q, this.f11514a.B()));
    }

    public final void a(C1465co coVar) {
        this.f11521h = coVar;
    }

    public final void a(Cdo doVar) {
        this.f11520g = doVar;
    }

    public final void a(C1540dqa dqa, C2858wc wcVar, q qVar, C3071zc zcVar, v vVar, boolean z2, C1062Tc tc, a aVar, C1946jh jhVar, C0835Kj kj, C1701gH gHVar, C1644fV fVVar, C1627fE fEVar) {
        C1088Uc<C2313on> uc;
        if (aVar == null) {
            aVar = new a(this.f11514a.getContext(), kj, (C1382bi) null);
        }
        this.t = new C1170Xg(this.f11514a, jhVar);
        this.u = kj;
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
        a("/mraid", (C1088Uc<? super C2313on>) new C1114Vc(aVar, this.t, jhVar));
        a("/mraidLoaded", (C1088Uc<? super C2313on>) this.r);
        a("/open", (C1088Uc<? super C2313on>) new C1192Yc(aVar, this.t, gHVar, fEVar));
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
        if (p.A().g(this.f11514a.getContext())) {
            a("/logScionEvent", (C1088Uc<? super C2313on>) new C1140Wc(this.f11514a.getContext()));
        }
        this.f11518e = dqa;
        this.f11519f = qVar;
        this.i = wcVar;
        this.j = zcVar;
        this.q = vVar;
        this.s = aVar;
        this.l = z2;
    }

    public final void a(String str, n<C1088Uc<? super C2313on>> nVar) {
        synchronized (this.f11517d) {
            List<C1088Uc> list = this.f11516c.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (C1088Uc uc : list) {
                    if (nVar.apply(uc)) {
                        arrayList.add(uc);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    public final void a(String str, C1088Uc<? super C2313on> uc) {
        synchronized (this.f11517d) {
            List list = this.f11516c.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.f11516c.put(str, list);
            }
            list.add(uc);
        }
    }

    public final void a(boolean z2) {
        this.l = z2;
    }

    public final void a(boolean z2, int i2) {
        C1540dqa dqa = (!this.f11514a.j() || this.f11514a.m().e()) ? this.f11518e : null;
        q qVar = this.f11519f;
        v vVar = this.q;
        C2313on onVar = this.f11514a;
        a(new AdOverlayInfoParcel(dqa, qVar, vVar, onVar, z2, i2, onVar.B()));
    }

    public final void a(boolean z2, int i2, String str) {
        boolean j2 = this.f11514a.j();
        C1540dqa dqa = (!j2 || this.f11514a.m().e()) ? this.f11518e : null;
        C2738un unVar = j2 ? null : new C2738un(this.f11514a, this.f11519f);
        C2858wc wcVar = this.i;
        C3071zc zcVar = this.j;
        v vVar = this.q;
        C2313on onVar = this.f11514a;
        a(new AdOverlayInfoParcel(dqa, (q) unVar, wcVar, zcVar, vVar, onVar, z2, i2, str, onVar.B()));
    }

    public final void a(boolean z2, int i2, String str, String str2) {
        boolean j2 = this.f11514a.j();
        C1540dqa dqa = (!j2 || this.f11514a.m().e()) ? this.f11518e : null;
        C2738un unVar = j2 ? null : new C2738un(this.f11514a, this.f11519f);
        C2858wc wcVar = this.i;
        C3071zc zcVar = this.j;
        v vVar = this.q;
        C2313on onVar = this.f11514a;
        a(new AdOverlayInfoParcel(dqa, unVar, wcVar, zcVar, vVar, onVar, z2, i2, str, str2, onVar.B()));
    }

    public final void b(String str, C1088Uc<? super C2313on> uc) {
        synchronized (this.f11517d) {
            List list = this.f11516c.get(str);
            if (list != null) {
                list.remove(uc);
            }
        }
    }

    public final void b(boolean z2) {
        this.y = z2;
    }

    public final boolean b() {
        boolean z2;
        synchronized (this.f11517d) {
            z2 = this.n;
        }
        return z2;
    }

    public final boolean c() {
        boolean z2;
        synchronized (this.f11517d) {
            z2 = this.o;
        }
        return z2;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener d() {
        synchronized (this.f11517d) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener e() {
        synchronized (this.f11517d) {
        }
        return null;
    }

    public final void f(boolean z2) {
        synchronized (this.f11517d) {
            this.o = z2;
        }
    }

    public final void g(boolean z2) {
        synchronized (this.f11517d) {
            this.n = true;
        }
    }

    public void onAdClicked() {
        C1540dqa dqa = this.f11518e;
        if (dqa != null) {
            dqa.onAdClicked();
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        fa.f(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            a(parse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r1.a();
        r0.f11521h = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.v = true;
        r1 = r0.f11521h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.f11517d
            monitor-enter(r1)
            com.google.android.gms.internal.ads.on r2 = r0.f11514a     // Catch:{ all -> 0x0029 }
            boolean r2 = r2.isDestroyed()     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            com.google.android.gms.ads.internal.util.fa.f(r2)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.internal.ads.on r2 = r0.f11514a     // Catch:{ all -> 0x0029 }
            r2.o()     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            r1 = 1
            r0.v = r1
            com.google.android.gms.internal.ads.co r1 = r0.f11521h
            if (r1 == 0) goto L_0x0025
            r1.a()
            r1 = 0
            r0.f11521h = r1
        L_0x0025:
            r0.g()
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2242nn.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C2670toa c2 = this.f11514a.c();
        if (c2 != null && webView == c2.getWebView()) {
            c2.a(webView, str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f11514a.a(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a(str, (Map<String, String>) Collections.emptyMap());
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        fa.f(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.l && webView == this.f11514a.getWebView()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    C1540dqa dqa = this.f11518e;
                    if (dqa != null) {
                        dqa.onAdClicked();
                        C0835Kj kj = this.u;
                        if (kj != null) {
                            kj.a(str);
                        }
                        this.f11518e = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.f11514a.getWebView().willNotDraw()) {
                try {
                    Qba G = this.f11514a.G();
                    if (G != null && G.a(parse)) {
                        parse = G.a(parse, this.f11514a.getContext(), this.f11514a.getView(), this.f11514a.f());
                    }
                } catch (C2506rda unused) {
                    String valueOf2 = String.valueOf(str);
                    C1018Rk.d(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                }
                a aVar = this.s;
                if (aVar == null || aVar.b()) {
                    a(new c("android.intent.action.VIEW", parse.toString(), (String) null, (String) null, (String) null, (String) null, (String) null));
                } else {
                    this.s.a(str);
                }
            } else {
                String valueOf3 = String.valueOf(str);
                C1018Rk.d(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            }
        } else {
            a(parse);
        }
        return true;
    }
}
