package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.measurement.internal.o  reason: case insensitive filesystem */
public final class C3192o extends a {
    public static final Parcelable.Creator<C3192o> CREATOR = new r();

    /* renamed from: a  reason: collision with root package name */
    public final String f13696a;

    /* renamed from: b  reason: collision with root package name */
    public final C3187n f13697b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13698c;

    /* renamed from: d  reason: collision with root package name */
    public final long f13699d;

    C3192o(C3192o oVar, long j) {
        C0563t.a(oVar);
        this.f13696a = oVar.f13696a;
        this.f13697b = oVar.f13697b;
        this.f13698c = oVar.f13698c;
        this.f13699d = j;
    }

    public C3192o(String str, C3187n nVar, String str2, long j) {
        this.f13696a = str;
        this.f13697b = nVar;
        this.f13698c = str2;
        this.f13699d = j;
    }

    public final String toString() {
        String str = this.f13698c;
        String str2 = this.f13696a;
        String valueOf = String.valueOf(this.f13697b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f13696a, false);
        c.a(parcel, 3, (Parcelable) this.f13697b, i, false);
        c.a(parcel, 4, this.f13698c, false);
        c.a(parcel, 5, this.f13699d);
        c.a(parcel, a2);
    }
}
