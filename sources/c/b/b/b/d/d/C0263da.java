package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.firebase.auth.C3311v;

/* renamed from: c.b.b.b.d.d.da  reason: case insensitive filesystem */
public final class C0263da extends a {
    public static final Parcelable.Creator<C0263da> CREATOR = new C0267fa();

    /* renamed from: a  reason: collision with root package name */
    private final C3311v f3991a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3992b;

    public C0263da(C3311v vVar, String str) {
        this.f3991a = vVar;
        this.f3992b = str;
    }

    public final C3311v a() {
        return this.f3991a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, (Parcelable) this.f3991a, i, false);
        c.a(parcel, 2, this.f3992b, false);
        c.a(parcel, a2);
    }
}
