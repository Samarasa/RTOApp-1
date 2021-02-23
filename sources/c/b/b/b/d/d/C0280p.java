package c.b.b.b.d.d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.b.b.b.d.d.p  reason: case insensitive filesystem */
public class C0280p implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f4032a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4033b;

    protected C0280p(IBinder iBinder, String str) {
        this.f4032a = iBinder;
        this.f4033b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f4033b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f4032a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f4032a;
    }
}
