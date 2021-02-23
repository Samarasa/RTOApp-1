package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.c;
import com.google.firebase.auth.C3307q;
import org.json.JSONException;
import org.json.JSONObject;

public final class F implements C3307q {
    public static final Parcelable.Creator<F> CREATOR = new I();

    /* renamed from: a  reason: collision with root package name */
    private long f14352a;

    /* renamed from: b  reason: collision with root package name */
    private long f14353b;

    public F(long j, long j2) {
        this.f14352a = j;
        this.f14353b = j2;
    }

    public static F a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new F(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final long a() {
        return this.f14353b;
    }

    public final long b() {
        return this.f14352a;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f14352a);
            jSONObject.put("creationTimestamp", this.f14353b);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, b());
        c.a(parcel, 2, a());
        c.a(parcel, a2);
    }
}
