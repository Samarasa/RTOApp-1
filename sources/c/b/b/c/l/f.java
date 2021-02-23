package c.b.b.c.l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import b.h.a.a.h;
import c.b.b.c.k;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public final float f4805a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f4806b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f4807c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f4808d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4809e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4810f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4811g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4812h;
    public final ColorStateList i;
    public final float j;
    public final float k;
    public final float l;
    private final int m;
    /* access modifiers changed from: private */
    public boolean n = false;
    /* access modifiers changed from: private */
    public Typeface o;

    public f(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, k.TextAppearance);
        this.f4805a = obtainStyledAttributes.getDimension(k.TextAppearance_android_textSize, 0.0f);
        this.f4806b = c.a(context, obtainStyledAttributes, k.TextAppearance_android_textColor);
        this.f4807c = c.a(context, obtainStyledAttributes, k.TextAppearance_android_textColorHint);
        this.f4808d = c.a(context, obtainStyledAttributes, k.TextAppearance_android_textColorLink);
        this.f4809e = obtainStyledAttributes.getInt(k.TextAppearance_android_textStyle, 0);
        this.f4810f = obtainStyledAttributes.getInt(k.TextAppearance_android_typeface, 1);
        int a2 = c.a(obtainStyledAttributes, k.TextAppearance_fontFamily, k.TextAppearance_android_fontFamily);
        this.m = obtainStyledAttributes.getResourceId(a2, 0);
        this.f4811g = obtainStyledAttributes.getString(a2);
        this.f4812h = obtainStyledAttributes.getBoolean(k.TextAppearance_textAllCaps, false);
        this.i = c.a(context, obtainStyledAttributes, k.TextAppearance_android_shadowColor);
        this.j = obtainStyledAttributes.getFloat(k.TextAppearance_android_shadowDx, 0.0f);
        this.k = obtainStyledAttributes.getFloat(k.TextAppearance_android_shadowDy, 0.0f);
        this.l = obtainStyledAttributes.getFloat(k.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private void b() {
        String str;
        if (this.o == null && (str = this.f4811g) != null) {
            this.o = Typeface.create(str, this.f4809e);
        }
        if (this.o == null) {
            int i2 = this.f4810f;
            this.o = i2 != 1 ? i2 != 2 ? i2 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.o = Typeface.create(this.o, this.f4809e);
        }
    }

    public Typeface a() {
        b();
        return this.o;
    }

    public Typeface a(Context context) {
        if (this.n) {
            return this.o;
        }
        if (!context.isRestricted()) {
            try {
                this.o = h.a(context, this.m);
                if (this.o != null) {
                    this.o = Typeface.create(this.o, this.f4809e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f4811g, e2);
            }
        }
        b();
        this.n = true;
        return this.o;
    }

    public void a(Context context, TextPaint textPaint, h hVar) {
        a(textPaint, a());
        a(context, (h) new e(this, textPaint, hVar));
    }

    public void a(Context context, h hVar) {
        if (g.a()) {
            a(context);
        } else {
            b();
        }
        if (this.m == 0) {
            this.n = true;
        }
        if (this.n) {
            hVar.a(this.o, true);
            return;
        }
        try {
            h.a(context, this.m, new d(this, hVar), (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.n = true;
            hVar.a(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f4811g, e2);
            this.n = true;
            hVar.a(-3);
        }
    }

    public void a(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ -1) & this.f4809e;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f4805a);
    }

    public void b(Context context, TextPaint textPaint, h hVar) {
        c(context, textPaint, hVar);
        ColorStateList colorStateList = this.f4806b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.l;
        float f3 = this.j;
        float f4 = this.k;
        ColorStateList colorStateList2 = this.i;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void c(Context context, TextPaint textPaint, h hVar) {
        if (g.a()) {
            a(textPaint, a(context));
        } else {
            a(context, textPaint, hVar);
        }
    }
}
