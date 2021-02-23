package c.b.b.b.d.f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.b.b.b.d.f.a  reason: case insensitive filesystem */
public class C0290a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f4363a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4364b;

    protected C0290a(IBinder iBinder, String str) {
        this.f4363a = iBinder;
        this.f4364b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel Db() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f4364b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f4363a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f4363a;
    }

    /* access modifiers changed from: protected */
    public final void b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f4363a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
