package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

public final class YN implements Xga<ZN> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<ApplicationInfo> f9348a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<PackageInfo> f9349b;

    private YN(C1876iha<ApplicationInfo> iha, C1876iha<PackageInfo> iha2) {
        this.f9348a = iha;
        this.f9349b = iha2;
    }

    public static YN a(C1876iha<ApplicationInfo> iha, C1876iha<PackageInfo> iha2) {
        return new YN(iha, iha2);
    }

    public static ZN a(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        return new ZN(applicationInfo, packageInfo);
    }

    public final /* synthetic */ Object get() {
        return a(this.f9348a.get(), this.f9349b.get());
    }
}
