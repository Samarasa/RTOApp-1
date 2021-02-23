package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.hla  reason: case insensitive filesystem */
public final class C1814hla extends C1884ila {
    public static final Parcelable.Creator<C1814hla> CREATOR = new C1743gla();

    /* renamed from: b  reason: collision with root package name */
    private final String f10719b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10720c;

    /* renamed from: d  reason: collision with root package name */
    public final String f10721d;

    C1814hla(Parcel parcel) {
        super("COMM");
        this.f10719b = parcel.readString();
        this.f10720c = parcel.readString();
        this.f10721d = parcel.readString();
    }

    public C1814hla(String str, String str2, String str3) {
        super("COMM");
        this.f10719b = str;
        this.f10720c = str2;
        this.f10721d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1814hla.class == obj.getClass()) {
            C1814hla hla = (C1814hla) obj;
            return Tma.a((Object) this.f10720c, (Object) hla.f10720c) && Tma.a((Object) this.f10719b, (Object) hla.f10719b) && Tma.a((Object) this.f10721d, (Object) hla.f10721d);
        }
    }

    public final int hashCode() {
        String str = this.f10719b;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f10720c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10721d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10835a);
        parcel.writeString(this.f10719b);
        parcel.writeString(this.f10721d);
    }
}
