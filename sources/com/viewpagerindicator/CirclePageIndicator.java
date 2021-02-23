package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import b.h.j.C0202h;
import b.h.j.z;

public class CirclePageIndicator extends View implements c {

    /* renamed from: a  reason: collision with root package name */
    private float f14802a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f14803b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f14804c;

    /* renamed from: d  reason: collision with root package name */
    private final Paint f14805d;

    /* renamed from: e  reason: collision with root package name */
    private ViewPager f14806e;

    /* renamed from: f  reason: collision with root package name */
    private ViewPager.f f14807f;

    /* renamed from: g  reason: collision with root package name */
    private int f14808g;

    /* renamed from: h  reason: collision with root package name */
    private int f14809h;
    private float i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private int n;
    private float o;
    private int p;
    private boolean q;

    static class a extends View.BaseSavedState {
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: a  reason: collision with root package name */
        int f14810a;

        private a(Parcel parcel) {
            super(parcel);
            this.f14810a = parcel.readInt();
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f14810a);
        }
    }

    public CirclePageIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.vpiCirclePageIndicatorStyle);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f14803b = new Paint(1);
        this.f14804c = new Paint(1);
        this.f14805d = new Paint(1);
        this.o = -1.0f;
        this.p = -1;
        if (!isInEditMode()) {
            Resources resources = getResources();
            int color = resources.getColor(f.default_circle_indicator_page_color);
            int color2 = resources.getColor(f.default_circle_indicator_fill_color);
            int integer = resources.getInteger(h.default_circle_indicator_orientation);
            int color3 = resources.getColor(f.default_circle_indicator_stroke_color);
            float dimension = resources.getDimension(g.default_circle_indicator_stroke_width);
            float dimension2 = resources.getDimension(g.default_circle_indicator_radius);
            boolean z = resources.getBoolean(e.default_circle_indicator_centered);
            boolean z2 = resources.getBoolean(e.default_circle_indicator_snap);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.CirclePageIndicator, i2, 0);
            this.l = obtainStyledAttributes.getBoolean(i.CirclePageIndicator_centered, z);
            this.k = obtainStyledAttributes.getInt(i.CirclePageIndicator_android_orientation, integer);
            this.f14803b.setStyle(Paint.Style.FILL);
            this.f14803b.setColor(obtainStyledAttributes.getColor(i.CirclePageIndicator_pageColor, color));
            this.f14804c.setStyle(Paint.Style.STROKE);
            this.f14804c.setColor(obtainStyledAttributes.getColor(i.CirclePageIndicator_strokeColor, color3));
            this.f14804c.setStrokeWidth(obtainStyledAttributes.getDimension(i.CirclePageIndicator_strokeWidth, dimension));
            this.f14805d.setStyle(Paint.Style.FILL);
            this.f14805d.setColor(obtainStyledAttributes.getColor(i.CirclePageIndicator_fillColor, color2));
            this.f14802a = obtainStyledAttributes.getDimension(i.CirclePageIndicator_radius, dimension2);
            this.m = obtainStyledAttributes.getBoolean(i.CirclePageIndicator_snap, z2);
            Drawable drawable = obtainStyledAttributes.getDrawable(i.CirclePageIndicator_android_background);
            if (drawable != null) {
                setBackgroundDrawable(drawable);
            }
            obtainStyledAttributes.recycle();
            this.n = z.b(ViewConfiguration.get(context));
        }
    }

    private int a(int i2) {
        ViewPager viewPager;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824 || (viewPager = this.f14806e) == null) {
            return size;
        }
        int count = viewPager.getAdapter().getCount();
        float f2 = this.f14802a;
        int paddingLeft = (int) (((float) (getPaddingLeft() + getPaddingRight())) + (((float) (count * 2)) * f2) + (((float) (count - 1)) * f2) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
    }

    private int b(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.f14802a * 2.0f) + ((float) getPaddingTop()) + ((float) getPaddingBottom()) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    public int getFillColor() {
        return this.f14805d.getColor();
    }

    public int getOrientation() {
        return this.k;
    }

    public int getPageColor() {
        return this.f14803b.getColor();
    }

    public float getRadius() {
        return this.f14802a;
    }

    public int getStrokeColor() {
        return this.f14804c.getColor();
    }

    public float getStrokeWidth() {
        return this.f14804c.getStrokeWidth();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int count;
        int i2;
        int i3;
        int i4;
        int i5;
        float f2;
        float f3;
        super.onDraw(canvas);
        ViewPager viewPager = this.f14806e;
        if (viewPager != null && (count = viewPager.getAdapter().getCount()) != 0) {
            if (this.f14808g >= count) {
                setCurrentItem(count - 1);
                return;
            }
            if (this.k == 0) {
                i5 = getWidth();
                i4 = getPaddingLeft();
                i3 = getPaddingRight();
                i2 = getPaddingTop();
            } else {
                i5 = getHeight();
                i4 = getPaddingTop();
                i3 = getPaddingBottom();
                i2 = getPaddingLeft();
            }
            float f4 = this.f14802a;
            float f5 = 3.0f * f4;
            float f6 = ((float) i2) + f4;
            float f7 = ((float) i4) + f4;
            if (this.l) {
                f7 += (((float) ((i5 - i4) - i3)) / 2.0f) - ((((float) count) * f5) / 2.0f);
            }
            float f8 = this.f14802a;
            if (this.f14804c.getStrokeWidth() > 0.0f) {
                f8 -= this.f14804c.getStrokeWidth() / 2.0f;
            }
            for (int i6 = 0; i6 < count; i6++) {
                float f9 = (((float) i6) * f5) + f7;
                if (this.k == 0) {
                    f3 = f6;
                } else {
                    f3 = f9;
                    f9 = f6;
                }
                if (this.f14803b.getAlpha() > 0) {
                    canvas.drawCircle(f9, f3, f8, this.f14803b);
                }
                float f10 = this.f14802a;
                if (f8 != f10) {
                    canvas.drawCircle(f9, f3, f10, this.f14804c);
                }
            }
            float f11 = ((float) (this.m ? this.f14809h : this.f14808g)) * f5;
            if (!this.m) {
                f11 += this.i * f5;
            }
            if (this.k == 0) {
                f2 = f11 + f7;
            } else {
                float f12 = f6;
                f6 = f11 + f7;
                f2 = f12;
            }
            canvas.drawCircle(f2, f6, this.f14802a, this.f14805d);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        if (this.k == 0) {
            i5 = a(i2);
            i4 = b(i3);
        } else {
            i5 = b(i2);
            i4 = a(i3);
        }
        setMeasuredDimension(i5, i4);
    }

    public void onPageScrollStateChanged(int i2) {
        this.j = i2;
        ViewPager.f fVar = this.f14807f;
        if (fVar != null) {
            fVar.onPageScrollStateChanged(i2);
        }
    }

    public void onPageScrolled(int i2, float f2, int i3) {
        this.f14808g = i2;
        this.i = f2;
        invalidate();
        ViewPager.f fVar = this.f14807f;
        if (fVar != null) {
            fVar.onPageScrolled(i2, f2, i3);
        }
    }

    public void onPageSelected(int i2) {
        if (this.m || this.j == 0) {
            this.f14808g = i2;
            this.f14809h = i2;
            invalidate();
        }
        ViewPager.f fVar = this.f14807f;
        if (fVar != null) {
            fVar.onPageSelected(i2);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        int i2 = aVar.f14810a;
        this.f14808g = i2;
        this.f14809h = i2;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f14810a = this.f14808g;
        return aVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f2;
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        ViewPager viewPager = this.f14806e;
        int i2 = 0;
        if (viewPager == null || viewPager.getAdapter().getCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float c2 = C0202h.c(motionEvent, C0202h.a(motionEvent, this.p));
                    float f3 = c2 - this.o;
                    if (!this.q && Math.abs(f3) > ((float) this.n)) {
                        this.q = true;
                    }
                    if (this.q) {
                        this.o = c2;
                        if (this.f14806e.e() || this.f14806e.a()) {
                            this.f14806e.b(f3);
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int a2 = C0202h.a(motionEvent);
                        this.o = C0202h.c(motionEvent, a2);
                        this.p = C0202h.b(motionEvent, a2);
                    } else if (action == 6) {
                        int a3 = C0202h.a(motionEvent);
                        if (C0202h.b(motionEvent, a3) == this.p) {
                            if (a3 == 0) {
                                i2 = 1;
                            }
                            this.p = C0202h.b(motionEvent, i2);
                        }
                        f2 = C0202h.c(motionEvent, C0202h.a(motionEvent, this.p));
                    }
                }
                return true;
            }
            if (!this.q) {
                int count = this.f14806e.getAdapter().getCount();
                float width = (float) getWidth();
                float f4 = width / 2.0f;
                float f5 = width / 6.0f;
                if (this.f14808g > 0 && motionEvent.getX() < f4 - f5) {
                    if (action != 3) {
                        this.f14806e.setCurrentItem(this.f14808g - 1);
                    }
                    return true;
                } else if (this.f14808g < count - 1 && motionEvent.getX() > f4 + f5) {
                    if (action != 3) {
                        this.f14806e.setCurrentItem(this.f14808g + 1);
                    }
                    return true;
                }
            }
            this.q = false;
            this.p = -1;
            if (this.f14806e.e()) {
                this.f14806e.c();
            }
            return true;
        }
        this.p = C0202h.b(motionEvent, 0);
        f2 = motionEvent.getX();
        this.o = f2;
        return true;
    }

    public void setCentered(boolean z) {
        this.l = z;
        invalidate();
    }

    public void setCurrentItem(int i2) {
        ViewPager viewPager = this.f14806e;
        if (viewPager != null) {
            viewPager.setCurrentItem(i2);
            this.f14808g = i2;
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void setFillColor(int i2) {
        this.f14805d.setColor(i2);
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.f fVar) {
        this.f14807f = fVar;
    }

    public void setOrientation(int i2) {
        if (i2 == 0 || i2 == 1) {
            this.k = i2;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
    }

    public void setPageColor(int i2) {
        this.f14803b.setColor(i2);
        invalidate();
    }

    public void setRadius(float f2) {
        this.f14802a = f2;
        invalidate();
    }

    public void setSnap(boolean z) {
        this.m = z;
        invalidate();
    }

    public void setStrokeColor(int i2) {
        this.f14804c.setColor(i2);
        invalidate();
    }

    public void setStrokeWidth(float f2) {
        this.f14804c.setStrokeWidth(f2);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f14806e;
        if (viewPager2 != viewPager) {
            if (viewPager2 != null) {
                viewPager2.setOnPageChangeListener((ViewPager.f) null);
            }
            if (viewPager.getAdapter() != null) {
                this.f14806e = viewPager;
                this.f14806e.setOnPageChangeListener(this);
                invalidate();
                return;
            }
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
    }
}
