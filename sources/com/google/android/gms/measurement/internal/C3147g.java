package com.google.android.gms.measurement.internal;

import android.os.Handler;
import c.b.b.b.d.f.Fd;
import com.google.android.gms.common.internal.C0563t;

/* renamed from: com.google.android.gms.measurement.internal.g  reason: case insensitive filesystem */
abstract class C3147g {

    /* renamed from: a  reason: collision with root package name */
    private static volatile Handler f13576a;

    /* renamed from: b  reason: collision with root package name */
    private final C3244yc f13577b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f13578c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public volatile long f13579d;

    C3147g(C3244yc ycVar) {
        C0563t.a(ycVar);
        this.f13577b = ycVar;
        this.f13578c = new C3165j(this, ycVar);
    }

    private final Handler d() {
        Handler handler;
        if (f13576a != null) {
            return f13576a;
        }
        synchronized (C3147g.class) {
            if (f13576a == null) {
                f13576a = new Fd(this.f13577b.f().getMainLooper());
            }
            handler = f13576a;
        }
        return handler;
    }

    public abstract void a();

    public final void a(long j) {
        c();
        if (j >= 0) {
            this.f13579d = this.f13577b.j().a();
            if (!d().postDelayed(this.f13578c, j)) {
                this.f13577b.h().t().a("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public final boolean b() {
        return this.f13579d != 0;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.f13579d = 0;
        d().removeCallbacks(this.f13578c);
    }
}
