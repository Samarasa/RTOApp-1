package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1475cu;

/* renamed from: com.google.android.gms.internal.ads.fR  reason: case insensitive filesystem */
public final class C1640fR<RequestComponentT extends C1475cu<AdT>, AdT> implements C2278oR<RequestComponentT, AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final C2278oR<RequestComponentT, AdT> f10402a;

    /* renamed from: b  reason: collision with root package name */
    private RequestComponentT f10403b;

    public C1640fR(C2278oR<RequestComponentT, AdT> oRVar) {
        this.f10402a = oRVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final synchronized RequestComponentT a() {
        return this.f10403b;
    }

    public final synchronized LY<AdT> a(C2349pR pRVar, C2420qR<RequestComponentT> qRVar) {
        if (pRVar.f11706a != null) {
            this.f10403b = (C1475cu) qRVar.a(pRVar.f11707b).a();
            return this.f10403b.b().b(pRVar.f11706a);
        }
        LY<AdT> a2 = this.f10402a.a(pRVar, qRVar);
        this.f10403b = (C1475cu) this.f10402a.a();
        return a2;
    }
}
