package c.b.b.b.b;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import c.b.b.b.c.b;
import com.google.android.gms.common.internal.P;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class x extends a {
    public static final Parcelable.Creator<x> CREATOR = new A();

    /* renamed from: a  reason: collision with root package name */
    private final String f3906a;

    /* renamed from: b  reason: collision with root package name */
    private final r f3907b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3908c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3909d;

    x(String str, IBinder iBinder, boolean z, boolean z2) {
        this.f3906a = str;
        this.f3907b = a(iBinder);
        this.f3908c = z;
        this.f3909d = z2;
    }

    x(String str, r rVar, boolean z, boolean z2) {
        this.f3906a = str;
        this.f3907b = rVar;
        this.f3908c = z;
        this.f3909d = z2;
    }

    private static r a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            c.b.b.b.c.a b2 = P.a(iBinder).b();
            byte[] bArr = b2 == null ? null : (byte[]) b.Q(b2);
            if (bArr != null) {
                return new u(bArr);
            }
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            return null;
        } catch (RemoteException e2) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e2);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f3906a, false);
        r rVar = this.f3907b;
        if (rVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            rVar = null;
        } else {
            rVar.asBinder();
        }
        c.a(parcel, 2, (IBinder) rVar, false);
        c.a(parcel, 3, this.f3908c);
        c.a(parcel, 4, this.f3909d);
        c.a(parcel, a2);
    }
}
