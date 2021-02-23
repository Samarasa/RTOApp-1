package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import com.google.android.gms.ads.internal.p;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.eA  reason: case insensitive filesystem */
public final class C1552eA extends C2289ob implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, FA {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f10218a = {"2011", "1009", "3010"};

    /* renamed from: b  reason: collision with root package name */
    private final String f10219b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, WeakReference<View>> f10220c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private FrameLayout f10221d;

    /* renamed from: e  reason: collision with root package name */
    private FrameLayout f10222e;

    /* renamed from: f  reason: collision with root package name */
    private PY f10223f;

    /* renamed from: g  reason: collision with root package name */
    private View f10224g;

    /* renamed from: h  reason: collision with root package name */
    private final int f10225h;
    private C3110zz i;
    private C2456qna j;
    private a k = null;
    private C1793hb l;
    private boolean m;
    private boolean n = false;

    public C1552eA(FrameLayout frameLayout, FrameLayout frameLayout2, int i2) {
        String str;
        this.f10221d = frameLayout;
        this.f10222e = frameLayout2;
        this.f10225h = 203404000;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f10219b = str;
        p.z();
        C2309ol.a((View) frameLayout, (ViewTreeObserver.OnGlobalLayoutListener) this);
        p.z();
        C2309ol.a((View) frameLayout, (ViewTreeObserver.OnScrollChangedListener) this);
        this.f10223f = C1252_k.f9703e;
        this.j = new C2456qna(this.f10221d.getContext(), this.f10221d);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void _b() {
        this.f10223f.execute(new C1482dA(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void Zb() {
        if (this.f10224g == null) {
            this.f10224g = new View(this.f10221d.getContext());
            this.f10224g.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f10221d != this.f10224g.getParent()) {
            this.f10221d.addView(this.f10224g);
        }
    }

    public final synchronized View a(String str) {
        if (this.n) {
            return null;
        }
        WeakReference weakReference = this.f10220c.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    public final synchronized void a(a aVar, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(com.google.android.gms.internal.ads.C1793hb r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.n     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            r0 = 1
            r1.m = r0     // Catch:{ all -> 0x001b }
            r1.l = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.ads.zz r0 = r1.i     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0019
            com.google.android.gms.internal.ads.zz r0 = r1.i     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.ads.Fz r0 = r0.m()     // Catch:{ all -> 0x001b }
            r0.a(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1552eA.a(com.google.android.gms.internal.ads.hb):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r4 = r1.n     // Catch:{ all -> 0x0041 }
            if (r4 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            if (r3 != 0) goto L_0x0010
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.f10220c     // Catch:{ all -> 0x0041 }
            r3.remove(r2)     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)
            return
        L_0x0010:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.f10220c     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0041 }
            r0.<init>(r3)     // Catch:{ all -> 0x0041 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0041 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0041 }
            if (r4 != 0) goto L_0x003f
            java.lang.String r4 = "3011"
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x002b
            goto L_0x003f
        L_0x002b:
            int r2 = r1.f10225h     // Catch:{ all -> 0x0041 }
            boolean r2 = com.google.android.gms.ads.internal.util.T.a((int) r2)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0036
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0041 }
        L_0x0036:
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0041 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)
            return
        L_0x003f:
            monitor-exit(r1)
            return
        L_0x0041:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1552eA.a(java.lang.String, android.view.View, boolean):void");
    }

    public final synchronized void a(String str, a aVar) {
        a(str, (View) b.Q(aVar), true);
    }

    public final synchronized JSONObject c() {
        if (this.i == null) {
            return null;
        }
        return this.i.a((View) this.f10221d, h(), i());
    }

    public final synchronized void c(a aVar) {
        this.i.a((View) b.Q(aVar));
    }

    public final a d() {
        return this.k;
    }

    public final synchronized void destroy() {
        if (!this.n) {
            if (this.i != null) {
                this.i.b((FA) this);
                this.i = null;
            }
            this.f10220c.clear();
            this.f10221d.removeAllViews();
            this.f10222e.removeAllViews();
            this.f10220c = null;
            this.f10221d = null;
            this.f10222e = null;
            this.f10224g = null;
            this.j = null;
            this.n = true;
        }
    }

    public final /* synthetic */ View e() {
        return this.f10221d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void e(c.b.b.b.c.a r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.n     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            java.lang.Object r2 = c.b.b.b.c.b.Q(r2)     // Catch:{ all -> 0x004a }
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.C3110zz     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0016
            java.lang.String r2 = "Not an instance of native engine. This is most likely a transient error"
            com.google.android.gms.internal.ads.C1018Rk.d(r2)     // Catch:{ all -> 0x004a }
            monitor-exit(r1)
            return
        L_0x0016:
            com.google.android.gms.internal.ads.zz r0 = r1.i     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.zz r0 = r1.i     // Catch:{ all -> 0x004a }
            r0.b((com.google.android.gms.internal.ads.FA) r1)     // Catch:{ all -> 0x004a }
        L_0x001f:
            r1._b()     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.ads.zz r2 = (com.google.android.gms.internal.ads.C3110zz) r2     // Catch:{ all -> 0x004a }
            r1.i = r2     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.ads.zz r2 = r1.i     // Catch:{ all -> 0x004a }
            r2.a((com.google.android.gms.internal.ads.FA) r1)     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.ads.zz r2 = r1.i     // Catch:{ all -> 0x004a }
            android.widget.FrameLayout r0 = r1.f10221d     // Catch:{ all -> 0x004a }
            r2.b((android.view.View) r0)     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.ads.zz r2 = r1.i     // Catch:{ all -> 0x004a }
            android.widget.FrameLayout r0 = r1.f10222e     // Catch:{ all -> 0x004a }
            r2.c((android.view.View) r0)     // Catch:{ all -> 0x004a }
            boolean r2 = r1.m     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x0048
            com.google.android.gms.internal.ads.zz r2 = r1.i     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.ads.Fz r2 = r2.m()     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.ads.hb r0 = r1.l     // Catch:{ all -> 0x004a }
            r2.a(r0)     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r1)
            return
        L_0x004a:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1552eA.e(c.b.b.b.c.a):void");
    }

    public final FrameLayout f() {
        return this.f10222e;
    }

    public final C2456qna g() {
        return this.j;
    }

    public final void g(a aVar) {
        onTouch(this.f10221d, (MotionEvent) b.Q(aVar));
    }

    public final synchronized Map<String, WeakReference<View>> h() {
        return this.f10220c;
    }

    public final synchronized Map<String, WeakReference<View>> i() {
        return this.f10220c;
    }

    public final synchronized Map<String, WeakReference<View>> j() {
        return null;
    }

    public final synchronized String k() {
        return this.f10219b;
    }

    public final synchronized void onClick(View view) {
        if (this.i != null) {
            this.i.g();
            this.i.a(view, this.f10221d, h(), i(), false);
        }
    }

    public final synchronized void onGlobalLayout() {
        if (this.i != null) {
            this.i.a(this.f10221d, h(), i(), C3110zz.d(this.f10221d));
        }
    }

    public final synchronized void onScrollChanged() {
        if (this.i != null) {
            this.i.a(this.f10221d, h(), i(), C3110zz.d(this.f10221d));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.i != null) {
            this.i.a(view, motionEvent, (View) this.f10221d);
        }
        return false;
    }

    public final synchronized a r(String str) {
        return b.a(a(str));
    }

    public final synchronized void u(a aVar) {
        if (!this.n) {
            this.k = aVar;
        }
    }
}
