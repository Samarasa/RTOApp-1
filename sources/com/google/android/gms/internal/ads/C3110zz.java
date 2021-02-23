package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import c.b.b.b.c.a;
import com.google.android.gms.ads.internal.p;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.zz  reason: case insensitive filesystem */
public final class C3110zz extends C3103zs {
    private final YK A;

    /* renamed from: h  reason: collision with root package name */
    private final Executor f13142h;
    private final C0877Lz i;
    private final C1085Tz j;
    private final C1765hA k;
    private final C0981Pz l;
    private final C1059Sz m;
    private final Qga<MB> n;
    private final Qga<KB> o;
    private final Qga<UB> p;
    private final Qga<GB> q;
    private final Qga<PB> r;
    private FA s;
    private boolean t;
    private boolean u = false;
    private final C0939Oj v;
    private final Qba w;
    private final C1200Yk x;
    private final Context y;
    private final C0721Fz z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3110zz(C3032ys ysVar, Executor executor, C0877Lz lz, C1085Tz tz, C1765hA hAVar, C0981Pz pz, C1059Sz sz, Qga<MB> qga, Qga<KB> qga2, Qga<UB> qga3, Qga<GB> qga4, Qga<PB> qga5, C0939Oj oj, Qba qba, C1200Yk yk, Context context, C0721Fz fz, YK yk2) {
        super(ysVar);
        this.f13142h = executor;
        this.i = lz;
        this.j = tz;
        this.k = hAVar;
        this.l = pz;
        this.m = sz;
        this.n = qga;
        this.o = qga2;
        this.p = qga3;
        this.q = qga4;
        this.r = qga5;
        this.v = oj;
        this.w = qba;
        this.x = yk;
        this.y = context;
        this.z = fz;
        this.A = yk2;
    }

    public static boolean d(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null);
    }

    public final synchronized JSONObject a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return this.j.b(view, map, map2);
    }

    public final synchronized void a() {
        this.f13142h.execute(new C0695Ez(this));
        super.a();
    }

    public final synchronized void a(Bundle bundle) {
        this.j.b(bundle);
    }

    public final synchronized void a(View view) {
        this.j.a(view);
    }

    public final synchronized void a(View view, MotionEvent motionEvent, View view2) {
        this.j.a(view, motionEvent, view2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.view.View r9, android.view.View r10, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r11, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r12, boolean r13) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.google.android.gms.internal.ads.hA r0 = r8.k     // Catch:{ all -> 0x0045 }
            com.google.android.gms.internal.ads.FA r1 = r8.s     // Catch:{ all -> 0x0045 }
            r0.b((com.google.android.gms.internal.ads.FA) r1)     // Catch:{ all -> 0x0045 }
            com.google.android.gms.internal.ads.Tz r2 = r8.j     // Catch:{ all -> 0x0045 }
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r2.a((android.view.View) r3, (android.view.View) r4, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r5, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r6, (boolean) r7)     // Catch:{ all -> 0x0045 }
            boolean r9 = r8.u     // Catch:{ all -> 0x0045 }
            if (r9 == 0) goto L_0x0043
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r9 = com.google.android.gms.internal.ads.F.ic     // Catch:{ all -> 0x0045 }
            com.google.android.gms.internal.ads.B r10 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x0045 }
            java.lang.Object r9 = r10.a(r9)     // Catch:{ all -> 0x0045 }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0045 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0045 }
            if (r9 == 0) goto L_0x0043
            com.google.android.gms.internal.ads.Lz r9 = r8.i     // Catch:{ all -> 0x0045 }
            com.google.android.gms.internal.ads.on r9 = r9.t()     // Catch:{ all -> 0x0045 }
            if (r9 != 0) goto L_0x0031
            goto L_0x0043
        L_0x0031:
            com.google.android.gms.internal.ads.Lz r9 = r8.i     // Catch:{ all -> 0x0045 }
            com.google.android.gms.internal.ads.on r9 = r9.t()     // Catch:{ all -> 0x0045 }
            java.lang.String r10 = "onSdkAdUserInteractionClick"
            b.e.b r11 = new b.e.b     // Catch:{ all -> 0x0045 }
            r11.<init>()     // Catch:{ all -> 0x0045 }
            r9.a((java.lang.String) r10, (java.util.Map<java.lang.String, ?>) r11)     // Catch:{ all -> 0x0045 }
            monitor-exit(r8)
            return
        L_0x0043:
            monitor-exit(r8)
            return
        L_0x0045:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3110zz.a(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.view.View r3, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5, boolean r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.t     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            r0 = 1
            if (r6 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.hA r6 = r2.k     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.FA r1 = r2.s     // Catch:{ all -> 0x006a }
            r6.c(r1)     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.Tz r6 = r2.j     // Catch:{ all -> 0x006a }
            r6.a((android.view.View) r3, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r4, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r5)     // Catch:{ all -> 0x006a }
            r2.t = r0     // Catch:{ all -> 0x006a }
            monitor-exit(r2)
            return
        L_0x001a:
            if (r6 != 0) goto L_0x0068
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.F.pc     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.B r1 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x006a }
            java.lang.Object r6 = r1.a(r6)     // Catch:{ all -> 0x006a }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x006a }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x006a }
            if (r6 == 0) goto L_0x0068
            if (r4 == 0) goto L_0x0068
            java.util.Set r6 = r4.entrySet()     // Catch:{ all -> 0x006a }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x006a }
        L_0x0038:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x006a }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x006a }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x006a }
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch:{ all -> 0x006a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x006a }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0038
            boolean r1 = d(r1)     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0038
            com.google.android.gms.internal.ads.hA r6 = r2.k     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.FA r1 = r2.s     // Catch:{ all -> 0x006a }
            r6.c(r1)     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.Tz r6 = r2.j     // Catch:{ all -> 0x006a }
            r6.a((android.view.View) r3, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r4, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r5)     // Catch:{ all -> 0x006a }
            r2.t = r0     // Catch:{ all -> 0x006a }
            monitor-exit(r2)
            return
        L_0x0068:
            monitor-exit(r2)
            return
        L_0x006a:
            r3 = move-exception
            monitor-exit(r2)
            goto L_0x006e
        L_0x006d:
            throw r3
        L_0x006e:
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3110zz.a(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized void a(Era era) {
        this.j.a(era);
    }

    public final synchronized void a(FA fa) {
        HW a2;
        this.s = fa;
        this.k.a(fa);
        this.j.a(fa.e(), fa.i(), fa.j(), (View.OnTouchListener) fa, (View.OnClickListener) fa);
        if (((Boolean) Qqa.e().a(F.Ib)).booleanValue() && (a2 = this.w.a()) != null) {
            a2.a(fa.e());
        }
        if (fa.g() != null) {
            fa.g().a((C2739una) this.v);
        }
    }

    public final synchronized void a(Mra mra) {
        this.A.a(mra);
    }

    public final synchronized void a(C1724gc gcVar) {
        this.j.a(gcVar);
    }

    public final synchronized void a(C3102zra zra) {
        this.j.a(zra);
    }

    public final synchronized void a(String str) {
        this.j.a(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r16, boolean r17) {
        /*
            r15 = this;
            r0 = r15
            com.google.android.gms.internal.ads.Pz r1 = r0.l
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            com.google.android.gms.internal.ads.Lz r1 = r0.i
            com.google.android.gms.internal.ads.on r1 = r1.u()
            com.google.android.gms.internal.ads.Lz r2 = r0.i
            com.google.android.gms.internal.ads.on r2 = r2.t()
            if (r1 != 0) goto L_0x001b
            if (r2 != 0) goto L_0x001b
            return
        L_0x001b:
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0021
            r5 = 1
            goto L_0x0022
        L_0x0021:
            r5 = 0
        L_0x0022:
            if (r2 == 0) goto L_0x0025
            r3 = 1
        L_0x0025:
            r6 = 0
            if (r5 == 0) goto L_0x002a
        L_0x0028:
            r10 = r6
            goto L_0x0032
        L_0x002a:
            if (r3 == 0) goto L_0x0030
            java.lang.String r6 = "javascript"
            r1 = r2
            goto L_0x0028
        L_0x0030:
            r1 = r6
            r10 = r1
        L_0x0032:
            android.webkit.WebView r5 = r1.getWebView()
            if (r5 != 0) goto L_0x003e
            java.lang.String r1 = "Webview is null in InternalNativeAd"
        L_0x003a:
            com.google.android.gms.internal.ads.C1018Rk.d(r1)
            return
        L_0x003e:
            com.google.android.gms.internal.ads.qh r5 = com.google.android.gms.ads.internal.p.r()
            android.content.Context r6 = r0.y
            boolean r5 = r5.b((android.content.Context) r6)
            if (r5 != 0) goto L_0x004d
            java.lang.String r1 = "Failed to initialize omid in InternalNativeAd"
            goto L_0x003a
        L_0x004d:
            com.google.android.gms.internal.ads.Yk r5 = r0.x
            int r6 = r5.f9457b
            int r5 = r5.f9458c
            r7 = 23
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
            r8.append(r6)
            java.lang.String r6 = "."
            r8.append(r6)
            r8.append(r5)
            java.lang.String r6 = r8.toString()
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.F.sd
            com.google.android.gms.internal.ads.B r7 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r5 = r7.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x00ac
            if (r3 == 0) goto L_0x0084
            com.google.android.gms.internal.ads.rh r5 = com.google.android.gms.internal.ads.C2513rh.VIDEO
            com.google.android.gms.internal.ads.th r7 = com.google.android.gms.internal.ads.C2655th.DEFINED_BY_JAVASCRIPT
        L_0x0081:
            r13 = r5
            r12 = r7
            goto L_0x0095
        L_0x0084:
            com.google.android.gms.internal.ads.rh r5 = com.google.android.gms.internal.ads.C2513rh.NATIVE_DISPLAY
            com.google.android.gms.internal.ads.Lz r7 = r0.i
            int r7 = r7.o()
            r8 = 3
            if (r7 != r8) goto L_0x0092
            com.google.android.gms.internal.ads.th r7 = com.google.android.gms.internal.ads.C2655th.UNSPECIFIED
            goto L_0x0081
        L_0x0092:
            com.google.android.gms.internal.ads.th r7 = com.google.android.gms.internal.ads.C2655th.ONE_PIXEL
            goto L_0x0081
        L_0x0095:
            com.google.android.gms.internal.ads.qh r5 = com.google.android.gms.ads.internal.p.r()
            android.webkit.WebView r7 = r1.getWebView()
            com.google.android.gms.internal.ads.yS r8 = r0.f13129b
            java.lang.String r14 = r8.ga
            java.lang.String r8 = ""
            java.lang.String r9 = "javascript"
            r11 = r16
            c.b.b.b.c.a r5 = r5.a(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00be
        L_0x00ac:
            com.google.android.gms.internal.ads.qh r5 = com.google.android.gms.ads.internal.p.r()
            android.webkit.WebView r7 = r1.getWebView()
            java.lang.String r8 = ""
            java.lang.String r9 = "javascript"
            r11 = r16
            c.b.b.b.c.a r5 = r5.a(r6, r7, r8, r9, r10, r11)
        L_0x00be:
            if (r5 != 0) goto L_0x00c4
            java.lang.String r1 = "Failed to create omid session in InternalNativeAd"
            goto L_0x003a
        L_0x00c4:
            com.google.android.gms.internal.ads.Lz r6 = r0.i
            r6.a((c.b.b.b.c.a) r5)
            r1.a((c.b.b.b.c.a) r5)
            if (r3 == 0) goto L_0x00dd
            android.view.View r2 = r2.getView()
            if (r2 == 0) goto L_0x00db
            com.google.android.gms.internal.ads.qh r3 = com.google.android.gms.ads.internal.p.r()
            r3.a(r5, r2)
        L_0x00db:
            r0.u = r4
        L_0x00dd:
            if (r17 == 0) goto L_0x0102
            com.google.android.gms.internal.ads.qh r2 = com.google.android.gms.ads.internal.p.r()
            r2.a((c.b.b.b.c.a) r5)
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.F.ud
            com.google.android.gms.internal.ads.B r3 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r2 = r3.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0102
            b.e.b r2 = new b.e.b
            r2.<init>()
            java.lang.String r3 = "onSdkLoaded"
            r1.a((java.lang.String) r3, (java.util.Map<java.lang.String, ?>) r2)
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3110zz.a(java.lang.String, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(boolean z2) {
        this.j.a(this.s.e(), this.s.h(), this.s.i(), z2);
    }

    public final void b() {
        this.f13142h.execute(new C0643Cz(this));
        if (this.i.o() != 7) {
            Executor executor = this.f13142h;
            C1085Tz tz = this.j;
            tz.getClass();
            executor.execute(C0617Bz.a(tz));
        }
        super.b();
    }

    public final synchronized void b(Bundle bundle) {
        this.j.a(bundle);
    }

    public final void b(View view) {
        a v2 = this.i.v();
        boolean z2 = this.i.u() != null;
        if (this.l.a() && v2 != null && z2 && view != null) {
            p.r().a(v2, view);
        }
    }

    public final synchronized void b(FA fa) {
        this.j.a(fa.e(), fa.h());
        if (fa.f() != null) {
            fa.f().setClickable(false);
            fa.f().removeAllViews();
        }
        if (fa.g() != null) {
            fa.g().b((C2739una) this.v);
        }
        this.s = null;
    }

    public final void c(View view) {
        a v2 = this.i.v();
        if (this.l.a() && v2 != null && view != null) {
            p.r().b(v2, view);
        }
    }

    public final synchronized boolean c(Bundle bundle) {
        if (this.t) {
            return true;
        }
        boolean c2 = this.j.c(bundle);
        this.t = c2;
        return c2;
    }

    public final synchronized void g() {
        this.j.C();
    }

    public final synchronized boolean h() {
        return this.j.T();
    }

    public final synchronized void i() {
        if (this.s == null) {
            C1018Rk.a("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            this.f13142h.execute(new C0669Dz(this, this.s instanceof C1340bA));
        }
    }

    public final synchronized void j() {
        if (!this.t) {
            this.j.b();
        }
    }

    public final boolean k() {
        return this.l.d();
    }

    public final boolean l() {
        return this.l.a();
    }

    public final C0721Fz m() {
        return this.z;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void n() {
        this.j.destroy();
        this.i.a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void o() {
        try {
            int o2 = this.i.o();
            if (o2 != 1) {
                if (o2 != 2) {
                    if (o2 != 3) {
                        if (o2 != 6) {
                            if (o2 != 7) {
                                C1018Rk.b("Wrong native template id!");
                            } else if (this.m.e() != null) {
                                this.m.e().a(this.q.get());
                            }
                        } else if (this.m.c() != null) {
                            a("Google", true);
                            this.m.c().a(this.p.get());
                        }
                    } else if (this.m.a(this.i.e()) != null) {
                        if (this.i.t() != null) {
                            a("Google", true);
                        }
                        this.m.a(this.i.e()).a(this.r.get());
                    }
                } else if (this.m.b() != null) {
                    a("Google", true);
                    this.m.b().a(this.o.get());
                }
            } else if (this.m.a() != null) {
                a("Google", true);
                this.m.a().a(this.n.get());
            }
        } catch (RemoteException e2) {
            C1018Rk.b("RemoteException when notifyAdLoad is called", e2);
        }
    }

    public final synchronized void p() {
        this.j.D();
    }
}
