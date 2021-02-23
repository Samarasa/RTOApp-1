package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import b.e.b;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.e;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.nd  reason: case insensitive filesystem */
public final class C3191nd extends C3137eb {

    /* renamed from: c  reason: collision with root package name */
    protected C3175kd f13688c;

    /* renamed from: d  reason: collision with root package name */
    private volatile C3175kd f13689d;

    /* renamed from: e  reason: collision with root package name */
    private C3175kd f13690e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Activity, C3175kd> f13691f = new b();

    /* renamed from: g  reason: collision with root package name */
    private C3175kd f13692g;

    /* renamed from: h  reason: collision with root package name */
    private String f13693h;

    public C3191nd(C3144fc fcVar) {
        super(fcVar);
    }

    private static String a(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : BuildConfig.FLAVOR;
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    private final void a(Activity activity, C3175kd kdVar, boolean z) {
        C3175kd kdVar2 = this.f13689d == null ? this.f13690e : this.f13689d;
        if (kdVar.f13638b == null) {
            kdVar = new C3175kd(kdVar.f13637a, a(activity.getClass().getCanonicalName()), kdVar.f13639c);
        }
        this.f13690e = this.f13689d;
        this.f13689d = kdVar;
        g().a((Runnable) new C3186md(this, z, kdVar2, kdVar));
    }

    public static void a(C3175kd kdVar, Bundle bundle, boolean z) {
        if (bundle != null && kdVar != null && (!bundle.containsKey("_sc") || z)) {
            String str = kdVar.f13637a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            bundle.putString("_sc", kdVar.f13638b);
            bundle.putLong("_si", kdVar.f13639c);
        } else if (bundle != null && kdVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* access modifiers changed from: private */
    public final void a(C3175kd kdVar, boolean z) {
        o().a(j().b());
        if (u().a(kdVar.f13640d, z)) {
            kdVar.f13640d = false;
        }
    }

    private final C3175kd d(Activity activity) {
        C0563t.a(activity);
        C3175kd kdVar = this.f13691f.get(activity);
        if (kdVar != null) {
            return kdVar;
        }
        C3175kd kdVar2 = new C3175kd((String) null, a(activity.getClass().getCanonicalName()), k().t());
        this.f13691f.put(activity, kdVar2);
        return kdVar2;
    }

    /* access modifiers changed from: protected */
    public final boolean A() {
        return false;
    }

    public final C3175kd B() {
        x();
        c();
        return this.f13688c;
    }

    public final C3175kd C() {
        a();
        return this.f13689d;
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final void a(Activity activity) {
        a(activity, d(activity), false);
        B o = o();
        o.g().a((Runnable) new C3130da(o, o.j().b()));
    }

    public final void a(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f13691f.put(activity, new C3175kd(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    public final void a(Activity activity, String str, String str2) {
        if (this.f13689d == null) {
            h().y().a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f13691f.get(activity) == null) {
            h().y().a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = a(activity.getClass().getCanonicalName());
            }
            boolean equals = this.f13689d.f13638b.equals(str2);
            boolean c2 = se.c(this.f13689d.f13637a, str);
            if (equals && c2) {
                h().y().a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                h().y().a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                h().B().a("Setting current screen to name, class", str == null ? "null" : str, str2);
                C3175kd kdVar = new C3175kd(str, str2, k().t());
                this.f13691f.put(activity, kdVar);
                a(activity, kdVar, true);
            } else {
                h().y().a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    public final void a(String str, C3175kd kdVar) {
        c();
        synchronized (this) {
            if (this.f13693h == null || this.f13693h.equals(str) || kdVar != null) {
                this.f13693h = str;
                this.f13692g = kdVar;
            }
        }
    }

    public final void b(Activity activity) {
        C3175kd d2 = d(activity);
        this.f13690e = this.f13689d;
        this.f13689d = null;
        g().a((Runnable) new C3201pd(this, d2));
    }

    public final void b(Activity activity, Bundle bundle) {
        C3175kd kdVar;
        if (bundle != null && (kdVar = this.f13691f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", kdVar.f13639c);
            bundle2.putString("name", kdVar.f13637a);
            bundle2.putString("referrer_name", kdVar.f13638b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final void c(Activity activity) {
        this.f13691f.remove(activity);
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

    public final /* bridge */ /* synthetic */ B o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ Hc p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ C3196od r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ Ud u() {
        return super.u();
    }
}
