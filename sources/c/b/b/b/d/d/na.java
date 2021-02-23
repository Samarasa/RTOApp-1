package c.b.b.b.d.d;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.firebase.auth.J;
import java.util.List;

public final class na extends a {
    public static final Parcelable.Creator<na> CREATOR = new oa();

    /* renamed from: a  reason: collision with root package name */
    private String f4023a;

    /* renamed from: b  reason: collision with root package name */
    private String f4024b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4025c;

    /* renamed from: d  reason: collision with root package name */
    private String f4026d;

    /* renamed from: e  reason: collision with root package name */
    private String f4027e;

    /* renamed from: f  reason: collision with root package name */
    private xa f4028f;

    /* renamed from: g  reason: collision with root package name */
    private String f4029g;

    /* renamed from: h  reason: collision with root package name */
    private String f4030h;
    private long i;
    private long j;
    private boolean k;
    private J l;
    private List<ta> m;

    public na() {
        this.f4028f = new xa();
    }

    public na(String str, String str2, boolean z, String str3, String str4, xa xaVar, String str5, String str6, long j2, long j3, boolean z2, J j4, List<ta> list) {
        this.f4023a = str;
        this.f4024b = str2;
        this.f4025c = z;
        this.f4026d = str3;
        this.f4027e = str4;
        this.f4028f = xaVar == null ? new xa() : xa.a(xaVar);
        this.f4029g = str5;
        this.f4030h = str6;
        this.i = j2;
        this.j = j3;
        this.k = z2;
        this.l = j4;
        this.m = list == null ? C0286w.a() : list;
    }

    public final String a() {
        return this.f4024b;
    }

    public final boolean b() {
        return this.f4025c;
    }

    public final String g() {
        return this.f4023a;
    }

    public final String h() {
        return this.f4026d;
    }

    public final Uri i() {
        if (!TextUtils.isEmpty(this.f4027e)) {
            return Uri.parse(this.f4027e);
        }
        return null;
    }

    public final String j() {
        return this.f4030h;
    }

    public final long k() {
        return this.i;
    }

    public final long l() {
        return this.j;
    }

    public final boolean u() {
        return this.k;
    }

    public final List<va> v() {
        return this.f4028f.a();
    }

    public final J w() {
        return this.l;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f4023a, false);
        c.a(parcel, 3, this.f4024b, false);
        c.a(parcel, 4, this.f4025c);
        c.a(parcel, 5, this.f4026d, false);
        c.a(parcel, 6, this.f4027e, false);
        c.a(parcel, 7, (Parcelable) this.f4028f, i2, false);
        c.a(parcel, 8, this.f4029g, false);
        c.a(parcel, 9, this.f4030h, false);
        c.a(parcel, 10, this.i);
        c.a(parcel, 11, this.j);
        c.a(parcel, 12, this.k);
        c.a(parcel, 13, (Parcelable) this.l, i2, false);
        c.c(parcel, 14, this.m, false);
        c.a(parcel, a2);
    }

    public final List<ta> x() {
        return this.m;
    }
}
