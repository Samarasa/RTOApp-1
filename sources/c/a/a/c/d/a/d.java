package c.a.a.c.d.a;

import android.graphics.Bitmap;
import c.a.a.c.b.A;
import c.a.a.c.b.F;
import c.a.a.c.b.a.e;
import c.a.a.i.i;
import c.a.a.i.k;

public class d implements F<Bitmap>, A {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f3370a;

    /* renamed from: b  reason: collision with root package name */
    private final e f3371b;

    public d(Bitmap bitmap, e eVar) {
        i.a(bitmap, "Bitmap must not be null");
        this.f3370a = bitmap;
        i.a(eVar, "BitmapPool must not be null");
        this.f3371b = eVar;
    }

    public static d a(Bitmap bitmap, e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new d(bitmap, eVar);
    }

    public void a() {
        this.f3371b.a(this.f3370a);
    }

    public int b() {
        return k.a(this.f3370a);
    }

    public Class<Bitmap> c() {
        return Bitmap.class;
    }

    public Bitmap get() {
        return this.f3370a;
    }

    public void p() {
        this.f3370a.prepareToDraw();
    }
}
