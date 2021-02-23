package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.kd  reason: case insensitive filesystem */
public final class C2009kd extends a {
    public static final Parcelable.Creator<C2009kd> CREATOR = new C1938jd();

    /* renamed from: a  reason: collision with root package name */
    private final String f11069a;

    /* renamed from: b  reason: collision with root package name */
    private final String[] f11070b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f11071c;

    C2009kd(String str, String[] strArr, String[] strArr2) {
        this.f11069a = str;
        this.f11070b = strArr;
        this.f11071c = strArr2;
    }

    public static C2009kd a(C1339b<?> bVar) {
        Map<String, String> a2 = bVar.a();
        int size = a2.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry next : a2.entrySet()) {
            strArr[i] = (String) next.getKey();
            strArr2[i] = (String) next.getValue();
            i++;
        }
        return new C2009kd(bVar.d(), strArr, strArr2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f11069a, false);
        c.a(parcel, 2, this.f11070b, false);
        c.a(parcel, 3, this.f11071c, false);
        c.a(parcel, a2);
    }
}
