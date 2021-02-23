package c.b.b.b.d.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class b implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f3920a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3921b;

    protected b(IBinder iBinder, String str) {
        this.f3920a = iBinder;
        this.f3921b = str;
    }

    /* access modifiers changed from: protected */
    public final void a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f3920a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f3920a;
    }

    /* access modifiers changed from: protected */
    public final Parcel c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3921b);
        return obtain;
    }
}
