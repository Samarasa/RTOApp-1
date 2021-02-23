package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

public final class ZN implements JO<KO<Bundle>>, KO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final ApplicationInfo f9546a;

    /* renamed from: b  reason: collision with root package name */
    private final PackageInfo f9547b;

    ZN(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.f9546a = applicationInfo;
        this.f9547b = packageInfo;
    }

    public final LY<KO<Bundle>> a() {
        return DY.a(this);
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f9546a.packageName;
        PackageInfo packageInfo = this.f9547b;
        String str2 = null;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (valueOf != null) {
            bundle.putInt("vc", valueOf.intValue());
        }
        if (((Boolean) Qqa.e().a(F.ie)).booleanValue()) {
            PackageInfo packageInfo2 = this.f9547b;
            if (packageInfo2 != null) {
                str2 = packageInfo2.versionName;
            }
            if (str2 != null) {
                bundle.putString("vnm", str2);
            }
        }
    }
}
