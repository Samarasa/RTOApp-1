package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class M extends a {
    public static final Parcelable.Creator<M> CREATOR = new N();

    /* renamed from: a  reason: collision with root package name */
    private final String f3973a;

    public M(String str) {
        this.f3973a = str;
    }

    public final String a() {
        return this.f3973a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f3973a, false);
        c.a(parcel, a2);
    }
}
