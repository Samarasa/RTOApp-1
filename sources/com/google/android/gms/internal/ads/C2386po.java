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
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.po  reason: case insensitive filesystem */
final class C2386po extends C2882wo implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, C1516de, C2313on {
    private C0813Jn A;
    private boolean B;
    private boolean C;
    private C1242_a D;
    private C1112Va E;
    private C1536doa F;
    private int G;
    /* access modifiers changed from: private */
    public int H;
    private Q I;
    private Q J;
    private Q K;
    private U L;
    private WeakReference<View.OnClickListener> M;
    private int N;
    private f O;
    private ca P;
    private final AtomicReference<a> Q = new AtomicReference<>();
    private int R = -1;
    private int S = -1;
    private int T = -1;
    private int U = -1;
    private Map<String, C0994Qm> V;
    private final WindowManager W;

    /* renamed from: d  reason: collision with root package name */
    private final C1606eo f11768d;

    /* renamed from: e  reason: collision with root package name */
    private final C1748go f11769e;

    /* renamed from: f  reason: collision with root package name */
    private final Qba f11770f;

    /* renamed from: g  reason: collision with root package name */
    private final C1862ia f11771g;

    /* renamed from: h  reason: collision with root package name */
    private final C1200Yk f11772h;
    private final k i;
    private final b j;
    private final DisplayMetrics k;
    private final Soa l;
    private final C2670toa m;
    private final boolean n;
    private C2988yS o;
    private DS p;
    private f q;
    private C1819ho r;
    private String s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private boolean x = true;
    private boolean y = false;
    private String z = BuildConfig.FLAVOR;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C2386po(C1606eo eoVar, C1748go goVar, C1819ho hoVar, String str, boolean z2, boolean z3, Qba qba, C1862ia iaVar, C1200Yk yk, T t2, k kVar, b bVar, Soa soa, C2670toa toa, boolean z4, C2988yS ySVar, DS ds) {
        super(eoVar, goVar);
        DS ds2;
        C1200Yk yk2 = yk;
        this.f11768d = eoVar;
        this.f11769e = goVar;
        this.r = hoVar;
        this.s = str;
        this.u = z2;
        this.w = -1;
        this.f11770f = qba;
        this.f11771g = iaVar;
        this.f11772h = yk2;
        this.i = kVar;
        this.j = bVar;
        this.W = (WindowManager) getContext().getSystemService("window");
        p.c();
        this.k = oa.a(this.W);
        this.l = soa;
        this.m = toa;
        this.n = z4;
        this.o = ySVar;
        this.p = ds;
        this.P = new ca(this.f11768d.a(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        p.c().a((Context) eoVar, yk2.f9456a, getSettings());
        setDownloadListener(this);
        V();
        if (m.d()) {
            addJavascriptInterface(C0917Nn.a((C2313on) this), "googleAdsJsInterface");
        }
        Z();
        this.L = new U(new T(true, "make_wv", this.s));
        this.L.a().a(t2);
        if (!(!((Boolean) Qqa.e().a(F.vb)).booleanValue() || (ds2 = this.p) == null || ds2.f6547b == null)) {
            this.L.a().a("gqi", this.p.f6547b);
        }
        this.J = N.a(this.L.a());
        this.L.a("native:view_create", this.J);
        this.K = null;
        this.I = null;
        p.e().b((Context) eoVar);
    }

    private final boolean T() {
        int i2;
        int i3;
        boolean z2 = false;
        if (!this.f11769e.T() && !this.f11769e.b()) {
            return false;
        }
        Qqa.a();
        DisplayMetrics displayMetrics = this.k;
        int b2 = C0758Hk.b(displayMetrics, displayMetrics.widthPixels);
        Qqa.a();
        DisplayMetrics displayMetrics2 = this.k;
        int b3 = C0758Hk.b(displayMetrics2, displayMetrics2.heightPixels);
        Activity a2 = this.f11768d.a();
        if (a2 == null || a2.getWindow() == null) {
            i3 = b2;
            i2 = b3;
        } else {
            p.c();
            int[] a3 = oa.a(a2);
            Qqa.a();
            int b4 = C0758Hk.b(this.k, a3[0]);
            Qqa.a();
            i2 = C0758Hk.b(this.k, a3[1]);
            i3 = b4;
        }
        if (this.S == b2 && this.R == b3 && this.T == i3 && this.U == i2) {
            return false;
        }
        if (!(this.S == b2 && this.R == b3)) {
            z2 = true;
        }
        this.S = b2;
        this.R = b3;
        this.T = i3;
        this.U = i2;
        new C1734gh(this).a(b2, b3, i3, i2, this.k.density, this.W.getDefaultDisplay().getRotation());
        return z2;
    }

    private final void U() {
        N.a(this.L.a(), this.J, "aeh2");
    }

    private final synchronized void V() {
        if (!this.u) {
            if (!this.r.e()) {
                if (Build.VERSION.SDK_INT < 18) {
                    C1018Rk.a("Disabling hardware acceleration on an AdView.");
                    W();
                    return;
                }
                C1018Rk.a("Enabling hardware acceleration on an AdView.");
                X();
                return;
            }
        }
        C1018Rk.a("Enabling hardware acceleration on an overlay.");
        X();
    }

    private final synchronized void W() {
        if (!this.v) {
            p.e();
            setLayerType(1, (Paint) null);
        }
        this.v = true;
    }

    private final synchronized void X() {
        if (this.v) {
            p.e();
            setLayerType(0, (Paint) null);
        }
        this.v = false;
    }

    private final synchronized void Y() {
        if (this.V != null) {
            for (C0994Qm a2 : this.V.values()) {
                a2.a();
            }
        }
        this.V = null;
    }

    private final void Z() {
        T a2;
        U u2 = this.L;
        if (u2 != null && (a2 = u2.a()) != null && p.g().c() != null) {
            p.g().c().a(a2);
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

    private final void h(boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z2 ? "1" : "0");
        C1445ce.a((C1516de) this, "onAdVisibilityChanged", (Map) hashMap);
    }

    public final void A() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(p.h().b()));
        hashMap.put("app_volume", String.valueOf(p.h().a()));
        hashMap.put("device_volume", String.valueOf(C0499e.a(getContext())));
        C1445ce.a((C1516de) this, "volume", (Map) hashMap);
    }

    public final C1200Yk B() {
        return this.f11772h;
    }

    public final synchronized C1536doa C() {
        return this.F;
    }

    public final synchronized boolean D() {
        return this.t;
    }

    public final Context E() {
        return this.f11768d.b();
    }

    public final boolean F() {
        return false;
    }

    public final Qba G() {
        return this.f11770f;
    }

    public final Q H() {
        return this.J;
    }

    public final int I() {
        return getMeasuredWidth();
    }

    public final synchronized void J() {
        if (this.E != null) {
            this.E.Xb();
        }
    }

    public final synchronized String K() {
        if (this.p == null) {
            return null;
        }
        return this.p.f6547b;
    }

    public final void L() {
        f a2 = a();
        if (a2 != null) {
            a2.dc();
        }
    }

    public final synchronized int M() {
        return this.N;
    }

    public final int N() {
        return getMeasuredHeight();
    }

    public final C0967Pl O() {
        return null;
    }

    public final synchronized void P() {
        this.y = true;
        if (this.i != null) {
            this.i.P();
        }
    }

    public final synchronized void Q() {
        this.y = false;
        if (this.i != null) {
            this.i.Q();
        }
    }

    public final synchronized f a() {
        return this.q;
    }

    public final void a(int i2) {
        if (i2 == 0) {
            N.a(this.L.a(), this.J, "aebb2");
        }
        U();
        if (this.L.a() != null) {
            this.L.a().a("close_type", String.valueOf(i2));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i2));
        hashMap.put("version", this.f11772h.f9456a);
        C1445ce.a((C1516de) this, "onhide", (Map) hashMap);
    }

    public final void a(Context context) {
        this.f11768d.setBaseContext(context);
        this.P.a(this.f11768d.a());
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
        this.m.a(activity, (WebView) this);
        this.m.a(str, str2);
        if (viewGroup != null) {
            viewGroup.addView(this.m.getView());
        } else {
            C1018Rk.b("The FrameLayout object cannot be null.");
        }
    }

    public final void a(a aVar) {
        this.Q.set(aVar);
    }

    public final void a(c cVar) {
        this.f11769e.a(cVar);
    }

    public final synchronized void a(f fVar) {
        this.q = fVar;
    }

    public final synchronized void a(C0813Jn jn) {
        if (this.A != null) {
            C1018Rk.b("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.A = jn;
        }
    }

    public final synchronized void a(C1112Va va) {
        this.E = va;
    }

    public final synchronized void a(C1242_a _aVar) {
        this.D = _aVar;
    }

    public final synchronized void a(C1536doa doa) {
        this.F = doa;
    }

    public final synchronized void a(C1819ho hoVar) {
        this.r = hoVar;
        requestLayout();
    }

    public final void a(C2810vna vna) {
        synchronized (this) {
            this.B = vna.m;
        }
        h(vna.m);
    }

    public final void a(C2988yS ySVar, DS ds) {
        this.o = ySVar;
        this.p = ds;
    }

    public final synchronized void a(String str) {
        if (!isDestroyed()) {
            super.a(str);
        } else {
            C1018Rk.d("The webview is destroyed. Ignoring action.");
        }
    }

    public final void a(String str, n<C1088Uc<? super C2313on>> nVar) {
        C1748go goVar = this.f11769e;
        if (goVar != null) {
            goVar.a(str, nVar);
        }
    }

    public final synchronized void a(String str, C0994Qm qm) {
        if (this.V == null) {
            this.V = new HashMap();
        }
        this.V.put(str, qm);
    }

    public final void a(String str, C1088Uc<? super C2313on> uc) {
        C1748go goVar = this.f11769e;
        if (goVar != null) {
            goVar.b(str, uc);
        }
    }

    public final void a(String str, String str2) {
        C1445ce.a((C1516de) this, str, str2);
    }

    public final synchronized void a(String str, String str2, String str3) {
        String str4 = str;
        super.loadDataWithBaseURL(str4, C1203Yn.a(str2, C1203Yn.a()), "text/html", "UTF-8", str3);
    }

    public final void a(String str, Map map) {
        C1445ce.a((C1516de) this, str, map);
    }

    public final void a(String str, JSONObject jSONObject) {
        C1445ce.b(this, str, jSONObject);
    }

    public final synchronized void a(boolean z2) {
        if (this.q != null) {
            this.q.a(this.f11769e.T(), z2);
        } else {
            this.t = z2;
        }
    }

    public final void a(boolean z2, int i2, String str) {
        this.f11769e.a(z2, i2, str);
    }

    public final void a(boolean z2, int i2, String str, String str2) {
        this.f11769e.a(z2, i2, str, str2);
    }

    public final void a(boolean z2, long j2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", z2 ? "1" : "0");
        hashMap.put("duration", Long.toString(j2));
        C1445ce.a((C1516de) this, "onCacheAccessComplete", (Map) hashMap);
    }

    public final boolean a(boolean z2, int i2) {
        destroy();
        this.l.a((Voa) new C2315oo(z2, i2));
        this.l.a(Uoa.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    public final synchronized C0994Qm b(String str) {
        if (this.V == null) {
            return null;
        }
        return this.V.get(str);
    }

    public final synchronized void b(int i2) {
        this.N = i2;
    }

    public final synchronized void b(f fVar) {
        this.O = fVar;
    }

    public final void b(String str, C1088Uc<? super C2313on> uc) {
        C1748go goVar = this.f11769e;
        if (goVar != null) {
            goVar.a(str, uc);
        }
    }

    public final void b(String str, JSONObject jSONObject) {
        C1445ce.a((C1516de) this, str, jSONObject);
    }

    public final synchronized void b(boolean z2) {
        this.G += z2 ? 1 : -1;
        if (this.G <= 0 && this.q != null) {
            this.q.ec();
        }
    }

    public final void b(boolean z2, int i2) {
        this.f11769e.a(z2, i2);
    }

    public final synchronized boolean b() {
        return this.G > 0;
    }

    public final C2670toa c() {
        return this.m;
    }

    public final synchronized void c(boolean z2) {
        boolean z3 = z2 != this.u;
        this.u = z2;
        V();
        if (z3) {
            if (!((Boolean) Qqa.e().a(F.K)).booleanValue() || !this.r.e()) {
                new C1734gh(this).c(z2 ? "expanded" : "default");
            }
        }
    }

    public final a d() {
        return this.Q.get();
    }

    public final void d(boolean z2) {
        this.f11769e.b(z2);
    }

    public final synchronized C0813Jn e() {
        return this.A;
    }

    public final synchronized void e(boolean z2) {
        this.x = z2;
    }

    public final Activity f() {
        return this.f11768d.a();
    }

    public final void f(boolean z2) {
        this.f11769e.a(z2);
    }

    public final synchronized f g() {
        return this.O;
    }

    /* access modifiers changed from: protected */
    public final synchronized void g(boolean z2) {
        if (!z2) {
            Z();
            this.P.d();
            if (this.q != null) {
                this.q.Zb();
                this.q.onDestroy();
                this.q = null;
            }
        }
        this.Q.set((Object) null);
        this.f11769e.a();
        p.y();
        C0916Nm.a((C1175Xl) this);
        Y();
    }

    public final synchronized String getRequestId() {
        return this.z;
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    public final void h() {
        this.P.c();
    }

    public final boolean i() {
        return ((Boolean) Qqa.e().a(F.Ee)).booleanValue() && this.m != null && this.n;
    }

    public final synchronized boolean j() {
        return this.u;
    }

    public final b k() {
        return this.j;
    }

    public final void l() {
        if (this.K == null) {
            this.K = N.a(this.L.a());
            this.L.a("native:view_load", this.K);
        }
    }

    public final synchronized C1819ho m() {
        return this.r;
    }

    public final DS n() {
        return this.p;
    }

    public final void o() {
    }

    public final void onAdClicked() {
        C1748go goVar = this.f11769e;
        if (goVar != null) {
            goVar.onAdClicked();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isDestroyed()) {
            this.P.a();
        }
        boolean z2 = this.B;
        if (this.f11769e != null && this.f11769e.b()) {
            if (!this.C) {
                this.f11769e.d();
                this.f11769e.e();
                this.C = true;
            }
            T();
            z2 = true;
        }
        h(z2);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!isDestroyed()) {
                this.P.b();
            }
            super.onDetachedFromWindow();
            if (this.C && this.f11769e != null && this.f11769e.b() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.f11769e.d();
                this.f11769e.e();
                this.C = false;
            }
        }
        h(false);
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
        if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
            super.onDraw(canvas);
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
        boolean T2 = T();
        f a2 = a();
        if (a2 != null && T2) {
            a2.cc();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01d8 A[SYNTHETIC, Splitter:B:109:0x01d8] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0141  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:64:0x00de=Splitter:B:64:0x00de, B:116:0x01ee=Splitter:B:116:0x01ee} */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.isDestroyed()     // Catch:{ all -> 0x01f3 }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x01ee
            boolean r0 = r7.u     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x01ee
            com.google.android.gms.internal.ads.ho r0 = r7.r     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.f()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x0021
            goto L_0x01ee
        L_0x0021:
            com.google.android.gms.internal.ads.ho r0 = r7.r     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.h()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.ho r0 = r7.r     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.g()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.F.oc     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.B r1 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x01f3 }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x01f3 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.Jn r0 = r7.e()     // Catch:{ all -> 0x01f3 }
            r1 = 0
            if (r0 == 0) goto L_0x0059
            float r0 = r0.ia()     // Catch:{ all -> 0x01f3 }
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0063
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x0063:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01f3 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01f3 }
            float r1 = (float) r9     // Catch:{ all -> 0x01f3 }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01f3 }
            float r2 = (float) r8     // Catch:{ all -> 0x01f3 }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01f3 }
            if (r9 != 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            float r9 = (float) r2     // Catch:{ all -> 0x01f3 }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01f3 }
            r9 = r2
            goto L_0x0084
        L_0x007c:
            if (r8 != 0) goto L_0x0084
            if (r1 == 0) goto L_0x0084
            float r8 = (float) r1     // Catch:{ all -> 0x01f3 }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01f3 }
            r8 = r1
        L_0x0084:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01f3 }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01f3 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x0091:
            com.google.android.gms.internal.ads.ho r0 = r7.r     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.a()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x00e3
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.F.rc     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.B r1 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x01f3 }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x01f3 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x00de
            boolean r0 = com.google.android.gms.common.util.m.d()     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x00b2
            goto L_0x00de
        L_0x00b2:
            java.lang.String r0 = "/contentHeight"
            com.google.android.gms.internal.ads.ro r1 = new com.google.android.gms.internal.ads.ro     // Catch:{ all -> 0x01f3 }
            r1.<init>(r7)     // Catch:{ all -> 0x01f3 }
            r7.b((java.lang.String) r0, (com.google.android.gms.internal.ads.C1088Uc<? super com.google.android.gms.internal.ads.C2313on>) r1)     // Catch:{ all -> 0x01f3 }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.a((java.lang.String) r0)     // Catch:{ all -> 0x01f3 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01f3 }
            int r0 = r7.H     // Catch:{ all -> 0x01f3 }
            r1 = -1
            if (r0 == r1) goto L_0x00d5
            int r9 = r7.H     // Catch:{ all -> 0x01f3 }
            float r9 = (float) r9     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r0 = r7.k     // Catch:{ all -> 0x01f3 }
            float r0 = r0.density     // Catch:{ all -> 0x01f3 }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01f3 }
            goto L_0x00d9
        L_0x00d5:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01f3 }
        L_0x00d9:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x00de:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x00e3:
            com.google.android.gms.internal.ads.ho r0 = r7.r     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.e()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x00f8
            android.util.DisplayMetrics r8 = r7.k     // Catch:{ all -> 0x01f3 }
            int r8 = r8.widthPixels     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r9 = r7.k     // Catch:{ all -> 0x01f3 }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01f3 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x00f8:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01f3 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01f3 }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01f3 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01f3 }
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
            com.google.android.gms.internal.ads.ho r2 = r7.r     // Catch:{ all -> 0x01f3 }
            int r2 = r2.f10734c     // Catch:{ all -> 0x01f3 }
            r3 = 1
            if (r2 > r0) goto L_0x012e
            com.google.android.gms.internal.ads.ho r2 = r7.r     // Catch:{ all -> 0x01f3 }
            int r2 = r2.f10733b     // Catch:{ all -> 0x01f3 }
            if (r2 <= r5) goto L_0x012c
            goto L_0x012e
        L_0x012c:
            r2 = 0
            goto L_0x012f
        L_0x012e:
            r2 = 1
        L_0x012f:
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.F.Id     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.B r6 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x01f3 }
            java.lang.Object r4 = r6.a(r4)     // Catch:{ all -> 0x01f3 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01f3 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01f3 }
            if (r4 == 0) goto L_0x016e
            com.google.android.gms.internal.ads.ho r4 = r7.r     // Catch:{ all -> 0x01f3 }
            int r4 = r4.f10734c     // Catch:{ all -> 0x01f3 }
            float r4 = (float) r4     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r6 = r7.k     // Catch:{ all -> 0x01f3 }
            float r6 = r6.density     // Catch:{ all -> 0x01f3 }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r6 = r7.k     // Catch:{ all -> 0x01f3 }
            float r6 = r6.density     // Catch:{ all -> 0x01f3 }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x016a
            com.google.android.gms.internal.ads.ho r0 = r7.r     // Catch:{ all -> 0x01f3 }
            int r0 = r0.f10733b     // Catch:{ all -> 0x01f3 }
            float r0 = (float) r0     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.k     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r5 = r7.k     // Catch:{ all -> 0x01f3 }
            float r5 = r5.density     // Catch:{ all -> 0x01f3 }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x016a
            goto L_0x016b
        L_0x016a:
            r3 = 0
        L_0x016b:
            if (r2 == 0) goto L_0x016e
            r2 = r3
        L_0x016e:
            r0 = 8
            if (r2 == 0) goto L_0x01d8
            com.google.android.gms.internal.ads.ho r2 = r7.r     // Catch:{ all -> 0x01f3 }
            int r2 = r2.f10734c     // Catch:{ all -> 0x01f3 }
            float r2 = (float) r2     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r3 = r7.k     // Catch:{ all -> 0x01f3 }
            float r3 = r3.density     // Catch:{ all -> 0x01f3 }
            float r2 = r2 / r3
            int r2 = (int) r2     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.ho r3 = r7.r     // Catch:{ all -> 0x01f3 }
            int r3 = r3.f10733b     // Catch:{ all -> 0x01f3 }
            float r3 = (float) r3     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.k     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch:{ all -> 0x01f3 }
            float r8 = (float) r8     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.k     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r8 = r8 / r4
            int r8 = (int) r8     // Catch:{ all -> 0x01f3 }
            float r9 = (float) r9     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.k     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01f3 }
            r4 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f3 }
            r5.<init>(r4)     // Catch:{ all -> 0x01f3 }
            java.lang.String r4 = "Not enough space to show ad. Needs "
            r5.append(r4)     // Catch:{ all -> 0x01f3 }
            r5.append(r2)     // Catch:{ all -> 0x01f3 }
            java.lang.String r2 = "x"
            r5.append(r2)     // Catch:{ all -> 0x01f3 }
            r5.append(r3)     // Catch:{ all -> 0x01f3 }
            java.lang.String r2 = " dp, but only has "
            r5.append(r2)     // Catch:{ all -> 0x01f3 }
            r5.append(r8)     // Catch:{ all -> 0x01f3 }
            java.lang.String r8 = "x"
            r5.append(r8)     // Catch:{ all -> 0x01f3 }
            r5.append(r9)     // Catch:{ all -> 0x01f3 }
            java.lang.String r8 = " dp."
            r5.append(r8)     // Catch:{ all -> 0x01f3 }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.C1018Rk.d(r8)     // Catch:{ all -> 0x01f3 }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01f3 }
            if (r8 == r0) goto L_0x01d3
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01f3 }
        L_0x01d3:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x01d8:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01f3 }
            if (r8 == r0) goto L_0x01e1
            r7.setVisibility(r1)     // Catch:{ all -> 0x01f3 }
        L_0x01e1:
            com.google.android.gms.internal.ads.ho r8 = r7.r     // Catch:{ all -> 0x01f3 }
            int r8 = r8.f10734c     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.ho r9 = r7.r     // Catch:{ all -> 0x01f3 }
            int r9 = r9.f10733b     // Catch:{ all -> 0x01f3 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x01ee:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x01f3:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2386po.onMeasure(int, int):void");
    }

    public final void onPause() {
        try {
            super.onPause();
        } catch (Exception e2) {
            C1018Rk.b("Could not pause webview.", e2);
        }
    }

    public final void onResume() {
        try {
            super.onResume();
        } catch (Exception e2) {
            C1018Rk.b("Could not resume webview.", e2);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f11769e.b() || this.f11769e.c()) {
            Qba qba = this.f11770f;
            if (qba != null) {
                qba.a(motionEvent);
            }
            C1862ia iaVar = this.f11771g;
            if (iaVar != null) {
                iaVar.a(motionEvent);
            }
        } else {
            synchronized (this) {
                if (this.D != null) {
                    this.D.a(motionEvent);
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final synchronized String p() {
        return this.s;
    }

    public final synchronized C1242_a q() {
        return this.D;
    }

    public final synchronized boolean r() {
        return this.x;
    }

    public final C2988yS s() {
        return this.o;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.M = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final synchronized void setRequestedOrientation(int i2) {
        this.w = i2;
        if (this.q != null) {
            this.q.d(this.w);
        }
    }

    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e2) {
            C1018Rk.b("Could not stop loading webview.", e2);
        }
    }

    public final /* synthetic */ C1323ao t() {
        return this.f11769e;
    }

    public final void u() {
        setBackgroundColor(0);
    }

    public final void v() {
        if (this.I == null) {
            N.a(this.L.a(), this.J, "aes2");
            this.I = N.a(this.L.a());
            this.L.a("native:view_show", this.I);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f11772h.f9456a);
        C1445ce.a((C1516de) this, "onshow", (Map) hashMap);
    }

    public final void w() {
        U();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f11772h.f9456a);
        C1445ce.a((C1516de) this, "onhide", (Map) hashMap);
    }

    public final U x() {
        return this.L;
    }

    public final void y() {
        fa.f("Cannot add text view to inner AdWebView");
    }

    public final WebViewClient z() {
        return this.f11769e;
    }
}
