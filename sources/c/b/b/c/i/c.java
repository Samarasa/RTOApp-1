package c.b.b.c.i;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final View f4791a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4792b = false;

    /* renamed from: c  reason: collision with root package name */
    private int f4793c = 0;

    public c(b bVar) {
        this.f4791a = (View) bVar;
    }

    private void d() {
        ViewParent parent = this.f4791a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).a(this.f4791a);
        }
    }

    public int a() {
        return this.f4793c;
    }

    public void a(int i) {
        this.f4793c = i;
    }

    public void a(Bundle bundle) {
        this.f4792b = bundle.getBoolean("expanded", false);
        this.f4793c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f4792b) {
            d();
        }
    }

    public boolean b() {
        return this.f4792b;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f4792b);
        bundle.putInt("expandedComponentIdHint", this.f4793c);
        return bundle;
    }
}
