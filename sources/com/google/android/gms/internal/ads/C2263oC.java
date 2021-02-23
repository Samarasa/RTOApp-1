package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.oC  reason: case insensitive filesystem */
public final class C2263oC implements C1868id {

    /* renamed from: a  reason: collision with root package name */
    private final C1080Tu f11560a;

    /* renamed from: b  reason: collision with root package name */
    private final C1809hj f11561b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11562c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11563d;

    public C2263oC(C1080Tu tu, C2988yS ySVar) {
        this.f11560a = tu;
        this.f11561b = ySVar.l;
        this.f11562c = ySVar.j;
        this.f11563d = ySVar.k;
    }

    public final void M() {
        this.f11560a.aa();
    }

    public final void N() {
        this.f11560a.ba();
    }

    public final void a(C1809hj hjVar) {
        int i;
        String str;
        C1809hj hjVar2 = this.f11561b;
        if (hjVar2 != null) {
            hjVar = hjVar2;
        }
        if (hjVar != null) {
            str = hjVar.f10714a;
            i = hjVar.f10715b;
        } else {
            str = BuildConfig.FLAVOR;
            i = 1;
        }
        this.f11560a.a(new C0834Ki(str, i), this.f11562c, this.f11563d);
    }
}
