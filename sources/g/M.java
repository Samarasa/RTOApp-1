package g;

import h.e;
import h.g;
import java.io.Closeable;
import java.nio.charset.Charset;

public abstract class M implements Closeable {
    public static M a(C c2, long j, g gVar) {
        if (gVar != null) {
            return new L(c2, j, gVar);
        }
        throw new NullPointerException("source == null");
    }

    public static M a(C c2, byte[] bArr) {
        e eVar = new e();
        eVar.write(bArr);
        return a(c2, (long) bArr.length, eVar);
    }

    private Charset u() {
        C r = r();
        return r != null ? r.a(g.a.e.j) : g.a.e.j;
    }

    public abstract long a();

    public void close() {
        g.a.e.a((Closeable) s());
    }

    public abstract C r();

    public abstract g s();

    public final String t() {
        g s = s();
        try {
            return s.a(g.a.e.a(s, u()));
        } finally {
            g.a.e.a((Closeable) s);
        }
    }
}
