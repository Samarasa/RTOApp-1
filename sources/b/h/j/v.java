package b.h.j;

import android.view.View;
import b.h.j.y;

class v extends y.b<Boolean> {
    v(int i, Class cls, int i2) {
        super(i, cls, i2);
    }

    /* access modifiers changed from: package-private */
    public Boolean a(View view) {
        return Boolean.valueOf(view.isScreenReaderFocusable());
    }
}
