package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import com.google.android.gms.ads.internal.i;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.internal.ads.C1200Yk;
import com.google.android.gms.internal.ads.C1540dqa;
import com.google.android.gms.internal.ads.C2313on;
import com.google.android.gms.internal.ads.C2858wc;
import com.google.android.gms.internal.ads.C3071zc;

public final class AdOverlayInfoParcel extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new o();

    /* renamed from: a  reason: collision with root package name */
    public final c f5477a;

    /* renamed from: b  reason: collision with root package name */
    public final C1540dqa f5478b;

    /* renamed from: c  reason: collision with root package name */
    public final q f5479c;

    /* renamed from: d  reason: collision with root package name */
    public final C2313on f5480d;

    /* renamed from: e  reason: collision with root package name */
    public final C3071zc f5481e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5482f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5483g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5484h;
    public final v i;
    public final int j;
    public final int k;
    public final String l;
    public final C1200Yk m;
    public final String n;
    public final i o;
    public final C2858wc p;

    AdOverlayInfoParcel(c cVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i2, int i3, String str3, C1200Yk yk, String str4, i iVar, IBinder iBinder6) {
        this.f5477a = cVar;
        this.f5478b = (C1540dqa) b.Q(a.C0060a.a(iBinder));
        this.f5479c = (q) b.Q(a.C0060a.a(iBinder2));
        this.f5480d = (C2313on) b.Q(a.C0060a.a(iBinder3));
        this.p = (C2858wc) b.Q(a.C0060a.a(iBinder6));
        this.f5481e = (C3071zc) b.Q(a.C0060a.a(iBinder4));
        this.f5482f = str;
        this.f5483g = z;
        this.f5484h = str2;
        this.i = (v) b.Q(a.C0060a.a(iBinder5));
        this.j = i2;
        this.k = i3;
        this.l = str3;
        this.m = yk;
        this.n = str4;
        this.o = iVar;
    }

    public AdOverlayInfoParcel(c cVar, C1540dqa dqa, q qVar, v vVar, C1200Yk yk) {
        this.f5477a = cVar;
        this.f5478b = dqa;
        this.f5479c = qVar;
        this.f5480d = null;
        this.p = null;
        this.f5481e = null;
        this.f5482f = null;
        this.f5483g = false;
        this.f5484h = null;
        this.i = vVar;
        this.j = -1;
        this.k = 4;
        this.l = null;
        this.m = yk;
        this.n = null;
        this.o = null;
    }

    public AdOverlayInfoParcel(C1540dqa dqa, q qVar, v vVar, C2313on onVar, int i2, C1200Yk yk, String str, i iVar, String str2, String str3) {
        this.f5477a = null;
        this.f5478b = null;
        this.f5479c = qVar;
        this.f5480d = onVar;
        this.p = null;
        this.f5481e = null;
        this.f5482f = str2;
        this.f5483g = false;
        this.f5484h = str3;
        this.i = null;
        this.j = i2;
        this.k = 1;
        this.l = null;
        this.m = yk;
        this.n = str;
        this.o = iVar;
    }

    public AdOverlayInfoParcel(C1540dqa dqa, q qVar, v vVar, C2313on onVar, boolean z, int i2, C1200Yk yk) {
        this.f5477a = null;
        this.f5478b = dqa;
        this.f5479c = qVar;
        this.f5480d = onVar;
        this.p = null;
        this.f5481e = null;
        this.f5482f = null;
        this.f5483g = z;
        this.f5484h = null;
        this.i = vVar;
        this.j = i2;
        this.k = 2;
        this.l = null;
        this.m = yk;
        this.n = null;
        this.o = null;
    }

    public AdOverlayInfoParcel(C1540dqa dqa, q qVar, C2858wc wcVar, C3071zc zcVar, v vVar, C2313on onVar, boolean z, int i2, String str, C1200Yk yk) {
        this.f5477a = null;
        this.f5478b = dqa;
        this.f5479c = qVar;
        this.f5480d = onVar;
        this.p = wcVar;
        this.f5481e = zcVar;
        this.f5482f = null;
        this.f5483g = z;
        this.f5484h = null;
        this.i = vVar;
        this.j = i2;
        this.k = 3;
        this.l = str;
        this.m = yk;
        this.n = null;
        this.o = null;
    }

    public AdOverlayInfoParcel(C1540dqa dqa, q qVar, C2858wc wcVar, C3071zc zcVar, v vVar, C2313on onVar, boolean z, int i2, String str, String str2, C1200Yk yk) {
        this.f5477a = null;
        this.f5478b = dqa;
        this.f5479c = qVar;
        this.f5480d = onVar;
        this.p = wcVar;
        this.f5481e = zcVar;
        this.f5482f = str2;
        this.f5483g = z;
        this.f5484h = str;
        this.i = vVar;
        this.j = i2;
        this.k = 3;
        this.l = null;
        this.m = yk;
        this.n = null;
        this.o = null;
    }

    public static AdOverlayInfoParcel a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, (Parcelable) this.f5477a, i2, false);
        c.a(parcel, 3, b.a(this.f5478b).asBinder(), false);
        c.a(parcel, 4, b.a(this.f5479c).asBinder(), false);
        c.a(parcel, 5, b.a(this.f5480d).asBinder(), false);
        c.a(parcel, 6, b.a(this.f5481e).asBinder(), false);
        c.a(parcel, 7, this.f5482f, false);
        c.a(parcel, 8, this.f5483g);
        c.a(parcel, 9, this.f5484h, false);
        c.a(parcel, 10, b.a(this.i).asBinder(), false);
        c.a(parcel, 11, this.j);
        c.a(parcel, 12, this.k);
        c.a(parcel, 13, this.l, false);
        c.a(parcel, 14, (Parcelable) this.m, i2, false);
        c.a(parcel, 16, this.n, false);
        c.a(parcel, 17, (Parcelable) this.o, i2, false);
        c.a(parcel, 18, b.a(this.p).asBinder(), false);
        c.a(parcel, a2);
    }
}
