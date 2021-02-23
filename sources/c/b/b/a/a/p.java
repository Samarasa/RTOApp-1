package c.b.b.a.a;

import android.util.Base64;
import c.b.b.a.a.f;
import c.b.b.a.d;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

public abstract class p {

    public static abstract class a {
        public abstract a a(d dVar);

        public abstract a a(String str);

        public abstract a a(byte[] bArr);

        public abstract p a();
    }

    public static a a() {
        f.a aVar = new f.a();
        aVar.a(d.DEFAULT);
        return aVar;
    }

    public p a(d dVar) {
        a a2 = a();
        a2.a(b());
        a2.a(dVar);
        a2.a(c());
        return a2.a();
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract d d();

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? BuildConfig.FLAVOR : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
