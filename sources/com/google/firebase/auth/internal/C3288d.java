package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.HandlerThread;
import c.b.b.b.b.a.a;
import c.b.b.b.d.d.Ha;
import c.b.d.e;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.h;

/* renamed from: com.google.firebase.auth.internal.d  reason: case insensitive filesystem */
public final class C3288d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static a f14370a = new a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: b  reason: collision with root package name */
    private final e f14371b;

    /* renamed from: c  reason: collision with root package name */
    volatile long f14372c;

    /* renamed from: d  reason: collision with root package name */
    volatile long f14373d;

    /* renamed from: e  reason: collision with root package name */
    private long f14374e;

    /* renamed from: f  reason: collision with root package name */
    private HandlerThread f14375f = new HandlerThread("TokenRefresher", 10);

    /* renamed from: g  reason: collision with root package name */
    private Handler f14376g;

    /* renamed from: h  reason: collision with root package name */
    private Runnable f14377h;

    public C3288d(e eVar) {
        f14370a.d("Initializing TokenRefresher", new Object[0]);
        C0563t.a(eVar);
        this.f14371b = eVar;
        this.f14375f.start();
        this.f14376g = new Ha(this.f14375f.getLooper());
        this.f14377h = new O(this, this.f14371b.d());
        this.f14374e = 300000;
    }

    public final void a() {
        a aVar = f14370a;
        long j = this.f14372c - this.f14374e;
        StringBuilder sb = new StringBuilder(43);
        sb.append("Scheduling refresh for ");
        sb.append(j);
        aVar.d(sb.toString(), new Object[0]);
        c();
        this.f14373d = Math.max((this.f14372c - h.d().a()) - this.f14374e, 0) / 1000;
        this.f14376g.postDelayed(this.f14377h, this.f14373d * 1000);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        int i = (int) this.f14373d;
        this.f14373d = (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) ? 2 * this.f14373d : i != 960 ? 30 : 960;
        this.f14372c = h.d().a() + (this.f14373d * 1000);
        a aVar = f14370a;
        long j = this.f14372c;
        StringBuilder sb = new StringBuilder(43);
        sb.append("Scheduling refresh for ");
        sb.append(j);
        aVar.d(sb.toString(), new Object[0]);
        this.f14376g.postDelayed(this.f14377h, this.f14373d * 1000);
    }

    public final void c() {
        this.f14376g.removeCallbacks(this.f14377h);
    }
}
