package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.bla  reason: case insensitive filesystem */
public final class C1389bla implements Parcelable {
    public static final Parcelable.Creator<C1389bla> CREATOR = new C1531dla();

    /* renamed from: a  reason: collision with root package name */
    private final a[] f9956a;

    /* renamed from: com.google.android.gms.internal.ads.bla$a */
    public interface a extends Parcelable {
    }

    C1389bla(Parcel parcel) {
        this.f9956a = new a[parcel.readInt()];
        int i = 0;
        while (true) {
            a[] aVarArr = this.f9956a;
            if (i < aVarArr.length) {
                aVarArr[i] = (a) parcel.readParcelable(a.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public C1389bla(List<? extends a> list) {
        this.f9956a = new a[list.size()];
        list.toArray(this.f9956a);
    }

    public final int a() {
        return this.f9956a.length;
    }

    public final a a(int i) {
        return this.f9956a[i];
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1389bla.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f9956a, ((C1389bla) obj).f9956a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9956a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9956a.length);
        for (a writeParcelable : this.f9956a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
