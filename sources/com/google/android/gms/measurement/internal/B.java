package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import b.e.b;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.e;
import java.util.Map;

public final class B extends Fb {

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Long> f13185b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Integer> f13186c = new b();

    /* renamed from: d  reason: collision with root package name */
    private long f13187d;

    public B(C3144fc fcVar) {
        super(fcVar);
    }

    private final void a(long j, C3175kd kdVar) {
        if (kdVar == null) {
            h().B().a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            h().B().a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C3191nd.a(kdVar, bundle, true);
            p().a("am", "_xa", bundle);
        }
    }

    private final void a(String str, long j, C3175kd kdVar) {
        if (kdVar == null) {
            h().B().a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            h().B().a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C3191nd.a(kdVar, bundle, true);
            p().a("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    public final void b(long j) {
        for (String put : this.f13185b.keySet()) {
            this.f13185b.put(put, Long.valueOf(j));
        }
        if (!this.f13185b.isEmpty()) {
            this.f13187d = j;
        }
    }

    /* access modifiers changed from: private */
    public final void c(String str, long j) {
        a();
        c();
        C0563t.b(str);
        if (this.f13186c.isEmpty()) {
            this.f13187d = j;
        }
        Integer num = this.f13186c.get(str);
        if (num != null) {
            this.f13186c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.f13186c.size() >= 100) {
            h().w().a("Too many ads visible");
        } else {
            this.f13186c.put(str, 1);
            this.f13185b.put(str, Long.valueOf(j));
        }
    }

    /* access modifiers changed from: private */
    public final void d(String str, long j) {
        a();
        c();
        C0563t.b(str);
        Integer num = this.f13186c.get(str);
        if (num != null) {
            C3175kd B = s().B();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f13186c.remove(str);
                Long l = this.f13185b.get(str);
                if (l == null) {
                    h().t().a("First ad unit exposure time was never set");
                } else {
                    this.f13185b.remove(str);
                    a(str, j - l.longValue(), B);
                }
                if (this.f13186c.isEmpty()) {
                    long j2 = this.f13187d;
                    if (j2 == 0) {
                        h().t().a("First ad exposure time was never set");
                        return;
                    }
                    a(j - j2, B);
                    this.f13187d = 0;
                    return;
                }
                return;
            }
            this.f13186c.put(str, Integer.valueOf(intValue));
            return;
        }
        h().t().a("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final void a(long j) {
        C3175kd B = s().B();
        for (String next : this.f13185b.keySet()) {
            a(next, j - this.f13185b.get(next).longValue(), B);
        }
        if (!this.f13185b.isEmpty()) {
            a(j - this.f13187d, B);
        }
        b(j);
    }

    public final void a(String str, long j) {
        if (str == null || str.length() == 0) {
            h().t().a("Ad unit id must be a non-empty string");
        } else {
            g().a((Runnable) new C3111a(this, str, j));
        }
    }

    public final void b(String str, long j) {
        if (str == null || str.length() == 0) {
            h().t().a("Ad unit id must be a non-empty string");
        } else {
            g().a((Runnable) new Ea(this, str, j));
        }
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ C3159i d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C3248zb e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ Context f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ Zb g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ Bb h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ He i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ e j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ se k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Lb l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Ie m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ Hc p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ C3191nd s() {
        return super.s();
    }
}
