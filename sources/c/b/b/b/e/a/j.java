package c.b.b.b.e.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0564u;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new i();

    /* renamed from: a  reason: collision with root package name */
    private final int f4673a;

    /* renamed from: b  reason: collision with root package name */
    private final C0564u f4674b;

    j(int i, C0564u uVar) {
        this.f4673a = i;
        this.f4674b = uVar;
    }

    public j(C0564u uVar) {
        this(1, uVar);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f4673a);
        c.a(parcel, 2, (Parcelable) this.f4674b, i, false);
        c.a(parcel, a2);
    }
}
