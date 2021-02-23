package c.b.b.b.d.c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class b implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f3923a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3924b;

    protected b(IBinder iBinder, String str) {
        this.f3923a = iBinder;
        this.f3924b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel Db() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3924b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f3923a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f3923a;
    }
}
