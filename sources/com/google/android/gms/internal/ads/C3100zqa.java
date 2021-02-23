package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.zqa  reason: case insensitive filesystem */
public final class C3100zqa extends a {
    public static final Parcelable.Creator<C3100zqa> CREATOR = new C3029yqa();

    /* renamed from: a  reason: collision with root package name */
    public final int f13127a;

    public C3100zqa(int i) {
        this.f13127a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f13127a);
        c.a(parcel, a2);
    }
}
