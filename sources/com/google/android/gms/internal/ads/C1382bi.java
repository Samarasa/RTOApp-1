package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.bi  reason: case insensitive filesystem */
public final class C1382bi extends a {
    public static final Parcelable.Creator<C1382bi> CREATOR = new C1594ei();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9947a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f9948b;

    public C1382bi() {
        this(false, Collections.emptyList());
    }

    public C1382bi(boolean z, List<String> list) {
        this.f9947a = z;
        this.f9948b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f9947a);
        c.b(parcel, 3, this.f9948b, false);
        c.a(parcel, a2);
    }
}
