package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.fa;

/* renamed from: com.google.android.gms.internal.ads.wo  reason: case insensitive filesystem */
public class C2882wo extends C2457qo implements C2953xo {

    /* renamed from: a  reason: collision with root package name */
    private final C2669to f12690a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f12691b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12692c;

    public C2882wo(Context context, C2669to toVar) {
        super(context);
        p.g().f();
        this.f12690a = toVar;
        super.setWebViewClient(toVar);
    }

    private final synchronized void S() {
        if (!this.f12692c) {
            this.f12692c = true;
            p.g().g();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void R() {
        super.destroy();
    }

    public final synchronized void a(C2598so soVar) {
        fa.f("Blank page loaded, 1...");
        o();
    }

    public /* bridge */ /* synthetic */ void a(String str) {
        super.a(str);
    }

    public /* bridge */ /* synthetic */ void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
    }

    public synchronized void destroy() {
        if (!this.f12691b) {
            this.f12691b = true;
            this.f12690a.a((C2953xo) this);
            g(false);
            fa.f("Initiating WebView self destruct sequence in 3...");
            fa.f("Loading blank page in WebView, 2...");
            try {
                super.loadUrl("about:blank");
            } catch (UnsatisfiedLinkError e2) {
                p.g().a((Throwable) e2, "AdWebViewImpl.loadUrlUnsafe");
                C1018Rk.d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isDestroyed()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.internal.ads.C1018Rk.d(r2)     // Catch:{ all -> 0x0019 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2882wo.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            synchronized (this) {
                if (!isDestroyed()) {
                    g(true);
                }
                S();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public void g(boolean z) {
    }

    public final synchronized boolean isDestroyed() {
        return this.f12691b;
    }

    public synchronized void loadData(String str, String str2, String str3) {
        if (!isDestroyed()) {
            super.loadData(str, str2, str3);
        } else {
            C1018Rk.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!isDestroyed()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            C1018Rk.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadUrl(String str) {
        if (!isDestroyed()) {
            super.loadUrl(str);
        } else {
            C1018Rk.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* access modifiers changed from: protected */
    public synchronized void o() {
        fa.f("Destroying WebView!");
        S();
        C1252_k.f9703e.execute(new C2811vo(this));
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public void onDraw(Canvas canvas) {
        if (!isDestroyed()) {
            super.onDraw(canvas);
        }
    }

    public void onPause() {
        if (!isDestroyed()) {
            super.onPause();
        }
    }

    public void onResume() {
        if (!isDestroyed()) {
            super.onResume();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !isDestroyed() && super.onTouchEvent(motionEvent);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
    }

    public void stopLoading() {
        if (!isDestroyed()) {
            super.stopLoading();
        }
    }
}
