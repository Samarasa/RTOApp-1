package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import b.h.h.e;
import b.h.j.y;
import c.b.b.c.l.a;
import c.b.b.c.l.f;
import c.b.b.c.l.h;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f14065a = (Build.VERSION.SDK_INT < 18);

    /* renamed from: b  reason: collision with root package name */
    private static final Paint f14066b = null;
    private CharSequence A;
    private boolean B;
    private boolean C;
    private Bitmap D;
    private Paint E;
    private float F;
    private float G;
    private float H;
    private float I;
    private int[] J;
    private boolean K;
    private final TextPaint L;
    private final TextPaint M;
    private TimeInterpolator N;
    private TimeInterpolator O;
    private float P;
    private float Q;
    private float R;
    private ColorStateList S;
    private float T;
    private float U;
    private float V;
    private ColorStateList W;

    /* renamed from: c  reason: collision with root package name */
    private final View f14067c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14068d;

    /* renamed from: e  reason: collision with root package name */
    private float f14069e;

    /* renamed from: f  reason: collision with root package name */
    private final Rect f14070f;

    /* renamed from: g  reason: collision with root package name */
    private final Rect f14071g;

    /* renamed from: h  reason: collision with root package name */
    private final RectF f14072h;
    private int i = 16;
    private int j = 16;
    private float k = 15.0f;
    private float l = 15.0f;
    private ColorStateList m;
    private ColorStateList n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private Typeface u;
    private Typeface v;
    private Typeface w;
    private a x;
    private a y;
    private CharSequence z;

    static {
        Paint paint = f14066b;
        if (paint != null) {
            paint.setAntiAlias(true);
            f14066b.setColor(-65281);
        }
    }

    public d(View view) {
        this.f14067c = view;
        this.L = new TextPaint(129);
        this.M = new TextPaint(this.L);
        this.f14071g = new Rect();
        this.f14070f = new Rect();
        this.f14072h = new RectF();
    }

    private static float a(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return c.b.b.c.a.a.a(f2, f3, f4);
    }

    private static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((((float) Color.alpha(i2)) * f3) + (((float) Color.alpha(i3)) * f2)), (int) ((((float) Color.red(i2)) * f3) + (((float) Color.red(i3)) * f2)), (int) ((((float) Color.green(i2)) * f3) + (((float) Color.green(i3)) * f2)), (int) ((((float) Color.blue(i2)) * f3) + (((float) Color.blue(i3)) * f2)));
    }

    private static boolean a(float f2, float f3) {
        return Math.abs(f2 - f3) < 0.001f;
    }

    private static boolean a(Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }

    private void b(float f2) {
        int i2;
        TextPaint textPaint;
        d(f2);
        this.s = a(this.q, this.r, f2, this.N);
        this.t = a(this.o, this.p, f2, this.N);
        e(a(this.k, this.l, f2, this.O));
        if (this.n != this.m) {
            textPaint = this.L;
            i2 = a(n(), c(), f2);
        } else {
            textPaint = this.L;
            i2 = c();
        }
        textPaint.setColor(i2);
        this.L.setShadowLayer(a(this.T, this.P, f2, (TimeInterpolator) null), a(this.U, this.Q, f2, (TimeInterpolator) null), a(this.V, this.R, f2, (TimeInterpolator) null), a(c(this.W), c(this.S), f2));
        y.E(this.f14067c);
    }

    private boolean b(CharSequence charSequence) {
        boolean z2 = true;
        if (y.m(this.f14067c) != 1) {
            z2 = false;
        }
        return (z2 ? e.f2503d : e.f2502c).isRtl(charSequence, 0, charSequence.length());
    }

    private int c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.J;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private void c(float f2) {
        boolean z2;
        float f3;
        boolean z3;
        if (this.z != null) {
            float width = (float) this.f14071g.width();
            float width2 = (float) this.f14070f.width();
            boolean z4 = true;
            if (a(f2, this.l)) {
                float f4 = this.l;
                this.H = 1.0f;
                Typeface typeface = this.w;
                Typeface typeface2 = this.u;
                if (typeface != typeface2) {
                    this.w = typeface2;
                    z3 = true;
                } else {
                    z3 = false;
                }
                f3 = f4;
                z2 = z3;
            } else {
                f3 = this.k;
                Typeface typeface3 = this.w;
                Typeface typeface4 = this.v;
                if (typeface3 != typeface4) {
                    this.w = typeface4;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (a(f2, this.k)) {
                    this.H = 1.0f;
                } else {
                    this.H = f2 / this.k;
                }
                float f5 = this.l / this.k;
                width = width2 * f5 > width ? Math.min(width / f5, width2) : width2;
            }
            if (width > 0.0f) {
                z2 = this.I != f3 || this.K || z2;
                this.I = f3;
                this.K = false;
            }
            if (this.A == null || z2) {
                this.L.setTextSize(this.I);
                this.L.setTypeface(this.w);
                TextPaint textPaint = this.L;
                if (this.H == 1.0f) {
                    z4 = false;
                }
                textPaint.setLinearText(z4);
                CharSequence ellipsize = TextUtils.ellipsize(this.z, this.L, width, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.A)) {
                    this.A = ellipsize;
                    this.B = b(this.A);
                }
            }
        }
    }

    private boolean c(Typeface typeface) {
        a aVar = this.y;
        if (aVar != null) {
            aVar.a();
        }
        if (this.u == typeface) {
            return false;
        }
        this.u = typeface;
        return true;
    }

    private void d(float f2) {
        this.f14072h.left = a((float) this.f14070f.left, (float) this.f14071g.left, f2, this.N);
        this.f14072h.top = a(this.o, this.p, f2, this.N);
        this.f14072h.right = a((float) this.f14070f.right, (float) this.f14071g.right, f2, this.N);
        this.f14072h.bottom = a((float) this.f14070f.bottom, (float) this.f14071g.bottom, f2, this.N);
    }

    private boolean d(Typeface typeface) {
        a aVar = this.x;
        if (aVar != null) {
            aVar.a();
        }
        if (this.v == typeface) {
            return false;
        }
        this.v = typeface;
        return true;
    }

    private void e(float f2) {
        c(f2);
        this.C = f14065a && this.H != 1.0f;
        if (this.C) {
            m();
        }
        y.E(this.f14067c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j() {
        /*
            r11 = this;
            float r0 = r11.I
            float r1 = r11.l
            r11.c((float) r1)
            java.lang.CharSequence r1 = r11.A
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0018
            android.text.TextPaint r4 = r11.L
            int r5 = r1.length()
            float r1 = r4.measureText(r1, r2, r5)
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            int r4 = r11.j
            boolean r5 = r11.B
            int r4 = b.h.j.C0197c.a(r4, r5)
            r5 = r4 & 112(0x70, float:1.57E-43)
            r6 = 80
            r7 = 48
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r7) goto L_0x0053
            if (r5 == r6) goto L_0x004d
            android.text.TextPaint r5 = r11.L
            float r5 = r5.descent()
            android.text.TextPaint r9 = r11.L
            float r9 = r9.ascent()
            float r5 = r5 - r9
            float r5 = r5 / r8
            android.text.TextPaint r9 = r11.L
            float r9 = r9.descent()
            float r5 = r5 - r9
            android.graphics.Rect r9 = r11.f14071g
            int r9 = r9.centerY()
            float r9 = (float) r9
            float r9 = r9 + r5
            r11.p = r9
            goto L_0x0061
        L_0x004d:
            android.graphics.Rect r5 = r11.f14071g
            int r5 = r5.bottom
            float r5 = (float) r5
            goto L_0x005f
        L_0x0053:
            android.graphics.Rect r5 = r11.f14071g
            int r5 = r5.top
            float r5 = (float) r5
            android.text.TextPaint r9 = r11.L
            float r9 = r9.ascent()
            float r5 = r5 - r9
        L_0x005f:
            r11.p = r5
        L_0x0061:
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r5
            r9 = 5
            r10 = 1
            if (r4 == r10) goto L_0x0079
            if (r4 == r9) goto L_0x0073
            android.graphics.Rect r1 = r11.f14071g
            int r1 = r1.left
            float r1 = (float) r1
            r11.r = r1
            goto L_0x0084
        L_0x0073:
            android.graphics.Rect r4 = r11.f14071g
            int r4 = r4.right
            float r4 = (float) r4
            goto L_0x0081
        L_0x0079:
            android.graphics.Rect r4 = r11.f14071g
            int r4 = r4.centerX()
            float r4 = (float) r4
            float r1 = r1 / r8
        L_0x0081:
            float r4 = r4 - r1
            r11.r = r4
        L_0x0084:
            float r1 = r11.k
            r11.c((float) r1)
            java.lang.CharSequence r1 = r11.A
            if (r1 == 0) goto L_0x0097
            android.text.TextPaint r3 = r11.L
            int r4 = r1.length()
            float r3 = r3.measureText(r1, r2, r4)
        L_0x0097:
            int r1 = r11.i
            boolean r2 = r11.B
            int r1 = b.h.j.C0197c.a(r1, r2)
            r2 = r1 & 112(0x70, float:1.57E-43)
            if (r2 == r7) goto L_0x00cb
            if (r2 == r6) goto L_0x00c5
            android.text.TextPaint r2 = r11.L
            float r2 = r2.descent()
            android.text.TextPaint r4 = r11.L
            float r4 = r4.ascent()
            float r2 = r2 - r4
            float r2 = r2 / r8
            android.text.TextPaint r4 = r11.L
            float r4 = r4.descent()
            float r2 = r2 - r4
            android.graphics.Rect r4 = r11.f14070f
            int r4 = r4.centerY()
            float r4 = (float) r4
            float r4 = r4 + r2
            r11.o = r4
            goto L_0x00d9
        L_0x00c5:
            android.graphics.Rect r2 = r11.f14070f
            int r2 = r2.bottom
            float r2 = (float) r2
            goto L_0x00d7
        L_0x00cb:
            android.graphics.Rect r2 = r11.f14070f
            int r2 = r2.top
            float r2 = (float) r2
            android.text.TextPaint r4 = r11.L
            float r4 = r4.ascent()
            float r2 = r2 - r4
        L_0x00d7:
            r11.o = r2
        L_0x00d9:
            r1 = r1 & r5
            if (r1 == r10) goto L_0x00ec
            if (r1 == r9) goto L_0x00e6
            android.graphics.Rect r1 = r11.f14070f
            int r1 = r1.left
            float r1 = (float) r1
        L_0x00e3:
            r11.q = r1
            goto L_0x00f6
        L_0x00e6:
            android.graphics.Rect r1 = r11.f14070f
            int r1 = r1.right
            float r1 = (float) r1
            goto L_0x00f4
        L_0x00ec:
            android.graphics.Rect r1 = r11.f14070f
            int r1 = r1.centerX()
            float r1 = (float) r1
            float r3 = r3 / r8
        L_0x00f4:
            float r1 = r1 - r3
            goto L_0x00e3
        L_0x00f6:
            r11.l()
            r11.e(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.d.j():void");
    }

    private void k() {
        b(this.f14069e);
    }

    private void l() {
        Bitmap bitmap = this.D;
        if (bitmap != null) {
            bitmap.recycle();
            this.D = null;
        }
    }

    private void m() {
        if (this.D == null && !this.f14070f.isEmpty() && !TextUtils.isEmpty(this.A)) {
            b(0.0f);
            this.F = this.L.ascent();
            this.G = this.L.descent();
            TextPaint textPaint = this.L;
            CharSequence charSequence = this.A;
            int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int round2 = Math.round(this.G - this.F);
            if (round > 0 && round2 > 0) {
                this.D = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.D);
                CharSequence charSequence2 = this.A;
                canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) round2) - this.L.descent(), this.L);
                if (this.E == null) {
                    this.E = new Paint(3);
                }
            }
        }
    }

    private int n() {
        return c(this.m);
    }

    public int a() {
        return this.j;
    }

    public void a(float f2) {
        float a2 = b.h.d.a.a(f2, 0.0f, 1.0f);
        if (a2 != this.f14069e) {
            this.f14069e = a2;
            k();
        }
    }

    public void a(int i2) {
        f fVar = new f(this.f14067c.getContext(), i2);
        ColorStateList colorStateList = fVar.f4806b;
        if (colorStateList != null) {
            this.n = colorStateList;
        }
        float f2 = fVar.f4805a;
        if (f2 != 0.0f) {
            this.l = f2;
        }
        ColorStateList colorStateList2 = fVar.i;
        if (colorStateList2 != null) {
            this.S = colorStateList2;
        }
        this.Q = fVar.j;
        this.R = fVar.k;
        this.P = fVar.l;
        a aVar = this.y;
        if (aVar != null) {
            aVar.a();
        }
        this.y = new a(new b(this), fVar.a());
        fVar.a(this.f14067c.getContext(), (h) this.y);
        i();
    }

    public void a(int i2, int i3, int i4, int i5) {
        if (!a(this.f14071g, i2, i3, i4, i5)) {
            this.f14071g.set(i2, i3, i4, i5);
            this.K = true;
            h();
        }
    }

    public void a(TimeInterpolator timeInterpolator) {
        this.O = timeInterpolator;
        i();
    }

    public void a(ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            i();
        }
    }

    public void a(Canvas canvas) {
        float f2;
        int save = canvas.save();
        if (this.A != null && this.f14068d) {
            float f3 = this.s;
            float f4 = this.t;
            boolean z2 = this.C && this.D != null;
            if (z2) {
                f2 = this.F * this.H;
                float f5 = this.G;
            } else {
                f2 = this.L.ascent() * this.H;
                this.L.descent();
                float f6 = this.H;
            }
            if (z2) {
                f4 += f2;
            }
            float f7 = f4;
            float f8 = this.H;
            if (f8 != 1.0f) {
                canvas.scale(f8, f8, f3, f7);
            }
            if (z2) {
                canvas.drawBitmap(this.D, f3, f7, this.E);
            } else {
                CharSequence charSequence = this.A;
                canvas.drawText(charSequence, 0, charSequence.length(), f3, f7, this.L);
            }
        }
        canvas.restoreToCount(save);
    }

    public void a(Typeface typeface) {
        if (c(typeface)) {
            i();
        }
    }

    public void a(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.z, charSequence)) {
            this.z = charSequence;
            this.A = null;
            l();
            i();
        }
    }

    public final boolean a(int[] iArr) {
        this.J = iArr;
        if (!g()) {
            return false;
        }
        i();
        return true;
    }

    public Typeface b() {
        Typeface typeface = this.u;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void b(int i2) {
        if (this.j != i2) {
            this.j = i2;
            i();
        }
    }

    public void b(int i2, int i3, int i4, int i5) {
        if (!a(this.f14070f, i2, i3, i4, i5)) {
            this.f14070f.set(i2, i3, i4, i5);
            this.K = true;
            h();
        }
    }

    public void b(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            i();
        }
    }

    public void b(Typeface typeface) {
        if (d(typeface)) {
            i();
        }
    }

    public int c() {
        return c(this.n);
    }

    public void c(int i2) {
        f fVar = new f(this.f14067c.getContext(), i2);
        ColorStateList colorStateList = fVar.f4806b;
        if (colorStateList != null) {
            this.m = colorStateList;
        }
        float f2 = fVar.f4805a;
        if (f2 != 0.0f) {
            this.k = f2;
        }
        ColorStateList colorStateList2 = fVar.i;
        if (colorStateList2 != null) {
            this.W = colorStateList2;
        }
        this.U = fVar.j;
        this.V = fVar.k;
        this.T = fVar.l;
        a aVar = this.x;
        if (aVar != null) {
            aVar.a();
        }
        this.x = new a(new c(this), fVar.a());
        fVar.a(this.f14067c.getContext(), (h) this.x);
        i();
    }

    public int d() {
        return this.i;
    }

    public void d(int i2) {
        if (this.i != i2) {
            this.i = i2;
            i();
        }
    }

    public Typeface e() {
        Typeface typeface = this.v;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public CharSequence f() {
        return this.z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.m;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.n
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.m
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.d.g():boolean");
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.f14068d = this.f14071g.width() > 0 && this.f14071g.height() > 0 && this.f14070f.width() > 0 && this.f14070f.height() > 0;
    }

    public void i() {
        if (this.f14067c.getHeight() > 0 && this.f14067c.getWidth() > 0) {
            j();
            k();
        }
    }
}
