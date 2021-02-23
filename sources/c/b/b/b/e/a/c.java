package c.b.b.b.e.a;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.a.a;

public final class c extends a implements k {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    private final int f4670a;

    /* renamed from: b  reason: collision with root package name */
    private int f4671b;

    /* renamed from: c  reason: collision with root package name */
    private Intent f4672c;

    public c() {
        this(0, (Intent) null);
    }

    c(int i, int i2, Intent intent) {
        this.f4670a = i;
        this.f4671b = i2;
        this.f4672c = intent;
    }

    private c(int i, Intent intent) {
        this(2, 0, (Intent) null);
    }

    public final Status f() {
        return this.f4671b == 0 ? Status.f5755a : Status.f5759e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f4670a);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f4671b);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, (Parcelable) this.f4672c, i, false);
        com.google.android.gms.common.internal.a.c.a(parcel, a2);
    }
}
