package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.firebase.auth.C3311v;

public final class S extends a {
    public static final Parcelable.Creator<S> CREATOR = new U();

    /* renamed from: a  reason: collision with root package name */
    private final String f3979a;

    /* renamed from: b  reason: collision with root package name */
    private final C3311v f3980b;

    public S(String str, C3311v vVar) {
        this.f3979a = str;
        this.f3980b = vVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f3979a, false);
        c.a(parcel, 2, (Parcelable) this.f3980b, i, false);
        c.a(parcel, a2);
    }
}
