package androidx.viewpager.widget;

import android.graphics.Rect;
import android.view.View;
import b.h.j.I;
import b.h.j.q;
import b.h.j.y;

class e implements q {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f1667a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ViewPager f1668b;

    e(ViewPager viewPager) {
        this.f1668b = viewPager;
    }

    public I a(View view, I i) {
        I b2 = y.b(view, i);
        if (b2.g()) {
            return b2;
        }
        Rect rect = this.f1667a;
        rect.left = b2.c();
        rect.top = b2.e();
        rect.right = b2.d();
        rect.bottom = b2.b();
        int childCount = this.f1668b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            I a2 = y.a(this.f1668b.getChildAt(i2), b2);
            rect.left = Math.min(a2.c(), rect.left);
            rect.top = Math.min(a2.e(), rect.top);
            rect.right = Math.min(a2.d(), rect.right);
            rect.bottom = Math.min(a2.b(), rect.bottom);
        }
        return b2.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
