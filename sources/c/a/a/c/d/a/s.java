package c.a.a.c.d.a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import c.a.a.c.b.A;
import c.a.a.c.b.F;
import c.a.a.i.i;

public final class s implements F<BitmapDrawable>, A {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f3407a;

    /* renamed from: b  reason: collision with root package name */
    private final F<Bitmap> f3408b;

    private s(Resources resources, F<Bitmap> f2) {
        i.a(resources);
        this.f3407a = resources;
        i.a(f2);
        this.f3408b = f2;
    }

    public static F<BitmapDrawable> a(Resources resources, F<Bitmap> f2) {
        if (f2 == null) {
            return null;
        }
        return new s(resources, f2);
    }

    public void a() {
        this.f3408b.a();
    }

    public int b() {
        return this.f3408b.b();
    }

    public Class<BitmapDrawable> c() {
        return BitmapDrawable.class;
    }

    public BitmapDrawable get() {
        return new BitmapDrawable(this.f3407a, this.f3408b.get());
    }

    public void p() {
        F<Bitmap> f2 = this.f3408b;
        if (f2 instanceof A) {
            ((A) f2).p();
        }
    }
}
