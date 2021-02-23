package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.c.a;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

final class Lb extends C3249zc {

    /* renamed from: c  reason: collision with root package name */
    static final Pair<String, Long> f13334c = new Pair<>(BuildConfig.FLAVOR, 0L);
    public Nb A = new Nb(this, "deep_link_retrieval_complete", false);
    public Qb B = new Qb(this, "deep_link_retrieval_attempts", 0);
    public final Sb C = new Sb(this, "firebase_feature_rollouts", (String) null);

    /* renamed from: d  reason: collision with root package name */
    private SharedPreferences f13335d;

    /* renamed from: e  reason: collision with root package name */
    public Pb f13336e;

    /* renamed from: f  reason: collision with root package name */
    public final Qb f13337f = new Qb(this, "last_upload", 0);

    /* renamed from: g  reason: collision with root package name */
    public final Qb f13338g = new Qb(this, "last_upload_attempt", 0);

    /* renamed from: h  reason: collision with root package name */
    public final Qb f13339h = new Qb(this, "backoff", 0);
    public final Qb i = new Qb(this, "last_delete_stale", 0);
    public final Qb j = new Qb(this, "midnight_offset", 0);
    public final Qb k = new Qb(this, "first_open_time", 0);
    public final Qb l = new Qb(this, "app_install_time", 0);
    public final Sb m = new Sb(this, "app_instance_id", (String) null);
    private String n;
    private boolean o;
    private long p;
    public final Qb q = new Qb(this, "time_before_start", 10000);
    public final Qb r = new Qb(this, "session_timeout", 1800000);
    public final Nb s = new Nb(this, "start_new_session", true);
    public final Sb t = new Sb(this, "non_personalized_ads", (String) null);
    public final Nb u = new Nb(this, "use_dynamite_api", false);
    public final Nb v = new Nb(this, "allow_remote_dynamite", false);
    public final Qb w = new Qb(this, "last_pause_time", 0);
    public final Qb x = new Qb(this, "time_active", 0);
    public boolean y;
    public Nb z = new Nb(this, "app_backgrounded", false);

    Lb(C3144fc fcVar) {
        super(fcVar);
    }

    /* access modifiers changed from: package-private */
    public final boolean A() {
        return this.f13335d.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: package-private */
    public final Pair<String, Boolean> a(String str) {
        c();
        long b2 = j().b();
        String str2 = this.n;
        if (str2 != null && b2 < this.p) {
            return new Pair<>(str2, Boolean.valueOf(this.o));
        }
        this.p = b2 + m().a(str, C3202q.f13719d);
        a.a(true);
        try {
            a.C0070a a2 = a.a(f());
            if (a2 != null) {
                this.n = a2.a();
                this.o = a2.b();
            }
            if (this.n == null) {
                this.n = BuildConfig.FLAVOR;
            }
        } catch (Exception e2) {
            h().A().a("Unable to get advertising id", e2);
            this.n = BuildConfig.FLAVOR;
        }
        a.a(false);
        return new Pair<>(this.n, Boolean.valueOf(this.o));
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        c();
        h().B().a("Setting useService", Boolean.valueOf(z2));
        SharedPreferences.Editor edit = t().edit();
        edit.putBoolean("use_service", z2);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final boolean a(long j2) {
        return j2 - this.r.a() > this.w.a();
    }

    /* access modifiers changed from: package-private */
    public final String b(String str) {
        c();
        String str2 = (String) a(str).first;
        MessageDigest v2 = se.v();
        if (v2 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, v2.digest(str2.getBytes()))});
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z2) {
        c();
        h().B().a("Setting measurementEnabled", Boolean.valueOf(z2));
        SharedPreferences.Editor edit = t().edit();
        edit.putBoolean("measurement_enabled", z2);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void c(String str) {
        c();
        SharedPreferences.Editor edit = t().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void c(boolean z2) {
        c();
        h().B().a("Updating deferred analytics collection", Boolean.valueOf(z2));
        SharedPreferences.Editor edit = t().edit();
        edit.putBoolean("deferred_analytics_collection", z2);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void d(String str) {
        c();
        SharedPreferences.Editor edit = t().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    public final void n() {
        this.f13335d = f().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.y = this.f13335d.getBoolean("has_been_opened", false);
        if (!this.y) {
            SharedPreferences.Editor edit = this.f13335d.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f13336e = new Pb(this, "health_monitor", Math.max(0, C3202q.f13720e.a(null).longValue()));
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final SharedPreferences t() {
        c();
        o();
        return this.f13335d;
    }

    /* access modifiers changed from: package-private */
    public final String u() {
        c();
        return t().getString("gmp_app_id", (String) null);
    }

    /* access modifiers changed from: package-private */
    public final String v() {
        c();
        return t().getString("admob_app_id", (String) null);
    }

    /* access modifiers changed from: package-private */
    public final Boolean w() {
        c();
        if (!t().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(t().getBoolean("use_service", false));
    }

    /* access modifiers changed from: package-private */
    public final void x() {
        c();
        h().B().a("Clearing collection preferences.");
        Boolean y2 = y();
        SharedPreferences.Editor edit = t().edit();
        edit.clear();
        edit.apply();
        if (y2 != null) {
            b(y2.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    public final Boolean y() {
        c();
        if (t().contains("measurement_enabled")) {
            return Boolean.valueOf(t().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final String z() {
        c();
        String string = t().getString("previous_os_version", (String) null);
        d().o();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = t().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }
}
