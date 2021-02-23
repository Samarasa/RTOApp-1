package com.google.firebase.auth;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.c;
import com.google.firebase.auth.a.a;
import org.json.JSONException;
import org.json.JSONObject;

public final class F extends W {
    public static final Parcelable.Creator<F> CREATOR = new E();

    /* renamed from: a  reason: collision with root package name */
    private final String f14248a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14249b;

    /* renamed from: c  reason: collision with root package name */
    private final long f14250c;

    /* renamed from: d  reason: collision with root package name */
    private final String f14251d;

    public F(String str, String str2, long j, String str3) {
        C0563t.b(str);
        this.f14248a = str;
        this.f14249b = str2;
        this.f14250c = j;
        C0563t.b(str3);
        this.f14251d = str3;
    }

    public static F a(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new F(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f14248a);
            jSONObject.putOpt("displayName", this.f14249b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f14250c));
            jSONObject.putOpt("phoneNumber", this.f14251d);
            return jSONObject;
        } catch (JSONException e2) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new a(e2);
        }
    }

    @SuppressLint({"id"})
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f14248a, false);
        c.a(parcel, 2, this.f14249b, false);
        c.a(parcel, 3, this.f14250c);
        c.a(parcel, 4, this.f14251d, false);
        c.a(parcel, a2);
    }
}
