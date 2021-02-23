package b.r.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import b.h.a.a.i;
import b.h.b.b;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class k extends i {

    /* renamed from: b  reason: collision with root package name */
    static final PorterDuff.Mode f2833b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    private g f2834c;

    /* renamed from: d  reason: collision with root package name */
    private PorterDuffColorFilter f2835d;

    /* renamed from: e  reason: collision with root package name */
    private ColorFilter f2836e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2837f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2838g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable.ConstantState f2839h;
    private final float[] i;
    private final Matrix j;
    private final Rect k;

    private static class a extends e {
        a() {
        }

        a(a aVar) {
            super(aVar);
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f2853b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f2852a = b.h.b.b.a(string2);
            }
            this.f2854c = i.b(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (i.a(xmlPullParser, "pathData")) {
                TypedArray a2 = i.a(resources, theme, attributeSet, a.f2810d);
                a(a2, xmlPullParser);
                a2.recycle();
            }
        }

        public boolean b() {
            return true;
        }
    }

    private static class b extends e {

        /* renamed from: e  reason: collision with root package name */
        private int[] f2840e;

        /* renamed from: f  reason: collision with root package name */
        b.h.a.a.b f2841f;

        /* renamed from: g  reason: collision with root package name */
        float f2842g = 0.0f;

        /* renamed from: h  reason: collision with root package name */
        b.h.a.a.b f2843h;
        float i = 1.0f;
        float j = 1.0f;
        float k = 0.0f;
        float l = 1.0f;
        float m = 0.0f;
        Paint.Cap n = Paint.Cap.BUTT;
        Paint.Join o = Paint.Join.MITER;
        float p = 4.0f;

        b() {
        }

        b(b bVar) {
            super(bVar);
            this.f2840e = bVar.f2840e;
            this.f2841f = bVar.f2841f;
            this.f2842g = bVar.f2842g;
            this.i = bVar.i;
            this.f2843h = bVar.f2843h;
            this.f2854c = bVar.f2854c;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
        }

        private Paint.Cap a(int i2, Paint.Cap cap) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join a(int i2, Paint.Join join) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f2840e = null;
            if (i.a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f2853b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f2852a = b.h.b.b.a(string2);
                }
                Resources.Theme theme2 = theme;
                this.f2843h = i.a(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.j = i.a(typedArray, xmlPullParser, "fillAlpha", 12, this.j);
                this.n = a(i.b(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.n);
                this.o = a(i.b(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.o);
                this.p = i.a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
                this.f2841f = i.a(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.i = i.a(typedArray, xmlPullParser, "strokeAlpha", 11, this.i);
                this.f2842g = i.a(typedArray, xmlPullParser, "strokeWidth", 4, this.f2842g);
                this.l = i.a(typedArray, xmlPullParser, "trimPathEnd", 6, this.l);
                this.m = i.a(typedArray, xmlPullParser, "trimPathOffset", 7, this.m);
                this.k = i.a(typedArray, xmlPullParser, "trimPathStart", 5, this.k);
                this.f2854c = i.b(typedArray, xmlPullParser, "fillType", 13, this.f2854c);
            }
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a2 = i.a(resources, theme, attributeSet, a.f2809c);
            a(a2, xmlPullParser, theme);
            a2.recycle();
        }

        public boolean a() {
            return this.f2843h.d() || this.f2841f.d();
        }

        public boolean a(int[] iArr) {
            return this.f2841f.a(iArr) | this.f2843h.a(iArr);
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f2843h.a();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f2841f.a();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f2842g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f2) {
            this.j = f2;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i2) {
            this.f2843h.b(i2);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f2) {
            this.i = f2;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i2) {
            this.f2841f.b(i2);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f2) {
            this.f2842g = f2;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f2) {
            this.l = f2;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f2) {
            this.m = f2;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f2) {
            this.k = f2;
        }
    }

    private static class c extends d {

        /* renamed from: a  reason: collision with root package name */
        final Matrix f2844a = new Matrix();

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<d> f2845b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        float f2846c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        private float f2847d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        private float f2848e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        private float f2849f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        private float f2850g = 1.0f;

        /* renamed from: h  reason: collision with root package name */
        private float f2851h = 0.0f;
        private float i = 0.0f;
        final Matrix j = new Matrix();
        int k;
        private int[] l;
        private String m = null;

        public c() {
            super();
        }

        public c(c cVar, b.e.b<String, Object> bVar) {
            super();
            e eVar;
            this.f2846c = cVar.f2846c;
            this.f2847d = cVar.f2847d;
            this.f2848e = cVar.f2848e;
            this.f2849f = cVar.f2849f;
            this.f2850g = cVar.f2850g;
            this.f2851h = cVar.f2851h;
            this.i = cVar.i;
            this.l = cVar.l;
            this.m = cVar.m;
            this.k = cVar.k;
            String str = this.m;
            if (str != null) {
                bVar.put(str, this);
            }
            this.j.set(cVar.j);
            ArrayList<d> arrayList = cVar.f2845b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                d dVar = arrayList.get(i2);
                if (dVar instanceof c) {
                    this.f2845b.add(new c((c) dVar, bVar));
                } else {
                    if (dVar instanceof b) {
                        eVar = new b((b) dVar);
                    } else if (dVar instanceof a) {
                        eVar = new a((a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f2845b.add(eVar);
                    String str2 = eVar.f2853b;
                    if (str2 != null) {
                        bVar.put(str2, eVar);
                    }
                }
            }
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.f2846c = i.a(typedArray, xmlPullParser, "rotation", 5, this.f2846c);
            this.f2847d = typedArray.getFloat(1, this.f2847d);
            this.f2848e = typedArray.getFloat(2, this.f2848e);
            this.f2849f = i.a(typedArray, xmlPullParser, "scaleX", 3, this.f2849f);
            this.f2850g = i.a(typedArray, xmlPullParser, "scaleY", 4, this.f2850g);
            this.f2851h = i.a(typedArray, xmlPullParser, "translateX", 6, this.f2851h);
            this.i = i.a(typedArray, xmlPullParser, "translateY", 7, this.i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            b();
        }

        private void b() {
            this.j.reset();
            this.j.postTranslate(-this.f2847d, -this.f2848e);
            this.j.postScale(this.f2849f, this.f2850g);
            this.j.postRotate(this.f2846c, 0.0f, 0.0f);
            this.j.postTranslate(this.f2851h + this.f2847d, this.i + this.f2848e);
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a2 = i.a(resources, theme, attributeSet, a.f2808b);
            a(a2, xmlPullParser);
            a2.recycle();
        }

        public boolean a() {
            for (int i2 = 0; i2 < this.f2845b.size(); i2++) {
                if (this.f2845b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        public boolean a(int[] iArr) {
            boolean z = false;
            for (int i2 = 0; i2 < this.f2845b.size(); i2++) {
                z |= this.f2845b.get(i2).a(iArr);
            }
            return z;
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.f2847d;
        }

        public float getPivotY() {
            return this.f2848e;
        }

        public float getRotation() {
            return this.f2846c;
        }

        public float getScaleX() {
            return this.f2849f;
        }

        public float getScaleY() {
            return this.f2850g;
        }

        public float getTranslateX() {
            return this.f2851h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f2847d) {
                this.f2847d = f2;
                b();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f2848e) {
                this.f2848e = f2;
                b();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.f2846c) {
                this.f2846c = f2;
                b();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f2849f) {
                this.f2849f = f2;
                b();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f2850g) {
                this.f2850g = f2;
                b();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f2851h) {
                this.f2851h = f2;
                b();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.i) {
                this.i = f2;
                b();
            }
        }
    }

    private static abstract class d {
        private d() {
        }

        public boolean a() {
            return false;
        }

        public boolean a(int[] iArr) {
            return false;
        }
    }

    private static abstract class e extends d {

        /* renamed from: a  reason: collision with root package name */
        protected b.C0030b[] f2852a = null;

        /* renamed from: b  reason: collision with root package name */
        String f2853b;

        /* renamed from: c  reason: collision with root package name */
        int f2854c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f2855d;

        public e() {
            super();
        }

        public e(e eVar) {
            super();
            this.f2853b = eVar.f2853b;
            this.f2855d = eVar.f2855d;
            this.f2852a = b.h.b.b.a(eVar.f2852a);
        }

        public void a(Path path) {
            path.reset();
            b.C0030b[] bVarArr = this.f2852a;
            if (bVarArr != null) {
                b.C0030b.a(bVarArr, path);
            }
        }

        public boolean b() {
            return false;
        }

        public b.C0030b[] getPathData() {
            return this.f2852a;
        }

        public String getPathName() {
            return this.f2853b;
        }

        public void setPathData(b.C0030b[] bVarArr) {
            if (!b.h.b.b.a(this.f2852a, bVarArr)) {
                this.f2852a = b.h.b.b.a(bVarArr);
            } else {
                b.h.b.b.b(this.f2852a, bVarArr);
            }
        }
    }

    private static class f {

        /* renamed from: a  reason: collision with root package name */
        private static final Matrix f2856a = new Matrix();

        /* renamed from: b  reason: collision with root package name */
        private final Path f2857b;

        /* renamed from: c  reason: collision with root package name */
        private final Path f2858c;

        /* renamed from: d  reason: collision with root package name */
        private final Matrix f2859d;

        /* renamed from: e  reason: collision with root package name */
        Paint f2860e;

        /* renamed from: f  reason: collision with root package name */
        Paint f2861f;

        /* renamed from: g  reason: collision with root package name */
        private PathMeasure f2862g;

        /* renamed from: h  reason: collision with root package name */
        private int f2863h;
        final c i;
        float j;
        float k;
        float l;
        float m;
        int n;
        String o;
        Boolean p;
        final b.e.b<String, Object> q;

        public f() {
            this.f2859d = new Matrix();
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 255;
            this.o = null;
            this.p = null;
            this.q = new b.e.b<>();
            this.i = new c();
            this.f2857b = new Path();
            this.f2858c = new Path();
        }

        public f(f fVar) {
            this.f2859d = new Matrix();
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 255;
            this.o = null;
            this.p = null;
            this.q = new b.e.b<>();
            this.i = new c(fVar.i, this.q);
            this.f2857b = new Path(fVar.f2857b);
            this.f2858c = new Path(fVar.f2858c);
            this.j = fVar.j;
            this.k = fVar.k;
            this.l = fVar.l;
            this.m = fVar.m;
            this.f2863h = fVar.f2863h;
            this.n = fVar.n;
            this.o = fVar.o;
            String str = fVar.o;
            if (str != null) {
                this.q.put(str, this);
            }
            this.p = fVar.p;
        }

        private static float a(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        private float a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a2 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a2) / max;
            }
            return 0.0f;
        }

        private void a(c cVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            cVar.f2844a.set(matrix);
            cVar.f2844a.preConcat(cVar.j);
            canvas.save();
            for (int i4 = 0; i4 < cVar.f2845b.size(); i4++) {
                d dVar = cVar.f2845b.get(i4);
                if (dVar instanceof c) {
                    a((c) dVar, cVar.f2844a, canvas, i2, i3, colorFilter);
                } else if (dVar instanceof e) {
                    a(cVar, (e) dVar, canvas, i2, i3, colorFilter);
                }
            }
            canvas.restore();
        }

        private void a(c cVar, e eVar, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            float f2 = ((float) i2) / this.l;
            float f3 = ((float) i3) / this.m;
            float min = Math.min(f2, f3);
            Matrix matrix = cVar.f2844a;
            this.f2859d.set(matrix);
            this.f2859d.postScale(f2, f3);
            float a2 = a(matrix);
            if (a2 != 0.0f) {
                eVar.a(this.f2857b);
                Path path = this.f2857b;
                this.f2858c.reset();
                if (eVar.b()) {
                    this.f2858c.setFillType(eVar.f2854c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f2858c.addPath(path, this.f2859d);
                    canvas.clipPath(this.f2858c);
                    return;
                }
                b bVar = (b) eVar;
                if (!(bVar.k == 0.0f && bVar.l == 1.0f)) {
                    float f4 = bVar.k;
                    float f5 = bVar.m;
                    float f6 = (f4 + f5) % 1.0f;
                    float f7 = (bVar.l + f5) % 1.0f;
                    if (this.f2862g == null) {
                        this.f2862g = new PathMeasure();
                    }
                    this.f2862g.setPath(this.f2857b, false);
                    float length = this.f2862g.getLength();
                    float f8 = f6 * length;
                    float f9 = f7 * length;
                    path.reset();
                    if (f8 > f9) {
                        this.f2862g.getSegment(f8, length, path, true);
                        this.f2862g.getSegment(0.0f, f9, path, true);
                    } else {
                        this.f2862g.getSegment(f8, f9, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f2858c.addPath(path, this.f2859d);
                if (bVar.f2843h.e()) {
                    b.h.a.a.b bVar2 = bVar.f2843h;
                    if (this.f2861f == null) {
                        this.f2861f = new Paint(1);
                        this.f2861f.setStyle(Paint.Style.FILL);
                    }
                    Paint paint = this.f2861f;
                    if (bVar2.c()) {
                        Shader b2 = bVar2.b();
                        b2.setLocalMatrix(this.f2859d);
                        paint.setShader(b2);
                        paint.setAlpha(Math.round(bVar.j * 255.0f));
                    } else {
                        paint.setShader((Shader) null);
                        paint.setAlpha(255);
                        paint.setColor(k.a(bVar2.a(), bVar.j));
                    }
                    paint.setColorFilter(colorFilter);
                    this.f2858c.setFillType(bVar.f2854c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f2858c, paint);
                }
                if (bVar.f2841f.e()) {
                    b.h.a.a.b bVar3 = bVar.f2841f;
                    if (this.f2860e == null) {
                        this.f2860e = new Paint(1);
                        this.f2860e.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint2 = this.f2860e;
                    Paint.Join join = bVar.o;
                    if (join != null) {
                        paint2.setStrokeJoin(join);
                    }
                    Paint.Cap cap = bVar.n;
                    if (cap != null) {
                        paint2.setStrokeCap(cap);
                    }
                    paint2.setStrokeMiter(bVar.p);
                    if (bVar3.c()) {
                        Shader b3 = bVar3.b();
                        b3.setLocalMatrix(this.f2859d);
                        paint2.setShader(b3);
                        paint2.setAlpha(Math.round(bVar.i * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(k.a(bVar3.a(), bVar.i));
                    }
                    paint2.setColorFilter(colorFilter);
                    paint2.setStrokeWidth(bVar.f2842g * min * a2);
                    canvas.drawPath(this.f2858c, paint2);
                }
            }
        }

        public void a(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            a(this.i, f2856a, canvas, i2, i3, colorFilter);
        }

        public boolean a() {
            if (this.p == null) {
                this.p = Boolean.valueOf(this.i.a());
            }
            return this.p.booleanValue();
        }

        public boolean a(int[] iArr) {
            return this.i.a(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.n;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.n = i2;
        }
    }

    private static class g extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f2864a;

        /* renamed from: b  reason: collision with root package name */
        f f2865b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f2866c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f2867d;

        /* renamed from: e  reason: collision with root package name */
        boolean f2868e;

        /* renamed from: f  reason: collision with root package name */
        Bitmap f2869f;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f2870g;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f2871h;
        int i;
        boolean j;
        boolean k;
        Paint l;

        public g() {
            this.f2866c = null;
            this.f2867d = k.f2833b;
            this.f2865b = new f();
        }

        public g(g gVar) {
            this.f2866c = null;
            this.f2867d = k.f2833b;
            if (gVar != null) {
                this.f2864a = gVar.f2864a;
                this.f2865b = new f(gVar.f2865b);
                Paint paint = gVar.f2865b.f2861f;
                if (paint != null) {
                    this.f2865b.f2861f = new Paint(paint);
                }
                Paint paint2 = gVar.f2865b.f2860e;
                if (paint2 != null) {
                    this.f2865b.f2860e = new Paint(paint2);
                }
                this.f2866c = gVar.f2866c;
                this.f2867d = gVar.f2867d;
                this.f2868e = gVar.f2868e;
            }
        }

        public Paint a(ColorFilter colorFilter) {
            if (!b() && colorFilter == null) {
                return null;
            }
            if (this.l == null) {
                this.l = new Paint();
                this.l.setFilterBitmap(true);
            }
            this.l.setAlpha(this.f2865b.getRootAlpha());
            this.l.setColorFilter(colorFilter);
            return this.l;
        }

        public void a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f2869f, (Rect) null, rect, a(colorFilter));
        }

        public boolean a() {
            return !this.k && this.f2870g == this.f2866c && this.f2871h == this.f2867d && this.j == this.f2868e && this.i == this.f2865b.getRootAlpha();
        }

        public boolean a(int i2, int i3) {
            return i2 == this.f2869f.getWidth() && i3 == this.f2869f.getHeight();
        }

        public boolean a(int[] iArr) {
            boolean a2 = this.f2865b.a(iArr);
            this.k |= a2;
            return a2;
        }

        public void b(int i2, int i3) {
            if (this.f2869f == null || !a(i2, i3)) {
                this.f2869f = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                this.k = true;
            }
        }

        public boolean b() {
            return this.f2865b.getRootAlpha() < 255;
        }

        public void c(int i2, int i3) {
            this.f2869f.eraseColor(0);
            this.f2865b.a(new Canvas(this.f2869f), i2, i3, (ColorFilter) null);
        }

        public boolean c() {
            return this.f2865b.a();
        }

        public void d() {
            this.f2870g = this.f2866c;
            this.f2871h = this.f2867d;
            this.i = this.f2865b.getRootAlpha();
            this.j = this.f2868e;
            this.k = false;
        }

        public int getChangingConfigurations() {
            return this.f2864a;
        }

        public Drawable newDrawable() {
            return new k(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new k(this);
        }
    }

    private static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f2872a;

        public h(Drawable.ConstantState constantState) {
            this.f2872a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f2872a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f2872a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            k kVar = new k();
            kVar.f2832a = (VectorDrawable) this.f2872a.newDrawable();
            return kVar;
        }

        public Drawable newDrawable(Resources resources) {
            k kVar = new k();
            kVar.f2832a = (VectorDrawable) this.f2872a.newDrawable(resources);
            return kVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            k kVar = new k();
            kVar.f2832a = (VectorDrawable) this.f2872a.newDrawable(resources, theme);
            return kVar;
        }
    }

    k() {
        this.f2838g = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.f2834c = new g();
    }

    k(g gVar) {
        this.f2838g = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.f2834c = gVar;
        this.f2835d = a(this.f2835d, gVar.f2866c, gVar.f2867d);
    }

    static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (((float) Color.alpha(i2)) * f2)) << 24);
    }

    private static PorterDuff.Mode a(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A[Catch:{ IOException | XmlPullParserException -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[Catch:{ IOException | XmlPullParserException -> 0x0045 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b.r.a.a.k a(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0023
            b.r.a.a.k r0 = new b.r.a.a.k
            r0.<init>()
            android.graphics.drawable.Drawable r6 = b.h.a.a.h.a(r6, r7, r8)
            r0.f2832a = r6
            b.r.a.a.k$h r6 = new b.r.a.a.k$h
            android.graphics.drawable.Drawable r7 = r0.f2832a
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            r0.f2839h = r6
            return r0
        L_0x0023:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
        L_0x002b:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            r4 = 2
            if (r3 == r4) goto L_0x0036
            r5 = 1
            if (r3 == r5) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            if (r3 != r4) goto L_0x003d
            b.r.a.a.k r6 = createFromXmlInner(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            return r6
        L_0x003d:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
        L_0x0045:
            r6 = move-exception
            goto L_0x0048
        L_0x0047:
            r6 = move-exception
        L_0x0048:
            android.util.Log.e(r1, r0, r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.r.a.a.k.a(android.content.res.Resources, int, android.content.res.Resources$Theme):b.r.a.a.k");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: b.r.a.a.k$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: b.r.a.a.k$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: b.r.a.a.k$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: b.r.a.a.k$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: b.r.a.a.k$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.content.res.Resources r11, org.xmlpull.v1.XmlPullParser r12, android.util.AttributeSet r13, android.content.res.Resources.Theme r14) {
        /*
            r10 = this;
            b.r.a.a.k$g r0 = r10.f2834c
            b.r.a.a.k$f r1 = r0.f2865b
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            b.r.a.a.k$c r3 = r1.i
            r2.push(r3)
            int r3 = r12.getEventType()
            int r4 = r12.getDepth()
            r5 = 1
            int r4 = r4 + r5
            r6 = 1
        L_0x0019:
            if (r3 == r5) goto L_0x00c4
            int r7 = r12.getDepth()
            r8 = 3
            if (r7 >= r4) goto L_0x0024
            if (r3 == r8) goto L_0x00c4
        L_0x0024:
            r7 = 2
            java.lang.String r9 = "group"
            if (r3 != r7) goto L_0x00af
            java.lang.String r3 = r12.getName()
            java.lang.Object r7 = r2.peek()
            b.r.a.a.k$c r7 = (b.r.a.a.k.c) r7
            java.lang.String r8 = "path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0059
            b.r.a.a.k$b r3 = new b.r.a.a.k$b
            r3.<init>()
            r3.a(r11, r13, r14, r12)
            java.util.ArrayList<b.r.a.a.k$d> r6 = r7.f2845b
            r6.add(r3)
            java.lang.String r6 = r3.getPathName()
            if (r6 == 0) goto L_0x0057
            b.e.b<java.lang.String, java.lang.Object> r6 = r1.q
            java.lang.String r7 = r3.getPathName()
            r6.put(r7, r3)
        L_0x0057:
            r6 = 0
            goto L_0x007d
        L_0x0059:
            java.lang.String r8 = "clip-path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0085
            b.r.a.a.k$a r3 = new b.r.a.a.k$a
            r3.<init>()
            r3.a(r11, r13, r14, r12)
            java.util.ArrayList<b.r.a.a.k$d> r7 = r7.f2845b
            r7.add(r3)
            java.lang.String r7 = r3.getPathName()
            if (r7 == 0) goto L_0x007d
            b.e.b<java.lang.String, java.lang.Object> r7 = r1.q
            java.lang.String r8 = r3.getPathName()
            r7.put(r8, r3)
        L_0x007d:
            int r7 = r0.f2864a
            int r3 = r3.f2855d
        L_0x0081:
            r3 = r3 | r7
            r0.f2864a = r3
            goto L_0x00be
        L_0x0085:
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            b.r.a.a.k$c r3 = new b.r.a.a.k$c
            r3.<init>()
            r3.a(r11, r13, r14, r12)
            java.util.ArrayList<b.r.a.a.k$d> r7 = r7.f2845b
            r7.add(r3)
            r2.push(r3)
            java.lang.String r7 = r3.getGroupName()
            if (r7 == 0) goto L_0x00aa
            b.e.b<java.lang.String, java.lang.Object> r7 = r1.q
            java.lang.String r8 = r3.getGroupName()
            r7.put(r8, r3)
        L_0x00aa:
            int r7 = r0.f2864a
            int r3 = r3.k
            goto L_0x0081
        L_0x00af:
            if (r3 != r8) goto L_0x00be
            java.lang.String r3 = r12.getName()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            r2.pop()
        L_0x00be:
            int r3 = r12.next()
            goto L_0x0019
        L_0x00c4:
            if (r6 != 0) goto L_0x00c7
            return
        L_0x00c7:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r12 = "no path defined"
            r11.<init>(r12)
            goto L_0x00d0
        L_0x00cf:
            throw r11
        L_0x00d0:
            goto L_0x00cf
        */
        throw new UnsupportedOperationException("Method not decompiled: b.r.a.a.k.a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    private void a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        g gVar = this.f2834c;
        f fVar = gVar.f2865b;
        gVar.f2867d = a(i.b(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList a2 = i.a(typedArray, xmlPullParser, theme, "tint", 1);
        if (a2 != null) {
            gVar.f2866c = a2;
        }
        gVar.f2868e = i.a(typedArray, xmlPullParser, "autoMirrored", 5, gVar.f2868e);
        fVar.l = i.a(typedArray, xmlPullParser, "viewportWidth", 7, fVar.l);
        fVar.m = i.a(typedArray, xmlPullParser, "viewportHeight", 8, fVar.m);
        if (fVar.l <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (fVar.m > 0.0f) {
            fVar.j = typedArray.getDimension(3, fVar.j);
            fVar.k = typedArray.getDimension(2, fVar.k);
            if (fVar.j <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (fVar.k > 0.0f) {
                fVar.setAlpha(i.a(typedArray, xmlPullParser, "alpha", 4, fVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    fVar.o = string;
                    fVar.q.put(string, fVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    public static k createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        k kVar = new k();
        kVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return kVar;
    }

    /* access modifiers changed from: package-private */
    public PorterDuffColorFilter a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* access modifiers changed from: package-private */
    public Object a(String str) {
        return this.f2834c.f2865b.q.get(str);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        this.f2838g = z;
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f2832a;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.a(drawable);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.k);
        if (this.k.width() > 0 && this.k.height() > 0) {
            ColorFilter colorFilter = this.f2836e;
            if (colorFilter == null) {
                colorFilter = this.f2835d;
            }
            canvas.getMatrix(this.j);
            this.j.getValues(this.i);
            float abs = Math.abs(this.i[0]);
            float abs2 = Math.abs(this.i[4]);
            float abs3 = Math.abs(this.i[1]);
            float abs4 = Math.abs(this.i[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.k.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.k.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.k;
                canvas.translate((float) rect.left, (float) rect.top);
                if (a()) {
                    canvas.translate((float) this.k.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.k.offsetTo(0, 0);
                this.f2834c.b(min, min2);
                if (!this.f2838g) {
                    this.f2834c.c(min, min2);
                } else if (!this.f2834c.a()) {
                    this.f2834c.c(min, min2);
                    this.f2834c.d();
                }
                this.f2834c.a(canvas, colorFilter, this.k);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f2832a;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f2834c.f2865b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f2832a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2834c.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f2832a;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f2836e;
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f2832a;
        if (drawable != null && Build.VERSION.SDK_INT >= 24) {
            return new h(drawable.getConstantState());
        }
        this.f2834c.f2864a = getChangingConfigurations();
        return this.f2834c;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f2832a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f2834c.f2865b.k;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f2832a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f2834c.f2865b.j;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        g gVar = this.f2834c;
        gVar.f2865b = new f();
        TypedArray a2 = i.a(resources, theme, attributeSet, a.f2807a);
        a(a2, xmlPullParser, theme);
        a2.recycle();
        gVar.f2864a = getChangingConfigurations();
        gVar.k = true;
        a(resources, xmlPullParser, attributeSet, theme);
        this.f2835d = a(this.f2835d, gVar.f2866c, gVar.f2867d);
    }

    public void invalidateSelf() {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f2832a;
        return drawable != null ? androidx.core.graphics.drawable.a.f(drawable) : this.f2834c.f2868e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f2834c.f2866c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f2834c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2832a
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            b.r.a.a.k$g r0 = r1.f2834c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x0028
            b.r.a.a.k$g r0 = r1.f2834c
            android.content.res.ColorStateList r0 = r0.f2866c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.r.a.a.k.isStateful():boolean");
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2837f && super.mutate() == this) {
            this.f2834c = new g(this.f2834c);
            this.f2837f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        g gVar = this.f2834c;
        ColorStateList colorStateList = gVar.f2866c;
        if (!(colorStateList == null || (mode = gVar.f2867d) == null)) {
            this.f2835d = a(this.f2835d, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!gVar.c() || !gVar.a(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f2834c.f2865b.getRootAlpha() != i2) {
            this.f2834c.f2865b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, z);
        } else {
            this.f2834c.f2868e = z;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f2836e = colorFilter;
        invalidateSelf();
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i2) {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.b(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, colorStateList);
            return;
        }
        g gVar = this.f2834c;
        if (gVar.f2866c != colorStateList) {
            gVar.f2866c = colorStateList;
            this.f2835d = a(this.f2835d, colorStateList, gVar.f2867d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, mode);
            return;
        }
        g gVar = this.f2834c;
        if (gVar.f2867d != mode) {
            gVar.f2867d = mode;
            this.f2835d = a(this.f2835d, gVar.f2866c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f2832a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f2832a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
