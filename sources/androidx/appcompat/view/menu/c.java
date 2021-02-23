package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import b.h.c.a.b;
import java.util.Iterator;
import java.util.Map;

abstract class c {

    /* renamed from: a  reason: collision with root package name */
    final Context f301a;

    /* renamed from: b  reason: collision with root package name */
    private Map<b, MenuItem> f302b;

    /* renamed from: c  reason: collision with root package name */
    private Map<b.h.c.a.c, SubMenu> f303c;

    c(Context context) {
        this.f301a = context;
    }

    /* access modifiers changed from: package-private */
    public final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b bVar = (b) menuItem;
        if (this.f302b == null) {
            this.f302b = new b.e.b();
        }
        MenuItem menuItem2 = this.f302b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        p pVar = new p(this.f301a, bVar);
        this.f302b.put(bVar, pVar);
        return pVar;
    }

    /* access modifiers changed from: package-private */
    public final SubMenu a(SubMenu subMenu) {
        if (!(subMenu instanceof b.h.c.a.c)) {
            return subMenu;
        }
        b.h.c.a.c cVar = (b.h.c.a.c) subMenu;
        if (this.f303c == null) {
            this.f303c = new b.e.b();
        }
        SubMenu subMenu2 = this.f303c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        B b2 = new B(this.f301a, cVar);
        this.f303c.put(cVar, b2);
        return b2;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        Map<b, MenuItem> map = this.f302b;
        if (map != null) {
            Iterator<b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        Map<b, MenuItem> map = this.f302b;
        if (map != null) {
            map.clear();
        }
        Map<b.h.c.a.c, SubMenu> map2 = this.f303c;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i) {
        Map<b, MenuItem> map = this.f302b;
        if (map != null) {
            Iterator<b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
