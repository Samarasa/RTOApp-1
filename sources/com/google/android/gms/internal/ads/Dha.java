package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

public final class Dha implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f6596a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private final Context f6597b;

    /* renamed from: c  reason: collision with root package name */
    private Application f6598c;

    /* renamed from: d  reason: collision with root package name */
    private final PowerManager f6599d;

    /* renamed from: e  reason: collision with root package name */
    private final KeyguardManager f6600e;

    /* renamed from: f  reason: collision with root package name */
    private BroadcastReceiver f6601f;

    /* renamed from: g  reason: collision with root package name */
    private final C2656tha f6602g;

    /* renamed from: h  reason: collision with root package name */
    private WeakReference<ViewTreeObserver> f6603h;
    private WeakReference<View> i;
    private C2298ofa j;
    private byte k = -1;
    private int l = -1;
    private long m = -3;

    public Dha(Context context, C2656tha tha) {
        this.f6597b = context.getApplicationContext();
        this.f6602g = tha;
        this.f6599d = (PowerManager) this.f6597b.getSystemService("power");
        this.f6600e = (KeyguardManager) this.f6597b.getSystemService("keyguard");
        Context context2 = this.f6597b;
        if (context2 instanceof Application) {
            this.f6598c = (Application) context2;
            this.j = new C2298ofa((Application) context2, this);
        }
        a((View) null);
    }

    private final void a(Activity activity, int i2) {
        Window window;
        if (this.i != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View b2 = b();
            if (b2 != null && peekDecorView != null && b2.getRootView() == peekDecorView.getRootView()) {
                this.l = i2;
            }
        }
    }

    private final View b() {
        WeakReference<View> weakReference = this.i;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private final void b(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f6603h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f6601f == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f6601f = new Fha(this);
            this.f6597b.registerReceiver(this.f6601f, intentFilter);
        }
        Application application = this.f6598c;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.j);
            } catch (Exception unused) {
            }
        }
    }

    private final void c() {
        f6596a.post(new Gha(this));
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[Catch:{ Exception -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[SYNTHETIC, Splitter:B:17:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003c A[SYNTHETIC, Splitter:B:23:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c(android.view.View r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.f6603h     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001d
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.f6603h     // Catch:{ Exception -> 0x001d }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x001d }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001b
            boolean r2 = r1.isAlive()     // Catch:{ Exception -> 0x001d }
            if (r2 == 0) goto L_0x001b
            r1.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x001d }
            r1.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x001d }
        L_0x001b:
            r3.f6603h = r0     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch:{ Exception -> 0x002d }
            boolean r1 = r4.isAlive()     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x002d
            r4.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x002d }
            r4.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x002d }
        L_0x002d:
            android.content.BroadcastReceiver r4 = r3.f6601f
            if (r4 == 0) goto L_0x0038
            android.content.Context r1 = r3.f6597b     // Catch:{ Exception -> 0x0036 }
            r1.unregisterReceiver(r4)     // Catch:{ Exception -> 0x0036 }
        L_0x0036:
            r3.f6601f = r0
        L_0x0038:
            android.app.Application r4 = r3.f6598c
            if (r4 == 0) goto L_0x0041
            com.google.android.gms.internal.ads.ofa r0 = r3.j     // Catch:{ Exception -> 0x0041 }
            r4.unregisterActivityLifecycleCallbacks(r0)     // Catch:{ Exception -> 0x0041 }
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Dha.c(android.view.View):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0064, code lost:
        if (r7 == false) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r9 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r9.i
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.view.View r0 = r9.b()
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L_0x0013
            r9.m = r2
            r9.k = r1
            return
        L_0x0013:
            int r4 = r0.getVisibility()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x001d
            r4 = 1
            goto L_0x001e
        L_0x001d:
            r4 = 0
        L_0x001e:
            boolean r7 = r0.isShown()
            if (r7 != 0) goto L_0x0027
            r4 = r4 | 2
            byte r4 = (byte) r4
        L_0x0027:
            android.os.PowerManager r7 = r9.f6599d
            if (r7 == 0) goto L_0x0034
            boolean r7 = r7.isScreenOn()
            if (r7 != 0) goto L_0x0034
            r4 = r4 | 4
            byte r4 = (byte) r4
        L_0x0034:
            com.google.android.gms.internal.ads.tha r7 = r9.f6602g
            boolean r7 = r7.a()
            if (r7 != 0) goto L_0x0068
            android.app.KeyguardManager r7 = r9.f6600e
            if (r7 == 0) goto L_0x0067
            boolean r7 = r7.inKeyguardRestrictedInputMode()
            if (r7 == 0) goto L_0x0067
            android.app.Activity r7 = com.google.android.gms.internal.ads.Bha.a((android.view.View) r0)
            if (r7 == 0) goto L_0x0063
            android.view.Window r7 = r7.getWindow()
            if (r7 != 0) goto L_0x0054
            r7 = 0
            goto L_0x0058
        L_0x0054:
            android.view.WindowManager$LayoutParams r7 = r7.getAttributes()
        L_0x0058:
            if (r7 == 0) goto L_0x0063
            int r7 = r7.flags
            r8 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 & r8
            if (r7 == 0) goto L_0x0063
            r7 = 1
            goto L_0x0064
        L_0x0063:
            r7 = 0
        L_0x0064:
            if (r7 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r5 = 0
        L_0x0068:
            if (r5 != 0) goto L_0x006d
            r4 = r4 | 8
            byte r4 = (byte) r4
        L_0x006d:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L_0x007b
            r4 = r4 | 16
            byte r4 = (byte) r4
        L_0x007b:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L_0x0089
            r4 = r4 | 32
            byte r4 = (byte) r4
        L_0x0089:
            int r0 = r0.getWindowVisibility()
            int r5 = r9.l
            if (r5 == r1) goto L_0x0092
            r0 = r5
        L_0x0092:
            if (r0 == 0) goto L_0x0097
            r0 = r4 | 64
            byte r4 = (byte) r0
        L_0x0097:
            byte r0 = r9.k
            if (r0 == r4) goto L_0x00ab
            r9.k = r4
            byte r0 = r9.k
            if (r0 != 0) goto L_0x00a6
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto L_0x00a9
        L_0x00a6:
            long r0 = (long) r0
            long r0 = r2 - r0
        L_0x00a9:
            r9.m = r0
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Dha.d():void");
    }

    public final long a() {
        if (this.m <= -2 && b() == null) {
            this.m = -3;
        }
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public final void a(View view) {
        long j2;
        View b2 = b();
        if (b2 != null) {
            b2.removeOnAttachStateChangeListener(this);
            c(b2);
        }
        this.i = new WeakReference<>(view);
        if (view != null) {
            if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
                b(view);
            }
            view.addOnAttachStateChangeListener(this);
            j2 = -2;
        } else {
            j2 = -3;
        }
        this.m = j2;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, 0);
        d();
    }

    public final void onActivityDestroyed(Activity activity) {
        d();
    }

    public final void onActivityPaused(Activity activity) {
        a(activity, 4);
        d();
    }

    public final void onActivityResumed(Activity activity) {
        a(activity, 0);
        d();
        c();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        d();
    }

    public final void onActivityStarted(Activity activity) {
        a(activity, 0);
        d();
    }

    public final void onActivityStopped(Activity activity) {
        d();
    }

    public final void onGlobalLayout() {
        d();
    }

    public final void onScrollChanged() {
        d();
    }

    public final void onViewAttachedToWindow(View view) {
        this.l = -1;
        b(view);
        d();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.l = -1;
        d();
        c();
        c(view);
    }
}
