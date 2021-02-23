package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.jW  reason: case insensitive filesystem */
public final class C1928jW extends a {
    public static final Parcelable.Creator<C1928jW> CREATOR = new C2141mW();

    /* renamed from: a  reason: collision with root package name */
    private final int f10935a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10936b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10937c;

    /* renamed from: d  reason: collision with root package name */
    private final String f10938d;

    /* renamed from: e  reason: collision with root package name */
    private final int f10939e;

    C1928jW(int i, int i2, int i3, String str, String str2) {
        this.f10935a = i;
        this.f10936b = i2;
        this.f10937c = str;
        this.f10938d = str2;
        this.f10939e = i3;
    }

    public C1928jW(int i, C1949jia jia, String str, String str2) {
        this(1, i, jia.a(), str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f10935a);
        c.a(parcel, 2, this.f10936b);
        c.a(parcel, 3, this.f10937c, false);
        c.a(parcel, 4, this.f10938d, false);
        c.a(parcel, 5, this.f10939e);
        c.a(parcel, a2);
    }
}
