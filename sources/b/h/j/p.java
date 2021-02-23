package b.h.j;

import android.view.View;
import android.view.ViewGroup;

public class p {

    /* renamed from: a  reason: collision with root package name */
    private int f2569a;

    /* renamed from: b  reason: collision with root package name */
    private int f2570b;

    public p(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f2569a | this.f2570b;
    }

    public void a(View view, int i) {
        if (i == 1) {
            this.f2570b = 0;
        } else {
            this.f2569a = 0;
        }
    }

    public void a(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    public void a(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f2570b = i;
        } else {
            this.f2569a = i;
        }
    }
}
