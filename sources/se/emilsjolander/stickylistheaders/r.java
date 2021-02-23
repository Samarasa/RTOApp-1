package se.emilsjolander.stickylistheaders;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class r extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    View f15624a;

    /* renamed from: b  reason: collision with root package name */
    Drawable f15625b;

    /* renamed from: c  reason: collision with root package name */
    int f15626c;

    /* renamed from: d  reason: collision with root package name */
    View f15627d;

    /* renamed from: e  reason: collision with root package name */
    int f15628e;

    r(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    public void a(View view, View view2, Drawable drawable, int i) {
        if (view != null) {
            View view3 = this.f15624a;
            if (view3 != view) {
                removeView(view3);
                this.f15624a = view;
                ViewParent parent = view.getParent();
                if (!(parent == null || parent == this || !(parent instanceof ViewGroup))) {
                    ((ViewGroup) parent).removeView(view);
                }
                addView(view);
            }
            View view4 = this.f15627d;
            if (view4 != view2) {
                if (view4 != null) {
                    removeView(view4);
                }
                this.f15627d = view2;
                if (view2 != null) {
                    addView(view2);
                }
            }
            if (this.f15625b != drawable) {
                this.f15625b = drawable;
                this.f15626c = i;
                invalidate();
                return;
            }
            return;
        }
        throw new NullPointerException("List view item must not be null.");
    }

    public boolean a() {
        return this.f15627d != null;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f15627d == null && this.f15625b != null && this.f15624a.getVisibility() != 8) {
            if (Build.VERSION.SDK_INT < 11) {
                canvas.clipRect(0, 0, getWidth(), this.f15626c);
            }
            this.f15625b.draw(canvas);
        }
    }

    public View getHeader() {
        return this.f15627d;
    }

    public View getItem() {
        return this.f15624a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width = getWidth();
        int height = getHeight();
        View view = this.f15627d;
        if (view != null) {
            i5 = view.getMeasuredHeight();
            this.f15627d.layout(0, 0, width, i5);
        } else {
            Drawable drawable = this.f15625b;
            if (drawable != null) {
                drawable.setBounds(0, 0, width, this.f15626c);
                i5 = this.f15626c;
            } else {
                this.f15628e = 0;
                this.f15624a.layout(0, 0, width, height);
                return;
            }
        }
        this.f15628e = i5;
        this.f15624a.layout(0, i5, width, height);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        View view = this.f15627d;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || (i5 = layoutParams.height) <= 0) {
                this.f15627d.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
            } else {
                this.f15627d.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
            }
            i3 = this.f15627d.getMeasuredHeight() + 0;
        } else {
            i3 = (this.f15625b == null || this.f15624a.getVisibility() == 8) ? 0 : this.f15626c + 0;
        }
        ViewGroup.LayoutParams layoutParams2 = this.f15624a.getLayoutParams();
        if (this.f15624a.getVisibility() == 8) {
            this.f15624a.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        } else {
            if (layoutParams2 == null || (i4 = layoutParams2.height) < 0) {
                this.f15624a.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
            } else {
                this.f15624a.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            }
            i3 += this.f15624a.getMeasuredHeight();
        }
        setMeasuredDimension(size, i3);
    }
}
