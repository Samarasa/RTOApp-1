package c.b.b.c.n;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f4822a = new int[3];

    /* renamed from: b  reason: collision with root package name */
    private static final float[] f4823b = {0.0f, 0.5f, 1.0f};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f4824c = new int[4];

    /* renamed from: d  reason: collision with root package name */
    private static final float[] f4825d = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: e  reason: collision with root package name */
    private final Paint f4826e;

    /* renamed from: f  reason: collision with root package name */
    private final Paint f4827f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f4828g;

    /* renamed from: h  reason: collision with root package name */
    private int f4829h;
    private int i;
    private int j;
    private final Path k;

    public a() {
        this(-16777216);
    }

    public a(int i2) {
        this.k = new Path();
        a(i2);
        this.f4827f = new Paint(4);
        this.f4827f.setStyle(Paint.Style.FILL);
        this.f4826e = new Paint();
        this.f4826e.setColor(this.f4829h);
        this.f4828g = new Paint(this.f4827f);
    }

    public Paint a() {
        return this.f4826e;
    }

    public void a(int i2) {
        this.f4829h = b.h.b.a.b(i2, 68);
        this.i = b.h.b.a.b(i2, 20);
        this.j = b.h.b.a.b(i2, 0);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i2) {
        rectF.bottom += (float) i2;
        rectF.offset(0.0f, (float) (-i2));
        int[] iArr = f4822a;
        iArr[0] = this.j;
        iArr[1] = this.i;
        iArr[2] = this.f4829h;
        Paint paint = this.f4828g;
        float f2 = rectF.left;
        paint.setShader(new LinearGradient(f2, rectF.top, f2, rectF.bottom, iArr, f4823b, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f4828g);
        canvas.restore();
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i2, float f2, float f3) {
        RectF rectF2 = rectF;
        int i3 = i2;
        float f4 = f3;
        boolean z = f4 < 0.0f;
        Path path = this.k;
        if (z) {
            int[] iArr = f4824c;
            iArr[0] = 0;
            iArr[1] = this.j;
            iArr[2] = this.i;
            iArr[3] = this.f4829h;
            float f5 = f2;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f2, f4);
            path.close();
            float f6 = (float) (-i3);
            rectF2.inset(f6, f6);
            int[] iArr2 = f4824c;
            iArr2[0] = 0;
            iArr2[1] = this.f4829h;
            iArr2[2] = this.i;
            iArr2[3] = this.j;
        }
        float width = 1.0f - (((float) i3) / (rectF.width() / 2.0f));
        float[] fArr = f4825d;
        fArr[1] = width;
        fArr[2] = ((1.0f - width) / 2.0f) + width;
        this.f4827f.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, f4824c, f4825d, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        } else {
            Canvas canvas2 = canvas;
        }
        canvas.drawArc(rectF, f2, f3, true, this.f4827f);
        canvas.restore();
    }
}
