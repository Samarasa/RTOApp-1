package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import c.b.b.b.d.f.C0344he;
import c.b.b.b.d.f.C0467ze;

/* renamed from: com.google.android.gms.measurement.internal.de  reason: case insensitive filesystem */
final class C3134de {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Ud f13545a;

    C3134de(Ud ud) {
        this.f13545a = ud;
    }

    private final void b(long j, boolean z) {
        this.f13545a.c();
        if (C0467ze.b() && this.f13545a.m().a(C3202q.Y)) {
            if (this.f13545a.f13807a.c()) {
                this.f13545a.l().w.a(j);
            } else {
                return;
            }
        }
        this.f13545a.h().B().a("Session started, time", Long.valueOf(this.f13545a.j().b()));
        Long l = null;
        if (this.f13545a.m().a(C3202q.R)) {
            l = Long.valueOf(j / 1000);
        }
        this.f13545a.p().a("auto", "_sid", (Object) l, j);
        this.f13545a.l().s.a(false);
        Bundle bundle = new Bundle();
        if (this.f13545a.m().a(C3202q.R)) {
            bundle.putLong("_sid", l.longValue());
        }
        if (this.f13545a.m().a(C3202q.Ha) && z) {
            bundle.putLong("_aib", 1);
        }
        this.f13545a.p().a("auto", "_s", j, bundle);
        if (C0344he.b() && this.f13545a.m().a(C3202q.Pa)) {
            String a2 = this.f13545a.l().C.a();
            if (!TextUtils.isEmpty(a2)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", a2);
                this.f13545a.p().a("auto", "_ssr", j, bundle2);
            }
        }
        if (!C0467ze.b() || !this.f13545a.m().a(C3202q.Y)) {
            this.f13545a.l().w.a(j);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (C0467ze.b() && this.f13545a.m().a(C3202q.Y)) {
            this.f13545a.c();
            if (this.f13545a.l().a(this.f13545a.j().a())) {
                this.f13545a.l().s.a(true);
                if (Build.VERSION.SDK_INT >= 16) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    if (runningAppProcessInfo.importance == 100) {
                        this.f13545a.h().B().a("Detected application was in foreground");
                        b(this.f13545a.j().a(), false);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(long j, boolean z) {
        this.f13545a.c();
        this.f13545a.C();
        if (this.f13545a.l().a(j)) {
            this.f13545a.l().s.a(true);
            this.f13545a.l().x.a(0);
        }
        if (z && this.f13545a.m().a(C3202q.T)) {
            this.f13545a.l().w.a(j);
        }
        if (this.f13545a.l().s.a()) {
            b(j, z);
        }
    }
}
