package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.g  reason: case insensitive filesystem */
public final class C1693g extends a {
    public static final Parcelable.Creator<C1693g> CREATOR = new C1835i();

    /* renamed from: a  reason: collision with root package name */
    public final String f10489a;

    public C1693g(com.google.android.gms.ads.i.a aVar) {
        aVar.a();
        throw null;
    }

    C1693g(String str) {
        this.f10489a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 15, this.f10489a, false);
        c.a(parcel, a2);
    }
}
