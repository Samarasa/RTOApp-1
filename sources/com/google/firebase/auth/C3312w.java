package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.firebase.auth.w  reason: case insensitive filesystem */
public class C3312w extends a {
    public static final Parcelable.Creator<C3312w> CREATOR = new K();

    C3312w() {
    }

    public static C3312w a() {
        return new C3312w();
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(parcel, c.a(parcel));
    }
}
