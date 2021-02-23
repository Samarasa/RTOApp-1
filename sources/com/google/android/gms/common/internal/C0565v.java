package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.b.C0254b;
import com.google.android.gms.common.internal.C0557m;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.common.internal.v  reason: case insensitive filesystem */
public class C0565v extends a {
    public static final Parcelable.Creator<C0565v> CREATOR = new C();

    /* renamed from: a  reason: collision with root package name */
    private final int f5997a;

    /* renamed from: b  reason: collision with root package name */
    private IBinder f5998b;

    /* renamed from: c  reason: collision with root package name */
    private C0254b f5999c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6000d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6001e;

    C0565v(int i, IBinder iBinder, C0254b bVar, boolean z, boolean z2) {
        this.f5997a = i;
        this.f5998b = iBinder;
        this.f5999c = bVar;
        this.f6000d = z;
        this.f6001e = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0565v)) {
            return false;
        }
        C0565v vVar = (C0565v) obj;
        return this.f5999c.equals(vVar.f5999c) && g().equals(vVar.g());
    }

    public C0557m g() {
        return C0557m.a.a(this.f5998b);
    }

    public C0254b h() {
        return this.f5999c;
    }

    public boolean i() {
        return this.f6000d;
    }

    public boolean j() {
        return this.f6001e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f5997a);
        c.a(parcel, 2, this.f5998b, false);
        c.a(parcel, 3, (Parcelable) h(), i, false);
        c.a(parcel, 4, i());
        c.a(parcel, 5, j());
        c.a(parcel, a2);
    }
}
