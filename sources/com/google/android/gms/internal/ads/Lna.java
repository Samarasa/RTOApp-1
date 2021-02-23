package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.common.util.m;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(14)
public final class Lna extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private boolean f7742a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f7743b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7744c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f7745d;

    /* renamed from: e  reason: collision with root package name */
    private final Ina f7746e;

    /* renamed from: f  reason: collision with root package name */
    private final int f7747f;

    /* renamed from: g  reason: collision with root package name */
    private final int f7748g;

    /* renamed from: h  reason: collision with root package name */
    private final int f7749h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final String n;
    private final boolean o;
    private final boolean p;
    private final boolean q;

    public Lna() {
        this(new Ina());
    }

    private Lna(Ina ina) {
        this.f7742a = false;
        this.f7743b = false;
        this.f7744c = false;
        this.f7746e = ina;
        this.f7745d = new Object();
        this.f7748g = C2925xa.f12774d.a().intValue();
        this.f7749h = C2925xa.f12771a.a().intValue();
        this.i = C2925xa.f12775e.a().intValue();
        this.j = C2925xa.f12773c.a().intValue();
        this.k = ((Integer) Qqa.e().a(F.M)).intValue();
        this.l = ((Integer) Qqa.e().a(F.N)).intValue();
        this.m = ((Integer) Qqa.e().a(F.O)).intValue();
        this.f7747f = C2925xa.f12776f.a().intValue();
        this.n = (String) Qqa.e().a(F.Q);
        this.o = ((Boolean) Qqa.e().a(F.R)).booleanValue();
        this.p = ((Boolean) Qqa.e().a(F.S)).booleanValue();
        this.q = ((Boolean) Qqa.e().a(F.T)).booleanValue();
        setName("ContentFetchTask");
    }

    private final Pna a(View view, Fna fna) {
        boolean z;
        if (view == null) {
            return new Pna(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new Pna(this, 0, 0);
            }
            fna.b(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new Pna(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof C2313on)) {
            WebView webView = (WebView) view;
            if (!m.f()) {
                z = false;
            } else {
                fna.h();
                webView.post(new Nna(this, fna, webView, globalVisibleRect));
                z = true;
            }
            return z ? new Pna(this, 0, 1) : new Pna(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new Pna(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                Pna a2 = a(viewGroup.getChildAt(i4), fna);
                i2 += a2.f8263a;
                i3 += a2.f8264b;
            }
            return new Pna(this, i2, i3);
        }
    }

    private static boolean e() {
        try {
            Context b2 = p.f().b();
            if (b2 == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b2.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b2.getSystemService("keyguard");
            if (activityManager == null) {
                return false;
            }
            if (keyguardManager == null) {
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (Process.myPid() == next.pid) {
                    if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return false;
                    }
                    PowerManager powerManager = (PowerManager) b2.getSystemService("power");
                    return powerManager == null ? false : powerManager.isScreenOn();
                }
            }
            return false;
        } catch (Throwable th) {
            p.g().a(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    private final void f() {
        synchronized (this.f7745d) {
            this.f7743b = true;
            boolean z = this.f7743b;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(z);
            C1018Rk.a(sb.toString());
        }
    }

    public final void a() {
        synchronized (this.f7745d) {
            this.f7743b = false;
            this.f7745d.notifyAll();
            C1018Rk.a("ContentFetchThread: wakeup");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(View view) {
        try {
            Fna fna = new Fna(this.f7748g, this.f7749h, this.i, this.j, this.k, this.l, this.m, this.p);
            Context b2 = p.f().b();
            if (b2 != null && !TextUtils.isEmpty(this.n)) {
                String str = (String) view.getTag(b2.getResources().getIdentifier((String) Qqa.e().a(F.P), "id", b2.getPackageName()));
                if (str != null && str.equals(this.n)) {
                    return;
                }
            }
            Pna a2 = a(view, fna);
            fna.j();
            if (a2.f8263a != 0 || a2.f8264b != 0) {
                if (a2.f8264b != 0 || fna.k() != 0) {
                    if (a2.f8264b != 0 || !this.f7746e.a(fna)) {
                        this.f7746e.c(fna);
                    }
                }
            }
        } catch (Exception e2) {
            C1018Rk.b("Exception in fetchContentOnUIThread", e2);
            p.g().a((Throwable) e2, "ContentFetchTask.fetchContent");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Fna fna, WebView webView, String str, boolean z) {
        fna.g();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.o || TextUtils.isEmpty(webView.getTitle())) {
                    fna.a(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    fna.a(sb.toString(), z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (fna.b()) {
                this.f7746e.b(fna);
            }
        } catch (JSONException unused) {
            C1018Rk.a("Json string may be malformed.");
        } catch (Throwable th) {
            C1018Rk.a("Failed to get webview content.", th);
            p.g().a(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void b() {
        synchronized (this.f7745d) {
            if (this.f7742a) {
                C1018Rk.a("Content hash thread already started, quiting...");
                return;
            }
            this.f7742a = true;
            start();
        }
    }

    public final Fna c() {
        return this.f7746e.a(this.q);
    }

    public final boolean d() {
        return this.f7743b;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r4 = this;
        L_0x0000:
            boolean r0 = e()     // Catch:{ InterruptedException -> 0x0079, Exception -> 0x0069 }
            if (r0 == 0) goto L_0x005a
            com.google.android.gms.internal.ads.Hna r0 = com.google.android.gms.ads.internal.p.f()     // Catch:{ InterruptedException -> 0x0079, Exception -> 0x0069 }
            android.app.Activity r0 = r0.a()     // Catch:{ InterruptedException -> 0x0079, Exception -> 0x0069 }
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.internal.ads.C1018Rk.a((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0079, Exception -> 0x0069 }
        L_0x0015:
            r4.f()     // Catch:{ InterruptedException -> 0x0079, Exception -> 0x0069 }
            goto L_0x0060
        L_0x0019:
            if (r0 == 0) goto L_0x0060
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003d }
            if (r2 == 0) goto L_0x004c
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003d }
            android.view.View r2 = r2.getDecorView()     // Catch:{ Exception -> 0x003d }
            if (r2 == 0) goto L_0x004c
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x003d }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x003d }
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x003d }
            r1 = r0
            goto L_0x004c
        L_0x003d:
            r0 = move-exception
            com.google.android.gms.internal.ads.wk r2 = com.google.android.gms.ads.internal.p.g()     // Catch:{ InterruptedException -> 0x0079, Exception -> 0x0069 }
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.a((java.lang.Throwable) r0, (java.lang.String) r3)     // Catch:{ InterruptedException -> 0x0079, Exception -> 0x0069 }
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.internal.ads.C1018Rk.a((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0079, Exception -> 0x0069 }
        L_0x004c:
            if (r1 == 0) goto L_0x0060
            if (r1 != 0) goto L_0x0051
            goto L_0x0060
        L_0x0051:
            com.google.android.gms.internal.ads.Ona r0 = new com.google.android.gms.internal.ads.Ona     // Catch:{ InterruptedException -> 0x0079, Exception -> 0x0069 }
            r0.<init>(r4, r1)     // Catch:{ InterruptedException -> 0x0079, Exception -> 0x0069 }
            r1.post(r0)     // Catch:{ InterruptedException -> 0x0079, Exception -> 0x0069 }
            goto L_0x0060
        L_0x005a:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.internal.ads.C1018Rk.a((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0079, Exception -> 0x0069 }
            goto L_0x0015
        L_0x0060:
            int r0 = r4.f7747f     // Catch:{ InterruptedException -> 0x0079, Exception -> 0x0069 }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x0079, Exception -> 0x0069 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0079, Exception -> 0x0069 }
            goto L_0x007f
        L_0x0069:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.C1018Rk.b(r1, r0)
            com.google.android.gms.internal.ads.wk r1 = com.google.android.gms.ads.internal.p.g()
            java.lang.String r2 = "ContentFetchTask.run"
            r1.a((java.lang.Throwable) r0, (java.lang.String) r2)
            goto L_0x007f
        L_0x0079:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.C1018Rk.b(r1, r0)
        L_0x007f:
            java.lang.Object r0 = r4.f7745d
            monitor-enter(r0)
        L_0x0082:
            boolean r1 = r4.f7743b     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x0091
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.internal.ads.C1018Rk.a((java.lang.String) r1)     // Catch:{ InterruptedException -> 0x0082 }
            java.lang.Object r1 = r4.f7745d     // Catch:{ InterruptedException -> 0x0082 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0082 }
            goto L_0x0082
        L_0x0091:
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            goto L_0x0000
        L_0x0094:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            goto L_0x0098
        L_0x0097:
            throw r1
        L_0x0098:
            goto L_0x0097
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Lna.run():void");
    }
}
