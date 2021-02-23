package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* renamed from: com.google.android.gms.internal.ads.kF  reason: case insensitive filesystem */
public final class C1982kF implements Xga<PackageInfo> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f11037a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<ApplicationInfo> f11038b;

    private C1982kF(C1876iha<Context> iha, C1876iha<ApplicationInfo> iha2) {
        this.f11037a = iha;
        this.f11038b = iha2;
    }

    public static C1982kF a(C1876iha<Context> iha, C1876iha<ApplicationInfo> iha2) {
        return new C1982kF(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return C1274aF.a(this.f11037a.get(), this.f11038b.get());
    }
}
