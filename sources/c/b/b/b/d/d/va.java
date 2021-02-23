package c.b.b.b.d.d;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class va extends a {
    public static final Parcelable.Creator<va> CREATOR = new ua();

    /* renamed from: a  reason: collision with root package name */
    private String f4052a;

    /* renamed from: b  reason: collision with root package name */
    private String f4053b;

    /* renamed from: c  reason: collision with root package name */
    private String f4054c;

    /* renamed from: d  reason: collision with root package name */
    private String f4055d;

    /* renamed from: e  reason: collision with root package name */
    private String f4056e;

    /* renamed from: f  reason: collision with root package name */
    private String f4057f;

    /* renamed from: g  reason: collision with root package name */
    private String f4058g;

    public va() {
    }

    va(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f4052a = str;
        this.f4053b = str2;
        this.f4054c = str3;
        this.f4055d = str4;
        this.f4056e = str5;
        this.f4057f = str6;
        this.f4058g = str7;
    }

    public final String a() {
        return this.f4052a;
    }

    public final String b() {
        return this.f4053b;
    }

    public final Uri g() {
        if (!TextUtils.isEmpty(this.f4054c)) {
            return Uri.parse(this.f4054c);
        }
        return null;
    }

    public final String h() {
        return this.f4055d;
    }

    public final String i() {
        return this.f4057f;
    }

    public final String j() {
        return this.f4056e;
    }

    public final String k() {
        return this.f4058g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f4052a, false);
        c.a(parcel, 3, this.f4053b, false);
        c.a(parcel, 4, this.f4054c, false);
        c.a(parcel, 5, this.f4055d, false);
        c.a(parcel, 6, this.f4056e, false);
        c.a(parcel, 7, this.f4057f, false);
        c.a(parcel, 8, this.f4058g, false);
        c.a(parcel, a2);
    }
}
