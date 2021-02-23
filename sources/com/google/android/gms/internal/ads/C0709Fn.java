package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import c.b.b.b.c.a;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.f;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.C0499e;
import com.google.android.gms.ads.internal.util.ca;
import com.google.android.gms.ads.internal.util.fa;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.common.util.m;
import com.google.android.gms.common.util.n;
import com.google.android.gms.internal.ads.C1892ipa;
import com.google.android.gms.internal.ads.C2460qpa;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Fn  reason: case insensitive filesystem */
final class C0709Fn extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, C2313on {
    private boolean A = false;
    private String B = BuildConfig.FLAVOR;
    private C0813Jn C;
    private boolean D;
    private boolean E;
    private C1242_a F;
    private C1112Va G;
    private C1536doa H;
    private int I;
    /* access modifiers changed from: private */
    public int J;
    private Q K;
    private Q L;
    private Q M;
    private U N;
    private WeakReference<View.OnClickListener> O;
    private int P;
    private f Q;
    private boolean R;
    private ca S;
    private int T = -1;
    private int U = -1;
    private int V = -1;
    private int W = -1;

    /* renamed from: a  reason: collision with root package name */
    private final C1606eo f6914a;
    private Map<String, C0994Qm> aa;

    /* renamed from: b  reason: collision with root package name */
    private final Qba f6915b;
    private final WindowManager ba;

    /* renamed from: c  reason: collision with root package name */
    private final C1862ia f6916c;
    private final Soa ca;

    /* renamed from: d  reason: collision with root package name */
    private final C1200Yk f6917d;

    /* renamed from: e  reason: collision with root package name */
    private final k f6918e;

    /* renamed from: f  reason: collision with root package name */
    private final b f6919f;

    /* renamed from: g  reason: collision with root package name */
    private final DisplayMetrics f6920g;

    /* renamed from: h  reason: collision with root package name */
    private final float f6921h;
    private final C2670toa i;
    private final boolean j;
    private C2988yS k;
    private DS l;
    private boolean m = false;
    private boolean n = false;
    private C2242nn o;
    private f p;
    private a q;
    private C1819ho r;
    private String s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private Boolean x;
    private int y;
    private boolean z = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C0709Fn(C1606eo eoVar, C1819ho hoVar, String str, boolean z2, boolean z3, Qba qba, C1862ia iaVar, C1200Yk yk, T t2, k kVar, b bVar, Soa soa, C2670toa toa, boolean z4, C2988yS ySVar, DS ds) {
        super(eoVar);
        DS ds2;
        C1200Yk yk2 = yk;
        this.f6914a = eoVar;
        this.r = hoVar;
        this.s = str;
        this.v = z2;
        this.y = -1;
        this.f6915b = qba;
        this.f6916c = iaVar;
        this.f6917d = yk2;
        this.f6918e = kVar;
        this.f6919f = bVar;
        this.ba = (WindowManager) getContext().getSystemService("window");
        p.c();
        this.f6920g = oa.a(this.ba);
        this.f6921h = this.f6920g.density;
        this.ca = soa;
        this.i = toa;
        this.j = z4;
        this.k = ySVar;
        this.l = ds;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e2) {
            C1018Rk.b("Unable to enable Javascript.", e2);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        p.c().a((Context) eoVar, yk2.f9456a, settings);
        p.e().a(getContext(), settings);
        setDownloadListener(this);
        U();
        if (m.d()) {
            addJavascriptInterface(C0917Nn.a((C2313on) this), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.S = new ca(this.f6914a.a(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        Y();
        this.N = new U(new T(true, "make_wv", this.s));
        this.N.a().a(t2);
        if (!(!((Boolean) Qqa.e().a(F.vb)).booleanValue() || (ds2 = this.l) == null || ds2.f6547b == null)) {
            this.N.a().a("gqi", this.l.f6547b);
        }
        this.L = N.a(this.N.a());
        this.N.a("native:view_create", this.L);
        this.M = null;
        this.K = null;
        p.e().b((Context) eoVar);
        p.g().f();
    }

    private final boolean R() {
        int i2;
        int i3;
        boolean z2 = false;
        if (!this.o.T() && !this.o.b()) {
            return false;
        }
        Qqa.a();
        DisplayMetrics displayMetrics = this.f6920g;
        int b2 = C0758Hk.b(displayMetrics, displayMetrics.widthPixels);
        Qqa.a();
        DisplayMetrics displayMetrics2 = this.f6920g;
        int b3 = C0758Hk.b(displayMetrics2, displayMetrics2.heightPixels);
        Activity a2 = this.f6914a.a();
        if (a2 == null || a2.getWindow() == null) {
            i3 = b2;
            i2 = b3;
        } else {
            p.c();
            int[] a3 = oa.a(a2);
            Qqa.a();
            int b4 = C0758Hk.b(this.f6920g, a3[0]);
            Qqa.a();
            i2 = C0758Hk.b(this.f6920g, a3[1]);
            i3 = b4;
        }
        if (this.U == b2 && this.T == b3 && this.V == i3 && this.W == i2) {
            return false;
        }
        if (!(this.U == b2 && this.T == b3)) {
            z2 = true;
        }
        this.U = b2;
        this.T = b3;
        this.V = i3;
        this.W = i2;
        new C1734gh(this).a(b2, b3, i3, i2, this.f6920g.density, this.ba.getDefaultDisplay().getRotation());
        return z2;
    }

    private final synchronized void S() {
        this.x = p.g().d();
        if (this.x == null) {
            try {
                evaluateJavascript("(function(){})()", (ValueCallback<String>) null);
                a((Boolean) true);
            } catch (IllegalStateException unused) {
                a((Boolean) false);
            }
        }
    }

    private final void T() {
        N.a(this.N.a(), this.L, "aeh2");
    }

    private final synchronized void U() {
        if (!this.v) {
            if (!this.r.e()) {
                if (Build.VERSION.SDK_INT < 18) {
                    C1018Rk.a("Disabling hardware acceleration on an AdView.");
                    V();
                    return;
                }
                C1018Rk.a("Enabling hardware acceleration on an AdView.");
                W();
                return;
            }
        }
        C1018Rk.a("Enabling hardware acceleration on an overlay.");
        W();
    }

    private final synchronized void V() {
        if (!this.w) {
            p.e();
            setLayerType(1, (Paint) null);
        }
        this.w = true;
    }

    private final synchronized void W() {
        if (this.w) {
            p.e();
            setLayerType(0, (Paint) null);
        }
        this.w = false;
    }

    private final synchronized void X() {
        if (this.aa != null) {
            for (C0994Qm a2 : this.aa.values()) {
                a2.a();
            }
        }
        this.aa = null;
    }

    private final void Y() {
        T a2;
        U u2 = this.N;
        if (u2 != null && (a2 = u2.a()) != null && p.g().c() != null) {
            p.g().c().a(a2);
        }
    }

    private final synchronized Boolean Z() {
        return this.x;
    }

    static C0709Fn a(Context context, C1819ho hoVar, String str, boolean z2, boolean z3, Qba qba, C1862ia iaVar, C1200Yk yk, T t2, k kVar, b bVar, Soa soa, C2670toa toa, boolean z4, C2988yS ySVar, DS ds) {
        C1606eo eoVar = r0;
        C1606eo eoVar2 = new C1606eo(context);
        return new C0709Fn(eoVar, hoVar, str, z2, z3, qba, iaVar, yk, t2, kVar, bVar, soa, toa, z4, ySVar, ds);
    }

    private final void a(Boolean bool) {
        synchronized (this) {
            this.x = bool;
        }
        p.g().a(bool);
    }

    @TargetApi(19)
    private final synchronized void a(String str, ValueCallback<String> valueCallback) {
        if (!isDestroyed()) {
            evaluateJavascript(str, (ValueCallback<String>) null);
        } else {
            C1018Rk.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    static final /* synthetic */ void a(boolean z2, int i2, C2460qpa.a aVar) {
        C1892ipa.a p2 = C1892ipa.p();
        if (p2.l() != z2) {
            p2.a(z2);
        }
        p2.a(i2);
        aVar.a((C1892ipa) p2.k());
    }

    private final synchronized void aa() {
        if (!this.R) {
            this.R = true;
            p.g().g();
        }
    }

    private final synchronized void c(String str) {
        if (!isDestroyed()) {
            loadUrl(str);
        } else {
            C1018Rk.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    private final synchronized void d(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e2) {
            p.g().a(e2, "AdWebViewImpl.loadUrlUnsafe");
            C1018Rk.c("Could not call loadUrl. ", e2);
        }
    }

    private final void e(String str) {
        if (m.f()) {
            if (Z() == null) {
                S();
            }
            if (Z().booleanValue()) {
                a(str, (ValueCallback<String>) null);
                return;
            }
            String valueOf = String.valueOf(str);
            c(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        String valueOf2 = String.valueOf(str);
        c(valueOf2.length() != 0 ? "javascript:".concat(valueOf2) : new String("javascript:"));
    }

    private final void g(boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z2 ? "1" : "0");
        a("onAdVisibilityChanged", (Map<String, ?>) hashMap);
    }

    public final void A() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(p.h().b()));
        hashMap.put("app_volume", String.valueOf(p.h().a()));
        hashMap.put("device_volume", String.valueOf(C0499e.a(getContext())));
        a("volume", (Map<String, ?>) hashMap);
    }

    public final C1200Yk B() {
        return this.f6917d;
    }

    public final synchronized C1536doa C() {
        return this.H;
    }

    public final synchronized boolean D() {
        return this.t;
    }

    public final Context E() {
        return this.f6914a.b();
    }

    public final boolean F() {
        return false;
    }

    public final Qba G() {
        return this.f6915b;
    }

    public final Q H() {
        return this.L;
    }

    public final int I() {
        return getMeasuredWidth();
    }

    public final synchronized void J() {
        if (this.G != null) {
            this.G.Xb();
        }
    }

    public final synchronized String K() {
        if (this.l == null) {
            return null;
        }
        return this.l.f6547b;
    }

    public final void L() {
        f a2 = a();
        if (a2 != null) {
            a2.dc();
        }
    }

    public final synchronized int M() {
        return this.P;
    }

    public final int N() {
        return getMeasuredHeight();
    }

    public final C0967Pl O() {
        return null;
    }

    public final synchronized void P() {
        this.A = true;
        if (this.f6918e != null) {
            this.f6918e.P();
        }
    }

    public final synchronized void Q() {
        this.A = false;
        if (this.f6918e != null) {
            this.f6918e.Q();
        }
    }

    public final synchronized f a() {
        return this.p;
    }

    public final void a(int i2) {
        if (i2 == 0) {
            N.a(this.N.a(), this.L, "aebb2");
        }
        T();
        if (this.N.a() != null) {
            this.N.a().a("close_type", String.valueOf(i2));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i2));
        hashMap.put("version", this.f6917d.f9456a);
        a("onhide", (Map<String, ?>) hashMap);
    }

    public final void a(Context context) {
        this.f6914a.setBaseContext(context);
        this.S.a(this.f6914a.a());
    }

    public final void a(ViewGroup viewGroup, Activity activity, String str, String str2) {
        if (!i()) {
            fa.f("AR ad is not enabled or the ad from the server is not an AR ad.");
            return;
        }
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).removeView(this);
        }
        fa.f("Initializing ArWebView object.");
        this.i.a(activity, (WebView) this);
        this.i.a(str, str2);
        if (viewGroup != null) {
            viewGroup.addView(this.i.getView());
        } else {
            C1018Rk.b("The FrameLayout object cannot be null.");
        }
    }

    public final synchronized void a(a aVar) {
        this.q = aVar;
    }

    public final void a(c cVar) {
        this.o.a(cVar);
    }

    public final synchronized void a(f fVar) {
        this.p = fVar;
    }

    public final synchronized void a(C0813Jn jn) {
        if (this.C != null) {
            C1018Rk.b("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.C = jn;
        }
    }

    public final synchronized void a(C1112Va va) {
        this.G = va;
    }

    public final synchronized void a(C1242_a _aVar) {
        this.F = _aVar;
    }

    public final synchronized void a(C1536doa doa) {
        this.H = doa;
    }

    public final synchronized void a(C1819ho hoVar) {
        this.r = hoVar;
        requestLayout();
    }

    public final void a(C2810vna vna) {
        synchronized (this) {
            this.D = vna.m;
        }
        g(vna.m);
    }

    public final void a(C2988yS ySVar, DS ds) {
        this.k = ySVar;
        this.l = ds;
    }

    public final void a(String str) {
        e(str);
    }

    public final void a(String str, n<C1088Uc<? super C2313on>> nVar) {
        C2242nn nnVar = this.o;
        if (nnVar != null) {
            nnVar.a(str, nVar);
        }
    }

    public final synchronized void a(String str, C0994Qm qm) {
        if (this.aa == null) {
            this.aa = new HashMap();
        }
        this.aa.put(str, qm);
    }

    public final void a(String str, C1088Uc<? super C2313on> uc) {
        C2242nn nnVar = this.o;
        if (nnVar != null) {
            nnVar.b(str, uc);
        }
    }

    public final synchronized void a(String str, String str2, String str3) {
        if (!isDestroyed()) {
            String str4 = str;
            super.loadDataWithBaseURL(str4, C1203Yn.a(str2, C1203Yn.a()), "text/html", "UTF-8", str3);
            return;
        }
        C1018Rk.d("#004 The webview is destroyed. Ignoring action.");
    }

    public final void a(String str, Map<String, ?> map) {
        try {
            a(str, p.c().a(map));
        } catch (JSONException unused) {
            C1018Rk.d("Could not convert parameters to JSON.");
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        C1018Rk.a(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        e(sb.toString());
    }

    public final synchronized void a(boolean z2) {
        if (this.p != null) {
            this.p.a(this.o.T(), z2);
        } else {
            this.t = z2;
        }
    }

    public final void a(boolean z2, int i2, String str) {
        this.o.a(z2, i2, str);
    }

    public final void a(boolean z2, int i2, String str, String str2) {
        this.o.a(z2, i2, str, str2);
    }

    public final void a(boolean z2, long j2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", z2 ? "1" : "0");
        hashMap.put("duration", Long.toString(j2));
        a("onCacheAccessComplete", (Map<String, ?>) hashMap);
    }

    public final boolean a(boolean z2, int i2) {
        destroy();
        this.ca.a((Voa) new C0683En(z2, i2));
        this.ca.a(Uoa.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    public final synchronized C0994Qm b(String str) {
        if (this.aa == null) {
            return null;
        }
        return this.aa.get(str);
    }

    public final synchronized void b(int i2) {
        this.P = i2;
    }

    public final synchronized void b(f fVar) {
        this.Q = fVar;
    }

    public final void b(String str, C1088Uc<? super C2313on> uc) {
        C2242nn nnVar = this.o;
        if (nnVar != null) {
            nnVar.a(str, uc);
        }
    }

    public final void b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(");
        sb.append(jSONObject2);
        sb.append(");");
        e(sb.toString());
    }

    public final synchronized void b(boolean z2) {
        this.I += z2 ? 1 : -1;
        if (this.I <= 0 && this.p != null) {
            this.p.ec();
        }
    }

    public final void b(boolean z2, int i2) {
        this.o.a(z2, i2);
    }

    public final synchronized boolean b() {
        return this.I > 0;
    }

    public final C2670toa c() {
        return this.i;
    }

    public final synchronized void c(boolean z2) {
        boolean z3 = z2 != this.v;
        this.v = z2;
        U();
        if (z3) {
            if (!((Boolean) Qqa.e().a(F.K)).booleanValue() || !this.r.e()) {
                new C1734gh(this).c(z2 ? "expanded" : "default");
            }
        }
    }

    public final synchronized a d() {
        return this.q;
    }

    public final void d(boolean z2) {
        this.o.b(z2);
    }

    public final synchronized void destroy() {
        Y();
        this.S.d();
        if (this.p != null) {
            this.p.Zb();
            this.p.onDestroy();
            this.p = null;
        }
        this.q = null;
        this.o.a();
        if (!this.u) {
            p.y();
            C0916Nm.a((C1175Xl) this);
            X();
            this.u = true;
            fa.f("Initiating WebView self destruct sequence in 3...");
            fa.f("Loading blank page in WebView, 2...");
            d("about:blank");
        }
    }

    public final synchronized C0813Jn e() {
        return this.C;
    }

    public final synchronized void e(boolean z2) {
        this.z = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isDestroyed()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.internal.ads.C1018Rk.e(r2)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0012
            r2 = 0
            r3.onReceiveValue(r2)     // Catch:{ all -> 0x0019 }
        L_0x0012:
            monitor-exit(r1)
            return
        L_0x0014:
            super.evaluateJavascript(r2, r3)     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0709Fn.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    public final Activity f() {
        return this.f6914a.a();
    }

    public final void f(boolean z2) {
        this.o.a(z2);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            synchronized (this) {
                if (!this.u) {
                    this.o.a();
                    p.y();
                    C0916Nm.a((C1175Xl) this);
                    X();
                    aa();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final synchronized f g() {
        return this.Q;
    }

    public final synchronized String getRequestId() {
        return this.B;
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    public final void h() {
        this.S.c();
    }

    public final boolean i() {
        return ((Boolean) Qqa.e().a(F.Ee)).booleanValue() && this.i != null && this.j;
    }

    public final synchronized boolean isDestroyed() {
        return this.u;
    }

    public final synchronized boolean j() {
        return this.v;
    }

    public final b k() {
        return this.f6919f;
    }

    public final void l() {
        if (this.M == null) {
            this.M = N.a(this.N.a());
            this.N.a("native:view_load", this.M);
        }
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!isDestroyed()) {
            super.loadData(str, str2, str3);
        } else {
            C1018Rk.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!isDestroyed()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            C1018Rk.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!isDestroyed()) {
            try {
                super.loadUrl(str);
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e2) {
                p.g().a(e2, "AdWebViewImpl.loadUrl");
                C1018Rk.c("Could not call loadUrl. ", e2);
            }
        } else {
            C1018Rk.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized C1819ho m() {
        return this.r;
    }

    public final DS n() {
        return this.l;
    }

    public final synchronized void o() {
        fa.f("Destroying WebView!");
        aa();
        oa.f5628a.post(new C0735Gn(this));
    }

    public final void onAdClicked() {
        C2242nn nnVar = this.o;
        if (nnVar != null) {
            nnVar.onAdClicked();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isDestroyed()) {
            this.S.a();
        }
        boolean z2 = this.D;
        if (this.o != null && this.o.b()) {
            if (!this.E) {
                this.o.d();
                this.o.e();
                this.E = true;
            }
            R();
            z2 = true;
        }
        g(z2);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!isDestroyed()) {
                this.S.b();
            }
            super.onDetachedFromWindow();
            if (this.E && this.o != null && this.o.b() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.o.d();
                this.o.e();
                this.E = false;
            }
        }
        g(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            p.c();
            oa.a(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            C1018Rk.a(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (!isDestroyed()) {
            if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean R2 = R();
        f a2 = a();
        if (a2 != null && R2) {
            a2.cc();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01f9, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01d7 A[SYNTHETIC, Splitter:B:112:0x01d7] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0141  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:122:0x01fa=Splitter:B:122:0x01fa, B:64:0x00de=Splitter:B:64:0x00de} */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.isDestroyed()     // Catch:{ all -> 0x01ff }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x01fa
            boolean r0 = r7.v     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x01fa
            com.google.android.gms.internal.ads.ho r0 = r7.r     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.f()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x0021
            goto L_0x01fa
        L_0x0021:
            com.google.android.gms.internal.ads.ho r0 = r7.r     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.h()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.ho r0 = r7.r     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.g()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.F.oc     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.B r1 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x01ff }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x01ff }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.Jn r0 = r7.e()     // Catch:{ all -> 0x01ff }
            r1 = 0
            if (r0 == 0) goto L_0x0059
            float r0 = r0.ia()     // Catch:{ all -> 0x01ff }
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0063
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x0063:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01ff }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01ff }
            float r1 = (float) r9     // Catch:{ all -> 0x01ff }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01ff }
            float r2 = (float) r8     // Catch:{ all -> 0x01ff }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01ff }
            if (r9 != 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            float r9 = (float) r2     // Catch:{ all -> 0x01ff }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01ff }
            r9 = r2
            goto L_0x0084
        L_0x007c:
            if (r8 != 0) goto L_0x0084
            if (r1 == 0) goto L_0x0084
            float r8 = (float) r1     // Catch:{ all -> 0x01ff }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01ff }
            r8 = r1
        L_0x0084:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01ff }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01ff }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x0091:
            com.google.android.gms.internal.ads.ho r0 = r7.r     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.a()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x00e3
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.F.rc     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.B r1 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x01ff }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x01ff }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x00de
            boolean r0 = com.google.android.gms.common.util.m.d()     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x00b2
            goto L_0x00de
        L_0x00b2:
            java.lang.String r0 = "/contentHeight"
            com.google.android.gms.internal.ads.Hn r1 = new com.google.android.gms.internal.ads.Hn     // Catch:{ all -> 0x01ff }
            r1.<init>(r7)     // Catch:{ all -> 0x01ff }
            r7.b((java.lang.String) r0, (com.google.android.gms.internal.ads.C1088Uc<? super com.google.android.gms.internal.ads.C2313on>) r1)     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.e((java.lang.String) r0)     // Catch:{ all -> 0x01ff }
            android.util.DisplayMetrics r0 = r7.f6920g     // Catch:{ all -> 0x01ff }
            float r0 = r0.density     // Catch:{ all -> 0x01ff }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01ff }
            int r1 = r7.J     // Catch:{ all -> 0x01ff }
            r2 = -1
            if (r1 == r2) goto L_0x00d5
            int r9 = r7.J     // Catch:{ all -> 0x01ff }
            float r9 = (float) r9     // Catch:{ all -> 0x01ff }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01ff }
            goto L_0x00d9
        L_0x00d5:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01ff }
        L_0x00d9:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x00de:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x00e3:
            com.google.android.gms.internal.ads.ho r0 = r7.r     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.e()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x00f8
            android.util.DisplayMetrics r8 = r7.f6920g     // Catch:{ all -> 0x01ff }
            int r8 = r8.widthPixels     // Catch:{ all -> 0x01ff }
            android.util.DisplayMetrics r9 = r7.f6920g     // Catch:{ all -> 0x01ff }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01ff }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x00f8:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01ff }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01ff }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01ff }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01ff }
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r4) goto L_0x0118
            if (r0 != r3) goto L_0x0114
            goto L_0x0118
        L_0x0114:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0119
        L_0x0118:
            r0 = r8
        L_0x0119:
            if (r2 == r4) goto L_0x011d
            if (r2 != r3) goto L_0x011e
        L_0x011d:
            r5 = r9
        L_0x011e:
            com.google.android.gms.internal.ads.ho r2 = r7.r     // Catch:{ all -> 0x01ff }
            int r2 = r2.f10734c     // Catch:{ all -> 0x01ff }
            r3 = 1
            if (r2 > r0) goto L_0x012e
            com.google.android.gms.internal.ads.ho r2 = r7.r     // Catch:{ all -> 0x01ff }
            int r2 = r2.f10733b     // Catch:{ all -> 0x01ff }
            if (r2 <= r5) goto L_0x012c
            goto L_0x012e
        L_0x012c:
            r2 = 0
            goto L_0x012f
        L_0x012e:
            r2 = 1
        L_0x012f:
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.F.Id     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.B r6 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x01ff }
            java.lang.Object r4 = r6.a(r4)     // Catch:{ all -> 0x01ff }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01ff }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01ff }
            if (r4 == 0) goto L_0x0167
            com.google.android.gms.internal.ads.ho r4 = r7.r     // Catch:{ all -> 0x01ff }
            int r4 = r4.f10734c     // Catch:{ all -> 0x01ff }
            float r4 = (float) r4     // Catch:{ all -> 0x01ff }
            float r6 = r7.f6921h     // Catch:{ all -> 0x01ff }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01ff }
            float r6 = r7.f6921h     // Catch:{ all -> 0x01ff }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0163
            com.google.android.gms.internal.ads.ho r0 = r7.r     // Catch:{ all -> 0x01ff }
            int r0 = r0.f10733b     // Catch:{ all -> 0x01ff }
            float r0 = (float) r0     // Catch:{ all -> 0x01ff }
            float r4 = r7.f6921h     // Catch:{ all -> 0x01ff }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01ff }
            float r5 = r7.f6921h     // Catch:{ all -> 0x01ff }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0163
            r0 = 1
            goto L_0x0164
        L_0x0163:
            r0 = 0
        L_0x0164:
            if (r2 == 0) goto L_0x0167
            goto L_0x0168
        L_0x0167:
            r0 = r2
        L_0x0168:
            r2 = 8
            if (r0 == 0) goto L_0x01d7
            com.google.android.gms.internal.ads.ho r0 = r7.r     // Catch:{ all -> 0x01ff }
            int r0 = r0.f10734c     // Catch:{ all -> 0x01ff }
            float r0 = (float) r0     // Catch:{ all -> 0x01ff }
            float r4 = r7.f6921h     // Catch:{ all -> 0x01ff }
            float r0 = r0 / r4
            int r0 = (int) r0     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.ho r4 = r7.r     // Catch:{ all -> 0x01ff }
            int r4 = r4.f10733b     // Catch:{ all -> 0x01ff }
            float r4 = (float) r4     // Catch:{ all -> 0x01ff }
            float r5 = r7.f6921h     // Catch:{ all -> 0x01ff }
            float r4 = r4 / r5
            int r4 = (int) r4     // Catch:{ all -> 0x01ff }
            float r8 = (float) r8     // Catch:{ all -> 0x01ff }
            float r5 = r7.f6921h     // Catch:{ all -> 0x01ff }
            float r8 = r8 / r5
            int r8 = (int) r8     // Catch:{ all -> 0x01ff }
            float r9 = (float) r9     // Catch:{ all -> 0x01ff }
            float r5 = r7.f6921h     // Catch:{ all -> 0x01ff }
            float r9 = r9 / r5
            int r9 = (int) r9     // Catch:{ all -> 0x01ff }
            r5 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ff }
            r6.<init>(r5)     // Catch:{ all -> 0x01ff }
            java.lang.String r5 = "Not enough space to show ad. Needs "
            r6.append(r5)     // Catch:{ all -> 0x01ff }
            r6.append(r0)     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = "x"
            r6.append(r0)     // Catch:{ all -> 0x01ff }
            r6.append(r4)     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = " dp, but only has "
            r6.append(r0)     // Catch:{ all -> 0x01ff }
            r6.append(r8)     // Catch:{ all -> 0x01ff }
            java.lang.String r8 = "x"
            r6.append(r8)     // Catch:{ all -> 0x01ff }
            r6.append(r9)     // Catch:{ all -> 0x01ff }
            java.lang.String r8 = " dp."
            r6.append(r8)     // Catch:{ all -> 0x01ff }
            java.lang.String r8 = r6.toString()     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.C1018Rk.d(r8)     // Catch:{ all -> 0x01ff }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01ff }
            if (r8 == r2) goto L_0x01c5
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01ff }
        L_0x01c5:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01ff }
            boolean r8 = r7.m     // Catch:{ all -> 0x01ff }
            if (r8 != 0) goto L_0x01f8
            com.google.android.gms.internal.ads.Soa r8 = r7.ca     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.Uoa r9 = com.google.android.gms.internal.ads.Uoa.BANNER_SIZE_INVALID     // Catch:{ all -> 0x01ff }
            r8.a((com.google.android.gms.internal.ads.Uoa) r9)     // Catch:{ all -> 0x01ff }
            r7.m = r3     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x01d7:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01ff }
            if (r8 == r2) goto L_0x01e0
            r7.setVisibility(r1)     // Catch:{ all -> 0x01ff }
        L_0x01e0:
            boolean r8 = r7.n     // Catch:{ all -> 0x01ff }
            if (r8 != 0) goto L_0x01ed
            com.google.android.gms.internal.ads.Soa r8 = r7.ca     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.Uoa r9 = com.google.android.gms.internal.ads.Uoa.BANNER_SIZE_VALID     // Catch:{ all -> 0x01ff }
            r8.a((com.google.android.gms.internal.ads.Uoa) r9)     // Catch:{ all -> 0x01ff }
            r7.n = r3     // Catch:{ all -> 0x01ff }
        L_0x01ed:
            com.google.android.gms.internal.ads.ho r8 = r7.r     // Catch:{ all -> 0x01ff }
            int r8 = r8.f10734c     // Catch:{ all -> 0x01ff }
            com.google.android.gms.internal.ads.ho r9 = r7.r     // Catch:{ all -> 0x01ff }
            int r9 = r9.f10733b     // Catch:{ all -> 0x01ff }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01ff }
        L_0x01f8:
            monitor-exit(r7)
            return
        L_0x01fa:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01ff }
            monitor-exit(r7)
            return
        L_0x01ff:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0709Fn.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (!isDestroyed()) {
            try {
                super.onPause();
            } catch (Exception e2) {
                C1018Rk.b("Could not pause webview.", e2);
            }
        }
    }

    public final void onResume() {
        if (!isDestroyed()) {
            try {
                super.onResume();
            } catch (Exception e2) {
                C1018Rk.b("Could not resume webview.", e2);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.o.b() || this.o.c()) {
            Qba qba = this.f6915b;
            if (qba != null) {
                qba.a(motionEvent);
            }
            C1862ia iaVar = this.f6916c;
            if (iaVar != null) {
                iaVar.a(motionEvent);
            }
        } else {
            synchronized (this) {
                if (this.F != null) {
                    this.F.a(motionEvent);
                }
            }
        }
        if (isDestroyed()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final synchronized String p() {
        return this.s;
    }

    public final synchronized C1242_a q() {
        return this.F;
    }

    public final synchronized boolean r() {
        return this.z;
    }

    public final C2988yS s() {
        return this.k;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.O = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final synchronized void setRequestedOrientation(int i2) {
        this.y = i2;
        if (this.p != null) {
            this.p.d(this.y);
        }
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C2242nn) {
            this.o = (C2242nn) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!isDestroyed()) {
            try {
                super.stopLoading();
            } catch (Exception e2) {
                C1018Rk.b("Could not stop loading webview.", e2);
            }
        }
    }

    public final /* synthetic */ C1323ao t() {
        return this.o;
    }

    public final void u() {
        setBackgroundColor(0);
    }

    public final void v() {
        if (this.K == null) {
            N.a(this.N.a(), this.L, "aes2");
            this.K = N.a(this.N.a());
            this.N.a("native:view_show", this.K);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f6917d.f9456a);
        a("onshow", (Map<String, ?>) hashMap);
    }

    public final void w() {
        T();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f6917d.f9456a);
        a("onhide", (Map<String, ?>) hashMap);
    }

    public final U x() {
        return this.N;
    }

    public final void y() {
        fa.f("Cannot add text view to inner AdWebView");
    }

    public final WebViewClient z() {
        return this.o;
    }
}
