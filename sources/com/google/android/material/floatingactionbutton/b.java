package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import c.b.b.c.o.h;
import c.b.b.c.o.i;

class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private final i f14012a = new i();

    /* renamed from: b  reason: collision with root package name */
    private final Paint f14013b;

    /* renamed from: c  reason: collision with root package name */
    private final Path f14014c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private final Rect f14015d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private final RectF f14016e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    private final a f14017f = new a();

    /* renamed from: g  reason: collision with root package name */
    float f14018g;

    /* renamed from: h  reason: collision with root package name */
    private int f14019h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m = true;
    private h n;
    private ColorStateList o;

    private class a extends Drawable.ConstantState {
        private a() {
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return b.this;
        }
    }

    b(h hVar) {
        this.n = hVar;
        this.f14013b = new Paint(1);
        this.f14013b.setStyle(Paint.Style.STROKE);
    }

    private Shader a() {
        Rect rect = this.f14015d;
        copyBounds(rect);
        float height = this.f14018g / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{b.h.b.a.a(this.f14019h, this.l), b.h.b.a.a(this.i, this.l), b.h.b.a.a(b.h.b.a.b(this.i, 0), this.l), b.h.b.a.a(b.h.b.a.b(this.k, 0), this.l), b.h.b.a.a(this.k, this.l), b.h.b.a.a(this.j, this.l)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    public void a(float f2) {
        if (this.f14018g != f2) {
            this.f14018g = f2;
            this.f14013b.setStrokeWidth(f2 * 1.3333f);
            this.m = true;
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3, int i4, int i5) {
        this.f14019h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.l = colorStateList.getColorForState(getState(), this.l);
        }
        this.o = colorStateList;
        this.m = true;
        invalidateSelf();
    }

    public void a(h hVar) {
        this.n = hVar;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        if (this.m) {
            this.f14013b.setShader(a());
            this.m = false;
        }
        float strokeWidth = this.f14013b.getStrokeWidth() / 2.0f;
        copyBounds(this.f14015d);
        this.f14016e.set(this.f14015d);
        float min = Math.min(this.n.g().a(), this.f14016e.width() / 2.0f);
        if (this.n.i()) {
            this.f14016e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f14016e, min, min, this.f14013b);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f14017f;
    }

    public int getOpacity() {
        return this.f14018g > 0.0f ? -3 : -2;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.n.i()) {
            outline.setRoundRect(getBounds(), this.n.g().a());
            return;
        }
        copyBounds(this.f14015d);
        this.f14016e.set(this.f14015d);
        this.f14012a.a(this.n, 1.0f, this.f14016e, this.f14014c);
        if (this.f14014c.isConvex()) {
            outline.setConvexPath(this.f14014c);
        }
    }

    public boolean getPadding(Rect rect) {
        if (!this.n.i()) {
            return true;
        }
        int round = Math.round(this.f14018g);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.o;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.m = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.o;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.l)) == this.l)) {
            this.m = true;
            this.l = colorForState;
        }
        if (this.m) {
            invalidateSelf();
        }
        return this.m;
    }

    public void setAlpha(int i2) {
        this.f14013b.setAlpha(i2);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f14013b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
