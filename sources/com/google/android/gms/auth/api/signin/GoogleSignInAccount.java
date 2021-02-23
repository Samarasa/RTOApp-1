package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private static e f5740a = h.d();

    /* renamed from: b  reason: collision with root package name */
    private final int f5741b;

    /* renamed from: c  reason: collision with root package name */
    private String f5742c;

    /* renamed from: d  reason: collision with root package name */
    private String f5743d;

    /* renamed from: e  reason: collision with root package name */
    private String f5744e;

    /* renamed from: f  reason: collision with root package name */
    private String f5745f;

    /* renamed from: g  reason: collision with root package name */
    private Uri f5746g;

    /* renamed from: h  reason: collision with root package name */
    private String f5747h;
    private long i;
    private String j;
    private List<Scope> k;
    private String l;
    private String m;
    private Set<Scope> n = new HashSet();

    GoogleSignInAccount(int i2, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, List<Scope> list, String str7, String str8) {
        this.f5741b = i2;
        this.f5742c = str;
        this.f5743d = str2;
        this.f5744e = str3;
        this.f5745f = str4;
        this.f5746g = uri;
        this.f5747h = str5;
        this.i = j2;
        this.j = str6;
        this.k = list;
        this.l = str7;
        this.m = str8;
    }

    public static GoogleSignInAccount a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", (String) null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        GoogleSignInAccount a2 = a(jSONObject.optString("id"), jSONObject.optString("tokenId", (String) null), jSONObject.optString("email", (String) null), jSONObject.optString("displayName", (String) null), jSONObject.optString("givenName", (String) null), jSONObject.optString("familyName", (String) null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        a2.f5747h = jSONObject.optString("serverAuthCode", (String) null);
        return a2;
    }

    private static GoogleSignInAccount a(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l2, String str7, Set<Scope> set) {
        long longValue = (l2 == null ? Long.valueOf(f5740a.a() / 1000) : l2).longValue();
        C0563t.b(str7);
        C0563t.a(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, longValue, str7, new ArrayList(set), str5, str6);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.j.equals(this.j) && googleSignInAccount.w().equals(w());
    }

    public Account g() {
        String str = this.f5744e;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public String h() {
        return this.f5745f;
    }

    public int hashCode() {
        return ((this.j.hashCode() + 527) * 31) + w().hashCode();
    }

    public String i() {
        return this.f5744e;
    }

    public String j() {
        return this.m;
    }

    public String k() {
        return this.l;
    }

    public String l() {
        return this.f5742c;
    }

    public String u() {
        return this.f5743d;
    }

    public Uri v() {
        return this.f5746g;
    }

    public Set<Scope> w() {
        HashSet hashSet = new HashSet(this.k);
        hashSet.addAll(this.n);
        return hashSet;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f5741b);
        c.a(parcel, 2, l(), false);
        c.a(parcel, 3, u(), false);
        c.a(parcel, 4, i(), false);
        c.a(parcel, 5, h(), false);
        c.a(parcel, 6, (Parcelable) v(), i2, false);
        c.a(parcel, 7, x(), false);
        c.a(parcel, 8, this.i);
        c.a(parcel, 9, this.j, false);
        c.c(parcel, 10, this.k, false);
        c.a(parcel, 11, k(), false);
        c.a(parcel, 12, j(), false);
        c.a(parcel, a2);
    }

    public String x() {
        return this.f5747h;
    }
}
