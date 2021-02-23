package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import c.b.b.b.d.f.C0467ze;
import c.b.b.b.d.f.Re;

@TargetApi(14)
/* renamed from: com.google.android.gms.measurement.internal.cd  reason: case insensitive filesystem */
final class C3127cd implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Hc f13532a;

    private C3127cd(Hc hc) {
        this.f13532a = hc;
    }

    /* synthetic */ C3127cd(Hc hc, Jc jc) {
        this(hc);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009c A[SYNTHETIC, Splitter:B:33:0x009c] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e4 A[Catch:{ Exception -> 0x01a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f5 A[SYNTHETIC, Splitter:B:49:0x00f5] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0124 A[Catch:{ Exception -> 0x01a7 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0125 A[Catch:{ Exception -> 0x01a7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            r2 = r21
            com.google.android.gms.measurement.internal.Hc r3 = r1.f13532a     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.Ie r3 = r3.m()     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C3202q.za     // Catch:{ Exception -> 0x01a7 }
            boolean r3 = r3.a((com.google.android.gms.measurement.internal.C3204qb<java.lang.Boolean>) r4)     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r4 = "Activity created with data 'referrer' without required params"
            java.lang.String r5 = "utm_medium"
            java.lang.String r6 = "_cis"
            java.lang.String r7 = "utm_source"
            java.lang.String r8 = "utm_campaign"
            java.lang.String r10 = "gclid"
            if (r3 != 0) goto L_0x003f
            com.google.android.gms.measurement.internal.Hc r3 = r1.f13532a     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.Ie r3 = r3.m()     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.C3202q.Ba     // Catch:{ Exception -> 0x01a7 }
            boolean r3 = r3.a((com.google.android.gms.measurement.internal.C3204qb<java.lang.Boolean>) r11)     // Catch:{ Exception -> 0x01a7 }
            if (r3 != 0) goto L_0x003f
            com.google.android.gms.measurement.internal.Hc r3 = r1.f13532a     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.Ie r3 = r3.m()     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.C3202q.Aa     // Catch:{ Exception -> 0x01a7 }
            boolean r3 = r3.a((com.google.android.gms.measurement.internal.C3204qb<java.lang.Boolean>) r11)     // Catch:{ Exception -> 0x01a7 }
            if (r3 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r3 = 0
            goto L_0x0096
        L_0x003f:
            com.google.android.gms.measurement.internal.Hc r3 = r1.f13532a     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.se r3 = r3.k()     // Catch:{ Exception -> 0x01a7 }
            boolean r11 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x01a7 }
            if (r11 == 0) goto L_0x004c
            goto L_0x003d
        L_0x004c:
            boolean r11 = r2.contains(r10)     // Catch:{ Exception -> 0x01a7 }
            if (r11 != 0) goto L_0x0070
            boolean r11 = r2.contains(r8)     // Catch:{ Exception -> 0x01a7 }
            if (r11 != 0) goto L_0x0070
            boolean r11 = r2.contains(r7)     // Catch:{ Exception -> 0x01a7 }
            if (r11 != 0) goto L_0x0070
            boolean r11 = r2.contains(r5)     // Catch:{ Exception -> 0x01a7 }
            if (r11 != 0) goto L_0x0070
            com.google.android.gms.measurement.internal.Bb r3 = r3.h()     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.Db r3 = r3.A()     // Catch:{ Exception -> 0x01a7 }
            r3.a(r4)     // Catch:{ Exception -> 0x01a7 }
            goto L_0x003d
        L_0x0070:
            java.lang.String r11 = "https://google.com/search?"
            java.lang.String r12 = java.lang.String.valueOf(r21)     // Catch:{ Exception -> 0x01a7 }
            int r13 = r12.length()     // Catch:{ Exception -> 0x01a7 }
            if (r13 == 0) goto L_0x0081
            java.lang.String r11 = r11.concat(r12)     // Catch:{ Exception -> 0x01a7 }
            goto L_0x0087
        L_0x0081:
            java.lang.String r12 = new java.lang.String     // Catch:{ Exception -> 0x01a7 }
            r12.<init>(r11)     // Catch:{ Exception -> 0x01a7 }
            r11 = r12
        L_0x0087:
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch:{ Exception -> 0x01a7 }
            android.os.Bundle r3 = r3.a((android.net.Uri) r11)     // Catch:{ Exception -> 0x01a7 }
            if (r3 == 0) goto L_0x0096
            java.lang.String r11 = "referrer"
            r3.putString(r6, r11)     // Catch:{ Exception -> 0x01a7 }
        L_0x0096:
            r11 = 0
            java.lang.String r12 = "_cmp"
            r13 = 1
            if (r18 == 0) goto L_0x00e4
            com.google.android.gms.measurement.internal.Hc r14 = r1.f13532a     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.se r14 = r14.k()     // Catch:{ Exception -> 0x01a7 }
            r15 = r19
            android.os.Bundle r14 = r14.a((android.net.Uri) r15)     // Catch:{ Exception -> 0x01a7 }
            if (r14 == 0) goto L_0x00e5
            java.lang.String r15 = "intent"
            r14.putString(r6, r15)     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.Hc r6 = r1.f13532a     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.Ie r6 = r6.m()     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.C3202q.za     // Catch:{ Exception -> 0x01a7 }
            boolean r6 = r6.a((com.google.android.gms.measurement.internal.C3204qb<java.lang.Boolean>) r15)     // Catch:{ Exception -> 0x01a7 }
            if (r6 == 0) goto L_0x00de
            boolean r6 = r14.containsKey(r10)     // Catch:{ Exception -> 0x01a7 }
            if (r6 != 0) goto L_0x00de
            if (r3 == 0) goto L_0x00de
            boolean r6 = r3.containsKey(r10)     // Catch:{ Exception -> 0x01a7 }
            if (r6 == 0) goto L_0x00de
            java.lang.String r6 = "_cer"
            java.lang.String r15 = "gclid=%s"
            java.lang.Object[] r9 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r16 = r3.getString(r10)     // Catch:{ Exception -> 0x01a7 }
            r9[r11] = r16     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r9 = java.lang.String.format(r15, r9)     // Catch:{ Exception -> 0x01a7 }
            r14.putString(r6, r9)     // Catch:{ Exception -> 0x01a7 }
        L_0x00de:
            com.google.android.gms.measurement.internal.Hc r6 = r1.f13532a     // Catch:{ Exception -> 0x01a7 }
            r6.a((java.lang.String) r0, (java.lang.String) r12, (android.os.Bundle) r14)     // Catch:{ Exception -> 0x01a7 }
            goto L_0x00e5
        L_0x00e4:
            r14 = 0
        L_0x00e5:
            com.google.android.gms.measurement.internal.Hc r6 = r1.f13532a     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.Ie r6 = r6.m()     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C3202q.Ba     // Catch:{ Exception -> 0x01a7 }
            boolean r6 = r6.a((com.google.android.gms.measurement.internal.C3204qb<java.lang.Boolean>) r9)     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r9 = "auto"
            if (r6 == 0) goto L_0x011e
            com.google.android.gms.measurement.internal.Hc r6 = r1.f13532a     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.Ie r6 = r6.m()     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.C3202q.Aa     // Catch:{ Exception -> 0x01a7 }
            boolean r6 = r6.a((com.google.android.gms.measurement.internal.C3204qb<java.lang.Boolean>) r15)     // Catch:{ Exception -> 0x01a7 }
            if (r6 != 0) goto L_0x011e
            if (r3 == 0) goto L_0x011e
            boolean r6 = r3.containsKey(r10)     // Catch:{ Exception -> 0x01a7 }
            if (r6 == 0) goto L_0x011e
            if (r14 == 0) goto L_0x0113
            boolean r6 = r14.containsKey(r10)     // Catch:{ Exception -> 0x01a7 }
            if (r6 != 0) goto L_0x011e
        L_0x0113:
            com.google.android.gms.measurement.internal.Hc r6 = r1.f13532a     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r14 = "_lgclid"
            java.lang.String r15 = r3.getString(r10)     // Catch:{ Exception -> 0x01a7 }
            r6.a((java.lang.String) r9, (java.lang.String) r14, (java.lang.Object) r15, (boolean) r13)     // Catch:{ Exception -> 0x01a7 }
        L_0x011e:
            boolean r6 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x01a7 }
            if (r6 == 0) goto L_0x0125
            return
        L_0x0125:
            com.google.android.gms.measurement.internal.Hc r6 = r1.f13532a     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.Bb r6 = r6.h()     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.Db r6 = r6.A()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r14 = "Activity created with referrer"
            r6.a(r14, r2)     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.Hc r6 = r1.f13532a     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.Ie r6 = r6.m()     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.qb<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.C3202q.Aa     // Catch:{ Exception -> 0x01a7 }
            boolean r6 = r6.a((com.google.android.gms.measurement.internal.C3204qb<java.lang.Boolean>) r14)     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r14 = "_ldl"
            if (r6 == 0) goto L_0x0162
            if (r3 == 0) goto L_0x014c
            com.google.android.gms.measurement.internal.Hc r2 = r1.f13532a     // Catch:{ Exception -> 0x01a7 }
            r2.a((java.lang.String) r0, (java.lang.String) r12, (android.os.Bundle) r3)     // Catch:{ Exception -> 0x01a7 }
            goto L_0x015b
        L_0x014c:
            com.google.android.gms.measurement.internal.Hc r0 = r1.f13532a     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.Bb r0 = r0.h()     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.Db r0 = r0.A()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r3 = "Referrer does not contain valid parameters"
            r0.a(r3, r2)     // Catch:{ Exception -> 0x01a7 }
        L_0x015b:
            com.google.android.gms.measurement.internal.Hc r0 = r1.f13532a     // Catch:{ Exception -> 0x01a7 }
            r2 = 0
            r0.a((java.lang.String) r9, (java.lang.String) r14, (java.lang.Object) r2, (boolean) r13)     // Catch:{ Exception -> 0x01a7 }
            return
        L_0x0162:
            boolean r0 = r2.contains(r10)     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x018b
            boolean r0 = r2.contains(r8)     // Catch:{ Exception -> 0x01a7 }
            if (r0 != 0) goto L_0x018a
            boolean r0 = r2.contains(r7)     // Catch:{ Exception -> 0x01a7 }
            if (r0 != 0) goto L_0x018a
            boolean r0 = r2.contains(r5)     // Catch:{ Exception -> 0x01a7 }
            if (r0 != 0) goto L_0x018a
            java.lang.String r0 = "utm_term"
            boolean r0 = r2.contains(r0)     // Catch:{ Exception -> 0x01a7 }
            if (r0 != 0) goto L_0x018a
            java.lang.String r0 = "utm_content"
            boolean r0 = r2.contains(r0)     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x018b
        L_0x018a:
            r11 = 1
        L_0x018b:
            if (r11 != 0) goto L_0x019b
            com.google.android.gms.measurement.internal.Hc r0 = r1.f13532a     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.Bb r0 = r0.h()     // Catch:{ Exception -> 0x01a7 }
            com.google.android.gms.measurement.internal.Db r0 = r0.A()     // Catch:{ Exception -> 0x01a7 }
            r0.a(r4)     // Catch:{ Exception -> 0x01a7 }
            return
        L_0x019b:
            boolean r0 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x01a7 }
            if (r0 != 0) goto L_0x01a6
            com.google.android.gms.measurement.internal.Hc r0 = r1.f13532a     // Catch:{ Exception -> 0x01a7 }
            r0.a((java.lang.String) r9, (java.lang.String) r14, (java.lang.Object) r2, (boolean) r13)     // Catch:{ Exception -> 0x01a7 }
        L_0x01a6:
            return
        L_0x01a7:
            r0 = move-exception
            com.google.android.gms.measurement.internal.Hc r2 = r1.f13532a
            com.google.android.gms.measurement.internal.Bb r2 = r2.h()
            com.google.android.gms.measurement.internal.Db r2 = r2.t()
            java.lang.String r3 = "Throwable caught in handleReferrerForOnActivityCreated"
            r2.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3127cd.a(boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.f13532a.h().B().a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.f13532a.k();
                        String str = se.a(intent) ? "gs" : "auto";
                        String queryParameter = data.getQueryParameter("referrer");
                        boolean z = bundle == null;
                        if (!Re.b() || !C3202q.Ca.a(null).booleanValue()) {
                            a(z, data, str, queryParameter);
                        } else {
                            this.f13532a.g().a((Runnable) new C3121bd(this, z, data, str, queryParameter));
                        }
                    }
                }
            }
        } catch (Exception e2) {
            this.f13532a.h().t().a("Throwable caught in onActivityCreated", e2);
        } catch (Throwable th) {
            this.f13532a.s().a(activity, bundle);
            throw th;
        }
        this.f13532a.s().a(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f13532a.s().c(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f13532a.s().b(activity);
        Ud u = this.f13532a.u();
        u.g().a((Runnable) new Wd(u, u.j().b()));
    }

    public final void onActivityResumed(Activity activity) {
        if (!C0467ze.b() || !C3202q.X.a(null).booleanValue()) {
            this.f13532a.s().a(activity);
            this.f13532a.u().B();
            return;
        }
        this.f13532a.u().B();
        this.f13532a.s().a(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f13532a.s().b(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
