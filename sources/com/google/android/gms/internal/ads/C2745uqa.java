package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.uqa  reason: case insensitive filesystem */
public final class C2745uqa extends a {
    public static final Parcelable.Creator<C2745uqa> CREATOR = new C2958xqa();

    /* renamed from: a  reason: collision with root package name */
    public String f12443a;

    /* renamed from: b  reason: collision with root package name */
    public long f12444b;

    /* renamed from: c  reason: collision with root package name */
    public C1824hqa f12445c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f12446d;

    public C2745uqa(String str, long j, C1824hqa hqa, Bundle bundle) {
        this.f12443a = str;
        this.f12444b = j;
        this.f12445c = hqa;
        this.f12446d = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f12443a, false);
        c.a(parcel, 2, this.f12444b);
        c.a(parcel, 3, (Parcelable) this.f12445c, i, false);
        c.a(parcel, 4, this.f12446d, false);
        c.a(parcel, a2);
    }
}
