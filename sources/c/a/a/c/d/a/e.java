package c.a.a.c.d.a;

import android.content.Context;
import android.graphics.Bitmap;
import c.a.a.c;
import c.a.a.c.b.F;
import c.a.a.c.n;
import c.a.a.i.k;

public abstract class e implements n<Bitmap> {
    /* access modifiers changed from: protected */
    public abstract Bitmap a(c.a.a.c.b.a.e eVar, Bitmap bitmap, int i, int i2);

    public final F<Bitmap> a(Context context, F<Bitmap> f2, int i, int i2) {
        if (k.b(i, i2)) {
            c.a.a.c.b.a.e c2 = c.a(context).c();
            Bitmap bitmap = f2.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap a2 = a(c2, bitmap, i, i2);
            return bitmap.equals(a2) ? f2 : d.a(a2, c2);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }
}
