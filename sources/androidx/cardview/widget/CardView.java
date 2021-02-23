package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import b.d.a;
import b.d.b;
import b.d.d;
import b.d.e;

public class CardView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f749a = {16842801};

    /* renamed from: b  reason: collision with root package name */
    private static final h f750b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f751c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f752d;

    /* renamed from: e  reason: collision with root package name */
    int f753e;

    /* renamed from: f  reason: collision with root package name */
    int f754f;

    /* renamed from: g  reason: collision with root package name */
    final Rect f755g;

    /* renamed from: h  reason: collision with root package name */
    final Rect f756h;
    private final g i;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f750b = i2 >= 21 ? new d() : i2 >= 17 ? new c() : new f();
        f750b.a();
    }

    public CardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources;
        int i3;
        ColorStateList valueOf;
        this.f755g = new Rect();
        this.f756h = new Rect();
        this.i = new a(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.CardView, i2, d.CardView);
        if (obtainStyledAttributes.hasValue(e.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(e.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f749a);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i3 = b.cardview_light_background;
            } else {
                resources = getResources();
                i3 = b.cardview_dark_background;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i3));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(e.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(e.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(e.CardView_cardMaxElevation, 0.0f);
        this.f751c = obtainStyledAttributes.getBoolean(e.CardView_cardUseCompatPadding, false);
        this.f752d = obtainStyledAttributes.getBoolean(e.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(e.CardView_contentPadding, 0);
        this.f755g.left = obtainStyledAttributes.getDimensionPixelSize(e.CardView_contentPaddingLeft, dimensionPixelSize);
        this.f755g.top = obtainStyledAttributes.getDimensionPixelSize(e.CardView_contentPaddingTop, dimensionPixelSize);
        this.f755g.right = obtainStyledAttributes.getDimensionPixelSize(e.CardView_contentPaddingRight, dimensionPixelSize);
        this.f755g.bottom = obtainStyledAttributes.getDimensionPixelSize(e.CardView_contentPaddingBottom, dimensionPixelSize);
        float f2 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f753e = obtainStyledAttributes.getDimensionPixelSize(e.CardView_android_minWidth, 0);
        this.f754f = obtainStyledAttributes.getDimensionPixelSize(e.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f750b.a(this.i, context, colorStateList, dimension, dimension2, f2);
    }

    public ColorStateList getCardBackgroundColor() {
        return f750b.e(this.i);
    }

    public float getCardElevation() {
        return f750b.a(this.i);
    }

    public int getContentPaddingBottom() {
        return this.f755g.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f755g.left;
    }

    public int getContentPaddingRight() {
        return this.f755g.right;
    }

    public int getContentPaddingTop() {
        return this.f755g.top;
    }

    public float getMaxCardElevation() {
        return f750b.d(this.i);
    }

    public boolean getPreventCornerOverlap() {
        return this.f752d;
    }

    public float getRadius() {
        return f750b.b(this.i);
    }

    public boolean getUseCompatPadding() {
        return this.f751c;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (!(f750b instanceof d)) {
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f750b.g(this.i)), View.MeasureSpec.getSize(i2)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i3);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f750b.f(this.i)), View.MeasureSpec.getSize(i3)), mode2);
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        f750b.a(this.i, ColorStateList.valueOf(i2));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f750b.a(this.i, colorStateList);
    }

    public void setCardElevation(float f2) {
        f750b.b(this.i, f2);
    }

    public void setMaxCardElevation(float f2) {
        f750b.c(this.i, f2);
    }

    public void setMinimumHeight(int i2) {
        this.f754f = i2;
        super.setMinimumHeight(i2);
    }

    public void setMinimumWidth(int i2) {
        this.f753e = i2;
        super.setMinimumWidth(i2);
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f752d) {
            this.f752d = z;
            f750b.h(this.i);
        }
    }

    public void setRadius(float f2) {
        f750b.a(this.i, f2);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f751c != z) {
            this.f751c = z;
            f750b.c(this.i);
        }
    }
}
