package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.internal.ads.C1824hqa;
import com.google.android.gms.internal.ads.C2000kX;
import com.google.android.gms.internal.ads.C2209nT;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.ads.internal.util.q  reason: case insensitive filesystem */
public final class C0511q extends a {
    public static final Parcelable.Creator<C0511q> CREATOR = new C0512s();

    /* renamed from: a  reason: collision with root package name */
    public final String f5643a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5644b;

    C0511q(String str, int i) {
        this.f5643a = str == null ? BuildConfig.FLAVOR : str;
        this.f5644b = i;
    }

    public static C0511q a(Throwable th) {
        C1824hqa a2 = C2209nT.a(th);
        return new C0511q(C2000kX.b(th.getMessage()) ? a2.f10745b : th.getMessage(), a2.f10744a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f5643a, false);
        c.a(parcel, 2, this.f5644b);
        c.a(parcel, a2);
    }
}
