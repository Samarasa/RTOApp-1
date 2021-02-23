package androidx.cardview.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

class a implements g {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f757a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CardView f758b;

    a(CardView cardView) {
        this.f758b = cardView;
    }

    public void a(int i, int i2) {
        CardView cardView = this.f758b;
        if (i > cardView.f753e) {
            a.super.setMinimumWidth(i);
        }
        CardView cardView2 = this.f758b;
        if (i2 > cardView2.f754f) {
            a.super.setMinimumHeight(i2);
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        this.f758b.f756h.set(i, i2, i3, i4);
        CardView cardView = this.f758b;
        Rect rect = cardView.f755g;
        a.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public void a(Drawable drawable) {
        this.f757a = drawable;
        this.f758b.setBackgroundDrawable(drawable);
    }

    public boolean a() {
        return this.f758b.getPreventCornerOverlap();
    }

    public boolean b() {
        return this.f758b.getUseCompatPadding();
    }

    public Drawable c() {
        return this.f757a;
    }

    public View d() {
        return this.f758b;
    }
}
