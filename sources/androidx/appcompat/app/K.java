package androidx.appcompat.app;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import b.h.j.G;
import b.h.j.y;

class K extends G {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ N f170a;

    K(N n) {
        this.f170a = n;
    }

    public void b(View view) {
        View view2;
        N n = this.f170a;
        if (n.w && (view2 = n.k) != null) {
            view2.setTranslationY(0.0f);
            this.f170a.f180h.setTranslationY(0.0f);
        }
        this.f170a.f180h.setVisibility(8);
        this.f170a.f180h.setTransitioning(false);
        N n2 = this.f170a;
        n2.B = null;
        n2.l();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f170a.f179g;
        if (actionBarOverlayLayout != null) {
            y.F(actionBarOverlayLayout);
        }
    }
}
