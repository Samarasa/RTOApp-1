package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.firebase.auth.C3279d;

/* renamed from: c.b.b.b.d.d.ba  reason: case insensitive filesystem */
public final class C0259ba extends a {
    public static final Parcelable.Creator<C0259ba> CREATOR = new C0265ea();

    /* renamed from: a  reason: collision with root package name */
    private final C3279d f3988a;

    public C0259ba(C3279d dVar) {
        this.f3988a = dVar;
    }

    public final C3279d a() {
        return this.f3988a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, (Parcelable) this.f3988a, i, false);
        c.a(parcel, a2);
    }
}
