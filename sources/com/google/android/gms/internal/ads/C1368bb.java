package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.formats.c;
import com.google.android.gms.common.internal.a.a;

/* renamed from: com.google.android.gms.internal.ads.bb  reason: case insensitive filesystem */
public final class C1368bb extends a {
    public static final Parcelable.Creator<C1368bb> CREATOR = new C1297ab();

    /* renamed from: a  reason: collision with root package name */
    public final int f9909a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9910b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9911c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f9912d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9913e;

    /* renamed from: f  reason: collision with root package name */
    public final C1905j f9914f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f9915g;

    /* renamed from: h  reason: collision with root package name */
    public final int f9916h;

    public C1368bb(int i, boolean z, int i2, boolean z2, int i3, C1905j jVar, boolean z3, int i4) {
        this.f9909a = i;
        this.f9910b = z;
        this.f9911c = i2;
        this.f9912d = z2;
        this.f9913e = i3;
        this.f9914f = jVar;
        this.f9915g = z3;
        this.f9916h = i4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1368bb(c cVar) {
        this(4, cVar.f(), cVar.b(), cVar.e(), cVar.a(), cVar.d() != null ? new C1905j(cVar.d()) : null, cVar.g(), cVar.c());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f9909a);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f9910b);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, this.f9911c);
        com.google.android.gms.common.internal.a.c.a(parcel, 4, this.f9912d);
        com.google.android.gms.common.internal.a.c.a(parcel, 5, this.f9913e);
        com.google.android.gms.common.internal.a.c.a(parcel, 6, (Parcelable) this.f9914f, i, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 7, this.f9915g);
        com.google.android.gms.common.internal.a.c.a(parcel, 8, this.f9916h);
        com.google.android.gms.common.internal.a.c.a(parcel, a2);
    }
}
