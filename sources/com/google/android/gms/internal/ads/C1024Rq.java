package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Rq  reason: case insensitive filesystem */
public final class C1024Rq implements Xga<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2988yS> f8550a;

    private C1024Rq(C1876iha<C2988yS> iha) {
        this.f8550a = iha;
    }

    public static C1024Rq a(C1876iha<C2988yS> iha) {
        return new C1024Rq(iha);
    }

    public final /* synthetic */ Object get() {
        return C0946Oq.a(this.f8550a.get());
    }
}
