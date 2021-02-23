package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.ads.internal.p;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.wn  reason: case insensitive filesystem */
final /* synthetic */ class C2880wn implements C2214nY {

    /* renamed from: a  reason: collision with root package name */
    private final Context f12683a;

    /* renamed from: b  reason: collision with root package name */
    private final Qba f12684b;

    /* renamed from: c  reason: collision with root package name */
    private final C1200Yk f12685c;

    /* renamed from: d  reason: collision with root package name */
    private final b f12686d;

    /* renamed from: e  reason: collision with root package name */
    private final String f12687e;

    C2880wn(Context context, Qba qba, C1200Yk yk, b bVar, String str) {
        this.f12683a = context;
        this.f12684b = qba;
        this.f12685c = yk;
        this.f12686d = bVar;
        this.f12687e = str;
    }

    public final LY a(Object obj) {
        Context context = this.f12683a;
        Qba qba = this.f12684b;
        C1200Yk yk = this.f12685c;
        b bVar = this.f12686d;
        String str = this.f12687e;
        p.d();
        C2313on a2 = C2951xn.a(context, C1819ho.b(), BuildConfig.FLAVOR, false, false, qba, (C1862ia) null, yk, (T) null, (k) null, bVar, Soa.a(), (C2670toa) null, false, (C2988yS) null, (DS) null);
        C1813hl c2 = C1813hl.c(a2);
        a2.t().a((Cdo) new C3022yn(c2));
        a2.loadUrl(str);
        return c2;
    }
}
