package c.b.b.c.o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public float f4871a;

    /* renamed from: b  reason: collision with root package name */
    public float f4872b;

    /* renamed from: c  reason: collision with root package name */
    public float f4873c;

    /* renamed from: d  reason: collision with root package name */
    public float f4874d;

    /* renamed from: e  reason: collision with root package name */
    public float f4875e;

    /* renamed from: f  reason: collision with root package name */
    public float f4876f;

    /* renamed from: g  reason: collision with root package name */
    private final List<e> f4877g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List<f> f4878h = new ArrayList();

    static class a extends f {

        /* renamed from: b  reason: collision with root package name */
        private final c f4879b;

        public a(c cVar) {
            this.f4879b = cVar;
        }

        public void a(Matrix matrix, c.b.b.c.n.a aVar, int i, Canvas canvas) {
            c cVar = this.f4879b;
            float f2 = cVar.f4888g;
            float f3 = cVar.f4889h;
            aVar.a(canvas, matrix, new RectF(cVar.f4884c, cVar.f4885d, cVar.f4886e, cVar.f4887f), i, f2, f3);
        }
    }

    static class b extends f {

        /* renamed from: b  reason: collision with root package name */
        private final d f4880b;

        /* renamed from: c  reason: collision with root package name */
        private final float f4881c;

        /* renamed from: d  reason: collision with root package name */
        private final float f4882d;

        public b(d dVar, float f2, float f3) {
            this.f4880b = dVar;
            this.f4881c = f2;
            this.f4882d = f3;
        }

        /* access modifiers changed from: package-private */
        public float a() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f4880b.f4891c - this.f4882d) / (this.f4880b.f4890b - this.f4881c))));
        }

        public void a(Matrix matrix, c.b.b.c.n.a aVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f4880b.f4891c - this.f4882d), (double) (this.f4880b.f4890b - this.f4881c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f4881c, this.f4882d);
            matrix2.preRotate(a());
            aVar.a(canvas, matrix2, rectF, i);
        }
    }

    public static class c extends e {

        /* renamed from: b  reason: collision with root package name */
        private static final RectF f4883b = new RectF();

        /* renamed from: c  reason: collision with root package name */
        public float f4884c;

        /* renamed from: d  reason: collision with root package name */
        public float f4885d;

        /* renamed from: e  reason: collision with root package name */
        public float f4886e;

        /* renamed from: f  reason: collision with root package name */
        public float f4887f;

        /* renamed from: g  reason: collision with root package name */
        public float f4888g;

        /* renamed from: h  reason: collision with root package name */
        public float f4889h;

        public c(float f2, float f3, float f4, float f5) {
            this.f4884c = f2;
            this.f4885d = f3;
            this.f4886e = f4;
            this.f4887f = f5;
        }

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4892a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            f4883b.set(this.f4884c, this.f4885d, this.f4886e, this.f4887f);
            path.arcTo(f4883b, this.f4888g, this.f4889h, false);
            path.transform(matrix);
        }
    }

    public static class d extends e {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public float f4890b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public float f4891c;

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4892a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f4890b, this.f4891c);
            path.transform(matrix);
        }
    }

    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        protected final Matrix f4892a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        static final Matrix f4893a = new Matrix();

        f() {
        }

        public abstract void a(Matrix matrix, c.b.b.c.n.a aVar, int i, Canvas canvas);

        public final void a(c.b.b.c.n.a aVar, int i, Canvas canvas) {
            a(f4893a, aVar, i, canvas);
        }
    }

    public k() {
        b(0.0f, 0.0f);
    }

    private void a(float f2) {
        float f3 = this.f4875e;
        if (f3 != f2) {
            float f4 = ((f2 - f3) + 360.0f) % 360.0f;
            if (f4 <= 180.0f) {
                float f5 = this.f4873c;
                float f6 = this.f4874d;
                c cVar = new c(f5, f6, f5, f6);
                cVar.f4888g = this.f4875e;
                cVar.f4889h = f4;
                this.f4878h.add(new a(cVar));
                this.f4875e = f2;
            }
        }
    }

    private void a(f fVar, float f2, float f3) {
        a(f2);
        this.f4878h.add(fVar);
        this.f4875e = f3;
    }

    /* access modifiers changed from: package-private */
    public f a(Matrix matrix) {
        a(this.f4876f);
        return new j(this, new ArrayList(this.f4878h), matrix);
    }

    public void a(float f2, float f3) {
        d dVar = new d();
        float unused = dVar.f4890b = f2;
        float unused2 = dVar.f4891c = f3;
        this.f4877g.add(dVar);
        b bVar = new b(dVar, this.f4873c, this.f4874d);
        a(bVar, bVar.a() + 270.0f, bVar.a() + 270.0f);
        this.f4873c = f2;
        this.f4874d = f3;
    }

    public void a(float f2, float f3, float f4, float f5) {
        this.f4871a = f2;
        this.f4872b = f3;
        this.f4873c = f2;
        this.f4874d = f3;
        this.f4875e = f4;
        this.f4876f = (f4 + f5) % 360.0f;
        this.f4877g.clear();
        this.f4878h.clear();
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        c cVar = new c(f2, f3, f4, f5);
        cVar.f4888g = f6;
        cVar.f4889h = f7;
        this.f4877g.add(cVar);
        a aVar = new a(cVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        a(aVar, f6, z ? (180.0f + f8) % 360.0f : f8);
        double d2 = (double) f8;
        this.f4873c = ((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2))));
        this.f4874d = ((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2))));
    }

    public void a(Matrix matrix, Path path) {
        int size = this.f4877g.size();
        for (int i = 0; i < size; i++) {
            this.f4877g.get(i).a(matrix, path);
        }
    }

    public void b(float f2, float f3) {
        a(f2, f3, 270.0f, 0.0f);
    }
}
