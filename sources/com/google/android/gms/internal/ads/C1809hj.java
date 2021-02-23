package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.h.b;
import com.google.android.gms.common.internal.C0562s;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import org.json.JSONArray;

/* renamed from: com.google.android.gms.internal.ads.hj  reason: case insensitive filesystem */
public final class C1809hj extends a {
    public static final Parcelable.Creator<C1809hj> CREATOR = new C2021kj();

    /* renamed from: a  reason: collision with root package name */
    public final String f10714a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10715b;

    public C1809hj(b bVar) {
        this(bVar.getType(), bVar.F());
    }

    public C1809hj(String str, int i) {
        this.f10714a = str;
        this.f10715b = i;
    }

    public static C1809hj a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new C1809hj(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1809hj)) {
            C1809hj hjVar = (C1809hj) obj;
            return C0562s.a(this.f10714a, hjVar.f10714a) && C0562s.a(Integer.valueOf(this.f10715b), Integer.valueOf(hjVar.f10715b));
        }
    }

    public final int hashCode() {
        return C0562s.a(this.f10714a, Integer.valueOf(this.f10715b));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f10714a, false);
        c.a(parcel, 3, this.f10715b);
        c.a(parcel, a2);
    }
}
