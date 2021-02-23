package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;

class Ba implements ActionMenuView.e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Toolbar f418a;

    Ba(Toolbar toolbar) {
        this.f418a = toolbar;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Toolbar.c cVar = this.f418a.G;
        if (cVar != null) {
            return cVar.onMenuItemClick(menuItem);
        }
        return false;
    }
}
