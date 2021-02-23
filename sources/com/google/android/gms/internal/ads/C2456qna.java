package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.V;
import com.google.android.gms.ads.internal.util.oa;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

@TargetApi(14)
/* renamed from: com.google.android.gms.internal.ads.qna  reason: case insensitive filesystem */
public final class C2456qna implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a  reason: collision with root package name */
    private static final long f11893a = ((Long) Qqa.e().a(F.cb)).longValue();

    /* renamed from: b  reason: collision with root package name */
    private final Context f11894b;

    /* renamed from: c  reason: collision with root package name */
    private Application f11895c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager f11896d;

    /* renamed from: e  reason: collision with root package name */
    private final PowerManager f11897e;

    /* renamed from: f  reason: collision with root package name */
    private final KeyguardManager f11898f;

    /* renamed from: g  reason: collision with root package name */
    private BroadcastReceiver f11899g;

    /* renamed from: h  reason: collision with root package name */
    private WeakReference<ViewTreeObserver> f11900h;
    private WeakReference<View> i;
    private C2952xna j;
    private V k = new V(f11893a);
    private boolean l = false;
    private int m = -1;
    private final HashSet<C2739una> n = new HashSet<>();
    private final DisplayMetrics o;
    private final Rect p;

    public C2456qna(Context context, View view) {
        this.f11894b = context.getApplicationContext();
        this.f11896d = (WindowManager) context.getSystemService("window");
        this.f11897e = (PowerManager) this.f11894b.getSystemService("power");
        this.f11898f = (KeyguardManager) context.getSystemService("keyguard");
        Context context2 = this.f11894b;
        if (context2 instanceof Application) {
            this.f11895c = (Application) context2;
            this.j = new C2952xna((Application) context2, this);
        }
        this.o = context.getResources().getDisplayMetrics();
        this.p = new Rect();
        this.p.right = this.f11896d.getDefaultDisplay().getWidth();
        this.p.bottom = this.f11896d.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.i;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            b(view2);
        }
        this.i = new WeakReference<>(view);
        if (view != null) {
            if (p.e().a(view)) {
                a(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final Rect a(Rect rect) {
        return new Rect(b(rect.left), b(rect.top), b(rect.right), b(rect.bottom));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r32) {
        /*
            r31 = this;
            r1 = r31
            r2 = r32
            java.util.HashSet<com.google.android.gms.internal.ads.una> r0 = r1.n
            int r0 = r0.size()
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.ref.WeakReference<android.view.View> r0 = r1.i
            if (r0 != 0) goto L_0x0012
            return
        L_0x0012:
            java.lang.Object r0 = r0.get()
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            r4 = 0
            r5 = 1
            if (r2 != r5) goto L_0x001f
            r6 = 1
            goto L_0x0020
        L_0x001f:
            r6 = 0
        L_0x0020:
            if (r3 != 0) goto L_0x0024
            r7 = 1
            goto L_0x0025
        L_0x0024:
            r7 = 0
        L_0x0025:
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r0 = 2
            int[] r12 = new int[r0]
            int[] r0 = new int[r0]
            if (r3 == 0) goto L_0x0077
            boolean r13 = r3.getGlobalVisibleRect(r9)
            boolean r14 = r3.getLocalVisibleRect(r10)
            r3.getHitRect(r11)
            r3.getLocationOnScreen(r12)     // Catch:{ Exception -> 0x0052 }
            r3.getLocationInWindow(r0)     // Catch:{ Exception -> 0x0052 }
            goto L_0x0058
        L_0x0052:
            r0 = move-exception
            java.lang.String r15 = "Failure getting view location."
            com.google.android.gms.internal.ads.C1018Rk.b(r15, r0)
        L_0x0058:
            r0 = r12[r4]
            r8.left = r0
            r0 = r12[r5]
            r8.top = r0
            int r0 = r8.left
            int r12 = r3.getWidth()
            int r0 = r0 + r12
            r8.right = r0
            int r0 = r8.top
            int r12 = r3.getHeight()
            int r0 = r0 + r12
            r8.bottom = r0
            r24 = r13
            r26 = r14
            goto L_0x007b
        L_0x0077:
            r24 = 0
            r26 = 0
        L_0x007b:
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.F.fb
            com.google.android.gms.internal.ads.B r12 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r0 = r12.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0094
            if (r3 == 0) goto L_0x0094
            java.util.List r0 = r1.c(r3)
            goto L_0x0098
        L_0x0094:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x0098:
            r30 = r0
            r0 = 8
            if (r3 == 0) goto L_0x00a3
            int r12 = r3.getWindowVisibility()
            goto L_0x00a5
        L_0x00a3:
            r12 = 8
        L_0x00a5:
            int r13 = r1.m
            r14 = -1
            if (r13 == r14) goto L_0x00ab
            r12 = r13
        L_0x00ab:
            if (r7 != 0) goto L_0x00c2
            com.google.android.gms.ads.internal.p.c()
            android.os.PowerManager r7 = r1.f11897e
            android.app.KeyguardManager r13 = r1.f11898f
            boolean r7 = com.google.android.gms.ads.internal.util.oa.a((android.view.View) r3, (android.os.PowerManager) r7, (android.app.KeyguardManager) r13)
            if (r7 == 0) goto L_0x00c2
            if (r24 == 0) goto L_0x00c2
            if (r26 == 0) goto L_0x00c2
            if (r12 != 0) goto L_0x00c2
            r7 = 1
            goto L_0x00c3
        L_0x00c2:
            r7 = 0
        L_0x00c3:
            if (r6 == 0) goto L_0x00d2
            com.google.android.gms.ads.internal.util.V r6 = r1.k
            boolean r6 = r6.a()
            if (r6 != 0) goto L_0x00d2
            boolean r6 = r1.l
            if (r7 != r6) goto L_0x00d2
            return
        L_0x00d2:
            if (r7 != 0) goto L_0x00db
            boolean r6 = r1.l
            if (r6 != 0) goto L_0x00db
            if (r2 != r5) goto L_0x00db
            return
        L_0x00db:
            com.google.android.gms.internal.ads.vna r2 = new com.google.android.gms.internal.ads.vna
            com.google.android.gms.common.util.e r6 = com.google.android.gms.ads.internal.p.j()
            long r16 = r6.b()
            android.os.PowerManager r6 = r1.f11897e
            boolean r18 = r6.isScreenOn()
            if (r3 == 0) goto L_0x00fa
            com.google.android.gms.ads.internal.util.wa r6 = com.google.android.gms.ads.internal.p.e()
            boolean r6 = r6.a((android.view.View) r3)
            if (r6 == 0) goto L_0x00fa
            r19 = 1
            goto L_0x00fc
        L_0x00fa:
            r19 = 0
        L_0x00fc:
            if (r3 == 0) goto L_0x0105
            int r0 = r3.getWindowVisibility()
            r20 = r0
            goto L_0x0107
        L_0x0105:
            r20 = 8
        L_0x0107:
            android.graphics.Rect r0 = r1.p
            android.graphics.Rect r21 = r1.a((android.graphics.Rect) r0)
            android.graphics.Rect r22 = r1.a((android.graphics.Rect) r8)
            android.graphics.Rect r23 = r1.a((android.graphics.Rect) r9)
            android.graphics.Rect r25 = r1.a((android.graphics.Rect) r10)
            android.graphics.Rect r27 = r1.a((android.graphics.Rect) r11)
            android.util.DisplayMetrics r0 = r1.o
            float r0 = r0.density
            r15 = r2
            r28 = r0
            r29 = r7
            r15.<init>(r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.util.HashSet<com.google.android.gms.internal.ads.una> r0 = r1.n
            java.util.Iterator r0 = r0.iterator()
        L_0x012f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x013f
            java.lang.Object r3 = r0.next()
            com.google.android.gms.internal.ads.una r3 = (com.google.android.gms.internal.ads.C2739una) r3
            r3.a(r2)
            goto L_0x012f
        L_0x013f:
            r1.l = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2456qna.a(int):void");
    }

    private final void a(Activity activity, int i2) {
        Window window;
        if (this.i != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) this.i.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.m = i2;
            }
        }
    }

    private final void a(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f11900h = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f11899g == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f11899g = new C2597sna(this);
            p.x().a(this.f11894b, this.f11899g, intentFilter);
        }
        Application application = this.f11895c;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.j);
            } catch (Exception e2) {
                C1018Rk.b("Error registering activity lifecycle callbacks.", e2);
            }
        }
    }

    private final int b(int i2) {
        return (int) (((float) i2) / this.o.density);
    }

    private final void b(View view) {
        try {
            if (this.f11900h != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f11900h.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f11900h = null;
            }
        } catch (Exception e2) {
            C1018Rk.b("Error while unregistering listeners from the last ViewTreeObserver.", e2);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e3) {
            C1018Rk.b("Error while unregistering listeners from the ViewTreeObserver.", e3);
        }
        if (this.f11899g != null) {
            try {
                p.x().a(this.f11894b, this.f11899g);
            } catch (IllegalStateException e4) {
                C1018Rk.b("Failed trying to unregister the receiver", e4);
            } catch (Exception e5) {
                p.g().a((Throwable) e5, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f11899g = null;
        }
        Application application = this.f11895c;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.j);
            } catch (Exception e6) {
                C1018Rk.b("Error registering activity lifecycle callbacks.", e6);
            }
        }
    }

    private final List<Rect> c(View view) {
        try {
            ArrayList arrayList = new ArrayList();
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                View view2 = (View) parent;
                Rect rect = new Rect();
                if (view2.isScrollContainer() && view2.getGlobalVisibleRect(rect)) {
                    arrayList.add(a(rect));
                }
            }
            return arrayList;
        } catch (Exception e2) {
            p.g().a((Throwable) e2, "PositionWatcher.getParentScrollViewRects");
            return Collections.emptyList();
        }
    }

    private final void c() {
        oa.f5628a.post(new C2668tna(this));
    }

    public final void a() {
        this.k.a(f11893a);
    }

    public final void a(long j2) {
        this.k.a(j2);
    }

    public final void a(C2739una una) {
        this.n.add(una);
        a(3);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        a(3);
    }

    public final void b(C2739una una) {
        this.n.remove(una);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, 0);
        a(3);
        c();
    }

    public final void onActivityDestroyed(Activity activity) {
        a(3);
        c();
    }

    public final void onActivityPaused(Activity activity) {
        a(activity, 4);
        a(3);
        c();
    }

    public final void onActivityResumed(Activity activity) {
        a(activity, 0);
        a(3);
        c();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(3);
        c();
    }

    public final void onActivityStarted(Activity activity) {
        a(activity, 0);
        a(3);
        c();
    }

    public final void onActivityStopped(Activity activity) {
        a(3);
        c();
    }

    public final void onGlobalLayout() {
        a(2);
        c();
    }

    public final void onScrollChanged() {
        a(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.m = -1;
        a(view);
        a(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.m = -1;
        a(3);
        c();
        b(view);
    }
}
