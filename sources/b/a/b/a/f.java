package b.a.b.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import b.a.a;
import b.a.i;
import b.a.j;

public class f extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private static final float f2082a = ((float) Math.toRadians(45.0d));

    /* renamed from: b  reason: collision with root package name */
    private final Paint f2083b = new Paint();

    /* renamed from: c  reason: collision with root package name */
    private float f2084c;

    /* renamed from: d  reason: collision with root package name */
    private float f2085d;

    /* renamed from: e  reason: collision with root package name */
    private float f2086e;

    /* renamed from: f  reason: collision with root package name */
    private float f2087f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2088g;

    /* renamed from: h  reason: collision with root package name */
    private final Path f2089h = new Path();
    private final int i;
    private boolean j = false;
    private float k;
    private float l;
    private int m = 2;

    public f(Context context) {
        this.f2083b.setStyle(Paint.Style.STROKE);
        this.f2083b.setStrokeJoin(Paint.Join.MITER);
        this.f2083b.setStrokeCap(Paint.Cap.BUTT);
        this.f2083b.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, j.DrawerArrowToggle, a.drawerArrowStyle, i.Base_Widget_AppCompat_DrawerArrowToggle);
        a(obtainStyledAttributes.getColor(j.DrawerArrowToggle_color, 0));
        a(obtainStyledAttributes.getDimension(j.DrawerArrowToggle_thickness, 0.0f));
        a(obtainStyledAttributes.getBoolean(j.DrawerArrowToggle_spinBars, true));
        b((float) Math.round(obtainStyledAttributes.getDimension(j.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.i = obtainStyledAttributes.getDimensionPixelSize(j.DrawerArrowToggle_drawableSize, 0);
        this.f2085d = (float) Math.round(obtainStyledAttributes.getDimension(j.DrawerArrowToggle_barLength, 0.0f));
        this.f2084c = (float) Math.round(obtainStyledAttributes.getDimension(j.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f2086e = obtainStyledAttributes.getDimension(j.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private static float a(float f2, float f3, float f4) {
        return f2 + ((f3 - f2) * f4);
    }

    public void a(float f2) {
        if (this.f2083b.getStrokeWidth() != f2) {
            this.f2083b.setStrokeWidth(f2);
            double d2 = (double) (f2 / 2.0f);
            double cos = Math.cos((double) f2082a);
            Double.isNaN(d2);
            this.l = (float) (d2 * cos);
            invalidateSelf();
        }
    }

    public void a(int i2) {
        if (i2 != this.f2083b.getColor()) {
            this.f2083b.setColor(i2);
            invalidateSelf();
        }
    }

    public void a(boolean z) {
        if (this.f2088g != z) {
            this.f2088g = z;
            invalidateSelf();
        }
    }

    public void b(float f2) {
        if (f2 != this.f2087f) {
            this.f2087f = f2;
            invalidateSelf();
        }
    }

    public void b(boolean z) {
        if (this.j != z) {
            this.j = z;
            invalidateSelf();
        }
    }

    public void c(float f2) {
        if (this.k != f2) {
            this.k = f2;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i2 = this.m;
        boolean z = false;
        if (i2 != 0 && (i2 == 1 || (i2 == 3 ? androidx.core.graphics.drawable.a.e(this) == 0 : androidx.core.graphics.drawable.a.e(this) == 1))) {
            z = true;
        }
        float f2 = this.f2084c;
        float a2 = a(this.f2085d, (float) Math.sqrt((double) (f2 * f2 * 2.0f)), this.k);
        float a3 = a(this.f2085d, this.f2086e, this.k);
        float round = (float) Math.round(a(0.0f, this.l, this.k));
        float a4 = a(0.0f, f2082a, this.k);
        double d2 = (double) a2;
        float a5 = a(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.k);
        double d3 = (double) a4;
        double cos = Math.cos(d3);
        Double.isNaN(d2);
        boolean z2 = z;
        float round2 = (float) Math.round(cos * d2);
        double sin = Math.sin(d3);
        Double.isNaN(d2);
        float round3 = (float) Math.round(d2 * sin);
        this.f2089h.rewind();
        float a6 = a(this.f2087f + this.f2083b.getStrokeWidth(), -this.l, this.k);
        float f3 = (-a3) / 2.0f;
        this.f2089h.moveTo(f3 + round, 0.0f);
        this.f2089h.rLineTo(a3 - (round * 2.0f), 0.0f);
        this.f2089h.moveTo(f3, a6);
        this.f2089h.rLineTo(round2, round3);
        this.f2089h.moveTo(f3, -a6);
        this.f2089h.rLineTo(round2, -round3);
        this.f2089h.close();
        canvas.save();
        float strokeWidth = this.f2083b.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth);
        float f4 = this.f2087f;
        canvas2.translate((float) bounds.centerX(), ((float) ((((int) (height - (2.0f * f4))) / 4) * 2)) + (strokeWidth * 1.5f) + f4);
        if (this.f2088g) {
            canvas2.rotate(a5 * ((float) (this.j ^ z2 ? -1 : 1)));
        } else if (z2) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.f2089h, this.f2083b);
        canvas.restore();
    }

    public int getIntrinsicHeight() {
        return this.i;
    }

    public int getIntrinsicWidth() {
        return this.i;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i2) {
        if (i2 != this.f2083b.getAlpha()) {
            this.f2083b.setAlpha(i2);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2083b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
