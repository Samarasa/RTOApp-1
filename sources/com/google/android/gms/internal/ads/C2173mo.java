package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.k;

/* renamed from: com.google.android.gms.internal.ads.mo  reason: case insensitive filesystem */
final /* synthetic */ class C2173mo implements C2213nX {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11381a;

    /* renamed from: b  reason: collision with root package name */
    private final C1819ho f11382b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11383c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11384d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f11385e;

    /* renamed from: f  reason: collision with root package name */
    private final Qba f11386f;

    /* renamed from: g  reason: collision with root package name */
    private final C1862ia f11387g;

    /* renamed from: h  reason: collision with root package name */
    private final C1200Yk f11388h;
    private final T i = null;
    private final k j;
    private final b k;
    private final Soa l;
    private final C2670toa m;
    private final boolean n;
    private final C2988yS o;
    private final DS p;

    C2173mo(Context context, C1819ho hoVar, String str, boolean z, boolean z2, Qba qba, C1862ia iaVar, C1200Yk yk, T t, k kVar, b bVar, Soa soa, C2670toa toa, boolean z3, C2988yS ySVar, DS ds) {
        this.f11381a = context;
        this.f11382b = hoVar;
        this.f11383c = str;
        this.f11384d = z;
        this.f11385e = z2;
        this.f11386f = qba;
        this.f11387g = iaVar;
        this.f11388h = yk;
        this.j = kVar;
        this.k = bVar;
        this.l = soa;
        this.m = toa;
        this.n = z3;
        this.o = ySVar;
        this.p = ds;
    }

    public final Object get() {
        Context context = this.f11381a;
        C1819ho hoVar = this.f11382b;
        String str = this.f11383c;
        boolean z = this.f11384d;
        boolean z2 = this.f11385e;
        Qba qba = this.f11386f;
        C1862ia iaVar = this.f11387g;
        C1200Yk yk = this.f11388h;
        T t = this.i;
        k kVar = this.j;
        b bVar = this.k;
        Soa soa = this.l;
        C2670toa toa = this.m;
        boolean z3 = this.n;
        C2988yS ySVar = this.o;
        DS ds = this.p;
        C1748go goVar = r3;
        C1748go goVar2 = new C1748go();
        C1748go goVar3 = goVar2;
        C1606eo eoVar = r0;
        C1606eo eoVar2 = new C1606eo(context);
        boolean z4 = z2;
        C2386po poVar = new C2386po(eoVar, goVar, hoVar, str, z, z2, qba, iaVar, yk, t, kVar, bVar, soa, toa, z3, ySVar, ds);
        C0579An an = new C0579An(poVar);
        poVar.setWebChromeClient(new C1746gn(an));
        goVar3.a((C2313on) an, z4);
        return an;
    }
}
