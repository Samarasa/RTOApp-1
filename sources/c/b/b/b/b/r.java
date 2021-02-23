package c.b.b.b.b;

import android.os.RemoteException;
import android.util.Log;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.N;
import com.google.android.gms.common.internal.P;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class r extends P {

    /* renamed from: a  reason: collision with root package name */
    private int f3898a;

    protected r(byte[] bArr) {
        C0563t.a(bArr.length == 25);
        this.f3898a = Arrays.hashCode(bArr);
    }

    protected static byte[] c(String str) {
        try {
            return str.getBytes(CharEncoding.ISO_8859_1);
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] a();

    public final a b() {
        return b.a(a());
    }

    public boolean equals(Object obj) {
        a b2;
        if (obj != null && (obj instanceof N)) {
            try {
                N n = (N) obj;
                if (n.l() != hashCode() || (b2 = n.b()) == null) {
                    return false;
                }
                return Arrays.equals(a(), (byte[]) b.Q(b2));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f3898a;
    }

    public final int l() {
        return hashCode();
    }
}
