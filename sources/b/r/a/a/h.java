package b.r.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import b.h.a.a.i;
import b.h.b.b;
import org.xmlpull.v1.XmlPullParser;

public class h implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private float[] f2830a;

    /* renamed from: b  reason: collision with root package name */
    private float[] f2831b;

    public h(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a2 = i.a(resources, theme, attributeSet, a.l);
        a(a2, xmlPullParser);
        a2.recycle();
    }

    private void a(float f2, float f3) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f2, f3, 1.0f, 1.0f);
        a(path);
    }

    private void a(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f2, f3, f4, f5, 1.0f, 1.0f);
        a(path);
    }

    private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (i.a(xmlPullParser, "pathData")) {
            String a2 = i.a(typedArray, xmlPullParser, "pathData", 4);
            Path b2 = b.b(a2);
            if (b2 != null) {
                a(b2);
                return;
            }
            throw new InflateException("The path is null, which is created from " + a2);
        } else if (!i.a(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (i.a(xmlPullParser, "controlY1")) {
            float a3 = i.a(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float a4 = i.a(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean a5 = i.a(xmlPullParser, "controlX2");
            if (a5 != i.a(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!a5) {
                a(a3, a4);
            } else {
                a(a3, a4, i.a(typedArray, xmlPullParser, "controlX2", 2, 0.0f), i.a(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    private void a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f2830a = new float[min];
            this.f2831b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, (float[]) null);
                this.f2830a[i2] = fArr[0];
                this.f2831b[i2] = fArr[1];
            }
            if (((double) Math.abs(this.f2830a[0])) <= 1.0E-5d && ((double) Math.abs(this.f2831b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.f2830a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f2831b[i3] - 1.0f)) <= 1.0E-5d) {
                    int i4 = 0;
                    float f2 = 0.0f;
                    while (i < min) {
                        float[] fArr2 = this.f2830a;
                        int i5 = i4 + 1;
                        float f3 = fArr2[i4];
                        if (f3 >= f2) {
                            fArr2[i] = f3;
                            i++;
                            f2 = f3;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f3);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb.append(this.f2830a[0]);
            sb.append(",");
            sb.append(this.f2831b[0]);
            sb.append(" end:");
            int i6 = min - 1;
            sb.append(this.f2830a[i6]);
            sb.append(",");
            sb.append(this.f2831b[i6]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f2830a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f2 < this.f2830a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f2830a;
        float f3 = fArr[length] - fArr[i];
        if (f3 == 0.0f) {
            return this.f2831b[i];
        }
        float[] fArr2 = this.f2831b;
        float f4 = fArr2[i];
        return f4 + (((f2 - fArr[i]) / f3) * (fArr2[length] - f4));
    }
}
