package c.a.a.c.d.f;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c.a.a.c.b.F;
import c.a.a.c.b.a.e;
import c.a.a.c.d.a.d;
import c.a.a.c.k;

public final class c implements e<Drawable, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    private final e f3477a;

    /* renamed from: b  reason: collision with root package name */
    private final e<Bitmap, byte[]> f3478b;

    /* renamed from: c  reason: collision with root package name */
    private final e<c.a.a.c.d.e.c, byte[]> f3479c;

    public c(e eVar, e<Bitmap, byte[]> eVar2, e<c.a.a.c.d.e.c, byte[]> eVar3) {
        this.f3477a = eVar;
        this.f3478b = eVar2;
        this.f3479c = eVar3;
    }

    private static F<c.a.a.c.d.e.c> a(F<Drawable> f2) {
        return f2;
    }

    public F<byte[]> a(F<Drawable> f2, k kVar) {
        Drawable drawable = f2.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f3478b.a(d.a(((BitmapDrawable) drawable).getBitmap(), this.f3477a), kVar);
        }
        if (!(drawable instanceof c.a.a.c.d.e.c)) {
            return null;
        }
        e<c.a.a.c.d.e.c, byte[]> eVar = this.f3479c;
        a(f2);
        return eVar.a(f2, kVar);
    }
}
