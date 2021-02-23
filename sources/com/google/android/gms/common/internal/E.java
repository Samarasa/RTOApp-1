package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.b.d;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class E extends a {
    public static final Parcelable.Creator<E> CREATOR = new D();

    /* renamed from: a  reason: collision with root package name */
    Bundle f5898a;

    /* renamed from: b  reason: collision with root package name */
    d[] f5899b;

    /* renamed from: c  reason: collision with root package name */
    private int f5900c;

    public E() {
    }

    E(Bundle bundle, d[] dVarArr, int i) {
        this.f5898a = bundle;
        this.f5899b = dVarArr;
        this.f5900c = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f5898a, false);
        c.a(parcel, 2, (T[]) this.f5899b, i, false);
        c.a(parcel, 3, this.f5900c);
        c.a(parcel, a2);
    }
}
