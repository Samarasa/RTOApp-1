package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.dP  reason: case insensitive filesystem */
public final class C1497dP implements JO<C1567eP> {

    /* renamed from: a  reason: collision with root package name */
    private final C2590sk f10142a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f10143b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10144c;

    /* renamed from: d  reason: collision with root package name */
    private final PackageInfo f10145d;

    public C1497dP(C2590sk skVar, Executor executor, String str, PackageInfo packageInfo) {
        this.f10142a = skVar;
        this.f10143b = executor;
        this.f10144c = str;
        this.f10145d = packageInfo;
    }

    public final LY<C1567eP> a() {
        return DY.a(DY.a(this.f10142a.a(this.f10144c, this.f10145d), C1709gP.f10539a, this.f10143b), Throwable.class, new C1638fP(this), this.f10143b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(Throwable th) {
        return DY.a(new C1567eP(this.f10144c));
    }
}
