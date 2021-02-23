package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.i;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.q;
import com.google.android.gms.ads.internal.overlay.v;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;

/* renamed from: com.google.android.gms.internal.ads.vI  reason: case insensitive filesystem */
final class C2765vI implements C0876Ly {

    /* renamed from: a  reason: collision with root package name */
    private final Context f12476a;

    /* renamed from: b  reason: collision with root package name */
    private final C1200Yk f12477b;

    /* renamed from: c  reason: collision with root package name */
    private final LY<C1479cy> f12478c;

    /* renamed from: d  reason: collision with root package name */
    private final C2988yS f12479d;

    /* renamed from: e  reason: collision with root package name */
    private final C2313on f12480e;

    private C2765vI(Context context, C1200Yk yk, LY<C1479cy> ly, C2988yS ySVar, C2313on onVar) {
        this.f12476a = context;
        this.f12477b = yk;
        this.f12478c = ly;
        this.f12479d = ySVar;
        this.f12480e = onVar;
    }

    public final void a(boolean z, Context context) {
        this.f12480e.c(true);
        p.c();
        i iVar = new i(false, oa.m(this.f12476a), false, 0.0f, -1, z, this.f12479d.J, false);
        p.b();
        C3109zy i = ((C1479cy) DY.b(this.f12478c)).i();
        C2313on onVar = this.f12480e;
        C2988yS ySVar = this.f12479d;
        int i2 = ySVar.L;
        C1200Yk yk = this.f12477b;
        String str = ySVar.A;
        GS gs = ySVar.r;
        Context context2 = context;
        com.google.android.gms.ads.internal.overlay.p.a(context2, new AdOverlayInfoParcel((C1540dqa) null, (q) i, (v) null, onVar, i2, yk, str, iVar, gs.f7021b, gs.f7020a), true);
    }
}
