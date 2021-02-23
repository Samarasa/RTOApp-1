package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.internal.ads.csa;

public final class h extends j {
    public h(Context context) {
        super(context, 0);
        C0563t.a(context, (Object) "Context cannot be null");
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final /* bridge */ /* synthetic */ void a(e eVar) {
        super.a(eVar);
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ c getAdListener() {
        return super.getAdListener();
    }

    public final /* bridge */ /* synthetic */ f getAdSize() {
        return super.getAdSize();
    }

    public final /* bridge */ /* synthetic */ String getAdUnitId() {
        return super.getAdUnitId();
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ String getMediationAdapterClassName() {
        return super.getMediationAdapterClassName();
    }

    public final /* bridge */ /* synthetic */ u getResponseInfo() {
        return super.getResponseInfo();
    }

    public final v getVideoController() {
        csa csa = this.f5670a;
        if (csa != null) {
            return csa.j();
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void setAdListener(c cVar) {
        super.setAdListener(cVar);
    }

    public final /* bridge */ /* synthetic */ void setAdSize(f fVar) {
        super.setAdSize(fVar);
    }

    public final /* bridge */ /* synthetic */ void setAdUnitId(String str) {
        super.setAdUnitId(str);
    }

    public final /* bridge */ /* synthetic */ void setOnPaidEventListener(r rVar) {
        super.setOnPaidEventListener(rVar);
    }
}
