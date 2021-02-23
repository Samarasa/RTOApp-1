package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.lla  reason: case insensitive filesystem */
public final class C2097lla extends C1884ila {
    public static final Parcelable.Creator<C2097lla> CREATOR = new C2026kla();

    /* renamed from: b  reason: collision with root package name */
    private final String f11233b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11234c;

    C2097lla(Parcel parcel) {
        super(parcel.readString());
        this.f11233b = parcel.readString();
        this.f11234c = parcel.readString();
    }

    public C2097lla(String str, String str2, String str3) {
        super(str);
        this.f11233b = null;
        this.f11234c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2097lla.class == obj.getClass()) {
            C2097lla lla = (C2097lla) obj;
            return this.f10835a.equals(lla.f10835a) && Tma.a((Object) this.f11233b, (Object) lla.f11233b) && Tma.a((Object) this.f11234c, (Object) lla.f11234c);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f10835a.hashCode() + 527) * 31;
        String str = this.f11233b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11234c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10835a);
        parcel.writeString(this.f11233b);
        parcel.writeString(this.f11234c);
    }
}
