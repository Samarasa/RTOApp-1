package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.zj  reason: case insensitive filesystem */
public final class C3085zj extends C2163mj {

    /* renamed from: a  reason: collision with root package name */
    private final String f13101a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13102b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3085zj(C1809hj hjVar) {
        this(hjVar != null ? hjVar.f10714a : BuildConfig.FLAVOR, hjVar != null ? hjVar.f10715b : 1);
    }

    public C3085zj(String str, int i) {
        this.f13101a = str;
        this.f13102b = i;
    }

    public final int F() {
        return this.f13102b;
    }

    public final String getType() {
        return this.f13101a;
    }
}
