package b.q;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: b.q.w  reason: case insensitive filesystem */
class C0225w<T> extends Property<T, Float> {

    /* renamed from: a  reason: collision with root package name */
    private final Property<T, PointF> f2800a;

    /* renamed from: b  reason: collision with root package name */
    private final PathMeasure f2801b;

    /* renamed from: c  reason: collision with root package name */
    private final float f2802c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f2803d = new float[2];

    /* renamed from: e  reason: collision with root package name */
    private final PointF f2804e = new PointF();

    /* renamed from: f  reason: collision with root package name */
    private float f2805f;

    C0225w(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f2800a = property;
        this.f2801b = new PathMeasure(path, false);
        this.f2802c = this.f2801b.getLength();
    }

    /* renamed from: a */
    public void set(T t, Float f2) {
        this.f2805f = f2.floatValue();
        this.f2801b.getPosTan(this.f2802c * f2.floatValue(), this.f2803d, (float[]) null);
        PointF pointF = this.f2804e;
        float[] fArr = this.f2803d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f2800a.set(t, pointF);
    }

    public Float get(T t) {
        return Float.valueOf(this.f2805f);
    }
}
