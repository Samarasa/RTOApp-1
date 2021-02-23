package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.sqa  reason: case insensitive filesystem */
public final class C2603sqa extends a {
    public static final Parcelable.Creator<C2603sqa> CREATOR = new C2816vqa();

    /* renamed from: a  reason: collision with root package name */
    public final int f12148a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12149b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12150c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12151d;

    public C2603sqa(int i, int i2, String str, long j) {
        this.f12148a = i;
        this.f12149b = i2;
        this.f12150c = str;
        this.f12151d = j;
    }

    public static C2603sqa a(JSONObject jSONObject) {
        return new C2603sqa(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f12148a);
        c.a(parcel, 2, this.f12149b);
        c.a(parcel, 3, this.f12150c, false);
        c.a(parcel, 4, this.f12151d);
        c.a(parcel, a2);
    }
}
