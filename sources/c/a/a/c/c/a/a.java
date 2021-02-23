package c.a.a.c.c.a;

import c.a.a.c.c.l;
import c.a.a.c.c.t;
import c.a.a.c.c.u;
import c.a.a.c.c.v;
import c.a.a.c.c.y;
import c.a.a.c.j;
import c.a.a.c.k;
import java.io.InputStream;

public class a implements u<l, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public static final j<Integer> f3269a = j.a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: b  reason: collision with root package name */
    private final t<l, l> f3270b;

    /* renamed from: c.a.a.c.c.a.a$a  reason: collision with other inner class name */
    public static class C0049a implements v<l, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final t<l, l> f3271a = new t<>(500);

        public u<l, InputStream> a(y yVar) {
            return new a(this.f3271a);
        }
    }

    public a(t<l, l> tVar) {
        this.f3270b = tVar;
    }

    public u.a<InputStream> a(l lVar, int i, int i2, k kVar) {
        t<l, l> tVar = this.f3270b;
        if (tVar != null) {
            l a2 = tVar.a(lVar, 0, 0);
            if (a2 == null) {
                this.f3270b.a(lVar, 0, 0, lVar);
            } else {
                lVar = a2;
            }
        }
        return new u.a<>(lVar, new c.a.a.c.a.k(lVar, ((Integer) kVar.a(f3269a)).intValue()));
    }

    public boolean a(l lVar) {
        return true;
    }
}
