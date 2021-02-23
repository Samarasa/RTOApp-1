package b.q;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

class P implements Q {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroupOverlay f2711a;

    P(ViewGroup viewGroup) {
        this.f2711a = viewGroup.getOverlay();
    }

    public void a(Drawable drawable) {
        this.f2711a.add(drawable);
    }

    public void a(View view) {
        this.f2711a.add(view);
    }

    public void b(Drawable drawable) {
        this.f2711a.remove(drawable);
    }

    public void b(View view) {
        this.f2711a.remove(view);
    }
}
