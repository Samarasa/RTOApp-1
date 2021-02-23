package c.b.b.c.e;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import c.b.b.c.e.f;

public class c extends FrameLayout implements f {

    /* renamed from: a  reason: collision with root package name */
    private final d f4778a;

    public void a() {
        this.f4778a.a();
        throw null;
    }

    public void b() {
        this.f4778a.b();
        throw null;
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        d dVar = this.f4778a;
        if (dVar == null) {
            super.draw(canvas);
        } else {
            dVar.a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f4778a.c();
        throw null;
    }

    public int getCircularRevealScrimColor() {
        this.f4778a.d();
        throw null;
    }

    public f.d getRevealInfo() {
        this.f4778a.e();
        throw null;
    }

    public boolean isOpaque() {
        d dVar = this.f4778a;
        if (dVar == null) {
            return super.isOpaque();
        }
        dVar.f();
        throw null;
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f4778a.a(drawable);
        throw null;
    }

    public void setCircularRevealScrimColor(int i) {
        this.f4778a.a(i);
        throw null;
    }

    public void setRevealInfo(f.d dVar) {
        this.f4778a.a(dVar);
        throw null;
    }
}
