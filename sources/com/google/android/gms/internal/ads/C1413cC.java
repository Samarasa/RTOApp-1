package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.m;
import com.google.android.gms.ads.internal.overlay.q;
import com.google.android.gms.ads.internal.overlay.v;

/* renamed from: com.google.android.gms.internal.ads.cC  reason: case insensitive filesystem */
final class C1413cC implements q, v, C2858wc, C3071zc, C1540dqa {

    /* renamed from: a  reason: collision with root package name */
    private C1540dqa f9996a;

    /* renamed from: b  reason: collision with root package name */
    private C2858wc f9997b;

    /* renamed from: c  reason: collision with root package name */
    private q f9998c;

    /* renamed from: d  reason: collision with root package name */
    private C3071zc f9999d;

    /* renamed from: e  reason: collision with root package name */
    private v f10000e;

    private C1413cC() {
    }

    /* synthetic */ C1413cC(_B _b) {
        this();
    }

    /* access modifiers changed from: private */
    public final synchronized void a(C1540dqa dqa, C2858wc wcVar, q qVar, C3071zc zcVar, v vVar) {
        this.f9996a = dqa;
        this.f9997b = wcVar;
        this.f9998c = qVar;
        this.f9999d = zcVar;
        this.f10000e = vVar;
    }

    public final synchronized void H() {
        if (this.f10000e != null) {
            this.f10000e.H();
        }
    }

    public final synchronized void J() {
        if (this.f9998c != null) {
            this.f9998c.J();
        }
    }

    public final synchronized void Tb() {
        if (this.f9998c != null) {
            this.f9998c.Tb();
        }
    }

    public final synchronized void a(m mVar) {
        if (this.f9998c != null) {
            this.f9998c.a(mVar);
        }
    }

    public final synchronized void a(String str, Bundle bundle) {
        if (this.f9997b != null) {
            this.f9997b.a(str, bundle);
        }
    }

    public final synchronized void a(String str, String str2) {
        if (this.f9999d != null) {
            this.f9999d.a(str, str2);
        }
    }

    public final synchronized void onAdClicked() {
        if (this.f9996a != null) {
            this.f9996a.onAdClicked();
        }
    }

    public final synchronized void onPause() {
        if (this.f9998c != null) {
            this.f9998c.onPause();
        }
    }

    public final synchronized void onResume() {
        if (this.f9998c != null) {
            this.f9998c.onResume();
        }
    }
}
