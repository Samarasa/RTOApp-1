package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Qz  reason: case insensitive filesystem */
public final class C1007Qz implements Xga<C0955Oz> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2988yS> f8439a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<JSONObject> f8440b;

    public C1007Qz(C1876iha<C2988yS> iha, C1876iha<JSONObject> iha2) {
        this.f8439a = iha;
        this.f8440b = iha2;
    }

    public final /* synthetic */ Object get() {
        return new C0955Oz(this.f8439a.get(), this.f8440b.get());
    }
}
