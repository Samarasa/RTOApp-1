package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.b;
import c.b.b.c.a.h;
import c.b.b.c.k;
import c.b.b.c.l.f;
import c.b.b.c.o.e;
import com.google.android.material.internal.u;
import com.google.android.material.internal.v;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class c extends e implements b, Drawable.Callback, u.a {
    private static final int[] v = {16842910};
    private static final int[][] w = {new int[]{16842910, 16842913}, new int[]{16842910, 16842912}, new int[]{16842910}, new int[0]};
    private static final ShapeDrawable x = new ShapeDrawable(new OvalShape());
    private float A;
    private WeakReference<a> Aa = new WeakReference<>((Object) null);
    private float B;
    private TextUtils.TruncateAt Ba;
    private ColorStateList C;
    private boolean Ca;
    private float D;
    private int Da;
    private ColorStateList E;
    private boolean Ea;
    private CharSequence F;
    private boolean G;
    private Drawable H;
    private ColorStateList I;
    private float J;
    private boolean K;
    private Drawable L;
    private Drawable M;
    private ColorStateList N;
    private float O;
    private CharSequence P;
    private boolean Q;
    private boolean R;
    private Drawable S;
    private h T;
    private h U;
    private float V;
    private float W;
    private float X;
    private float Y;
    private float Z;
    private float aa;
    private float ba;
    private float ca;
    private final Context da;
    private final Paint ea = new Paint(1);
    private final Paint fa;
    private final Paint.FontMetrics ga = new Paint.FontMetrics();
    private final RectF ha = new RectF();
    private final PointF ia = new PointF();
    private final Path ja = new Path();
    private final u ka;
    private int la;
    private int ma;
    private int na;
    private int oa;
    private int pa;
    private boolean qa;
    private int ra;
    private int sa = 255;
    private ColorFilter ta;
    private PorterDuffColorFilter ua;
    private ColorStateList va;
    private PorterDuff.Mode wa = PorterDuff.Mode.SRC_IN;
    private int[] xa;
    private ColorStateList y;
    private boolean ya;
    private ColorStateList z;
    private ColorStateList za;

    public interface a {
        void a();
    }

    private c(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context);
        this.da = context;
        this.ka = new u(this);
        this.F = BuildConfig.FLAVOR;
        this.ka.b().density = context.getResources().getDisplayMetrics().density;
        this.fa = null;
        Paint paint = this.fa;
        if (paint != null) {
            paint.setStyle(Paint.Style.STROKE);
        }
        setState(v);
        a(v);
        this.Ca = true;
        if (c.b.b.c.m.a.f4814a) {
            x.setTint(-1);
        }
    }

    private float V() {
        this.ka.b().getFontMetrics(this.ga);
        Paint.FontMetrics fontMetrics = this.ga;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private boolean W() {
        return this.R && this.S != null && this.Q;
    }

    private ColorFilter X() {
        ColorFilter colorFilter = this.ta;
        return colorFilter != null ? colorFilter : this.ua;
    }

    private boolean Y() {
        return this.R && this.S != null && this.qa;
    }

    private boolean Z() {
        return this.G && this.H != null;
    }

    private ColorStateList a(ColorStateList colorStateList, ColorStateList colorStateList2) {
        return c.b.b.c.f.a.a(colorStateList2, this.la, colorStateList, this.ma, w);
    }

    public static c a(Context context, AttributeSet attributeSet, int i, int i2) {
        c cVar = new c(context, attributeSet, i, i2);
        cVar.a(attributeSet, i, i2);
        return cVar;
    }

    private void a(Canvas canvas, Rect rect) {
        if (Y()) {
            a(rect, this.ha);
            RectF rectF = this.ha;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.S.setBounds(0, 0, (int) this.ha.width(), (int) this.ha.height());
            this.S.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    private void a(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Z() || Y()) {
            float f2 = this.V + this.W;
            if (androidx.core.graphics.drawable.a.e(this) == 0) {
                rectF.left = ((float) rect.left) + f2;
                rectF.right = rectF.left + this.J;
            } else {
                rectF.right = ((float) rect.right) - f2;
                rectF.left = rectF.right - this.J;
            }
            float exactCenterY = rect.exactCenterY();
            float f3 = this.J;
            rectF.top = exactCenterY - (f3 / 2.0f);
            rectF.bottom = rectF.top + f3;
        }
    }

    private void a(AttributeSet attributeSet, int i, int i2) {
        TextUtils.TruncateAt truncateAt;
        TypedArray a2 = v.a(this.da, attributeSet, k.Chip, i, i2, new int[0]);
        this.Ea = a2.hasValue(k.Chip_shapeAppearance);
        i(c.b.b.c.l.c.a(this.da, a2, k.Chip_chipSurfaceColor));
        c(c.b.b.c.l.c.a(this.da, a2, k.Chip_chipBackgroundColor));
        g(a2.getDimension(k.Chip_chipMinHeight, 0.0f));
        if (a2.hasValue(k.Chip_chipCornerRadius)) {
            d(a2.getDimension(k.Chip_chipCornerRadius, 0.0f));
        }
        e(c.b.b.c.l.c.a(this.da, a2, k.Chip_chipStrokeColor));
        i(a2.getDimension(k.Chip_chipStrokeWidth, 0.0f));
        g(c.b.b.c.l.c.a(this.da, a2, k.Chip_rippleColor));
        b(a2.getText(k.Chip_android_text));
        a(c.b.b.c.l.c.c(this.da, a2, k.Chip_android_textAppearance));
        int i3 = a2.getInt(k.Chip_android_ellipsize, 0);
        if (i3 == 1) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (i3 != 2) {
            if (i3 == 3) {
                truncateAt = TextUtils.TruncateAt.END;
            }
            c(a2.getBoolean(k.Chip_chipIconVisible, false));
            if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
                c(a2.getBoolean(k.Chip_chipIconEnabled, false));
            }
            b(c.b.b.c.l.c.b(this.da, a2, k.Chip_chipIcon));
            d(c.b.b.c.l.c.a(this.da, a2, k.Chip_chipIconTint));
            f(a2.getDimension(k.Chip_chipIconSize, 0.0f));
            d(a2.getBoolean(k.Chip_closeIconVisible, false));
            if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
                d(a2.getBoolean(k.Chip_closeIconEnabled, false));
            }
            c(c.b.b.c.l.c.b(this.da, a2, k.Chip_closeIcon));
            f(c.b.b.c.l.c.a(this.da, a2, k.Chip_closeIconTint));
            k(a2.getDimension(k.Chip_closeIconSize, 0.0f));
            a(a2.getBoolean(k.Chip_android_checkable, false));
            b(a2.getBoolean(k.Chip_checkedIconVisible, false));
            if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
                b(a2.getBoolean(k.Chip_checkedIconEnabled, false));
            }
            a(c.b.b.c.l.c.b(this.da, a2, k.Chip_checkedIcon));
            b(h.a(this.da, a2, k.Chip_showMotionSpec));
            a(h.a(this.da, a2, k.Chip_hideMotionSpec));
            h(a2.getDimension(k.Chip_chipStartPadding, 0.0f));
            n(a2.getDimension(k.Chip_iconStartPadding, 0.0f));
            m(a2.getDimension(k.Chip_iconEndPadding, 0.0f));
            p(a2.getDimension(k.Chip_textStartPadding, 0.0f));
            o(a2.getDimension(k.Chip_textEndPadding, 0.0f));
            l(a2.getDimension(k.Chip_closeIconStartPadding, 0.0f));
            j(a2.getDimension(k.Chip_closeIconEndPadding, 0.0f));
            e(a2.getDimension(k.Chip_chipEndPadding, 0.0f));
            y(a2.getDimensionPixelSize(k.Chip_android_maxWidth, Integer.MAX_VALUE));
            a2.recycle();
        } else {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        }
        a(truncateAt);
        c(a2.getBoolean(k.Chip_chipIconVisible, false));
        c(a2.getBoolean(k.Chip_chipIconEnabled, false));
        b(c.b.b.c.l.c.b(this.da, a2, k.Chip_chipIcon));
        d(c.b.b.c.l.c.a(this.da, a2, k.Chip_chipIconTint));
        f(a2.getDimension(k.Chip_chipIconSize, 0.0f));
        d(a2.getBoolean(k.Chip_closeIconVisible, false));
        d(a2.getBoolean(k.Chip_closeIconEnabled, false));
        c(c.b.b.c.l.c.b(this.da, a2, k.Chip_closeIcon));
        f(c.b.b.c.l.c.a(this.da, a2, k.Chip_closeIconTint));
        k(a2.getDimension(k.Chip_closeIconSize, 0.0f));
        a(a2.getBoolean(k.Chip_android_checkable, false));
        b(a2.getBoolean(k.Chip_checkedIconVisible, false));
        b(a2.getBoolean(k.Chip_checkedIconEnabled, false));
        a(c.b.b.c.l.c.b(this.da, a2, k.Chip_checkedIcon));
        b(h.a(this.da, a2, k.Chip_showMotionSpec));
        a(h.a(this.da, a2, k.Chip_hideMotionSpec));
        h(a2.getDimension(k.Chip_chipStartPadding, 0.0f));
        n(a2.getDimension(k.Chip_iconStartPadding, 0.0f));
        m(a2.getDimension(k.Chip_iconEndPadding, 0.0f));
        p(a2.getDimension(k.Chip_textStartPadding, 0.0f));
        o(a2.getDimension(k.Chip_textEndPadding, 0.0f));
        l(a2.getDimension(k.Chip_closeIconStartPadding, 0.0f));
        j(a2.getDimension(k.Chip_closeIconEndPadding, 0.0f));
        e(a2.getDimension(k.Chip_chipEndPadding, 0.0f));
        y(a2.getDimensionPixelSize(k.Chip_android_maxWidth, Integer.MAX_VALUE));
        a2.recycle();
    }

    private static boolean a(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(int[] r6, int[] r7) {
        /*
            r5 = this;
            boolean r0 = super.onStateChange(r6)
            android.content.res.ColorStateList r1 = r5.y
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r5.la
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r3 = r5.la
            r4 = 1
            if (r3 == r1) goto L_0x0019
            r5.la = r1
            r0 = 1
        L_0x0019:
            android.content.res.ColorStateList r1 = r5.z
            if (r1 == 0) goto L_0x0024
            int r3 = r5.ma
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            int r3 = r5.ma
            if (r3 == r1) goto L_0x002c
            r5.ma = r1
            r0 = 1
        L_0x002c:
            android.content.res.ColorStateList r1 = r5.C
            if (r1 == 0) goto L_0x0037
            int r3 = r5.na
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            int r3 = r5.na
            if (r3 == r1) goto L_0x003f
            r5.na = r1
            r0 = 1
        L_0x003f:
            android.content.res.ColorStateList r1 = r5.za
            if (r1 == 0) goto L_0x004a
            int r3 = r5.oa
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x004b
        L_0x004a:
            r1 = 0
        L_0x004b:
            int r3 = r5.oa
            if (r3 == r1) goto L_0x0056
            r5.oa = r1
            boolean r1 = r5.ya
            if (r1 == 0) goto L_0x0056
            r0 = 1
        L_0x0056:
            com.google.android.material.internal.u r1 = r5.ka
            c.b.b.c.l.f r1 = r1.a()
            if (r1 == 0) goto L_0x0077
            com.google.android.material.internal.u r1 = r5.ka
            c.b.b.c.l.f r1 = r1.a()
            android.content.res.ColorStateList r1 = r1.f4806b
            if (r1 == 0) goto L_0x0077
            com.google.android.material.internal.u r1 = r5.ka
            c.b.b.c.l.f r1 = r1.a()
            android.content.res.ColorStateList r1 = r1.f4806b
            int r3 = r5.pa
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x0078
        L_0x0077:
            r1 = 0
        L_0x0078:
            int r3 = r5.pa
            if (r3 == r1) goto L_0x007f
            r5.pa = r1
            r0 = 1
        L_0x007f:
            int[] r1 = r5.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            boolean r1 = a((int[]) r1, (int) r3)
            if (r1 == 0) goto L_0x0092
            boolean r1 = r5.Q
            if (r1 == 0) goto L_0x0092
            r1 = 1
            goto L_0x0093
        L_0x0092:
            r1 = 0
        L_0x0093:
            boolean r3 = r5.qa
            if (r3 == r1) goto L_0x00ad
            android.graphics.drawable.Drawable r3 = r5.S
            if (r3 == 0) goto L_0x00ad
            float r0 = r5.l()
            r5.qa = r1
            float r1 = r5.l()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00ac
            r0 = 1
            r1 = 1
            goto L_0x00ae
        L_0x00ac:
            r0 = 1
        L_0x00ad:
            r1 = 0
        L_0x00ae:
            android.content.res.ColorStateList r3 = r5.va
            if (r3 == 0) goto L_0x00b8
            int r2 = r5.ra
            int r2 = r3.getColorForState(r6, r2)
        L_0x00b8:
            int r3 = r5.ra
            if (r3 == r2) goto L_0x00c9
            r5.ra = r2
            android.content.res.ColorStateList r0 = r5.va
            android.graphics.PorterDuff$Mode r2 = r5.wa
            android.graphics.PorterDuffColorFilter r0 = c.b.b.c.g.a.a(r5, r0, r2)
            r5.ua = r0
            r0 = 1
        L_0x00c9:
            android.graphics.drawable.Drawable r2 = r5.H
            boolean r2 = e((android.graphics.drawable.Drawable) r2)
            if (r2 == 0) goto L_0x00d8
            android.graphics.drawable.Drawable r2 = r5.H
            boolean r2 = r2.setState(r6)
            r0 = r0 | r2
        L_0x00d8:
            android.graphics.drawable.Drawable r2 = r5.S
            boolean r2 = e((android.graphics.drawable.Drawable) r2)
            if (r2 == 0) goto L_0x00e7
            android.graphics.drawable.Drawable r2 = r5.S
            boolean r6 = r2.setState(r6)
            r0 = r0 | r6
        L_0x00e7:
            android.graphics.drawable.Drawable r6 = r5.L
            boolean r6 = e((android.graphics.drawable.Drawable) r6)
            if (r6 == 0) goto L_0x00f6
            android.graphics.drawable.Drawable r6 = r5.L
            boolean r6 = r6.setState(r7)
            r0 = r0 | r6
        L_0x00f6:
            boolean r6 = c.b.b.c.m.a.f4814a
            if (r6 == 0) goto L_0x0109
            android.graphics.drawable.Drawable r6 = r5.M
            boolean r6 = e((android.graphics.drawable.Drawable) r6)
            if (r6 == 0) goto L_0x0109
            android.graphics.drawable.Drawable r6 = r5.M
            boolean r6 = r6.setState(r7)
            r0 = r0 | r6
        L_0x0109:
            if (r0 == 0) goto L_0x010e
            r5.invalidateSelf()
        L_0x010e:
            if (r1 == 0) goto L_0x0113
            r5.T()
        L_0x0113:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.c.a(int[], int[]):boolean");
    }

    private boolean aa() {
        return this.K && this.L != null;
    }

    private void b(Canvas canvas, Rect rect) {
        if (!this.Ea) {
            this.ea.setColor(this.ma);
            this.ea.setStyle(Paint.Style.FILL);
            this.ea.setColorFilter(X());
            this.ha.set(rect);
            canvas.drawRoundRect(this.ha, p(), p(), this.ea);
        }
    }

    private void b(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (aa()) {
            float f2 = this.ca + this.ba + this.O + this.aa + this.Z;
            if (androidx.core.graphics.drawable.a.e(this) == 0) {
                rectF.right = ((float) rect.right) - f2;
            } else {
                rectF.left = ((float) rect.left) + f2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.f4806b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean b(c.b.b.c.l.f r0) {
        /*
            if (r0 == 0) goto L_0x000e
            android.content.res.ColorStateList r0 = r0.f4806b
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.c.b(c.b.b.c.l.f):boolean");
    }

    private void ba() {
        this.za = this.ya ? c.b.b.c.m.a.a(this.E) : null;
    }

    private void c(Canvas canvas, Rect rect) {
        if (Z()) {
            a(rect, this.ha);
            RectF rectF = this.ha;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.H.setBounds(0, 0, (int) this.ha.width(), (int) this.ha.height());
            this.H.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    private void c(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (aa()) {
            float f2 = this.ca + this.ba;
            if (androidx.core.graphics.drawable.a.e(this) == 0) {
                rectF.right = ((float) rect.right) - f2;
                rectF.left = rectF.right - this.O;
            } else {
                rectF.left = ((float) rect.left) + f2;
                rectF.right = rectF.left + this.O;
            }
            float exactCenterY = rect.exactCenterY();
            float f3 = this.O;
            rectF.top = exactCenterY - (f3 / 2.0f);
            rectF.bottom = rectF.top + f3;
        }
    }

    private void ca() {
        this.M = new RippleDrawable(c.b.b.c.m.a.a(J()), this.L, x);
    }

    private void d(Canvas canvas, Rect rect) {
        if (this.D > 0.0f && !this.Ea) {
            this.ea.setColor(this.na);
            this.ea.setStyle(Paint.Style.STROKE);
            if (!this.Ea) {
                this.ea.setColorFilter(X());
            }
            RectF rectF = this.ha;
            float f2 = this.D;
            rectF.set(((float) rect.left) + (f2 / 2.0f), ((float) rect.top) + (f2 / 2.0f), ((float) rect.right) - (f2 / 2.0f), ((float) rect.bottom) - (f2 / 2.0f));
            float f3 = this.B - (this.D / 2.0f);
            canvas.drawRoundRect(this.ha, f3, f3, this.ea);
        }
    }

    private void d(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (aa()) {
            float f2 = this.ca + this.ba + this.O + this.aa + this.Z;
            if (androidx.core.graphics.drawable.a.e(this) == 0) {
                rectF.right = (float) rect.right;
                rectF.left = rectF.right - f2;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f2;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private void d(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            androidx.core.graphics.drawable.a.a(drawable, androidx.core.graphics.drawable.a.e(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.L) {
                if (drawable.isStateful()) {
                    drawable.setState(D());
                }
                androidx.core.graphics.drawable.a.a(drawable, this.N);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.H;
            if (drawable == drawable2) {
                androidx.core.graphics.drawable.a.a(drawable2, this.I);
            }
        }
    }

    private void e(Canvas canvas, Rect rect) {
        if (!this.Ea) {
            this.ea.setColor(this.la);
            this.ea.setStyle(Paint.Style.FILL);
            this.ha.set(rect);
            canvas.drawRoundRect(this.ha, p(), p(), this.ea);
        }
    }

    private void e(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.F != null) {
            float l = this.V + l() + this.Y;
            float m = this.ca + m() + this.Z;
            if (androidx.core.graphics.drawable.a.e(this) == 0) {
                rectF.left = ((float) rect.left) + l;
                rectF.right = ((float) rect.right) - m;
            } else {
                rectF.left = ((float) rect.left) + m;
                rectF.right = ((float) rect.right) - l;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private static boolean e(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private void f(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (aa()) {
            c(rect, this.ha);
            RectF rectF = this.ha;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.L.setBounds(0, 0, (int) this.ha.width(), (int) this.ha.height());
            if (c.b.b.c.m.a.f4814a) {
                this.M.setBounds(this.L.getBounds());
                drawable = this.M;
            } else {
                drawable = this.L;
            }
            drawable.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    private void f(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    private void g(Canvas canvas, Rect rect) {
        this.ea.setColor(this.oa);
        this.ea.setStyle(Paint.Style.FILL);
        this.ha.set(rect);
        if (!this.Ea) {
            canvas.drawRoundRect(this.ha, p(), p(), this.ea);
            return;
        }
        a(rect, this.ja);
        super.a(canvas, this.ea, this.ja, c());
    }

    private void h(Canvas canvas, Rect rect) {
        Paint paint = this.fa;
        if (paint != null) {
            paint.setColor(b.h.b.a.b(-16777216, 127));
            canvas.drawRect(rect, this.fa);
            if (Z() || Y()) {
                a(rect, this.ha);
                canvas.drawRect(this.ha, this.fa);
            }
            if (this.F != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.fa);
            }
            if (aa()) {
                c(rect, this.ha);
                canvas.drawRect(this.ha, this.fa);
            }
            this.fa.setColor(b.h.b.a.b(-65536, 127));
            b(rect, this.ha);
            canvas.drawRect(this.ha, this.fa);
            this.fa.setColor(b.h.b.a.b(-16711936, 127));
            d(rect, this.ha);
            canvas.drawRect(this.ha, this.fa);
        }
    }

    private static boolean h(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private void i(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.y != colorStateList) {
            this.y = colorStateList;
            if (!(!this.Ea || colorStateList == null || (colorStateList2 = this.z) == null)) {
                a(a(colorStateList2, colorStateList));
            }
            onStateChange(getState());
        }
    }

    private void i(Canvas canvas, Rect rect) {
        if (this.F != null) {
            Paint.Align a2 = a(rect, this.ia);
            e(rect, this.ha);
            if (this.ka.a() != null) {
                this.ka.b().drawableState = getState();
                this.ka.a(this.da);
            }
            this.ka.b().setTextAlign(a2);
            int i = 0;
            boolean z2 = Math.round(this.ka.a(L().toString())) > Math.round(this.ha.width());
            if (z2) {
                i = canvas.save();
                canvas.clipRect(this.ha);
            }
            CharSequence charSequence = this.F;
            if (z2 && this.Ba != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.ka.b(), this.ha.width(), this.Ba);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.ia;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.ka.b());
            if (z2) {
                canvas.restoreToCount(i);
            }
        }
    }

    public float A() {
        return this.ba;
    }

    public void A(int i) {
        b(h.a(this.da, i));
    }

    public float B() {
        return this.O;
    }

    public void B(int i) {
        a(new f(this.da, i));
    }

    public float C() {
        return this.aa;
    }

    public void C(int i) {
        o(this.da.getResources().getDimension(i));
    }

    public void D(int i) {
        p(this.da.getResources().getDimension(i));
    }

    public int[] D() {
        return this.xa;
    }

    public ColorStateList E() {
        return this.N;
    }

    public TextUtils.TruncateAt F() {
        return this.Ba;
    }

    public h G() {
        return this.U;
    }

    public float H() {
        return this.X;
    }

    public float I() {
        return this.W;
    }

    public ColorStateList J() {
        return this.E;
    }

    public h K() {
        return this.T;
    }

    public CharSequence L() {
        return this.F;
    }

    public f M() {
        return this.ka.a();
    }

    public float N() {
        return this.Z;
    }

    public float O() {
        return this.Y;
    }

    public boolean P() {
        return this.ya;
    }

    public boolean Q() {
        return this.Q;
    }

    public boolean R() {
        return e(this.L);
    }

    public boolean S() {
        return this.K;
    }

    /* access modifiers changed from: protected */
    public void T() {
        a aVar = (a) this.Aa.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean U() {
        return this.Ca;
    }

    /* access modifiers changed from: package-private */
    public Paint.Align a(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.F != null) {
            float l = this.V + l() + this.Y;
            if (androidx.core.graphics.drawable.a.e(this) == 0) {
                pointF.x = ((float) rect.left) + l;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - l;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - V();
        }
        return align;
    }

    public void a() {
        T();
        invalidateSelf();
    }

    public void a(RectF rectF) {
        d(getBounds(), rectF);
    }

    public void a(Drawable drawable) {
        if (this.S != drawable) {
            float l = l();
            this.S = drawable;
            float l2 = l();
            f(this.S);
            d(this.S);
            invalidateSelf();
            if (l != l2) {
                T();
            }
        }
    }

    public void a(TextUtils.TruncateAt truncateAt) {
        this.Ba = truncateAt;
    }

    public void a(h hVar) {
        this.U = hVar;
    }

    public void a(f fVar) {
        this.ka.a(fVar, this.da);
    }

    public void a(a aVar) {
        this.Aa = new WeakReference<>(aVar);
    }

    public void a(CharSequence charSequence) {
        if (this.P != charSequence) {
            this.P = b.h.h.a.a().a(charSequence);
            invalidateSelf();
        }
    }

    public void a(boolean z2) {
        if (this.Q != z2) {
            this.Q = z2;
            float l = l();
            if (!z2 && this.qa) {
                this.qa = false;
            }
            float l2 = l();
            invalidateSelf();
            if (l != l2) {
                T();
            }
        }
    }

    public boolean a(int[] iArr) {
        if (Arrays.equals(this.xa, iArr)) {
            return false;
        }
        this.xa = iArr;
        if (aa()) {
            return a(getState(), iArr);
        }
        return false;
    }

    public void b(Drawable drawable) {
        Drawable r = r();
        if (r != drawable) {
            float l = l();
            this.H = drawable != null ? androidx.core.graphics.drawable.a.i(drawable).mutate() : null;
            float l2 = l();
            f(r);
            if (Z()) {
                d(this.H);
            }
            invalidateSelf();
            if (l != l2) {
                T();
            }
        }
    }

    public void b(h hVar) {
        this.T = hVar;
    }

    public void b(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        if (!TextUtils.equals(this.F, charSequence)) {
            this.F = charSequence;
            this.ka.a(true);
            invalidateSelf();
            T();
        }
    }

    public void b(boolean z2) {
        if (this.R != z2) {
            boolean Y2 = Y();
            this.R = z2;
            boolean Y3 = Y();
            if (Y2 != Y3) {
                if (Y3) {
                    d(this.S);
                } else {
                    f(this.S);
                }
                invalidateSelf();
                T();
            }
        }
    }

    public void c(int i) {
        a(this.da.getResources().getBoolean(i));
    }

    public void c(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.z != colorStateList) {
            this.z = colorStateList;
            if (!(!this.Ea || (colorStateList2 = this.y) == null || colorStateList == null)) {
                a(a(colorStateList, colorStateList2));
            }
            onStateChange(getState());
        }
    }

    public void c(Drawable drawable) {
        Drawable y2 = y();
        if (y2 != drawable) {
            float m = m();
            this.L = drawable != null ? androidx.core.graphics.drawable.a.i(drawable).mutate() : null;
            if (c.b.b.c.m.a.f4814a) {
                ca();
            }
            float m2 = m();
            f(y2);
            if (aa()) {
                d(this.L);
            }
            invalidateSelf();
            if (m != m2) {
                T();
            }
        }
    }

    public void c(boolean z2) {
        if (this.G != z2) {
            boolean Z2 = Z();
            this.G = z2;
            boolean Z3 = Z();
            if (Z2 != Z3) {
                if (Z3) {
                    d(this.H);
                } else {
                    f(this.H);
                }
                invalidateSelf();
                T();
            }
        }
    }

    @Deprecated
    public void d(float f2) {
        if (this.B != f2) {
            this.B = f2;
            h().a(f2);
            invalidateSelf();
        }
    }

    public void d(int i) {
        a(b.a.a.a.a.b(this.da, i));
    }

    public void d(ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            if (Z()) {
                androidx.core.graphics.drawable.a.a(this.H, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void d(boolean z2) {
        if (this.K != z2) {
            boolean aa2 = aa();
            this.K = z2;
            boolean aa3 = aa();
            if (aa2 != aa3) {
                if (aa3) {
                    d(this.L);
                } else {
                    f(this.L);
                }
                invalidateSelf();
                T();
            }
        }
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i = 0;
            int i2 = this.sa;
            if (i2 < 255) {
                i = c.b.b.c.b.a.a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2);
            }
            e(canvas, bounds);
            b(canvas, bounds);
            if (this.Ea) {
                super.draw(canvas);
            }
            d(canvas, bounds);
            g(canvas, bounds);
            c(canvas, bounds);
            a(canvas, bounds);
            if (this.Ca) {
                i(canvas, bounds);
            }
            f(canvas, bounds);
            h(canvas, bounds);
            if (this.sa < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    public void e(float f2) {
        if (this.ca != f2) {
            this.ca = f2;
            invalidateSelf();
            T();
        }
    }

    public void e(int i) {
        b(this.da.getResources().getBoolean(i));
    }

    public void e(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            if (this.Ea) {
                b(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* access modifiers changed from: package-private */
    public void e(boolean z2) {
        this.Ca = z2;
    }

    public void f(float f2) {
        if (this.J != f2) {
            float l = l();
            this.J = f2;
            float l2 = l();
            invalidateSelf();
            if (l != l2) {
                T();
            }
        }
    }

    public void f(int i) {
        c(b.a.a.a.a.a(this.da, i));
    }

    public void f(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            if (aa()) {
                androidx.core.graphics.drawable.a.a(this.L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void f(boolean z2) {
        if (this.ya != z2) {
            this.ya = z2;
            ba();
            onStateChange(getState());
        }
    }

    public void g(float f2) {
        if (this.A != f2) {
            this.A = f2;
            invalidateSelf();
            T();
        }
    }

    @Deprecated
    public void g(int i) {
        d(this.da.getResources().getDimension(i));
    }

    public void g(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            ba();
            onStateChange(getState());
        }
    }

    public int getAlpha() {
        return this.sa;
    }

    public ColorFilter getColorFilter() {
        return this.ta;
    }

    public int getIntrinsicHeight() {
        return (int) this.A;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.V + l() + this.Y + this.ka.a(L().toString()) + this.Z + m() + this.ca), this.Da);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.Ea) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.B);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.B);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    public void h(float f2) {
        if (this.V != f2) {
            this.V = f2;
            invalidateSelf();
            T();
        }
    }

    public void h(int i) {
        e(this.da.getResources().getDimension(i));
    }

    public void i(float f2) {
        if (this.D != f2) {
            this.D = f2;
            this.ea.setStrokeWidth(f2);
            if (this.Ea) {
                super.c(f2);
            }
            invalidateSelf();
        }
    }

    public void i(int i) {
        b(b.a.a.a.a.b(this.da, i));
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return h(this.y) || h(this.z) || h(this.C) || (this.ya && h(this.za)) || b(this.ka.a()) || W() || e(this.H) || e(this.S) || h(this.va);
    }

    public void j(float f2) {
        if (this.ba != f2) {
            this.ba = f2;
            invalidateSelf();
            if (aa()) {
                T();
            }
        }
    }

    public void j(int i) {
        f(this.da.getResources().getDimension(i));
    }

    public void k(float f2) {
        if (this.O != f2) {
            this.O = f2;
            invalidateSelf();
            if (aa()) {
                T();
            }
        }
    }

    public void k(int i) {
        d(b.a.a.a.a.a(this.da, i));
    }

    /* access modifiers changed from: package-private */
    public float l() {
        if (Z() || Y()) {
            return this.W + this.J + this.X;
        }
        return 0.0f;
    }

    public void l(float f2) {
        if (this.aa != f2) {
            this.aa = f2;
            invalidateSelf();
            if (aa()) {
                T();
            }
        }
    }

    public void l(int i) {
        c(this.da.getResources().getBoolean(i));
    }

    /* access modifiers changed from: package-private */
    public float m() {
        if (aa()) {
            return this.aa + this.O + this.ba;
        }
        return 0.0f;
    }

    public void m(float f2) {
        if (this.X != f2) {
            float l = l();
            this.X = f2;
            float l2 = l();
            invalidateSelf();
            if (l != l2) {
                T();
            }
        }
    }

    public void m(int i) {
        g(this.da.getResources().getDimension(i));
    }

    public Drawable n() {
        return this.S;
    }

    public void n(float f2) {
        if (this.W != f2) {
            float l = l();
            this.W = f2;
            float l2 = l();
            invalidateSelf();
            if (l != l2) {
                T();
            }
        }
    }

    public void n(int i) {
        h(this.da.getResources().getDimension(i));
    }

    public ColorStateList o() {
        return this.z;
    }

    public void o(float f2) {
        if (this.Z != f2) {
            this.Z = f2;
            invalidateSelf();
            T();
        }
    }

    public void o(int i) {
        e(b.a.a.a.a.a(this.da, i));
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (Z()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.a(this.H, i);
        }
        if (Y()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.a(this.S, i);
        }
        if (aa()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.a(this.L, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (Z()) {
            onLevelChange |= this.H.setLevel(i);
        }
        if (Y()) {
            onLevelChange |= this.S.setLevel(i);
        }
        if (aa()) {
            onLevelChange |= this.L.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.Ea) {
            super.onStateChange(iArr);
        }
        return a(iArr, D());
    }

    public float p() {
        return this.Ea ? h().g().a() : this.B;
    }

    public void p(float f2) {
        if (this.Y != f2) {
            this.Y = f2;
            invalidateSelf();
            T();
        }
    }

    public void p(int i) {
        i(this.da.getResources().getDimension(i));
    }

    public float q() {
        return this.ca;
    }

    public void q(int i) {
        j(this.da.getResources().getDimension(i));
    }

    public Drawable r() {
        Drawable drawable = this.H;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return null;
    }

    public void r(int i) {
        c(b.a.a.a.a.b(this.da, i));
    }

    public float s() {
        return this.J;
    }

    public void s(int i) {
        k(this.da.getResources().getDimension(i));
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.sa != i) {
            this.sa = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.ta != colorFilter) {
            this.ta = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.va != colorStateList) {
            this.va = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.wa != mode) {
            this.wa = mode;
            this.ua = c.b.b.c.g.a.a(this, this.va, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (Z()) {
            visible |= this.H.setVisible(z2, z3);
        }
        if (Y()) {
            visible |= this.S.setVisible(z2, z3);
        }
        if (aa()) {
            visible |= this.L.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public ColorStateList t() {
        return this.I;
    }

    public void t(int i) {
        l(this.da.getResources().getDimension(i));
    }

    public float u() {
        return this.A;
    }

    public void u(int i) {
        f(b.a.a.a.a.a(this.da, i));
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public float v() {
        return this.V;
    }

    public void v(int i) {
        a(h.a(this.da, i));
    }

    public ColorStateList w() {
        return this.C;
    }

    public void w(int i) {
        m(this.da.getResources().getDimension(i));
    }

    public float x() {
        return this.D;
    }

    public void x(int i) {
        n(this.da.getResources().getDimension(i));
    }

    public Drawable y() {
        Drawable drawable = this.L;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return null;
    }

    public void y(int i) {
        this.Da = i;
    }

    public CharSequence z() {
        return this.P;
    }

    public void z(int i) {
        g(b.a.a.a.a.a(this.da, i));
    }
}
