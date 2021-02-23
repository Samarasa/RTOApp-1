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

/* renamed from: com.google.android.gms.internal.ads.bA  reason: case insensitive filesystem */
public final class C1340bA extends C2714ub implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, FA {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<View> f9872a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, WeakReference<View>> f9873b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, WeakReference<View>> f9874c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, WeakReference<View>> f9875d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private C3110zz f9876e;

    /* renamed from: f  reason: collision with root package name */
    private C2456qna f9877f;

    public C1340bA(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        p.z();
        C2309ol.a(view, (ViewTreeObserver.OnGlobalLayoutListener) this);
        p.z();
        C2309ol.a(view, (ViewTreeObserver.OnScrollChangedListener) this);
        this.f9872a = new WeakReference<>(view);
        for (Map.Entry next : hashMap.entrySet()) {
            String str = (String) next.getKey();
            View view2 = (View) next.getValue();
            if (view2 != null) {
                this.f9873b.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f9875d.putAll(this.f9873b);
        for (Map.Entry next2 : hashMap2.entrySet()) {
            View view3 = (View) next2.getValue();
            if (view3 != null) {
                this.f9874c.put((String) next2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.f9875d.putAll(this.f9874c);
        this.f9877f = new C2456qna(view.getContext(), view);
    }

    public final synchronized void Kb() {
        if (this.f9876e != null) {
            this.f9876e.b((FA) this);
            this.f9876e = null;
        }
    }

    public final synchronized View a(String str) {
        WeakReference weakReference = this.f9875d.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r3 != 0) goto L_0x0014
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.f9875d     // Catch:{ all -> 0x0047 }
            r3.remove(r2)     // Catch:{ all -> 0x0047 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.f9873b     // Catch:{ all -> 0x0047 }
            r3.remove(r2)     // Catch:{ all -> 0x0047 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.f9874c     // Catch:{ all -> 0x0047 }
            r3.remove(r2)     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            return
        L_0x0014:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.f9875d     // Catch:{ all -> 0x0047 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0047 }
            r0.<init>(r3)     // Catch:{ all -> 0x0047 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0047 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0047 }
            if (r4 != 0) goto L_0x0045
            java.lang.String r4 = "3011"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x002f
            goto L_0x0045
        L_0x002f:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.f9873b     // Catch:{ all -> 0x0047 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0047 }
            r0.<init>(r3)     // Catch:{ all -> 0x0047 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0047 }
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0047 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0047 }
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            return
        L_0x0045:
            monitor-exit(r1)
            return
        L_0x0047:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1340bA.a(java.lang.String, android.view.View, boolean):void");
    }

    public final synchronized JSONObject c() {
        return null;
    }

    public final synchronized void c(a aVar) {
        if (this.f9876e != null) {
            Object Q = b.Q(aVar);
            if (!(Q instanceof View)) {
                C1018Rk.d("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.f9876e.a((View) Q);
        }
    }

    public final synchronized a d() {
        return null;
    }

    public final View e() {
        return (View) this.f9872a.get();
    }

    public final synchronized void e(a aVar) {
        Object Q = b.Q(aVar);
        if (!(Q instanceof C3110zz)) {
            C1018Rk.d("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        if (this.f9876e != null) {
            this.f9876e.b((FA) this);
        }
        if (((C3110zz) Q).k()) {
            this.f9876e = (C3110zz) Q;
            this.f9876e.a((FA) this);
            this.f9876e.b(e());
            return;
        }
        C1018Rk.b("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    public final FrameLayout f() {
        return null;
    }

    public final C2456qna g() {
        return this.f9877f;
    }

    public final synchronized Map<String, WeakReference<View>> h() {
        return this.f9875d;
    }

    public final synchronized Map<String, WeakReference<View>> i() {
        return this.f9873b;
    }

    public final synchronized Map<String, WeakReference<View>> j() {
        return this.f9874c;
    }

    public final synchronized String k() {
        return "1007";
    }

    public final synchronized void onClick(View view) {
        if (this.f9876e != null) {
            this.f9876e.a(view, e(), h(), i(), true);
        }
    }

    public final synchronized void onGlobalLayout() {
        if (this.f9876e != null) {
            this.f9876e.a(e(), h(), i(), C3110zz.d(e()));
        }
    }

    public final synchronized void onScrollChanged() {
        if (this.f9876e != null) {
            this.f9876e.a(e(), h(), i(), C3110zz.d(e()));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f9876e != null) {
            this.f9876e.a(view, motionEvent, e());
        }
        return false;
    }
}
