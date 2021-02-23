package c.a.a.c.d.a;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import c.a.a.c.b.F;
import c.a.a.c.b.a.e;
import c.a.a.c.c;
import c.a.a.c.k;
import c.a.a.c.m;
import java.io.File;

public class b implements m<BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    private final e f3365a;

    /* renamed from: b  reason: collision with root package name */
    private final m<Bitmap> f3366b;

    public b(e eVar, m<Bitmap> mVar) {
        this.f3365a = eVar;
        this.f3366b = mVar;
    }

    public c a(k kVar) {
        return this.f3366b.a(kVar);
    }

    public boolean a(F<BitmapDrawable> f2, File file, k kVar) {
        return this.f3366b.a(new d(f2.get().getBitmap(), this.f3365a), file, kVar);
    }
}
