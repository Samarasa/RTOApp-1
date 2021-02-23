package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.b.d;
import c.b.b.b.b.f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C0557m;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.common.internal.g  reason: case insensitive filesystem */
public class C0551g extends a {
    public static final Parcelable.Creator<C0551g> CREATOR = new F();

    /* renamed from: a  reason: collision with root package name */
    private final int f5966a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5967b;

    /* renamed from: c  reason: collision with root package name */
    private int f5968c;

    /* renamed from: d  reason: collision with root package name */
    String f5969d;

    /* renamed from: e  reason: collision with root package name */
    IBinder f5970e;

    /* renamed from: f  reason: collision with root package name */
    Scope[] f5971f;

    /* renamed from: g  reason: collision with root package name */
    Bundle f5972g;

    /* renamed from: h  reason: collision with root package name */
    Account f5973h;
    d[] i;
    d[] j;
    private boolean k;
    private int l;

    public C0551g(int i2) {
        this.f5966a = 4;
        this.f5968c = f.f3884a;
        this.f5967b = i2;
        this.k = true;
    }

    C0551g(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, d[] dVarArr, d[] dVarArr2, boolean z, int i5) {
        this.f5966a = i2;
        this.f5967b = i3;
        this.f5968c = i4;
        if ("com.google.android.gms".equals(str)) {
            this.f5969d = "com.google.android.gms";
        } else {
            this.f5969d = str;
        }
        if (i2 < 2) {
            this.f5973h = iBinder != null ? C0545a.a(C0557m.a.a(iBinder)) : null;
        } else {
            this.f5970e = iBinder;
            this.f5973h = account;
        }
        this.f5971f = scopeArr;
        this.f5972g = bundle;
        this.i = dVarArr;
        this.j = dVarArr2;
        this.k = z;
        this.l = i5;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f5966a);
        c.a(parcel, 2, this.f5967b);
        c.a(parcel, 3, this.f5968c);
        c.a(parcel, 4, this.f5969d, false);
        c.a(parcel, 5, this.f5970e, false);
        c.a(parcel, 6, (T[]) this.f5971f, i2, false);
        c.a(parcel, 7, this.f5972g, false);
        c.a(parcel, 8, (Parcelable) this.f5973h, i2, false);
        c.a(parcel, 10, (T[]) this.i, i2, false);
        c.a(parcel, 11, (T[]) this.j, i2, false);
        c.a(parcel, 12, this.k);
        c.a(parcel, 13, this.l);
        c.a(parcel, a2);
    }
}
