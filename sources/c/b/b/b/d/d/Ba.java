package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.firebase.auth.a.a.la;

public final class Ba extends a implements la<Object> {
    public static final Parcelable.Creator<Ba> CREATOR = new Ea();

    /* renamed from: a  reason: collision with root package name */
    private String f3945a;

    /* renamed from: b  reason: collision with root package name */
    private String f3946b;

    /* renamed from: c  reason: collision with root package name */
    private String f3947c;

    /* renamed from: d  reason: collision with root package name */
    private String f3948d;

    /* renamed from: e  reason: collision with root package name */
    private String f3949e;

    /* renamed from: f  reason: collision with root package name */
    private String f3950f;

    /* renamed from: g  reason: collision with root package name */
    private String f3951g;

    /* renamed from: h  reason: collision with root package name */
    private String f3952h;
    private boolean i;
    private boolean j;
    private String k;
    private String l;
    private String m;
    private String n;
    private boolean o;
    private String p;

    public Ba() {
        this.i = true;
        this.j = true;
    }

    public Ba(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f3945a = "http://localhost";
        this.f3947c = str;
        this.f3948d = str2;
        this.f3952h = str5;
        this.k = str6;
        this.n = str7;
        this.p = str8;
        this.i = true;
        if (!TextUtils.isEmpty(this.f3947c) || !TextUtils.isEmpty(this.f3948d) || !TextUtils.isEmpty(this.k)) {
            C0563t.b(str3);
            this.f3949e = str3;
            this.f3950f = null;
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f3947c)) {
                sb.append("id_token=");
                sb.append(this.f3947c);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f3948d)) {
                sb.append("access_token=");
                sb.append(this.f3948d);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f3950f)) {
                sb.append("identifier=");
                sb.append(this.f3950f);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f3952h)) {
                sb.append("oauth_token_secret=");
                sb.append(this.f3952h);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.k)) {
                sb.append("code=");
                sb.append(this.k);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(str9)) {
                sb.append("nonce=");
                sb.append(str9);
                sb.append("&");
            }
            sb.append("providerId=");
            sb.append(this.f3949e);
            this.f3951g = sb.toString();
            this.j = true;
            return;
        }
        throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
    }

    Ba(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, String str10, String str11, String str12, boolean z3, String str13) {
        this.f3945a = str;
        this.f3946b = str2;
        this.f3947c = str3;
        this.f3948d = str4;
        this.f3949e = str5;
        this.f3950f = str6;
        this.f3951g = str7;
        this.f3952h = str8;
        this.i = z;
        this.j = z2;
        this.k = str9;
        this.l = str10;
        this.m = str11;
        this.n = str12;
        this.o = z3;
        this.p = str13;
    }

    public final Ba a(String str) {
        this.n = str;
        return this;
    }

    public final Ba a(boolean z) {
        this.j = false;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f3945a, false);
        c.a(parcel, 3, this.f3946b, false);
        c.a(parcel, 4, this.f3947c, false);
        c.a(parcel, 5, this.f3948d, false);
        c.a(parcel, 6, this.f3949e, false);
        c.a(parcel, 7, this.f3950f, false);
        c.a(parcel, 8, this.f3951g, false);
        c.a(parcel, 9, this.f3952h, false);
        c.a(parcel, 10, this.i);
        c.a(parcel, 11, this.j);
        c.a(parcel, 12, this.k, false);
        c.a(parcel, 13, this.l, false);
        c.a(parcel, 14, this.m, false);
        c.a(parcel, 15, this.n, false);
        c.a(parcel, 16, this.o);
        c.a(parcel, 17, this.p, false);
        c.a(parcel, a2);
    }
}
