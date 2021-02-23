package androidx.appcompat.view.menu;

import android.os.SystemClock;
import android.view.MenuItem;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.C0113ba;

class g implements C0113ba {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f310a;

    g(h hVar) {
        this.f310a = hVar;
    }

    public void a(k kVar, MenuItem menuItem) {
        h.a aVar = null;
        this.f310a.f317h.removeCallbacksAndMessages((Object) null);
        int size = this.f310a.j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (kVar == this.f310a.j.get(i).f319b) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            int i2 = i + 1;
            if (i2 < this.f310a.j.size()) {
                aVar = this.f310a.j.get(i2);
            }
            this.f310a.f317h.postAtTime(new f(this, aVar, menuItem, kVar), kVar, SystemClock.uptimeMillis() + 200);
        }
    }

    public void b(k kVar, MenuItem menuItem) {
        this.f310a.f317h.removeCallbacksAndMessages(kVar);
    }
}
