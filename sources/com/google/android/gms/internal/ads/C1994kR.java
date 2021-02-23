package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.fa;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.kR  reason: case insensitive filesystem */
final class C1994kR implements UW<ZF, C2136mR> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1853iR f11056a;

    C1994kR(C1853iR iRVar) {
        this.f11056a = iRVar;
    }

    public final /* synthetic */ Object apply(Object obj) {
        C1018Rk.b(BuildConfig.FLAVOR, (ZF) obj);
        fa.f("Failed to get a cache key, reverting to legacy flow.");
        C1853iR iRVar = this.f11056a;
        C2136mR unused = iRVar.f10809e = new C2136mR((C2515ri) null, iRVar.b(), (C1994kR) null);
        return this.f11056a.f10809e;
    }
}
