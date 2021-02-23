package com.google.android.gms.measurement.internal;

import android.content.Context;
import c.b.b.b.d.f.Bf;
import c.b.b.b.d.f.Le;
import com.google.android.gms.common.util.e;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.ub  reason: case insensitive filesystem */
public final class C3223ub extends C3137eb {

    /* renamed from: c  reason: collision with root package name */
    private String f13781c;

    /* renamed from: d  reason: collision with root package name */
    private String f13782d;

    /* renamed from: e  reason: collision with root package name */
    private int f13783e;

    /* renamed from: f  reason: collision with root package name */
    private String f13784f;

    /* renamed from: g  reason: collision with root package name */
    private String f13785g;

    /* renamed from: h  reason: collision with root package name */
    private long f13786h;
    private long i;
    private List<String> j;
    private int k;
    private String l;
    private String m;
    private String n;

    C3223ub(C3144fc fcVar, long j2) {
        super(fcVar);
        this.i = j2;
    }

    private final String I() {
        Db x;
        String str;
        if (!Bf.b() || !m().a(C3202q.Ia)) {
            try {
                Class<?> loadClass = f().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (loadClass == null) {
                    return null;
                }
                try {
                    Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{f()});
                    if (invoke == null) {
                        return null;
                    }
                    try {
                        return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                    } catch (Exception unused) {
                        x = h().y();
                        str = "Failed to retrieve Firebase Instance Id";
                    }
                } catch (Exception unused2) {
                    x = h().x();
                    str = "Failed to obtain Firebase Analytics instance";
                }
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        } else {
            x = h().B();
            str = "Disabled IID for tests.";
            x.a(str);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean A() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final String B() {
        x();
        return this.f13781c;
    }

    /* access modifiers changed from: package-private */
    public final String C() {
        x();
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public final String D() {
        x();
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public final String E() {
        x();
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public final int F() {
        x();
        return this.f13783e;
    }

    /* access modifiers changed from: package-private */
    public final int G() {
        x();
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public final List<String> H() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public final xe a(String str) {
        boolean z;
        Boolean bool;
        Boolean b2;
        c();
        a();
        String B = B();
        String C = C();
        x();
        String str2 = this.f13782d;
        long F = (long) F();
        x();
        String str3 = this.f13784f;
        long n2 = m().n();
        x();
        c();
        if (this.f13786h == 0) {
            this.f13786h = this.f13807a.v().a(f(), f().getPackageName());
        }
        long j2 = this.f13786h;
        boolean c2 = this.f13807a.c();
        boolean z2 = !l().y;
        c();
        a();
        String I = !this.f13807a.c() ? null : I();
        long d2 = this.f13807a.d();
        int G = G();
        boolean booleanValue = m().r().booleanValue();
        Ie m2 = m();
        m2.a();
        Boolean b3 = m2.b("google_analytics_ssaid_collection_enabled");
        boolean booleanValue2 = Boolean.valueOf(b3 == null || b3.booleanValue()).booleanValue();
        Lb l2 = l();
        l2.c();
        boolean z3 = l2.t().getBoolean("deferred_analytics_collection", false);
        String D = D();
        if (!m().a(C3202q.ca) || (b2 = m().b("google_analytics_default_allow_ad_personalization_signals")) == null) {
            z = z2;
            bool = null;
        } else {
            bool = Boolean.valueOf(!b2.booleanValue());
            z = z2;
        }
        return new xe(B, C, str2, F, str3, n2, j2, str, c2, z, I, 0, d2, G, booleanValue, booleanValue2, z3, D, bool, this.i, m().a(C3202q.ma) ? this.j : null, (!Le.b() || !m().a(C3202q.Fa)) ? null : E());
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
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

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0197 A[Catch:{ IllegalStateException -> 0x0204 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0199 A[Catch:{ IllegalStateException -> 0x0204 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a4 A[SYNTHETIC, Splitter:B:76:0x01a4] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e2 A[Catch:{ IllegalStateException -> 0x0204 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01f2 A[Catch:{ IllegalStateException -> 0x0204 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0225  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v() {
        /*
            r11 = this;
            android.content.Context r0 = r11.f()
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r1 = r11.f()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String r5 = "unknown"
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L_0x002e
            com.google.android.gms.measurement.internal.Bb r7 = r11.h()
            com.google.android.gms.measurement.internal.Db r7 = r7.t()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.a(r9, r8)
        L_0x002c:
            r8 = r2
            goto L_0x008e
        L_0x002e:
            java.lang.String r5 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0033 }
            goto L_0x0044
        L_0x0033:
            com.google.android.gms.measurement.internal.Bb r7 = r11.h()
            com.google.android.gms.measurement.internal.Db r7 = r7.t()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.a(r9, r8)
        L_0x0044:
            if (r5 != 0) goto L_0x0049
            java.lang.String r5 = "manual_install"
            goto L_0x0052
        L_0x0049:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x0052
            r5 = r3
        L_0x0052:
            android.content.Context r7 = r11.f()     // Catch:{ NameNotFoundException -> 0x007a }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x007a }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x007a }
            if (r7 == 0) goto L_0x002c
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x007a }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x007a }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x007a }
            if (r9 != 0) goto L_0x0071
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x007a }
            goto L_0x0072
        L_0x0071:
            r8 = r2
        L_0x0072:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0077 }
            int r6 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0077 }
            goto L_0x008e
        L_0x0077:
            r7 = r2
            r2 = r8
            goto L_0x007b
        L_0x007a:
            r7 = r2
        L_0x007b:
            com.google.android.gms.measurement.internal.Bb r8 = r11.h()
            com.google.android.gms.measurement.internal.Db r8 = r8.t()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.a(r10, r9, r2)
            r8 = r2
            r2 = r7
        L_0x008e:
            r11.f13781c = r0
            r11.f13784f = r5
            r11.f13782d = r2
            r11.f13783e = r6
            r11.f13785g = r8
            r5 = 0
            r11.f13786h = r5
            r11.i()
            android.content.Context r2 = r11.f()
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.internal.C0526f.a((android.content.Context) r2)
            r5 = 1
            if (r2 == 0) goto L_0x00b2
            boolean r6 = r2.j()
            if (r6 == 0) goto L_0x00b2
            r6 = 1
            goto L_0x00b3
        L_0x00b2:
            r6 = 0
        L_0x00b3:
            com.google.android.gms.measurement.internal.fc r7 = r11.f13807a
            java.lang.String r7 = r7.z()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r8 = "am"
            if (r7 != 0) goto L_0x00cf
            com.google.android.gms.measurement.internal.fc r7 = r11.f13807a
            java.lang.String r7 = r7.A()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x00cf
            r7 = 1
            goto L_0x00d0
        L_0x00cf:
            r7 = 0
        L_0x00d0:
            r6 = r6 | r7
            if (r6 != 0) goto L_0x00fc
            if (r2 != 0) goto L_0x00e3
            com.google.android.gms.measurement.internal.Bb r2 = r11.h()
            com.google.android.gms.measurement.internal.Db r2 = r2.t()
            java.lang.String r7 = "GoogleService failed to initialize (no status)"
            r2.a(r7)
            goto L_0x00fc
        L_0x00e3:
            com.google.android.gms.measurement.internal.Bb r7 = r11.h()
            com.google.android.gms.measurement.internal.Db r7 = r7.t()
            int r9 = r2.g()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r2 = r2.h()
            java.lang.String r10 = "GoogleService failed to initialize, status"
            r7.a(r10, r9, r2)
        L_0x00fc:
            if (r6 == 0) goto L_0x0163
            com.google.android.gms.measurement.internal.Ie r2 = r11.m()
            java.lang.Boolean r2 = r2.q()
            com.google.android.gms.measurement.internal.Ie r6 = r11.m()
            boolean r6 = r6.p()
            if (r6 == 0) goto L_0x0126
            com.google.android.gms.measurement.internal.fc r2 = r11.f13807a
            boolean r2 = r2.y()
            if (r2 == 0) goto L_0x0163
            com.google.android.gms.measurement.internal.Bb r2 = r11.h()
            com.google.android.gms.measurement.internal.Db r2 = r2.z()
            java.lang.String r6 = "Collection disabled with firebase_analytics_collection_deactivated=1"
        L_0x0122:
            r2.a(r6)
            goto L_0x0163
        L_0x0126:
            if (r2 == 0) goto L_0x0141
            boolean r6 = r2.booleanValue()
            if (r6 != 0) goto L_0x0141
            com.google.android.gms.measurement.internal.fc r2 = r11.f13807a
            boolean r2 = r2.y()
            if (r2 == 0) goto L_0x0163
            com.google.android.gms.measurement.internal.Bb r2 = r11.h()
            com.google.android.gms.measurement.internal.Db r2 = r2.z()
            java.lang.String r6 = "Collection disabled with firebase_analytics_collection_enabled=0"
            goto L_0x0122
        L_0x0141:
            if (r2 != 0) goto L_0x0154
            boolean r2 = com.google.android.gms.common.api.internal.C0526f.b()
            if (r2 == 0) goto L_0x0154
            com.google.android.gms.measurement.internal.Bb r2 = r11.h()
            com.google.android.gms.measurement.internal.Db r2 = r2.z()
            java.lang.String r6 = "Collection disabled with google_app_measurement_enable=0"
            goto L_0x0122
        L_0x0154:
            com.google.android.gms.measurement.internal.Bb r2 = r11.h()
            com.google.android.gms.measurement.internal.Db r2 = r2.B()
            java.lang.String r6 = "Collection enabled"
            r2.a(r6)
            r2 = 1
            goto L_0x0164
        L_0x0163:
            r2 = 0
        L_0x0164:
            r11.l = r3
            r11.m = r3
            r11.n = r3
            r11.i()
            com.google.android.gms.measurement.internal.fc r6 = r11.f13807a
            java.lang.String r6 = r6.z()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x018d
            com.google.android.gms.measurement.internal.fc r6 = r11.f13807a
            java.lang.String r6 = r6.A()
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x018d
            com.google.android.gms.measurement.internal.fc r6 = r11.f13807a
            java.lang.String r6 = r6.z()
            r11.m = r6
        L_0x018d:
            java.lang.String r6 = com.google.android.gms.common.api.internal.C0526f.a()     // Catch:{ IllegalStateException -> 0x0204 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x0204 }
            if (r7 == 0) goto L_0x0199
            r7 = r3
            goto L_0x019a
        L_0x0199:
            r7 = r6
        L_0x019a:
            r11.l = r7     // Catch:{ IllegalStateException -> 0x0204 }
            boolean r7 = c.b.b.b.d.f.Le.b()     // Catch:{ IllegalStateException -> 0x0204 }
            java.lang.String r8 = "admob_app_id"
            if (r7 == 0) goto L_0x01dc
            com.google.android.gms.measurement.internal.Ie r7 = r11.m()     // Catch:{ IllegalStateException -> 0x0204 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C3202q.Fa     // Catch:{ IllegalStateException -> 0x0204 }
            boolean r7 = r7.a((com.google.android.gms.measurement.internal.C3204qb<java.lang.Boolean>) r9)     // Catch:{ IllegalStateException -> 0x0204 }
            if (r7 == 0) goto L_0x01dc
            com.google.android.gms.common.internal.x r7 = new com.google.android.gms.common.internal.x     // Catch:{ IllegalStateException -> 0x0204 }
            android.content.Context r9 = r11.f()     // Catch:{ IllegalStateException -> 0x0204 }
            r7.<init>(r9)     // Catch:{ IllegalStateException -> 0x0204 }
            java.lang.String r9 = "ga_app_id"
            java.lang.String r9 = r7.a(r9)     // Catch:{ IllegalStateException -> 0x0204 }
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalStateException -> 0x0204 }
            if (r10 == 0) goto L_0x01c6
            goto L_0x01c7
        L_0x01c6:
            r3 = r9
        L_0x01c7:
            r11.n = r3     // Catch:{ IllegalStateException -> 0x0204 }
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x0204 }
            if (r3 == 0) goto L_0x01d5
            boolean r3 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalStateException -> 0x0204 }
            if (r3 != 0) goto L_0x01f0
        L_0x01d5:
            java.lang.String r3 = r7.a(r8)     // Catch:{ IllegalStateException -> 0x0204 }
        L_0x01d9:
            r11.m = r3     // Catch:{ IllegalStateException -> 0x0204 }
            goto L_0x01f0
        L_0x01dc:
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x0204 }
            if (r3 != 0) goto L_0x01f0
            com.google.android.gms.common.internal.x r3 = new com.google.android.gms.common.internal.x     // Catch:{ IllegalStateException -> 0x0204 }
            android.content.Context r6 = r11.f()     // Catch:{ IllegalStateException -> 0x0204 }
            r3.<init>(r6)     // Catch:{ IllegalStateException -> 0x0204 }
            java.lang.String r3 = r3.a(r8)     // Catch:{ IllegalStateException -> 0x0204 }
            goto L_0x01d9
        L_0x01f0:
            if (r2 == 0) goto L_0x0216
            com.google.android.gms.measurement.internal.Bb r2 = r11.h()     // Catch:{ IllegalStateException -> 0x0204 }
            com.google.android.gms.measurement.internal.Db r2 = r2.B()     // Catch:{ IllegalStateException -> 0x0204 }
            java.lang.String r3 = "App package, google app id"
            java.lang.String r6 = r11.f13781c     // Catch:{ IllegalStateException -> 0x0204 }
            java.lang.String r7 = r11.l     // Catch:{ IllegalStateException -> 0x0204 }
            r2.a(r3, r6, r7)     // Catch:{ IllegalStateException -> 0x0204 }
            goto L_0x0216
        L_0x0204:
            r2 = move-exception
            com.google.android.gms.measurement.internal.Bb r3 = r11.h()
            com.google.android.gms.measurement.internal.Db r3 = r3.t()
            java.lang.Object r0 = com.google.android.gms.measurement.internal.Bb.a((java.lang.String) r0)
            java.lang.String r6 = "getGoogleAppId or isMeasurementEnabled failed with exception. appId"
            r3.a(r6, r0, r2)
        L_0x0216:
            r0 = 0
            r11.j = r0
            com.google.android.gms.measurement.internal.Ie r0 = r11.m()
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C3202q.ma
            boolean r0 = r0.a((com.google.android.gms.measurement.internal.C3204qb<java.lang.Boolean>) r2)
            if (r0 == 0) goto L_0x026a
            r11.i()
            com.google.android.gms.measurement.internal.Ie r0 = r11.m()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.c(r2)
            if (r0 == 0) goto L_0x0266
            int r2 = r0.size()
            if (r2 != 0) goto L_0x0249
            com.google.android.gms.measurement.internal.Bb r2 = r11.h()
            com.google.android.gms.measurement.internal.Db r2 = r2.w()
            java.lang.String r3 = "Safelisted event list cannot be empty. Ignoring"
            r2.a(r3)
        L_0x0247:
            r5 = 0
            goto L_0x0266
        L_0x0249:
            java.util.Iterator r2 = r0.iterator()
        L_0x024d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0266
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.measurement.internal.se r6 = r11.k()
            java.lang.String r7 = "safelisted event"
            boolean r3 = r6.b((java.lang.String) r7, (java.lang.String) r3)
            if (r3 != 0) goto L_0x024d
            goto L_0x0247
        L_0x0266:
            if (r5 == 0) goto L_0x026a
            r11.j = r0
        L_0x026a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 < r2) goto L_0x0280
            if (r1 == 0) goto L_0x027d
            android.content.Context r0 = r11.f()
            boolean r0 = c.b.b.b.b.c.a.a(r0)
            r11.k = r0
            return
        L_0x027d:
            r11.k = r4
            return
        L_0x0280:
            r11.k = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3223ub.v():void");
    }
}
