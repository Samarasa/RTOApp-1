package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class P extends a {
    public static final Parcelable.Creator<P> CREATOR = new T();

    /* renamed from: a  reason: collision with root package name */
    private final String f3977a;

    /* renamed from: b  reason: collision with root package name */
    private final Ba f3978b;

    public P(String str, Ba ba) {
        this.f3977a = str;
        this.f3978b = ba;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f3977a, false);
        c.a(parcel, 2, (Parcelable) this.f3978b, i, false);
        c.a(parcel, a2);
    }
}
