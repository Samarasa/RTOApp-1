package b.q;

import android.view.View;
import android.view.WindowId;

class ja implements ka {

    /* renamed from: a  reason: collision with root package name */
    private final WindowId f2763a;

    ja(View view) {
        this.f2763a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ja) && ((ja) obj).f2763a.equals(this.f2763a);
    }

    public int hashCode() {
        return this.f2763a.hashCode();
    }
}
