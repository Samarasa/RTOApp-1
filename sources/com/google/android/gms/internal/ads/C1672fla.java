package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.fla  reason: case insensitive filesystem */
public final class C1672fla extends C1884ila {
    public static final Parcelable.Creator<C1672fla> CREATOR = new C1601ela();

    /* renamed from: b  reason: collision with root package name */
    private final String f10450b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10451c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10452d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f10453e;

    C1672fla(Parcel parcel) {
        super("APIC");
        this.f10450b = parcel.readString();
        this.f10451c = parcel.readString();
        this.f10452d = parcel.readInt();
        this.f10453e = parcel.createByteArray();
    }

    public C1672fla(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f10450b = str;
        this.f10451c = null;
        this.f10452d = 3;
        this.f10453e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1672fla.class == obj.getClass()) {
            C1672fla fla = (C1672fla) obj;
            return this.f10452d == fla.f10452d && Tma.a((Object) this.f10450b, (Object) fla.f10450b) && Tma.a((Object) this.f10451c, (Object) fla.f10451c) && Arrays.equals(this.f10453e, fla.f10453e);
        }
    }

    public final int hashCode() {
        int i = (this.f10452d + 527) * 31;
        String str = this.f10450b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10451c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f10453e);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10450b);
        parcel.writeString(this.f10451c);
        parcel.writeInt(this.f10452d);
        parcel.writeByteArray(this.f10453e);
    }
}
