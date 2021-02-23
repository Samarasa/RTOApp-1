package c.a.a.c.d.a;

import android.graphics.Bitmap;
import c.a.a.c.b.F;
import c.a.a.c.l;
import c.a.a.i.k;

public final class x implements l<Bitmap, Bitmap> {

    private static final class a implements F<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        private final Bitmap f3426a;

        a(Bitmap bitmap) {
            this.f3426a = bitmap;
        }

        public void a() {
        }

        public int b() {
            return k.a(this.f3426a);
        }

        public Class<Bitmap> c() {
            return Bitmap.class;
        }

        public Bitmap get() {
            return this.f3426a;
        }
    }

    public F<Bitmap> a(Bitmap bitmap, int i, int i2, c.a.a.c.k kVar) {
        return new a(bitmap);
    }

    public boolean a(Bitmap bitmap, c.a.a.c.k kVar) {
        return true;
    }
}
