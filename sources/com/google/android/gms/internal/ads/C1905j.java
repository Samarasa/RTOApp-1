package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.w;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.j  reason: case insensitive filesystem */
public final class C1905j extends a {
    public static final Parcelable.Creator<C1905j> CREATOR = new C2118m();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10874a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10875b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10876c;

    public C1905j(w wVar) {
        this(wVar.c(), wVar.b(), wVar.a());
    }

    public C1905j(boolean z, boolean z2, boolean z3) {
        this.f10874a = z;
        this.f10875b = z2;
        this.f10876c = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f10874a);
        c.a(parcel, 3, this.f10875b);
        c.a(parcel, 4, this.f10876c);
        c.a(parcel, a2);
    }
}
