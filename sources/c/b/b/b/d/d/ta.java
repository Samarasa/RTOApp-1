package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class ta extends a {
    public static final Parcelable.Creator<ta> CREATOR = new sa();

    /* renamed from: a  reason: collision with root package name */
    private final String f4048a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4049b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4050c;

    /* renamed from: d  reason: collision with root package name */
    private final long f4051d;

    public ta(String str, String str2, String str3, long j) {
        this.f4048a = str;
        C0563t.b(str2);
        this.f4049b = str2;
        this.f4050c = str3;
        this.f4051d = j;
    }

    public final String a() {
        return this.f4048a;
    }

    public final String b() {
        return this.f4049b;
    }

    public final String g() {
        return this.f4050c;
    }

    public final long h() {
        return this.f4051d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f4048a, false);
        c.a(parcel, 2, this.f4049b, false);
        c.a(parcel, 3, this.f4050c, false);
        c.a(parcel, 4, this.f4051d);
        c.a(parcel, a2);
    }
}
