package b.h.j;

import android.view.View;
import android.view.WindowInsets;

class u implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f2574a;

    u(q qVar) {
        this.f2574a = qVar;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return this.f2574a.a(view, I.a(windowInsets)).h();
    }
}
