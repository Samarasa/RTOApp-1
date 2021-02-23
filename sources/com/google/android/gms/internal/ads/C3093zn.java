package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.ads.internal.p;

/* renamed from: com.google.android.gms.internal.ads.zn  reason: case insensitive filesystem */
final /* synthetic */ class C3093zn implements C2213nX {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13112a;

    /* renamed from: b  reason: collision with root package name */
    private final C1819ho f13113b;

    /* renamed from: c  reason: collision with root package name */
    private final String f13114c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f13115d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f13116e;

    /* renamed from: f  reason: collision with root package name */
    private final Qba f13117f;

    /* renamed from: g  reason: collision with root package name */
    private final C1862ia f13118g;

    /* renamed from: h  reason: collision with root package name */
    private final C1200Yk f13119h;
    private final T i = null;
    private final k j;
    private final b k;
    private final Soa l;
    private final C2670toa m;
    private final boolean n;
    private final C2988yS o;
    private final DS p;

    C3093zn(Context context, C1819ho hoVar, String str, boolean z, boolean z2, Qba qba, C1862ia iaVar, C1200Yk yk, T t, k kVar, b bVar, Soa soa, C2670toa toa, boolean z3, C2988yS ySVar, DS ds) {
        this.f13112a = context;
        this.f13113b = hoVar;
        this.f13114c = str;
        this.f13115d = z;
        this.f13116e = z2;
        this.f13117f = qba;
        this.f13118g = iaVar;
        this.f13119h = yk;
        this.j = kVar;
        this.k = bVar;
        this.l = soa;
        this.m = toa;
        this.n = z3;
        this.o = ySVar;
        this.p = ds;
    }

    public final Object get() {
        Context context = this.f13112a;
        C1819ho hoVar = this.f13113b;
        String str = this.f13114c;
        boolean z = this.f13115d;
        boolean z2 = this.f13116e;
        Qba qba = this.f13117f;
        C1862ia iaVar = this.f13118g;
        C1200Yk yk = this.f13119h;
        k kVar = this.j;
        b bVar = this.k;
        Soa soa = this.l;
        C2670toa toa = this.m;
        boolean z3 = this.n;
        boolean z4 = z3;
        C0579An an = new C0579An(C0709Fn.a(context, hoVar, str, z, z2, qba, iaVar, yk, (T) null, kVar, bVar, soa, toa, z4, this.o, this.p));
        an.setWebViewClient(p.e().a(an, soa, z2));
        an.setWebChromeClient(new C1746gn(an));
        return an;
    }
}
