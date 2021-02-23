package c.a.a.c.d.c;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c.a.a.c.b.A;
import c.a.a.c.b.F;
import c.a.a.c.d.e.c;
import c.a.a.i.i;

public abstract class b<T extends Drawable> implements F<T>, A {

    /* renamed from: a  reason: collision with root package name */
    protected final T f3433a;

    public b(T t) {
        i.a(t);
        this.f3433a = (Drawable) t;
    }

    public final T get() {
        Drawable.ConstantState constantState = this.f3433a.getConstantState();
        return constantState == null ? this.f3433a : constantState.newDrawable();
    }

    public void p() {
        Bitmap c2;
        T t = this.f3433a;
        if (t instanceof BitmapDrawable) {
            c2 = ((BitmapDrawable) t).getBitmap();
        } else if (t instanceof c) {
            c2 = ((c) t).c();
        } else {
            return;
        }
        c2.prepareToDraw();
    }
}
