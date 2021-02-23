package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.internal.ads.C1582ec;
import com.google.android.gms.internal.ads.C1653fc;
import com.google.android.gms.internal.ads.C2251nra;
import com.google.android.gms.internal.ads.C2322ora;

public final class i extends a {
    public static final Parcelable.Creator<i> CREATOR = new l();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f5424a;

    /* renamed from: b  reason: collision with root package name */
    private final C2322ora f5425b;

    /* renamed from: c  reason: collision with root package name */
    private final IBinder f5426c;

    i(boolean z, IBinder iBinder, IBinder iBinder2) {
        this.f5424a = z;
        this.f5425b = iBinder != null ? C2251nra.a(iBinder) : null;
        this.f5426c = iBinder2;
    }

    public final boolean g() {
        return this.f5424a;
    }

    public final C2322ora h() {
        return this.f5425b;
    }

    public final C1653fc i() {
        return C1582ec.a(this.f5426c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, g());
        C2322ora ora = this.f5425b;
        c.a(parcel, 2, ora == null ? null : ora.asBinder(), false);
        c.a(parcel, 3, this.f5426c, false);
        c.a(parcel, a2);
    }
}
