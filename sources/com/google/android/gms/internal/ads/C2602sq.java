package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.sq  reason: case insensitive filesystem */
final class C2602sq implements AY<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2390pq f12147a;

    C2602sq(C2390pq pqVar) {
        this.f12147a = pqVar;
    }

    public final /* synthetic */ void a(Object obj) {
        _S e2 = this.f12147a.f11793g;
        List<String> a2 = this.f12147a.f11792f.a(this.f12147a.f11790d, this.f12147a.f11791e, false, BuildConfig.FLAVOR, (String) obj, this.f12147a.f11791e.f12916c);
        p.c();
        e2.a(a2, (Integer) oa.p(this.f12147a.f11787a) ? C1489dH.f10122b : C1489dH.f10121a);
    }

    public final void a(Throwable th) {
        _S e2 = this.f12147a.f11793g;
        List<String> a2 = this.f12147a.f11792f.a(this.f12147a.f11790d, this.f12147a.f11791e, false, BuildConfig.FLAVOR, "failure_click_attok", this.f12147a.f11791e.f12916c);
        p.c();
        e2.a(a2, (Integer) oa.p(this.f12147a.f11787a) ? C1489dH.f10122b : C1489dH.f10121a);
    }
}
