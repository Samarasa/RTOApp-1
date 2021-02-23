package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import c.b.b.b.b.c.b;
import c.b.b.b.b.c.c;
import c.b.b.b.d.f.La;
import com.google.android.gms.common.stats.a;
import java.util.List;

public final class Rb {

    /* renamed from: a  reason: collision with root package name */
    final C3144fc f13402a;

    Rb(C3144fc fcVar) {
        this.f13402a = fcVar;
    }

    private final boolean a() {
        try {
            b a2 = c.a(this.f13402a.f());
            if (a2 != null) {
                return a2.b("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f13402a.h().z().a("Failed to retrieve Package Manager to check Play Store compatibility");
            return false;
        } catch (Exception e2) {
            this.f13402a.h().z().a("Failed to retrieve Play Store version", e2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final Bundle a(String str, La la) {
        this.f13402a.g().c();
        if (la == null) {
            this.f13402a.h().w().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle c2 = la.c(bundle);
            if (c2 != null) {
                return c2;
            }
            this.f13402a.h().t().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e2) {
            this.f13402a.h().t().a("Exception occurred while retrieving the Install Referrer", e2.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        if (str == null || str.isEmpty()) {
            this.f13402a.h().z().a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.f13402a.g().c();
        if (!a()) {
            this.f13402a.h().z().a("Install Referrer Reporter is not available");
            return;
        }
        this.f13402a.h().z().a("Install Referrer Reporter is initializing");
        Ub ub = new Ub(this, str);
        this.f13402a.g().c();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f13402a.f().getPackageManager();
        if (packageManager == null) {
            this.f13402a.h().w().a("Failed to obtain Package Manager to verify binding conditions");
            return;
        }
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.f13402a.h().z().a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ResolveInfo resolveInfo = queryIntentServices.get(0);
        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
        if (serviceInfo != null) {
            String str2 = serviceInfo.packageName;
            if (resolveInfo.serviceInfo.name == null || !"com.android.vending".equals(str2) || !a()) {
                this.f13402a.h().z().a("Play Store missing or incompatible. Version 8.3.73 or later required");
                return;
            }
            try {
                this.f13402a.h().z().a("Install Referrer Service is", a.a().a(this.f13402a.f(), new Intent(intent), ub, 1) ? "available" : "not available");
            } catch (Exception e2) {
                this.f13402a.h().t().a("Exception occurred while binding to Install Referrer Service", e2.getMessage());
            }
        }
    }
}
