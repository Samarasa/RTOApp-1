package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C0176b;
import androidx.recyclerview.widget.RecyclerView;

class B implements C0176b.C0017b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RecyclerView f1268a;

    B(RecyclerView recyclerView) {
        this.f1268a = recyclerView;
    }

    public int a() {
        return this.f1268a.getChildCount();
    }

    public View a(int i) {
        return this.f1268a.getChildAt(i);
    }

    public void a(View view) {
        RecyclerView.x g2 = RecyclerView.g(view);
        if (g2 != null) {
            g2.onEnteredHiddenState(this.f1268a);
        }
    }

    public void a(View view, int i) {
        this.f1268a.addView(view, i);
        this.f1268a.a(view);
    }

    public void a(View view, int i, ViewGroup.LayoutParams layoutParams) {
        RecyclerView.x g2 = RecyclerView.g(view);
        if (g2 != null) {
            if (g2.isTmpDetached() || g2.shouldIgnore()) {
                g2.clearTmpDetachFlag();
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + g2 + this.f1268a.i());
            }
        }
        this.f1268a.attachViewToParent(view, i, layoutParams);
    }

    public int b(View view) {
        return this.f1268a.indexOfChild(view);
    }

    public void b() {
        int a2 = a();
        for (int i = 0; i < a2; i++) {
            View a3 = a(i);
            this.f1268a.b(a3);
            a3.clearAnimation();
        }
        this.f1268a.removeAllViews();
    }

    public void b(int i) {
        RecyclerView.x g2;
        View a2 = a(i);
        if (!(a2 == null || (g2 = RecyclerView.g(a2)) == null)) {
            if (!g2.isTmpDetached() || g2.shouldIgnore()) {
                g2.addFlags(256);
            } else {
                throw new IllegalArgumentException("called detach on an already detached child " + g2 + this.f1268a.i());
            }
        }
        this.f1268a.detachViewFromParent(i);
    }

    public RecyclerView.x c(View view) {
        return RecyclerView.g(view);
    }

    public void c(int i) {
        View childAt = this.f1268a.getChildAt(i);
        if (childAt != null) {
            this.f1268a.b(childAt);
            childAt.clearAnimation();
        }
        this.f1268a.removeViewAt(i);
    }

    public void d(View view) {
        RecyclerView.x g2 = RecyclerView.g(view);
        if (g2 != null) {
            g2.onLeftHiddenState(this.f1268a);
        }
    }
}
