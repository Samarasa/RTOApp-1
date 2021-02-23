package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.Jd  reason: case insensitive filesystem */
public final class C0803Jd extends a {
    public static final Parcelable.Creator<C0803Jd> CREATOR = new C0777Id();

    /* renamed from: a  reason: collision with root package name */
    public final String f7442a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f7443b;

    public C0803Jd(String str, Bundle bundle) {
        this.f7442a = str;
        this.f7443b = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f7442a, false);
        c.a(parcel, 2, this.f7443b, false);
        c.a(parcel, a2);
    }
}
