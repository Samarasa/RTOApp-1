package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import b.a.i;
import b.h.i.c;
import b.h.j.I;
import b.h.j.q;
import b.h.j.y;
import c.b.b.c.f;
import c.b.b.c.j;
import c.b.b.c.k;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.d;
import com.google.android.material.internal.v;

public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f13861a;

    /* renamed from: b  reason: collision with root package name */
    private int f13862b;

    /* renamed from: c  reason: collision with root package name */
    private Toolbar f13863c;

    /* renamed from: d  reason: collision with root package name */
    private View f13864d;

    /* renamed from: e  reason: collision with root package name */
    private View f13865e;

    /* renamed from: f  reason: collision with root package name */
    private int f13866f;

    /* renamed from: g  reason: collision with root package name */
    private int f13867g;

    /* renamed from: h  reason: collision with root package name */
    private int f13868h;
    private int i;
    private final Rect j;
    final d k;
    private boolean l;
    private boolean m;
    private Drawable n;
    Drawable o;
    private int p;
    private boolean q;
    private ValueAnimator r;
    private long s;
    private int t;
    private AppBarLayout.c u;
    int v;
    I w;

    public static class a extends FrameLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        int f13869a = 0;

        /* renamed from: b  reason: collision with root package name */
        float f13870b = 0.5f;

        public a(int i, int i2) {
            super(i, i2);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.CollapsingToolbarLayout_Layout);
            this.f13869a = obtainStyledAttributes.getInt(k.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            a(obtainStyledAttributes.getFloat(k.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public void a(float f2) {
            this.f13870b = f2;
        }
    }

    private class b implements AppBarLayout.c {
        b() {
        }

        public void a(AppBarLayout appBarLayout, int i) {
            int i2;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.v = i;
            I i3 = collapsingToolbarLayout.w;
            int e2 = i3 != null ? i3.e() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i4);
                a aVar = (a) childAt.getLayoutParams();
                j b2 = CollapsingToolbarLayout.b(childAt);
                int i5 = aVar.f13869a;
                if (i5 == 1) {
                    i2 = b.h.d.a.a(-i, 0, CollapsingToolbarLayout.this.a(childAt));
                } else if (i5 != 2) {
                } else {
                    i2 = Math.round(((float) (-i)) * aVar.f13870b);
                }
                b2.b(i2);
            }
            CollapsingToolbarLayout.this.a();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.o != null && e2 > 0) {
                y.E(collapsingToolbarLayout2);
            }
            CollapsingToolbarLayout.this.k.a(((float) Math.abs(i)) / ((float) ((CollapsingToolbarLayout.this.getHeight() - y.n(CollapsingToolbarLayout.this)) - e2)));
        }
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f13861a = true;
        this.j = new Rect();
        this.t = -1;
        this.k = new d(this);
        this.k.a(c.b.b.c.a.a.f4753e);
        TypedArray a2 = v.a(context, attributeSet, k.CollapsingToolbarLayout, i2, j.Widget_Design_CollapsingToolbar, new int[0]);
        this.k.d(a2.getInt(k.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        this.k.b(a2.getInt(k.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = a2.getDimensionPixelSize(k.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.i = dimensionPixelSize;
        this.f13868h = dimensionPixelSize;
        this.f13867g = dimensionPixelSize;
        this.f13866f = dimensionPixelSize;
        if (a2.hasValue(k.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.f13866f = a2.getDimensionPixelSize(k.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (a2.hasValue(k.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.f13868h = a2.getDimensionPixelSize(k.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (a2.hasValue(k.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.f13867g = a2.getDimensionPixelSize(k.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (a2.hasValue(k.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.i = a2.getDimensionPixelSize(k.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.l = a2.getBoolean(k.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(a2.getText(k.CollapsingToolbarLayout_title));
        this.k.c(j.TextAppearance_Design_CollapsingToolbar_Expanded);
        this.k.a(i.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (a2.hasValue(k.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            this.k.c(a2.getResourceId(k.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (a2.hasValue(k.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            this.k.a(a2.getResourceId(k.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        this.t = a2.getDimensionPixelSize(k.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        this.s = (long) a2.getInt(k.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        setContentScrim(a2.getDrawable(k.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(a2.getDrawable(k.CollapsingToolbarLayout_statusBarScrim));
        this.f13862b = a2.getResourceId(k.CollapsingToolbarLayout_toolbarId, -1);
        a2.recycle();
        setWillNotDraw(false);
        y.a((View) this, (q) new e(this));
    }

    private void a(int i2) {
        b();
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator == null) {
            this.r = new ValueAnimator();
            this.r.setDuration(this.s);
            this.r.setInterpolator(i2 > this.p ? c.b.b.c.a.a.f4751c : c.b.b.c.a.a.f4752d);
            this.r.addUpdateListener(new f(this));
        } else if (valueAnimator.isRunning()) {
            this.r.cancel();
        }
        this.r.setIntValues(new int[]{this.p, i2});
        this.r.start();
    }

    static j b(View view) {
        j jVar = (j) view.getTag(f.view_offset_helper);
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(view);
        view.setTag(f.view_offset_helper, jVar2);
        return jVar2;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
            r6 = this;
            boolean r0 = r6.f13861a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r6.f13863c = r0
            r6.f13864d = r0
            int r1 = r6.f13862b
            r2 = -1
            if (r1 == r2) goto L_0x0021
            android.view.View r1 = r6.findViewById(r1)
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            r6.f13863c = r1
            androidx.appcompat.widget.Toolbar r1 = r6.f13863c
            if (r1 == 0) goto L_0x0021
            android.view.View r1 = r6.c(r1)
            r6.f13864d = r1
        L_0x0021:
            androidx.appcompat.widget.Toolbar r1 = r6.f13863c
            r2 = 0
            if (r1 != 0) goto L_0x003e
            int r1 = r6.getChildCount()
            r3 = 0
        L_0x002b:
            if (r3 >= r1) goto L_0x003c
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = r4 instanceof androidx.appcompat.widget.Toolbar
            if (r5 == 0) goto L_0x0039
            r0 = r4
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            goto L_0x003c
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x002b
        L_0x003c:
            r6.f13863c = r0
        L_0x003e:
            r6.d()
            r6.f13861a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.b():void");
    }

    private View c(View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    private void c() {
        setContentDescription(getTitle());
    }

    private static int d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private void d() {
        View view;
        if (!this.l && (view = this.f13865e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f13865e);
            }
        }
        if (this.l && this.f13863c != null) {
            if (this.f13865e == null) {
                this.f13865e = new View(getContext());
            }
            if (this.f13865e.getParent() == null) {
                this.f13863c.addView(this.f13865e, -1, -1);
            }
        }
    }

    private boolean e(View view) {
        View view2 = this.f13864d;
        if (view2 == null || view2 == this) {
            if (view == this.f13863c) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int a(View view) {
        return ((getHeight() - b(view).b()) - view.getHeight()) - ((a) view.getLayoutParams()).bottomMargin;
    }

    /* access modifiers changed from: package-private */
    public I a(I i2) {
        I i3 = y.j(this) ? i2 : null;
        if (!c.a(this.w, i3)) {
            this.w = i3;
            requestLayout();
        }
        return i2.a();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.n != null || this.o != null) {
            setScrimsShown(getHeight() + this.v < getScrimVisibleHeightTrigger());
        }
    }

    public void a(boolean z, boolean z2) {
        if (this.q != z) {
            int i2 = 255;
            if (z2) {
                if (!z) {
                    i2 = 0;
                }
                a(i2);
            } else {
                if (!z) {
                    i2 = 0;
                }
                setScrimAlpha(i2);
            }
            this.q = z;
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        b();
        if (this.f13863c == null && (drawable = this.n) != null && this.p > 0) {
            drawable.mutate().setAlpha(this.p);
            this.n.draw(canvas);
        }
        if (this.l && this.m) {
            this.k.a(canvas);
        }
        if (this.o != null && this.p > 0) {
            I i2 = this.w;
            int e2 = i2 != null ? i2.e() : 0;
            if (e2 > 0) {
                this.o.setBounds(0, -this.v, getWidth(), e2 - this.v);
                this.o.mutate().setAlpha(this.p);
                this.o.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        boolean z;
        if (this.n == null || this.p <= 0 || !e(view)) {
            z = false;
        } else {
            this.n.mutate().setAlpha(this.p);
            this.n.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j2) || z;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.o;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.n;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        d dVar = this.k;
        if (dVar != null) {
            z |= dVar.a(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public a generateDefaultLayoutParams() {
        return new a(-1, -1);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.k.a();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.k.b();
    }

    public Drawable getContentScrim() {
        return this.n;
    }

    public int getExpandedTitleGravity() {
        return this.k.d();
    }

    public int getExpandedTitleMarginBottom() {
        return this.i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f13868h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f13866f;
    }

    public int getExpandedTitleMarginTop() {
        return this.f13867g;
    }

    public Typeface getExpandedTitleTypeface() {
        return this.k.e();
    }

    /* access modifiers changed from: package-private */
    public int getScrimAlpha() {
        return this.p;
    }

    public long getScrimAnimationDuration() {
        return this.s;
    }

    public int getScrimVisibleHeightTrigger() {
        int i2 = this.t;
        if (i2 >= 0) {
            return i2;
        }
        I i3 = this.w;
        int e2 = i3 != null ? i3.e() : 0;
        int n2 = y.n(this);
        return n2 > 0 ? Math.min((n2 * 2) + e2, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.o;
    }

    public CharSequence getTitle() {
        if (this.l) {
            return this.k.f();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            y.a((View) this, y.j((View) parent));
            if (this.u == null) {
                this.u = new b();
            }
            ((AppBarLayout) parent).a(this.u);
            y.F(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.c cVar = this.u;
        if (cVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).b(cVar);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View view;
        super.onLayout(z, i2, i3, i4, i5);
        I i6 = this.w;
        if (i6 != null) {
            int e2 = i6.e();
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (!y.j(childAt) && childAt.getTop() < e2) {
                    y.c(childAt, e2);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            b(getChildAt(i8)).d();
        }
        if (this.l && (view = this.f13865e) != null) {
            boolean z2 = true;
            this.m = y.z(view) && this.f13865e.getVisibility() == 0;
            if (this.m) {
                if (y.m(this) != 1) {
                    z2 = false;
                }
                View view2 = this.f13864d;
                if (view2 == null) {
                    view2 = this.f13863c;
                }
                int a2 = a(view2);
                com.google.android.material.internal.f.a((ViewGroup) this, this.f13865e, this.j);
                this.k.a(this.j.left + (z2 ? this.f13863c.getTitleMarginEnd() : this.f13863c.getTitleMarginStart()), this.j.top + a2 + this.f13863c.getTitleMarginTop(), this.j.right + (z2 ? this.f13863c.getTitleMarginStart() : this.f13863c.getTitleMarginEnd()), (this.j.bottom + a2) - this.f13863c.getTitleMarginBottom());
                this.k.b(z2 ? this.f13868h : this.f13866f, this.j.top + this.f13867g, (i4 - i2) - (z2 ? this.f13866f : this.f13868h), (i5 - i3) - this.i);
                this.k.i();
            }
        }
        if (this.f13863c != null) {
            if (this.l && TextUtils.isEmpty(this.k.f())) {
                setTitle(this.f13863c.getTitle());
            }
            View view3 = this.f13864d;
            if (view3 == null || view3 == this) {
                view3 = this.f13863c;
            }
            setMinimumHeight(d(view3));
        }
        a();
        int childCount3 = getChildCount();
        for (int i9 = 0; i9 < childCount3; i9++) {
            b(getChildAt(i9)).a();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        b();
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        I i4 = this.w;
        int e2 = i4 != null ? i4.e() : 0;
        if (mode == 0 && e2 > 0) {
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + e2, 1073741824));
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setBounds(0, 0, i2, i3);
        }
    }

    public void setCollapsedTitleGravity(int i2) {
        this.k.b(i2);
    }

    public void setCollapsedTitleTextAppearance(int i2) {
        this.k.a(i2);
    }

    public void setCollapsedTitleTextColor(int i2) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.k.a(colorStateList);
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.k.a(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.n;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.n = drawable3;
            Drawable drawable4 = this.n;
            if (drawable4 != null) {
                drawable4.setBounds(0, 0, getWidth(), getHeight());
                this.n.setCallback(this);
                this.n.setAlpha(this.p);
            }
            y.E(this);
        }
    }

    public void setContentScrimColor(int i2) {
        setContentScrim(new ColorDrawable(i2));
    }

    public void setContentScrimResource(int i2) {
        setContentScrim(b.h.a.a.c(getContext(), i2));
    }

    public void setExpandedTitleColor(int i2) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setExpandedTitleGravity(int i2) {
        this.k.d(i2);
    }

    public void setExpandedTitleMarginBottom(int i2) {
        this.i = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i2) {
        this.f13868h = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i2) {
        this.f13866f = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i2) {
        this.f13867g = i2;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i2) {
        this.k.c(i2);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.k.b(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.k.b(typeface);
    }

    /* access modifiers changed from: package-private */
    public void setScrimAlpha(int i2) {
        Toolbar toolbar;
        if (i2 != this.p) {
            if (!(this.n == null || (toolbar = this.f13863c) == null)) {
                y.E(toolbar);
            }
            this.p = i2;
            y.E(this);
        }
    }

    public void setScrimAnimationDuration(long j2) {
        this.s = j2;
    }

    public void setScrimVisibleHeightTrigger(int i2) {
        if (this.t != i2) {
            this.t = i2;
            a();
        }
    }

    public void setScrimsShown(boolean z) {
        a(z, y.A(this) && !isInEditMode());
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.o;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.o = drawable3;
            Drawable drawable4 = this.o;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.o.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.a(this.o, y.m(this));
                this.o.setVisible(getVisibility() == 0, false);
                this.o.setCallback(this);
                this.o.setAlpha(this.p);
            }
            y.E(this);
        }
    }

    public void setStatusBarScrimColor(int i2) {
        setStatusBarScrim(new ColorDrawable(i2));
    }

    public void setStatusBarScrimResource(int i2) {
        setStatusBarScrim(b.h.a.a.c(getContext(), i2));
    }

    public void setTitle(CharSequence charSequence) {
        this.k.a(charSequence);
        c();
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.l) {
            this.l = z;
            c();
            d();
            requestLayout();
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.o;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.o.setVisible(z, false);
        }
        Drawable drawable2 = this.n;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.n.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.n || drawable == this.o;
    }
}
