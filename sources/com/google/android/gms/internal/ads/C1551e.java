package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.t;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.e  reason: case insensitive filesystem */
public final class C1551e extends a {
    public static final Parcelable.Creator<C1551e> CREATOR = new C1764h();

    /* renamed from: a  reason: collision with root package name */
    private final int f10216a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10217b;

    public C1551e(int i, int i2) {
        this.f10216a = i;
        this.f10217b = i2;
    }

    public C1551e(t tVar) {
        this.f10216a = tVar.b();
        this.f10217b = tVar.c();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f10216a);
        c.a(parcel, 2, this.f10217b);
        c.a(parcel, a2);
    }
}
