package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1475cu;

/* renamed from: com.google.android.gms.internal.ads.gR  reason: case insensitive filesystem */
public final class C1711gR<RequestComponentT extends C1475cu<AdT>, AdT> implements C2278oR<RequestComponentT, AdT> {

    /* renamed from: a  reason: collision with root package name */
    private RequestComponentT f10540a;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final synchronized RequestComponentT a() {
        return this.f10540a;
    }

    public final synchronized LY<AdT> a(C2349pR pRVar, C2420qR<RequestComponentT> qRVar) {
        this.f10540a = (C1475cu) qRVar.a(pRVar.f11707b).a();
        return this.f10540a.b().b();
    }
}
