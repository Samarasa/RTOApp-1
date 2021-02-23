package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.C0490a;
import com.google.android.gms.ads.n;
import com.google.android.gms.ads.u;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.hqa  reason: case insensitive filesystem */
public final class C1824hqa extends a {
    public static final Parcelable.Creator<C1824hqa> CREATOR = new C1753gqa();

    /* renamed from: a  reason: collision with root package name */
    public final int f10744a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10745b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10746c;

    /* renamed from: d  reason: collision with root package name */
    public C1824hqa f10747d;

    /* renamed from: e  reason: collision with root package name */
    public IBinder f10748e;

    public C1824hqa(int i, String str, String str2, C1824hqa hqa, IBinder iBinder) {
        this.f10744a = i;
        this.f10745b = str;
        this.f10746c = str2;
        this.f10747d = hqa;
        this.f10748e = iBinder;
    }

    public final C0490a g() {
        C1824hqa hqa = this.f10747d;
        return new C0490a(this.f10744a, this.f10745b, this.f10746c, hqa == null ? null : new C0490a(hqa.f10744a, hqa.f10745b, hqa.f10746c));
    }

    public final n h() {
        C1824hqa hqa = this.f10747d;
        Nra nra = null;
        C0490a aVar = hqa == null ? null : new C0490a(hqa.f10744a, hqa.f10745b, hqa.f10746c);
        int i = this.f10744a;
        String str = this.f10745b;
        String str2 = this.f10746c;
        IBinder iBinder = this.f10748e;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            nra = queryLocalInterface instanceof Nra ? (Nra) queryLocalInterface : new Pra(iBinder);
        }
        return new n(i, str, str2, aVar, u.a(nra));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f10744a);
        c.a(parcel, 2, this.f10745b, false);
        c.a(parcel, 3, this.f10746c, false);
        c.a(parcel, 4, (Parcelable) this.f10747d, i, false);
        c.a(parcel, 5, this.f10748e, false);
        c.a(parcel, a2);
    }
}
