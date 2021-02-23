package c.a.a.c.c.a;

import c.a.a.c.c.l;
import c.a.a.c.c.u;
import c.a.a.c.c.v;
import c.a.a.c.c.y;
import c.a.a.c.k;
import java.io.InputStream;
import java.net.URL;

public class e implements u<URL, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final u<l, InputStream> f3280a;

    public static class a implements v<URL, InputStream> {
        public u<URL, InputStream> a(y yVar) {
            return new e(yVar.a(l.class, InputStream.class));
        }
    }

    public e(u<l, InputStream> uVar) {
        this.f3280a = uVar;
    }

    public u.a<InputStream> a(URL url, int i, int i2, k kVar) {
        return this.f3280a.a(new l(url), i, i2, kVar);
    }

    public boolean a(URL url) {
        return true;
    }
}
