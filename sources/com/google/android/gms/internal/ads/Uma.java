package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class Uma implements Parcelable {
    public static final Parcelable.Creator<Uma> CREATOR = new Xma();

    /* renamed from: a  reason: collision with root package name */
    public final int f8952a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8953b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8954c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f8955d;

    /* renamed from: e  reason: collision with root package name */
    private int f8956e;

    public Uma(int i, int i2, int i3, byte[] bArr) {
        this.f8952a = i;
        this.f8953b = i2;
        this.f8954c = i3;
        this.f8955d = bArr;
    }

    Uma(Parcel parcel) {
        this.f8952a = parcel.readInt();
        this.f8953b = parcel.readInt();
        this.f8954c = parcel.readInt();
        this.f8955d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Uma.class == obj.getClass()) {
            Uma uma = (Uma) obj;
            return this.f8952a == uma.f8952a && this.f8953b == uma.f8953b && this.f8954c == uma.f8954c && Arrays.equals(this.f8955d, uma.f8955d);
        }
    }

    public final int hashCode() {
        if (this.f8956e == 0) {
            this.f8956e = ((((((this.f8952a + 527) * 31) + this.f8953b) * 31) + this.f8954c) * 31) + Arrays.hashCode(this.f8955d);
        }
        return this.f8956e;
    }

    public final String toString() {
        int i = this.f8952a;
        int i2 = this.f8953b;
        int i3 = this.f8954c;
        boolean z = this.f8955d != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8952a);
        parcel.writeInt(this.f8953b);
        parcel.writeInt(this.f8954c);
        parcel.writeInt(this.f8955d != null ? 1 : 0);
        byte[] bArr = this.f8955d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
