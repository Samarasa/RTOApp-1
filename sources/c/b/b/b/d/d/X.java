package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class X extends a {
    public static final Parcelable.Creator<X> CREATOR = new Z();

    /* renamed from: a  reason: collision with root package name */
    private final Ba f3983a;

    public X(Ba ba) {
        this.f3983a = ba;
    }

    public final Ba a() {
        return this.f3983a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, (Parcelable) this.f3983a, i, false);
        c.a(parcel, a2);
    }
}
