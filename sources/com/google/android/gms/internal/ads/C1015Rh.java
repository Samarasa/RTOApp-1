package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Rh  reason: case insensitive filesystem */
public final class C1015Rh extends a {
    public static final Parcelable.Creator<C1015Rh> CREATOR = new C0989Qh();

    /* renamed from: a  reason: collision with root package name */
    public final View f8502a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, WeakReference<View>> f8503b;

    public C1015Rh(IBinder iBinder, IBinder iBinder2) {
        this.f8502a = (View) b.Q(a.C0060a.a(iBinder));
        this.f8503b = (Map) b.Q(a.C0060a.a(iBinder2));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, b.a(this.f8502a).asBinder(), false);
        c.a(parcel, 2, b.a(this.f8503b).asBinder(), false);
        c.a(parcel, a2);
    }
}
