package androidx.appcompat.app;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;

class G implements Toolbar.c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ H f143a;

    G(H h2) {
        this.f143a = h2;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        return this.f143a.f146c.onMenuItemSelected(0, menuItem);
    }
}
