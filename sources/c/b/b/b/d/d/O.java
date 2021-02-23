package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class O extends a {
    public static final Parcelable.Creator<O> CREATOR = new Q();

    /* renamed from: a  reason: collision with root package name */
    private final String f3974a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3975b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3976c;

    public O(String str, String str2, String str3) {
        this.f3974a = str;
        this.f3975b = str2;
        this.f3976c = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f3974a, false);
        c.a(parcel, 2, this.f3975b, false);
        c.a(parcel, 3, this.f3976c, false);
        c.a(parcel, a2);
    }
}
