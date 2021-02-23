package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: c.b.b.b.d.d.aa  reason: case insensitive filesystem */
public final class C0257aa extends a {
    public static final Parcelable.Creator<C0257aa> CREATOR = new C0261ca();

    /* renamed from: a  reason: collision with root package name */
    private final String f3984a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3985b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3986c;

    public C0257aa(String str, String str2, String str3) {
        this.f3984a = str;
        this.f3985b = str2;
        this.f3986c = str3;
    }

    public final String a() {
        return this.f3984a;
    }

    public final String b() {
        return this.f3985b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f3984a, false);
        c.a(parcel, 2, this.f3985b, false);
        c.a(parcel, 3, this.f3986c, false);
        c.a(parcel, a2);
    }
}
