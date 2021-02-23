package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.ha;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Xt  reason: case insensitive filesystem */
public final class C1183Xt {

    /* renamed from: a  reason: collision with root package name */
    private final VU f9298a;

    /* renamed from: b  reason: collision with root package name */
    private final C1200Yk f9299b;

    /* renamed from: c  reason: collision with root package name */
    private final ApplicationInfo f9300c;

    /* renamed from: d  reason: collision with root package name */
    private final String f9301d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f9302e;

    /* renamed from: f  reason: collision with root package name */
    private final PackageInfo f9303f;

    /* renamed from: g  reason: collision with root package name */
    private final Qga<LY<String>> f9304g;

    /* renamed from: h  reason: collision with root package name */
    private final ha f9305h;
    private final String i;
    private final MO<Bundle> j;

    public C1183Xt(VU vu, C1200Yk yk, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, Qga<LY<String>> qga, ha haVar, String str2, MO<Bundle> mo) {
        this.f9298a = vu;
        this.f9299b = yk;
        this.f9300c = applicationInfo;
        this.f9301d = str;
        this.f9302e = list;
        this.f9303f = packageInfo;
        this.f9304g = qga;
        this.f9305h = haVar;
        this.i = str2;
        this.j = mo;
    }

    public final LY<Bundle> a() {
        return this.f9298a.a(SU.SIGNALS).a(this.j.a(new Bundle())).a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C2515ri a(LY ly) {
        return new C2515ri((Bundle) ly.get(), this.f9299b, this.f9300c, this.f9301d, this.f9302e, this.f9303f, (String) this.f9304g.get().get(), this.f9305h.a(), this.i, (QT) null, (String) null);
    }

    public final LY<C2515ri> b() {
        LY<Bundle> a2 = a();
        return this.f9298a.a(SU.REQUEST_PARCEL, (LY<?>[]) new LY[]{a2, this.f9304g.get()}).a(new C1333au(this, a2)).a();
    }
}
