package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.mediation.z;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Rg  reason: case insensitive filesystem */
public final class C1014Rg extends a {
    public static final Parcelable.Creator<C1014Rg> CREATOR = new C1040Sg();

    /* renamed from: a  reason: collision with root package name */
    private final int f8498a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8499b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8500c;

    C1014Rg(int i, int i2, int i3) {
        this.f8498a = i;
        this.f8499b = i2;
        this.f8500c = i3;
    }

    public static C1014Rg a(z zVar) {
        zVar.a();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1014Rg)) {
            C1014Rg rg = (C1014Rg) obj;
            return rg.f8500c == this.f8500c && rg.f8499b == this.f8499b && rg.f8498a == this.f8498a;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f8498a, this.f8499b, this.f8500c});
    }

    public final String toString() {
        int i = this.f8498a;
        int i2 = this.f8499b;
        int i3 = this.f8500c;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f8498a);
        c.a(parcel, 2, this.f8499b);
        c.a(parcel, 3, this.f8500c);
        c.a(parcel, a2);
    }
}
