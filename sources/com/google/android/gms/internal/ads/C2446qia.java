package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.qia  reason: case insensitive filesystem */
public class C2446qia implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f11876a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11877b;

    protected C2446qia(IBinder iBinder, String str) {
        this.f11876a = iBinder;
        this.f11877b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f11876a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f11876a;
    }

    /* access modifiers changed from: protected */
    public final void b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f11876a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final Parcel c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f11877b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void c(int i, Parcel parcel) {
        try {
            this.f11876a.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
