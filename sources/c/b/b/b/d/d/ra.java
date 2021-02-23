package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.util.h;
import com.google.firebase.auth.a.a.Q;
import org.json.JSONException;
import org.json.JSONObject;

public final class ra extends a implements Q<ra, Object> {
    public static final Parcelable.Creator<ra> CREATOR = new qa();

    /* renamed from: a  reason: collision with root package name */
    private String f4041a;

    /* renamed from: b  reason: collision with root package name */
    private String f4042b;

    /* renamed from: c  reason: collision with root package name */
    private Long f4043c;

    /* renamed from: d  reason: collision with root package name */
    private String f4044d;

    /* renamed from: e  reason: collision with root package name */
    private Long f4045e;

    public ra() {
        this.f4045e = Long.valueOf(System.currentTimeMillis());
    }

    ra(String str, String str2, Long l, String str3, Long l2) {
        this.f4041a = str;
        this.f4042b = str2;
        this.f4043c = l;
        this.f4044d = str3;
        this.f4045e = l2;
    }

    public static ra b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            ra raVar = new ra();
            raVar.f4041a = jSONObject.optString("refresh_token", (String) null);
            raVar.f4042b = jSONObject.optString("access_token", (String) null);
            raVar.f4043c = Long.valueOf(jSONObject.optLong("expires_in"));
            raVar.f4044d = jSONObject.optString("token_type", (String) null);
            raVar.f4045e = Long.valueOf(jSONObject.optLong("issued_at"));
            return raVar;
        } catch (JSONException e2) {
            Log.d("GetTokenResponse", "Failed to read GetTokenResponse from JSONObject");
            throw new com.google.firebase.auth.a.a(e2);
        }
    }

    public final void a(String str) {
        C0563t.b(str);
        this.f4041a = str;
    }

    public final boolean b() {
        return h.d().a() + 300000 < this.f4045e.longValue() + (this.f4043c.longValue() * 1000);
    }

    public final String g() {
        return this.f4041a;
    }

    public final String h() {
        return this.f4042b;
    }

    public final long i() {
        Long l = this.f4043c;
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    public final long j() {
        return this.f4045e.longValue();
    }

    public final String k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.f4041a);
            jSONObject.put("access_token", this.f4042b);
            jSONObject.put("expires_in", this.f4043c);
            jSONObject.put("token_type", this.f4044d);
            jSONObject.put("issued_at", this.f4045e);
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.d("GetTokenResponse", "Failed to convert GetTokenResponse to JSON");
            throw new com.google.firebase.auth.a.a(e2);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f4041a, false);
        c.a(parcel, 3, this.f4042b, false);
        c.a(parcel, 4, Long.valueOf(i()), false);
        c.a(parcel, 5, this.f4044d, false);
        c.a(parcel, 6, Long.valueOf(this.f4045e.longValue()), false);
        c.a(parcel, a2);
    }
}
