package b.q;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import b.h.j.y;

class aa extends Property<View, Rect> {
    aa(Class cls, String str) {
        super(cls, str);
    }

    /* renamed from: a */
    public Rect get(View view) {
        return y.g(view);
    }

    /* renamed from: a */
    public void set(View view, Rect rect) {
        y.a(view, rect);
    }
}
