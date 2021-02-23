package b.q;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: b.q.d  reason: case insensitive filesystem */
class C0207d extends Property<Drawable, PointF> {

    /* renamed from: a  reason: collision with root package name */
    private Rect f2740a = new Rect();

    C0207d(Class cls, String str) {
        super(cls, str);
    }

    /* renamed from: a */
    public PointF get(Drawable drawable) {
        drawable.copyBounds(this.f2740a);
        Rect rect = this.f2740a;
        return new PointF((float) rect.left, (float) rect.top);
    }

    /* renamed from: a */
    public void set(Drawable drawable, PointF pointF) {
        drawable.copyBounds(this.f2740a);
        this.f2740a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(this.f2740a);
    }
}
