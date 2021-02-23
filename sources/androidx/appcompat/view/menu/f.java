package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.appcompat.view.menu.h;

class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h.a f306a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MenuItem f307b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k f308c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ g f309d;

    f(g gVar, h.a aVar, MenuItem menuItem, k kVar) {
        this.f309d = gVar;
        this.f306a = aVar;
        this.f307b = menuItem;
        this.f308c = kVar;
    }

    public void run() {
        h.a aVar = this.f306a;
        if (aVar != null) {
            this.f309d.f310a.B = true;
            aVar.f319b.a(false);
            this.f309d.f310a.B = false;
        }
        if (this.f307b.isEnabled() && this.f307b.hasSubMenu()) {
            this.f308c.a(this.f307b, 4);
        }
    }
}
