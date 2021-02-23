package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.fqa  reason: case insensitive filesystem */
public final class C1682fqa extends a {
    public static final Parcelable.Creator<C1682fqa> CREATOR = new C1611eqa();

    /* renamed from: a  reason: collision with root package name */
    public final String f10466a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10467b;

    public C1682fqa(String str, String str2) {
        this.f10466a = str;
        this.f10467b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f10466a, false);
        c.a(parcel, 2, this.f10467b, false);
        c.a(parcel, a2);
    }
}
