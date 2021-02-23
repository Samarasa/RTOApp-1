package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import c.b.b.b.b.c.c;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.o;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.lang.reflect.InvocationTargetException;

public final class Ie extends C3234wc {

    /* renamed from: b  reason: collision with root package name */
    private Boolean f13309b;

    /* renamed from: c  reason: collision with root package name */
    private Ke f13310c = C3117b.f13505a;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f13311d;

    Ie(C3144fc fcVar) {
        super(fcVar);
    }

    private final String a(String str, String str2) {
        String str3;
        Db db;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke((Object) null, new Object[]{str, str2});
        } catch (ClassNotFoundException e2) {
            e = e2;
            db = h().t();
            str3 = "Could not find SystemProperties class";
            db.a(str3, e);
            return str2;
        } catch (NoSuchMethodException e3) {
            e = e3;
            db = h().t();
            str3 = "Could not find SystemProperties.get() method";
            db.a(str3, e);
            return str2;
        } catch (IllegalAccessException e4) {
            e = e4;
            db = h().t();
            str3 = "Could not access SystemProperties.get()";
            db.a(str3, e);
            return str2;
        } catch (InvocationTargetException e5) {
            e = e5;
            db = h().t();
            str3 = "SystemProperties.get() threw an exception";
            db.a(str3, e);
            return str2;
        }
    }

    public static long s() {
        return C3202q.F.a(null).longValue();
    }

    public static long t() {
        return C3202q.f13721f.a(null).longValue();
    }

    private final Bundle x() {
        try {
            if (f().getPackageManager() == null) {
                h().t().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a2 = c.a(f()).a(f().getPackageName(), 128);
            if (a2 != null) {
                return a2.metaData;
            }
            h().t().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            h().t().a("Failed to load metadata: Package name not found", e2);
            return null;
        }
    }

    public final int a(String str) {
        return b(str, C3202q.q);
    }

    public final long a(String str, C3204qb<Long> qbVar) {
        if (str != null) {
            String a2 = this.f13310c.a(str, qbVar.a());
            if (!TextUtils.isEmpty(a2)) {
                try {
                    return qbVar.a(Long.valueOf(Long.parseLong(a2))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return qbVar.a(null).longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(com.google.android.gms.measurement.internal.C3138ec r6) {
        /*
            r5 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = r6.n()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0033
            boolean r1 = c.b.b.b.d.f.Le.b()
            if (r1 == 0) goto L_0x002f
            com.google.android.gms.measurement.internal.Ie r1 = r5.m()
            java.lang.String r2 = r6.l()
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C3202q.Fa
            boolean r1 = r1.d(r2, r3)
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = r6.p()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0033
        L_0x002f:
            java.lang.String r1 = r6.o()
        L_0x0033:
            com.google.android.gms.measurement.internal.qb<java.lang.String> r2 = com.google.android.gms.measurement.internal.C3202q.f13722g
            r3 = 0
            java.lang.Object r2 = r2.a(r3)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri$Builder r2 = r0.scheme(r2)
            com.google.android.gms.measurement.internal.qb<java.lang.String> r4 = com.google.android.gms.measurement.internal.C3202q.f13723h
            java.lang.Object r3 = r4.a(r3)
            java.lang.String r3 = (java.lang.String) r3
            android.net.Uri$Builder r2 = r2.encodedAuthority(r3)
            java.lang.String r3 = "config/app/"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            if (r4 == 0) goto L_0x005d
            java.lang.String r1 = r3.concat(r1)
            goto L_0x0062
        L_0x005d:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x0062:
            android.net.Uri$Builder r1 = r2.path(r1)
            java.lang.String r6 = r6.m()
            java.lang.String r2 = "app_instance_id"
            android.net.Uri$Builder r6 = r1.appendQueryParameter(r2, r6)
            java.lang.String r1 = "platform"
            java.lang.String r2 = "android"
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r1, r2)
            long r1 = r5.n()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "gmp_version"
            r6.appendQueryParameter(r2, r1)
            android.net.Uri r6 = r0.build()
            java.lang.String r6 = r6.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Ie.a(com.google.android.gms.measurement.internal.ec):java.lang.String");
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    /* access modifiers changed from: package-private */
    public final void a(Ke ke) {
        this.f13310c = ke;
    }

    public final boolean a(C3204qb<Boolean> qbVar) {
        return d((String) null, qbVar);
    }

    public final int b(String str, C3204qb<Integer> qbVar) {
        if (str != null) {
            String a2 = this.f13310c.a(str, qbVar.a());
            if (!TextUtils.isEmpty(a2)) {
                try {
                    return qbVar.a(Integer.valueOf(Integer.parseInt(a2))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return qbVar.a(null).intValue();
    }

    /* access modifiers changed from: package-private */
    public final Boolean b(String str) {
        C0563t.b(str);
        Bundle x = x();
        if (x == null) {
            h().t().a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!x.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(x.getBoolean(str));
        }
    }

    public final double c(String str, C3204qb<Double> qbVar) {
        if (str != null) {
            String a2 = this.f13310c.a(str, qbVar.a());
            if (!TextUtils.isEmpty(a2)) {
                try {
                    return qbVar.a(Double.valueOf(Double.parseDouble(a2))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return qbVar.a(null).doubleValue();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b A[SYNTHETIC, Splitter:B:9:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> c(java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.C0563t.b((java.lang.String) r4)
            android.os.Bundle r0 = r3.x()
            r1 = 0
            if (r0 != 0) goto L_0x0019
            com.google.android.gms.measurement.internal.Bb r4 = r3.h()
            com.google.android.gms.measurement.internal.Db r4 = r4.t()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L_0x0017:
            r4 = r1
            goto L_0x0028
        L_0x0019:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0020
            goto L_0x0017
        L_0x0020:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0028:
            if (r4 != 0) goto L_0x002b
            return r1
        L_0x002b:
            android.content.Context r0 = r3.f()     // Catch:{ NotFoundException -> 0x0043 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0043 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0043 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0043 }
            if (r4 != 0) goto L_0x003e
            return r1
        L_0x003e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            com.google.android.gms.measurement.internal.Bb r0 = r3.h()
            com.google.android.gms.measurement.internal.Db r0 = r0.t()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.a(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Ie.c(java.lang.String):java.util.List");
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ C3159i d() {
        return super.d();
    }

    public final boolean d(String str) {
        return "1".equals(this.f13310c.a(str, "gaia_collection_enabled"));
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.measurement.internal.qb, com.google.android.gms.measurement.internal.qb<java.lang.Boolean>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(java.lang.String r4, com.google.android.gms.measurement.internal.C3204qb<java.lang.Boolean> r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x000e
        L_0x0003:
            java.lang.Object r4 = r5.a(r0)
        L_0x0007:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x000e:
            com.google.android.gms.measurement.internal.Ke r1 = r3.f13310c
            java.lang.String r2 = r5.a()
            java.lang.String r4 = r1.a(r4, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L_0x001f
            goto L_0x0003
        L_0x001f:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r4 = r5.a(r4)
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Ie.d(java.lang.String, com.google.android.gms.measurement.internal.qb):boolean");
    }

    public final /* bridge */ /* synthetic */ C3248zb e() {
        return super.e();
    }

    public final boolean e(String str) {
        return "1".equals(this.f13310c.a(str, "measurement.event_sampling_enabled"));
    }

    public final boolean e(String str, C3204qb<Boolean> qbVar) {
        return d(str, qbVar);
    }

    public final /* bridge */ /* synthetic */ Context f() {
        return super.f();
    }

    /* access modifiers changed from: package-private */
    public final boolean f(String str) {
        return d(str, C3202q.J);
    }

    public final /* bridge */ /* synthetic */ Zb g() {
        return super.g();
    }

    /* access modifiers changed from: package-private */
    public final String g(String str) {
        C3204qb<String> qbVar = C3202q.K;
        return qbVar.a(str == null ? null : this.f13310c.a(str, qbVar.a()));
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

    public final long n() {
        i();
        return 19000;
    }

    public final boolean o() {
        if (this.f13311d == null) {
            synchronized (this) {
                if (this.f13311d == null) {
                    ApplicationInfo applicationInfo = f().getApplicationInfo();
                    String a2 = o.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f13311d = Boolean.valueOf(str != null && str.equals(a2));
                    }
                    if (this.f13311d == null) {
                        this.f13311d = Boolean.TRUE;
                        h().t().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f13311d.booleanValue();
    }

    public final boolean p() {
        i();
        Boolean b2 = b("firebase_analytics_collection_deactivated");
        return b2 != null && b2.booleanValue();
    }

    public final Boolean q() {
        i();
        return b("firebase_analytics_collection_enabled");
    }

    public final Boolean r() {
        a();
        Boolean b2 = b("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(b2 == null || b2.booleanValue());
    }

    public final String u() {
        return a("debug.firebase.analytics.app", BuildConfig.FLAVOR);
    }

    public final String v() {
        return a("debug.deferred.deeplink", BuildConfig.FLAVOR);
    }

    /* access modifiers changed from: package-private */
    public final boolean w() {
        if (this.f13309b == null) {
            this.f13309b = b("app_measurement_lite");
            if (this.f13309b == null) {
                this.f13309b = false;
            }
        }
        return this.f13309b.booleanValue() || !this.f13807a.C();
    }
}
