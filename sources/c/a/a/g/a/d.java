package c.a.a.g.a;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import c.a.a.g.b.b;

public abstract class d<Z> extends i<ImageView, Z> implements b.a {
    private Animatable i;

    public d(ImageView imageView) {
        super(imageView);
    }

    private void b(Z z) {
        if (z instanceof Animatable) {
            this.i = (Animatable) z;
            this.i.start();
            return;
        }
        this.i = null;
    }

    private void c(Z z) {
        a(z);
        b(z);
    }

    public void a(Drawable drawable) {
        super.a(drawable);
        c((Object) null);
        d(drawable);
    }

    /* access modifiers changed from: protected */
    public abstract void a(Z z);

    public void a(Z z, b<? super Z> bVar) {
        if (bVar == null || !bVar.a(z, this)) {
            c(z);
        } else {
            b(z);
        }
    }

    public void b(Drawable drawable) {
        super.b(drawable);
        c((Object) null);
        d(drawable);
    }

    public void c(Drawable drawable) {
        super.c(drawable);
        Animatable animatable = this.i;
        if (animatable != null) {
            animatable.stop();
        }
        c((Object) null);
        d(drawable);
    }

    public void d(Drawable drawable) {
        ((ImageView) this.f3577d).setImageDrawable(drawable);
    }

    public void m() {
        Animatable animatable = this.i;
        if (animatable != null) {
            animatable.start();
        }
    }

    public void n() {
        Animatable animatable = this.i;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
