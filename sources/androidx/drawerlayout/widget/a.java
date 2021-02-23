package androidx.drawerlayout.widget;

import android.view.View;
import android.view.WindowInsets;

class a implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DrawerLayout f1009a;

    a(DrawerLayout drawerLayout) {
        this.f1009a = drawerLayout;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        ((DrawerLayout) view).a((Object) windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
        return windowInsets.consumeSystemWindowInsets();
    }
}
