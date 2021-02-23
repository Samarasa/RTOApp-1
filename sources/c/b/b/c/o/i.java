package c.b.b.c.o;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private final k[] f4856a = new k[4];

    /* renamed from: b  reason: collision with root package name */
    private final Matrix[] f4857b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix[] f4858c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    private final PointF f4859d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    private final k f4860e = new k();

    /* renamed from: f  reason: collision with root package name */
    private final float[] f4861f = new float[2];

    /* renamed from: g  reason: collision with root package name */
    private final float[] f4862g = new float[2];

    public interface a {
        void a(k kVar, Matrix matrix, int i);

        void b(k kVar, Matrix matrix, int i);
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final h f4863a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f4864b;

        /* renamed from: c  reason: collision with root package name */
        public final RectF f4865c;

        /* renamed from: d  reason: collision with root package name */
        public final a f4866d;

        /* renamed from: e  reason: collision with root package name */
        public final float f4867e;

        b(h hVar, float f2, RectF rectF, a aVar, Path path) {
            this.f4866d = aVar;
            this.f4863a = hVar;
            this.f4867e = f2;
            this.f4865c = rectF;
            this.f4864b = path;
        }
    }

    public i() {
        for (int i = 0; i < 4; i++) {
            this.f4856a[i] = new k();
            this.f4857b[i] = new Matrix();
            this.f4858c[i] = new Matrix();
        }
    }

    private float a(int i) {
        return (float) ((i + 1) * 90);
    }

    private float a(RectF rectF, int i) {
        float centerX;
        float f2;
        float[] fArr = this.f4861f;
        k[] kVarArr = this.f4856a;
        fArr[0] = kVarArr[i].f4873c;
        fArr[1] = kVarArr[i].f4874d;
        this.f4857b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            centerX = rectF.centerX();
            f2 = this.f4861f[0];
        } else {
            centerX = rectF.centerY();
            f2 = this.f4861f[1];
        }
        return Math.abs(centerX - f2);
    }

    private a a(int i, h hVar) {
        return i != 1 ? i != 2 ? i != 3 ? hVar.h() : hVar.g() : hVar.b() : hVar.c();
    }

    private void a(int i, RectF rectF, PointF pointF) {
        float f2;
        float f3;
        float f4;
        if (i == 1) {
            f4 = rectF.right;
            f3 = rectF.bottom;
        } else if (i != 2) {
            f2 = i != 3 ? rectF.right : rectF.left;
            f3 = rectF.top;
        } else {
            f4 = rectF.left;
            f3 = rectF.bottom;
        }
        pointF.set(f2, f3);
    }

    private void a(b bVar, int i) {
        float[] fArr = this.f4861f;
        k[] kVarArr = this.f4856a;
        fArr[0] = kVarArr[i].f4871a;
        fArr[1] = kVarArr[i].f4872b;
        this.f4857b[i].mapPoints(fArr);
        if (i == 0) {
            Path path = bVar.f4864b;
            float[] fArr2 = this.f4861f;
            path.moveTo(fArr2[0], fArr2[1]);
        } else {
            Path path2 = bVar.f4864b;
            float[] fArr3 = this.f4861f;
            path2.lineTo(fArr3[0], fArr3[1]);
        }
        this.f4856a[i].a(this.f4857b[i], bVar.f4864b);
        a aVar = bVar.f4866d;
        if (aVar != null) {
            aVar.a(this.f4856a[i], this.f4857b[i], i);
        }
    }

    private c b(int i, h hVar) {
        return i != 1 ? i != 2 ? i != 3 ? hVar.e() : hVar.f() : hVar.d() : hVar.a();
    }

    private void b(int i) {
        float[] fArr = this.f4861f;
        k[] kVarArr = this.f4856a;
        fArr[0] = kVarArr[i].f4873c;
        fArr[1] = kVarArr[i].f4874d;
        this.f4857b[i].mapPoints(fArr);
        float a2 = a(i);
        this.f4858c[i].reset();
        Matrix matrix = this.f4858c[i];
        float[] fArr2 = this.f4861f;
        matrix.setTranslate(fArr2[0], fArr2[1]);
        this.f4858c[i].preRotate(a2);
    }

    private void b(b bVar, int i) {
        int i2 = (i + 1) % 4;
        float[] fArr = this.f4861f;
        k[] kVarArr = this.f4856a;
        fArr[0] = kVarArr[i].f4873c;
        fArr[1] = kVarArr[i].f4874d;
        this.f4857b[i].mapPoints(fArr);
        float[] fArr2 = this.f4862g;
        k[] kVarArr2 = this.f4856a;
        fArr2[0] = kVarArr2[i2].f4871a;
        fArr2[1] = kVarArr2[i2].f4872b;
        this.f4857b[i2].mapPoints(fArr2);
        float[] fArr3 = this.f4861f;
        float f2 = fArr3[0];
        float[] fArr4 = this.f4862g;
        float max = Math.max(((float) Math.hypot((double) (f2 - fArr4[0]), (double) (fArr3[1] - fArr4[1]))) - 0.001f, 0.0f);
        float a2 = a(bVar.f4865c, i);
        this.f4860e.b(0.0f, 0.0f);
        b(i, bVar.f4863a).a(max, a2, bVar.f4867e, this.f4860e);
        this.f4860e.a(this.f4858c[i], bVar.f4864b);
        a aVar = bVar.f4866d;
        if (aVar != null) {
            aVar.b(this.f4860e, this.f4858c[i], i);
        }
    }

    private void c(b bVar, int i) {
        a(i, bVar.f4863a).a(90.0f, bVar.f4867e, this.f4856a[i]);
        float a2 = a(i);
        this.f4857b[i].reset();
        a(i, bVar.f4865c, this.f4859d);
        Matrix matrix = this.f4857b[i];
        PointF pointF = this.f4859d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f4857b[i].preRotate(a2);
    }

    public void a(h hVar, float f2, RectF rectF, Path path) {
        a(hVar, f2, rectF, (a) null, path);
    }

    public void a(h hVar, float f2, RectF rectF, a aVar, Path path) {
        path.rewind();
        b bVar = new b(hVar, f2, rectF, aVar, path);
        for (int i = 0; i < 4; i++) {
            c(bVar, i);
            b(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            a(bVar, i2);
            b(bVar, i2);
        }
        path.close();
    }
}
