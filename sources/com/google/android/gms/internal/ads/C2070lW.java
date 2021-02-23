package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.lW  reason: case insensitive filesystem */
public final class C2070lW extends a {
    public static final Parcelable.Creator<C2070lW> CREATOR = new C2283oW();

    /* renamed from: a  reason: collision with root package name */
    private final int f11177a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f11178b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11179c;

    C2070lW(int i, byte[] bArr, int i2) {
        this.f11177a = i;
        this.f11178b = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f11179c = i2;
    }

    public C2070lW(byte[] bArr, int i) {
        this(1, (byte[]) null, 1);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f11177a);
        c.a(parcel, 2, this.f11178b, false);
        c.a(parcel, 3, this.f11179c);
        c.a(parcel, a2);
    }
}
