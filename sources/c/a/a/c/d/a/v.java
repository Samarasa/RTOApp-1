package c.a.a.c.d.a;

import android.graphics.Bitmap;
import c.a.a.c.b.F;
import c.a.a.c.b.a.b;
import c.a.a.c.b.a.e;
import c.a.a.c.d.a.l;
import c.a.a.c.k;
import c.a.a.c.l;
import c.a.a.i.d;
import c.a.a.i.g;
import java.io.IOException;
import java.io.InputStream;

public class v implements l<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final l f3417a;

    /* renamed from: b  reason: collision with root package name */
    private final b f3418b;

    static class a implements l.a {

        /* renamed from: a  reason: collision with root package name */
        private final t f3419a;

        /* renamed from: b  reason: collision with root package name */
        private final d f3420b;

        a(t tVar, d dVar) {
            this.f3419a = tVar;
            this.f3420b = dVar;
        }

        public void a() {
            this.f3419a.a();
        }

        public void a(e eVar, Bitmap bitmap) {
            IOException a2 = this.f3420b.a();
            if (a2 != null) {
                if (bitmap != null) {
                    eVar.a(bitmap);
                }
                throw a2;
            }
        }
    }

    public v(l lVar, b bVar) {
        this.f3417a = lVar;
        this.f3418b = bVar;
    }

    public F<Bitmap> a(InputStream inputStream, int i, int i2, k kVar) {
        t tVar;
        boolean z;
        if (inputStream instanceof t) {
            tVar = (t) inputStream;
            z = false;
        } else {
            tVar = new t(inputStream, this.f3418b);
            z = true;
        }
        d a2 = d.a(tVar);
        try {
            return this.f3417a.a((InputStream) new g(a2), i, i2, kVar, (l.a) new a(tVar, a2));
        } finally {
            a2.r();
            if (z) {
                tVar.r();
            }
        }
    }

    public boolean a(InputStream inputStream, k kVar) {
        return this.f3417a.a(inputStream);
    }
}
