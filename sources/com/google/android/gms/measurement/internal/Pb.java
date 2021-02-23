package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.C0563t;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

public final class Pb {

    /* renamed from: a  reason: collision with root package name */
    private final String f13378a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13379b;

    /* renamed from: c  reason: collision with root package name */
    private final String f13380c;

    /* renamed from: d  reason: collision with root package name */
    private final long f13381d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Lb f13382e;

    private Pb(Lb lb, String str, long j) {
        this.f13382e = lb;
        C0563t.b(str);
        C0563t.a(j > 0);
        this.f13378a = String.valueOf(str).concat(":start");
        this.f13379b = String.valueOf(str).concat(":count");
        this.f13380c = String.valueOf(str).concat(":value");
        this.f13381d = j;
    }

    private final void b() {
        this.f13382e.c();
        long a2 = this.f13382e.j().a();
        SharedPreferences.Editor edit = this.f13382e.t().edit();
        edit.remove(this.f13379b);
        edit.remove(this.f13380c);
        edit.putLong(this.f13378a, a2);
        edit.apply();
    }

    private final long c() {
        return this.f13382e.t().getLong(this.f13378a, 0);
    }

    public final Pair<String, Long> a() {
        long j;
        this.f13382e.c();
        this.f13382e.c();
        long c2 = c();
        if (c2 == 0) {
            b();
            j = 0;
        } else {
            j = Math.abs(c2 - this.f13382e.j().a());
        }
        long j2 = this.f13381d;
        if (j < j2) {
            return null;
        }
        if (j > (j2 << 1)) {
            b();
            return null;
        }
        String string = this.f13382e.t().getString(this.f13380c, (String) null);
        long j3 = this.f13382e.t().getLong(this.f13379b, 0);
        b();
        return (string == null || j3 <= 0) ? Lb.f13334c : new Pair<>(string, Long.valueOf(j3));
    }

    public final void a(String str, long j) {
        this.f13382e.c();
        if (c() == 0) {
            b();
        }
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        long j2 = this.f13382e.t().getLong(this.f13379b, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f13382e.t().edit();
            edit.putString(this.f13380c, str);
            edit.putLong(this.f13379b, 1);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.f13382e.k().u().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        SharedPreferences.Editor edit2 = this.f13382e.t().edit();
        if (z) {
            edit2.putString(this.f13380c, str);
        }
        edit2.putLong(this.f13379b, j3);
        edit2.apply();
    }
}
