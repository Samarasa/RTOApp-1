package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import c.b.b.b.d.d.na;
import c.b.b.b.d.d.va;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.firebase.auth.A;
import org.json.JSONException;
import org.json.JSONObject;

public final class z extends a implements A {
    public static final Parcelable.Creator<z> CREATOR = new C();

    /* renamed from: a  reason: collision with root package name */
    private String f14410a;

    /* renamed from: b  reason: collision with root package name */
    private String f14411b;

    /* renamed from: c  reason: collision with root package name */
    private String f14412c;

    /* renamed from: d  reason: collision with root package name */
    private String f14413d;

    /* renamed from: e  reason: collision with root package name */
    private Uri f14414e;

    /* renamed from: f  reason: collision with root package name */
    private String f14415f;

    /* renamed from: g  reason: collision with root package name */
    private String f14416g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f14417h;
    private String i;

    public z(na naVar, String str) {
        C0563t.a(naVar);
        C0563t.b(str);
        String g2 = naVar.g();
        C0563t.b(g2);
        this.f14410a = g2;
        this.f14411b = str;
        this.f14415f = naVar.a();
        this.f14412c = naVar.h();
        Uri i2 = naVar.i();
        if (i2 != null) {
            this.f14413d = i2.toString();
            this.f14414e = i2;
        }
        this.f14417h = naVar.b();
        this.i = null;
        this.f14416g = naVar.j();
    }

    public z(va vaVar) {
        C0563t.a(vaVar);
        this.f14410a = vaVar.a();
        String h2 = vaVar.h();
        C0563t.b(h2);
        this.f14411b = h2;
        this.f14412c = vaVar.b();
        Uri g2 = vaVar.g();
        if (g2 != null) {
            this.f14413d = g2.toString();
            this.f14414e = g2;
        }
        this.f14415f = vaVar.k();
        this.f14416g = vaVar.i();
        this.f14417h = false;
        this.i = vaVar.j();
    }

    public z(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7) {
        this.f14410a = str;
        this.f14411b = str2;
        this.f14415f = str3;
        this.f14416g = str4;
        this.f14412c = str5;
        this.f14413d = str6;
        if (!TextUtils.isEmpty(this.f14413d)) {
            this.f14414e = Uri.parse(this.f14413d);
        }
        this.f14417h = z;
        this.i = str7;
    }

    public static z a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new z(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e2) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new com.google.firebase.auth.a.a(e2);
        }
    }

    public final String a() {
        return this.i;
    }

    public final String b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f14410a);
            jSONObject.putOpt("providerId", this.f14411b);
            jSONObject.putOpt("displayName", this.f14412c);
            jSONObject.putOpt("photoUrl", this.f14413d);
            jSONObject.putOpt("email", this.f14415f);
            jSONObject.putOpt("phoneNumber", this.f14416g);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f14417h));
            jSONObject.putOpt("rawUserInfo", this.i);
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new com.google.firebase.auth.a.a(e2);
        }
    }

    public final String e() {
        return this.f14411b;
    }

    public final String g() {
        return this.f14412c;
    }

    public final String h() {
        return this.f14415f;
    }

    public final String i() {
        return this.f14416g;
    }

    public final String j() {
        return this.f14410a;
    }

    public final boolean k() {
        return this.f14417h;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, j(), false);
        c.a(parcel, 2, e(), false);
        c.a(parcel, 3, g(), false);
        c.a(parcel, 4, this.f14413d, false);
        c.a(parcel, 5, h(), false);
        c.a(parcel, 6, i(), false);
        c.a(parcel, 7, k());
        c.a(parcel, 8, this.i, false);
        c.a(parcel, a2);
    }
}
