package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.ads.internal.util.wa;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.C2313on;
import com.google.android.gms.internal.ads.C2797vh;
import com.google.android.gms.internal.ads.F;
import com.google.android.gms.internal.ads.Qqa;
import java.util.Collections;
import java.util.Map;

public class f extends C2797vh implements A {

    /* renamed from: a  reason: collision with root package name */
    private static final int f5494a = Color.argb(0, 0, 0, 0);

    /* renamed from: b  reason: collision with root package name */
    protected final Activity f5495b;

    /* renamed from: c  reason: collision with root package name */
    AdOverlayInfoParcel f5496c;

    /* renamed from: d  reason: collision with root package name */
    C2313on f5497d;

    /* renamed from: e  reason: collision with root package name */
    private l f5498e;

    /* renamed from: f  reason: collision with root package name */
    private s f5499f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5500g = false;

    /* renamed from: h  reason: collision with root package name */
    private FrameLayout f5501h;
    private WebChromeClient.CustomViewCallback i;
    private boolean j = false;
    private boolean k = false;
    private i l;
    private boolean m = false;
    m n = m.BACK_BUTTON;
    private final Object o = new Object();
    private Runnable p;
    private boolean q;
    private boolean r;
    private boolean s = false;
    private boolean t = false;
    private boolean u = true;

    public f(Activity activity) {
        this.f5495b = activity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.f5496c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            com.google.android.gms.ads.internal.i r0 = r0.o
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.f5456b
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            com.google.android.gms.ads.internal.util.wa r3 = com.google.android.gms.ads.internal.p.e()
            android.app.Activity r4 = r5.f5495b
            boolean r6 = r3.a((android.app.Activity) r4, (android.content.res.Configuration) r6)
            boolean r3 = r5.k
            r4 = 19
            if (r3 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0037
        L_0x0023:
            if (r6 != 0) goto L_0x0037
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r4) goto L_0x0038
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.f5496c
            if (r6 == 0) goto L_0x0038
            com.google.android.gms.ads.internal.i r6 = r6.o
            if (r6 == 0) goto L_0x0038
            boolean r6 = r6.f5461g
            if (r6 == 0) goto L_0x0038
            r2 = 1
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            android.app.Activity r6 = r5.f5495b
            android.view.Window r6 = r6.getWindow()
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.F.Fa
            com.google.android.gms.internal.ads.B r3 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0066
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x0066
            android.view.View r6 = r6.getDecorView()
            r0 = 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0062
            r0 = 5380(0x1504, float:7.539E-42)
            if (r2 == 0) goto L_0x0062
            r0 = 5894(0x1706, float:8.259E-42)
        L_0x0062:
            r6.setSystemUiVisibility(r0)
            return
        L_0x0066:
            r0 = 1024(0x400, float:1.435E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0082
            r6.addFlags(r0)
            r6.clearFlags(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x0088
            if (r2 == 0) goto L_0x0088
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
            return
        L_0x0082:
            r6.addFlags(r3)
            r6.clearFlags(r0)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.f.a(android.content.res.Configuration):void");
    }

    private static void a(a aVar, View view) {
        if (aVar != null && view != null) {
            p.r().a(aVar, view);
        }
    }

    private final void fc() {
        if (this.f5495b.isFinishing() && !this.s) {
            this.s = true;
            if (this.f5497d != null) {
                this.f5497d.a(this.n.a());
                synchronized (this.o) {
                    if (!this.q && this.f5497d.b()) {
                        this.p = new h(this);
                        oa.f5628a.postDelayed(this.p, ((Long) Qqa.e().a(F.Ca)).longValue());
                        return;
                    }
                }
            }
            bc();
        }
    }

    private final void gc() {
        this.f5497d.v();
    }

    private final void i(boolean z) {
        int intValue = ((Integer) Qqa.e().a(F.hd)).intValue();
        r rVar = new r();
        rVar.f5522e = 50;
        rVar.f5518a = z ? intValue : 0;
        rVar.f5519b = z ? 0 : intValue;
        rVar.f5520c = 0;
        rVar.f5521d = intValue;
        this.f5499f = new s(this.f5495b, rVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        a(z, this.f5496c.f5483g);
        this.l.addView(this.f5499f, layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r1.f5495b.getResources().getConfiguration().orientation == 1) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (r1.f5495b.getResources().getConfiguration().orientation == 2) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void j(boolean r23) {
        /*
            r22 = this;
            r1 = r22
            boolean r0 = r1.r
            r2 = 1
            if (r0 != 0) goto L_0x000c
            android.app.Activity r0 = r1.f5495b
            r0.requestWindowFeature(r2)
        L_0x000c:
            android.app.Activity r0 = r1.f5495b
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x01ec
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.f5496c
            com.google.android.gms.internal.ads.on r3 = r3.f5480d
            r4 = 0
            if (r3 == 0) goto L_0x0020
            com.google.android.gms.internal.ads.ao r3 = r3.t()
            goto L_0x0021
        L_0x0020:
            r3 = r4
        L_0x0021:
            r5 = 0
            if (r3 == 0) goto L_0x002c
            boolean r3 = r3.T()
            if (r3 == 0) goto L_0x002c
            r3 = 1
            goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            r1.m = r5
            if (r3 == 0) goto L_0x0067
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r1.f5496c
            int r6 = r6.j
            com.google.android.gms.ads.internal.p.e()
            r7 = 6
            if (r6 != r7) goto L_0x004d
            android.app.Activity r6 = r1.f5495b
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.orientation
            if (r6 != r2) goto L_0x004a
        L_0x0049:
            r5 = 1
        L_0x004a:
            r1.m = r5
            goto L_0x0067
        L_0x004d:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r1.f5496c
            int r6 = r6.j
            com.google.android.gms.ads.internal.p.e()
            r7 = 7
            if (r6 != r7) goto L_0x0067
            android.app.Activity r6 = r1.f5495b
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.orientation
            r7 = 2
            if (r6 != r7) goto L_0x004a
            goto L_0x0049
        L_0x0067:
            boolean r5 = r1.m
            r6 = 46
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Delay onShow to next orientation change: "
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            com.google.android.gms.internal.ads.C1018Rk.a((java.lang.String) r5)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r5 = r1.f5496c
            int r5 = r5.j
            r1.d(r5)
            com.google.android.gms.ads.internal.p.e()
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            r0.setFlags(r5, r5)
            java.lang.String r0 = "Hardware acceleration on the AdActivity window enabled."
            com.google.android.gms.internal.ads.C1018Rk.a((java.lang.String) r0)
            boolean r0 = r1.k
            if (r0 != 0) goto L_0x009c
            com.google.android.gms.ads.internal.overlay.i r0 = r1.l
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x00a0
        L_0x009c:
            com.google.android.gms.ads.internal.overlay.i r0 = r1.l
            int r5 = f5494a
        L_0x00a0:
            r0.setBackgroundColor(r5)
            android.app.Activity r0 = r1.f5495b
            com.google.android.gms.ads.internal.overlay.i r5 = r1.l
            r0.setContentView(r5)
            r1.r = r2
            if (r23 == 0) goto L_0x017a
            com.google.android.gms.ads.internal.p.d()     // Catch:{ Exception -> 0x016c }
            android.app.Activity r6 = r1.f5495b     // Catch:{ Exception -> 0x016c }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.f5496c     // Catch:{ Exception -> 0x016c }
            com.google.android.gms.internal.ads.on r0 = r0.f5480d     // Catch:{ Exception -> 0x016c }
            if (r0 == 0) goto L_0x00c3
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.f5496c     // Catch:{ Exception -> 0x016c }
            com.google.android.gms.internal.ads.on r0 = r0.f5480d     // Catch:{ Exception -> 0x016c }
            com.google.android.gms.internal.ads.ho r0 = r0.m()     // Catch:{ Exception -> 0x016c }
            r7 = r0
            goto L_0x00c4
        L_0x00c3:
            r7 = r4
        L_0x00c4:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.f5496c     // Catch:{ Exception -> 0x016c }
            com.google.android.gms.internal.ads.on r0 = r0.f5480d     // Catch:{ Exception -> 0x016c }
            if (r0 == 0) goto L_0x00d4
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.f5496c     // Catch:{ Exception -> 0x016c }
            com.google.android.gms.internal.ads.on r0 = r0.f5480d     // Catch:{ Exception -> 0x016c }
            java.lang.String r0 = r0.p()     // Catch:{ Exception -> 0x016c }
            r8 = r0
            goto L_0x00d5
        L_0x00d4:
            r8 = r4
        L_0x00d5:
            r9 = 1
            r11 = 0
            r12 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.f5496c     // Catch:{ Exception -> 0x016c }
            com.google.android.gms.internal.ads.Yk r13 = r0.m     // Catch:{ Exception -> 0x016c }
            r14 = 0
            r15 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.f5496c     // Catch:{ Exception -> 0x016c }
            com.google.android.gms.internal.ads.on r0 = r0.f5480d     // Catch:{ Exception -> 0x016c }
            if (r0 == 0) goto L_0x00ef
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.f5496c     // Catch:{ Exception -> 0x016c }
            com.google.android.gms.internal.ads.on r0 = r0.f5480d     // Catch:{ Exception -> 0x016c }
            com.google.android.gms.ads.internal.b r0 = r0.k()     // Catch:{ Exception -> 0x016c }
            r16 = r0
            goto L_0x00f1
        L_0x00ef:
            r16 = r4
        L_0x00f1:
            com.google.android.gms.internal.ads.Soa r17 = com.google.android.gms.internal.ads.Soa.a()     // Catch:{ Exception -> 0x016c }
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r10 = r3
            com.google.android.gms.internal.ads.on r0 = com.google.android.gms.internal.ads.C2951xn.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x016c }
            r1.f5497d = r0     // Catch:{ Exception -> 0x016c }
            com.google.android.gms.internal.ads.on r0 = r1.f5497d
            com.google.android.gms.internal.ads.ao r5 = r0.t()
            r6 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.f5496c
            com.google.android.gms.internal.ads.wc r7 = r0.p
            r8 = 0
            com.google.android.gms.internal.ads.zc r9 = r0.f5481e
            com.google.android.gms.ads.internal.overlay.v r10 = r0.i
            r11 = 1
            r12 = 0
            com.google.android.gms.internal.ads.on r0 = r0.f5480d
            if (r0 == 0) goto L_0x0124
            com.google.android.gms.internal.ads.ao r0 = r0.t()
            com.google.android.gms.ads.internal.a r0 = r0.S()
            r13 = r0
            goto L_0x0125
        L_0x0124:
            r13 = r4
        L_0x0125:
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r5.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.google.android.gms.internal.ads.on r0 = r1.f5497d
            com.google.android.gms.internal.ads.ao r0 = r0.t()
            com.google.android.gms.ads.internal.overlay.e r5 = new com.google.android.gms.ads.internal.overlay.e
            r5.<init>(r1)
            r0.a((com.google.android.gms.internal.ads.Cdo) r5)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.f5496c
            java.lang.String r5 = r0.l
            if (r5 == 0) goto L_0x014a
            com.google.android.gms.internal.ads.on r0 = r1.f5497d
            r0.loadUrl(r5)
            goto L_0x015a
        L_0x014a:
            java.lang.String r8 = r0.f5484h
            if (r8 == 0) goto L_0x0164
            com.google.android.gms.internal.ads.on r6 = r1.f5497d
            java.lang.String r7 = r0.f5482f
            r11 = 0
            java.lang.String r9 = "text/html"
            java.lang.String r10 = "UTF-8"
            r6.loadDataWithBaseURL(r7, r8, r9, r10, r11)
        L_0x015a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.f5496c
            com.google.android.gms.internal.ads.on r0 = r0.f5480d
            if (r0 == 0) goto L_0x0187
            r0.b((com.google.android.gms.ads.internal.overlay.f) r1)
            goto L_0x0187
        L_0x0164:
            com.google.android.gms.ads.internal.overlay.j r0 = new com.google.android.gms.ads.internal.overlay.j
            java.lang.String r2 = "No URL or HTML to display in ad overlay."
            r0.<init>(r2)
            throw r0
        L_0x016c:
            r0 = move-exception
            java.lang.String r2 = "Error obtaining webview."
            com.google.android.gms.internal.ads.C1018Rk.b(r2, r0)
            com.google.android.gms.ads.internal.overlay.j r0 = new com.google.android.gms.ads.internal.overlay.j
            java.lang.String r2 = "Could not obtain webview for the overlay."
            r0.<init>(r2)
            throw r0
        L_0x017a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.f5496c
            com.google.android.gms.internal.ads.on r0 = r0.f5480d
            r1.f5497d = r0
            com.google.android.gms.internal.ads.on r0 = r1.f5497d
            android.app.Activity r5 = r1.f5495b
            r0.a((android.content.Context) r5)
        L_0x0187:
            com.google.android.gms.internal.ads.on r0 = r1.f5497d
            r0.a((com.google.android.gms.ads.internal.overlay.f) r1)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.f5496c
            com.google.android.gms.internal.ads.on r0 = r0.f5480d
            if (r0 == 0) goto L_0x019b
            c.b.b.b.c.a r0 = r0.d()
            com.google.android.gms.ads.internal.overlay.i r5 = r1.l
            a((c.b.b.b.c.a) r0, (android.view.View) r5)
        L_0x019b:
            com.google.android.gms.internal.ads.on r0 = r1.f5497d
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x01b2
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x01b2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.google.android.gms.internal.ads.on r5 = r1.f5497d
            android.view.View r5 = r5.getView()
            r0.removeView(r5)
        L_0x01b2:
            boolean r0 = r1.k
            if (r0 == 0) goto L_0x01bb
            com.google.android.gms.internal.ads.on r0 = r1.f5497d
            r0.u()
        L_0x01bb:
            com.google.android.gms.internal.ads.on r0 = r1.f5497d
            android.app.Activity r5 = r1.f5495b
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r1.f5496c
            java.lang.String r7 = r6.f5482f
            java.lang.String r6 = r6.f5484h
            r0.a(r4, r5, r7, r6)
            com.google.android.gms.ads.internal.overlay.i r0 = r1.l
            com.google.android.gms.internal.ads.on r4 = r1.f5497d
            android.view.View r4 = r4.getView()
            r5 = -1
            r0.addView(r4, r5, r5)
            if (r23 != 0) goto L_0x01dd
            boolean r0 = r1.m
            if (r0 != 0) goto L_0x01dd
            r22.gc()
        L_0x01dd:
            r1.i(r3)
            com.google.android.gms.internal.ads.on r0 = r1.f5497d
            boolean r0 = r0.D()
            if (r0 == 0) goto L_0x01eb
            r1.a((boolean) r3, (boolean) r2)
        L_0x01eb:
            return
        L_0x01ec:
            com.google.android.gms.ads.internal.overlay.j r0 = new com.google.android.gms.ads.internal.overlay.j
            java.lang.String r2 = "Invalid activity, no window available."
            r0.<init>(r2)
            goto L_0x01f5
        L_0x01f4:
            throw r0
        L_0x01f5:
            goto L_0x01f4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.f.j(boolean):void");
    }

    public final void G(a aVar) {
        a((Configuration) b.Q(aVar));
    }

    public final void Hb() {
    }

    public final void J() {
        q qVar = this.f5496c.f5479c;
        if (qVar != null) {
            qVar.J();
        }
    }

    public final void Ob() {
        this.n = m.BACK_BUTTON;
    }

    public final void Wb() {
        this.n = m.CLOSE_BUTTON;
        this.f5495b.finish();
    }

    public final void Zb() {
        this.n = m.CUSTOM_CLOSE;
        this.f5495b.finish();
    }

    public final void _b() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f5496c;
        if (adOverlayInfoParcel != null && this.f5500g) {
            d(adOverlayInfoParcel.j);
        }
        if (this.f5501h != null) {
            this.f5495b.setContentView(this.l);
            this.r = true;
            this.f5501h.removeAllViews();
            this.f5501h = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.i;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.i = null;
        }
        this.f5500g = false;
    }

    public final void a(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.f5501h = new FrameLayout(this.f5495b);
        this.f5501h.setBackgroundColor(-16777216);
        this.f5501h.addView(view, -1, -1);
        this.f5495b.setContentView(this.f5501h);
        this.r = true;
        this.i = customViewCallback;
        this.f5500g = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r0 = (r0 = r6.f5496c).o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r7, boolean r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.F.Da
            com.google.android.gms.internal.ads.B r1 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.f5496c
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.i r0 = r0.o
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.f5462h
            if (r0 == 0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.F.Ea
            com.google.android.gms.internal.ads.B r4 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r3 = r4.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r6.f5496c
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.i r3 = r3.o
            if (r3 == 0) goto L_0x0043
            boolean r3 = r3.i
            if (r3 == 0) goto L_0x0043
            r3 = 1
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            if (r7 == 0) goto L_0x005a
            if (r8 == 0) goto L_0x005a
            if (r0 == 0) goto L_0x005a
            if (r3 != 0) goto L_0x005a
            com.google.android.gms.internal.ads.gh r7 = new com.google.android.gms.internal.ads.gh
            com.google.android.gms.internal.ads.on r4 = r6.f5497d
            java.lang.String r5 = "useCustomClose"
            r7.<init>(r4, r5)
            java.lang.String r4 = "Custom close has been disabled for interstitial ads in this ad slot."
            r7.a(r4)
        L_0x005a:
            com.google.android.gms.ads.internal.overlay.s r7 = r6.f5499f
            if (r7 == 0) goto L_0x0069
            if (r3 != 0) goto L_0x0066
            if (r8 == 0) goto L_0x0065
            if (r0 != 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            r7.a(r1)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.f.a(boolean, boolean):void");
    }

    public final void ac() {
        this.l.removeView(this.f5499f);
        i(true);
    }

    /* access modifiers changed from: package-private */
    public final void bc() {
        C2313on onVar;
        q qVar;
        if (!this.t) {
            this.t = true;
            C2313on onVar2 = this.f5497d;
            if (onVar2 != null) {
                this.l.removeView(onVar2.getView());
                l lVar = this.f5498e;
                if (lVar != null) {
                    this.f5497d.a(lVar.f5509d);
                    this.f5497d.c(false);
                    ViewGroup viewGroup = this.f5498e.f5508c;
                    View view = this.f5497d.getView();
                    l lVar2 = this.f5498e;
                    viewGroup.addView(view, lVar2.f5506a, lVar2.f5507b);
                    this.f5498e = null;
                } else if (this.f5495b.getApplicationContext() != null) {
                    this.f5497d.a(this.f5495b.getApplicationContext());
                }
                this.f5497d = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f5496c;
            if (!(adOverlayInfoParcel == null || (qVar = adOverlayInfoParcel.f5479c) == null)) {
                qVar.a(this.n);
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f5496c;
            if (adOverlayInfoParcel2 != null && (onVar = adOverlayInfoParcel2.f5480d) != null) {
                a(onVar.d(), this.f5496c.f5480d.getView());
            }
        }
    }

    public final void cc() {
        if (this.m) {
            this.m = false;
            gc();
        }
    }

    public final void d(int i2) {
        if (this.f5495b.getApplicationInfo().targetSdkVersion >= ((Integer) Qqa.e().a(F.ne)).intValue()) {
            if (this.f5495b.getApplicationInfo().targetSdkVersion <= ((Integer) Qqa.e().a(F.oe)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) Qqa.e().a(F.pe)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) Qqa.e().a(F.qe)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f5495b.setRequestedOrientation(i2);
        } catch (Throwable th) {
            p.g().b(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void db() {
        this.r = true;
    }

    public final void dc() {
        this.l.f5504b = true;
    }

    public final void ec() {
        synchronized (this.o) {
            this.q = true;
            if (this.p != null) {
                oa.f5628a.removeCallbacks(this.p);
                oa.f5628a.post(this.p);
            }
        }
    }

    public final void k(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.j);
    }

    public final void m() {
        if (((Boolean) Qqa.e().a(F.fd)).booleanValue()) {
            C2313on onVar = this.f5497d;
            if (onVar == null || onVar.isDestroyed()) {
                C1018Rk.d("The webview does not exist. Ignoring action.");
                return;
            }
            p.e();
            wa.b(this.f5497d);
        }
    }

    public void m(Bundle bundle) {
        this.f5495b.requestWindowFeature(1);
        this.j = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            this.f5496c = AdOverlayInfoParcel.a(this.f5495b.getIntent());
            if (this.f5496c != null) {
                if (this.f5496c.m.f9458c > 7500000) {
                    this.n = m.OTHER;
                }
                if (this.f5495b.getIntent() != null) {
                    this.u = this.f5495b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                if (this.f5496c.o != null) {
                    this.k = this.f5496c.o.f5455a;
                } else {
                    this.k = false;
                }
                if (this.k && this.f5496c.o.f5460f != -1) {
                    new k(this).b();
                }
                if (bundle == null) {
                    if (this.f5496c.f5479c != null && this.u) {
                        this.f5496c.f5479c.Tb();
                    }
                    if (!(this.f5496c.k == 1 || this.f5496c.f5478b == null)) {
                        this.f5496c.f5478b.onAdClicked();
                    }
                }
                this.l = new i(this.f5495b, this.f5496c.n, this.f5496c.m.f9456a);
                this.l.setId(1000);
                p.e().a(this.f5495b);
                int i2 = this.f5496c.k;
                if (i2 == 1) {
                    j(false);
                } else if (i2 == 2) {
                    this.f5498e = new l(this.f5496c.f5480d);
                    j(false);
                } else if (i2 == 3) {
                    j(true);
                } else {
                    throw new j("Could not determine ad overlay type.");
                }
            } else {
                throw new j("Could not get info for ad overlay.");
            }
        } catch (j e2) {
            C1018Rk.d(e2.getMessage());
            this.n = m.OTHER;
            this.f5495b.finish();
        }
    }

    public final void n() {
        if (((Boolean) Qqa.e().a(F.fd)).booleanValue() && this.f5497d != null && (!this.f5495b.isFinishing() || this.f5498e == null)) {
            p.e();
            wa.a(this.f5497d);
        }
        fc();
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
    }

    public final void onDestroy() {
        C2313on onVar = this.f5497d;
        if (onVar != null) {
            try {
                this.l.removeView(onVar.getView());
            } catch (NullPointerException unused) {
            }
        }
        fc();
    }

    public final void onPause() {
        _b();
        q qVar = this.f5496c.f5479c;
        if (qVar != null) {
            qVar.onPause();
        }
        if (!((Boolean) Qqa.e().a(F.fd)).booleanValue() && this.f5497d != null && (!this.f5495b.isFinishing() || this.f5498e == null)) {
            p.e();
            wa.a(this.f5497d);
        }
        fc();
    }

    public final void onResume() {
        q qVar = this.f5496c.f5479c;
        if (qVar != null) {
            qVar.onResume();
        }
        a(this.f5495b.getResources().getConfiguration());
        if (!((Boolean) Qqa.e().a(F.fd)).booleanValue()) {
            C2313on onVar = this.f5497d;
            if (onVar == null || onVar.isDestroyed()) {
                C1018Rk.d("The webview does not exist. Ignoring action.");
                return;
            }
            p.e();
            wa.b(this.f5497d);
        }
    }

    public final boolean xa() {
        this.n = m.BACK_BUTTON;
        C2313on onVar = this.f5497d;
        if (onVar == null) {
            return true;
        }
        boolean r2 = onVar.r();
        if (!r2) {
            this.f5497d.a("onbackblocked", (Map<String, ?>) Collections.emptyMap());
        }
        return r2;
    }
}
