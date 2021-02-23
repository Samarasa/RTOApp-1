package c.a.a.c.d.c;

import android.graphics.drawable.Drawable;
import c.a.a.c.b.F;

final class c extends b<Drawable> {
    private c(Drawable drawable) {
        super(drawable);
    }

    static F<Drawable> a(Drawable drawable) {
        if (drawable != null) {
            return new c(drawable);
        }
        return null;
    }

    public void a() {
    }

    public int b() {
        return Math.max(1, this.f3433a.getIntrinsicWidth() * this.f3433a.getIntrinsicHeight() * 4);
    }

    public Class<Drawable> c() {
        return this.f3433a.getClass();
    }
}
