package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class W extends a {
    public static final Parcelable.Creator<W> CREATOR = new Y();

    /* renamed from: a  reason: collision with root package name */
    private final String f3982a;

    public W(String str) {
        this.f3982a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f3982a, false);
        c.a(parcel, a2);
    }
}
