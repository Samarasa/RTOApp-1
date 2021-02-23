package c.a.a.c.d.a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import c.a.a.c.b.F;
import c.a.a.c.b.a.e;
import c.a.a.c.d.c.d;
import c.a.a.c.k;
import c.a.a.c.l;

public class u implements l<Uri, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final d f3415a;

    /* renamed from: b  reason: collision with root package name */
    private final e f3416b;

    public u(d dVar, e eVar) {
        this.f3415a = dVar;
        this.f3416b = eVar;
    }

    public F<Bitmap> a(Uri uri, int i, int i2, k kVar) {
        F<Drawable> a2 = this.f3415a.a(uri, i, i2, kVar);
        if (a2 == null) {
            return null;
        }
        return n.a(this.f3416b, a2.get(), i, i2);
    }

    public boolean a(Uri uri, k kVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
