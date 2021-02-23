package b.q;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

class X implements Y {

    /* renamed from: a  reason: collision with root package name */
    private final ViewOverlay f2725a;

    X(View view) {
        this.f2725a = view.getOverlay();
    }

    public void a(Drawable drawable) {
        this.f2725a.add(drawable);
    }

    public void b(Drawable drawable) {
        this.f2725a.remove(drawable);
    }
}
