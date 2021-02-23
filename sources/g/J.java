package g;

import g.a.e;
import h.f;

public abstract class J {
    public static J a(C c2, byte[] bArr) {
        return a(c2, bArr, 0, bArr.length);
    }

    public static J a(C c2, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            e.a((long) bArr.length, (long) i, (long) i2);
            return new I(c2, i2, bArr, i);
        }
        throw new NullPointerException("content == null");
    }

    public abstract long a();

    public abstract void a(f fVar);

    public abstract C b();
}
