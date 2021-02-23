package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0142q;
import androidx.appcompat.widget.C0145u;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.m;
import b.h.i.g;
import b.h.j.t;
import b.h.j.y;
import c.b.b.c.d;
import c.b.b.c.j;
import c.b.b.c.k;
import c.b.b.c.o.h;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.n;
import com.google.android.material.internal.f;
import com.google.android.material.internal.x;
import java.util.List;

@CoordinatorLayout.c(Behavior.class)
public class FloatingActionButton extends x implements t, m, c.b.b.c.i.a {

    /* renamed from: b  reason: collision with root package name */
    private static final int f13999b = j.Widget_Design_FloatingActionButton;

    /* renamed from: c  reason: collision with root package name */
    private ColorStateList f14000c;

    /* renamed from: d  reason: collision with root package name */
    private PorterDuff.Mode f14001d;

    /* renamed from: e  reason: collision with root package name */
    private ColorStateList f14002e;

    /* renamed from: f  reason: collision with root package name */
    private PorterDuff.Mode f14003f;

    /* renamed from: g  reason: collision with root package name */
    private ColorStateList f14004g;

    /* renamed from: h  reason: collision with root package name */
    private int f14005h;
    private int i;
    private int j;
    /* access modifiers changed from: private */
    public int k;
    private int l;
    boolean m;
    final Rect n;
    private final Rect o;
    private final C0145u p;
    private final c.b.b.c.i.c q;
    private n r;

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.b<T> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f14006a;

        /* renamed from: b  reason: collision with root package name */
        private a f14007b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f14008c;

        public BaseBehavior() {
            this.f14008c = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.FloatingActionButton_Behavior_Layout);
            this.f14008c = obtainStyledAttributes.getBoolean(k.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        private void a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.n;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.e eVar = (CoordinatorLayout.e) floatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - eVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= eVar.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - eVar.bottomMargin) {
                    i = rect.bottom;
                } else if (floatingActionButton.getTop() <= eVar.topMargin) {
                    i = -rect.top;
                }
                if (i != 0) {
                    y.c((View) floatingActionButton, i);
                }
                if (i2 != 0) {
                    y.b((View) floatingActionButton, i2);
                }
            }
        }

        private static boolean a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                return ((CoordinatorLayout.e) layoutParams).d() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean a(View view, FloatingActionButton floatingActionButton) {
            return this.f14008c && ((CoordinatorLayout.e) floatingActionButton.getLayoutParams()).c() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f14006a == null) {
                this.f14006a = new Rect();
            }
            Rect rect = this.f14006a;
            f.a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.a(this.f14007b, false);
                return true;
            }
            floatingActionButton.b(this.f14007b, false);
            return true;
        }

        private boolean b(View view, FloatingActionButton floatingActionButton) {
            if (!a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.e) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.a(this.f14007b, false);
                return true;
            }
            floatingActionButton.b(this.f14007b, false);
            return true;
        }

        public void a(CoordinatorLayout.e eVar) {
            if (eVar.f834h == 0) {
                eVar.f834h = 80;
            }
        }

        public boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> b2 = coordinatorLayout.b((View) floatingActionButton);
            int size = b2.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = b2.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (a(view) && b(view, floatingActionButton)) {
                        break;
                    }
                } else if (a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.c((View) floatingActionButton, i);
            a(coordinatorLayout, floatingActionButton);
            return true;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.n;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: a */
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!a(view)) {
                return false;
            } else {
                b(view, floatingActionButton);
                return false;
            }
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public /* bridge */ /* synthetic */ void a(CoordinatorLayout.e eVar) {
            super.a(eVar);
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.a(coordinatorLayout, floatingActionButton, i);
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.a(coordinatorLayout, floatingActionButton, rect);
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.b(coordinatorLayout, floatingActionButton, view);
        }
    }

    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    private class b implements c.b.b.c.n.b {
        b() {
        }

        public void a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.n.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.k, i2 + FloatingActionButton.this.k, i3 + FloatingActionButton.this.k, i4 + FloatingActionButton.this.k);
        }

        public void a(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        public boolean a() {
            return FloatingActionButton.this.m;
        }
    }

    class c<T extends FloatingActionButton> implements n.d {

        /* renamed from: a  reason: collision with root package name */
        private final c.b.b.c.a.k<T> f14010a;

        c(c.b.b.c.a.k<T> kVar) {
            this.f14010a = kVar;
        }

        public void a() {
            this.f14010a.b(FloatingActionButton.this);
        }

        public void b() {
            this.f14010a.a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && ((c) obj).f14010a.equals(this.f14010a);
        }

        public int hashCode() {
            return this.f14010a.hashCode();
        }
    }

    public FloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.b.b.c.b.floatingActionButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FloatingActionButton(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r7 = r22
            r8 = r23
            int r1 = f13999b
            r2 = r21
            android.content.Context r1 = com.google.android.material.internal.v.a(r2, r7, r8, r1)
            r0.<init>(r1, r7, r8)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.n = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.o = r1
            android.content.Context r9 = r20.getContext()
            int[] r3 = c.b.b.c.k.FloatingActionButton
            int r5 = f13999b
            r10 = 0
            int[] r6 = new int[r10]
            r1 = r9
            r2 = r22
            r4 = r23
            android.content.res.TypedArray r11 = com.google.android.material.internal.v.a(r1, r2, r3, r4, r5, r6)
            int r1 = c.b.b.c.k.FloatingActionButton_backgroundTint
            android.content.res.ColorStateList r1 = c.b.b.c.l.c.a((android.content.Context) r9, (android.content.res.TypedArray) r11, (int) r1)
            r0.f14000c = r1
            int r1 = c.b.b.c.k.FloatingActionButton_backgroundTintMode
            r2 = -1
            int r1 = r11.getInt(r1, r2)
            r3 = 0
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.w.a((int) r1, (android.graphics.PorterDuff.Mode) r3)
            r0.f14001d = r1
            int r1 = c.b.b.c.k.FloatingActionButton_rippleColor
            android.content.res.ColorStateList r1 = c.b.b.c.l.c.a((android.content.Context) r9, (android.content.res.TypedArray) r11, (int) r1)
            r0.f14004g = r1
            int r1 = c.b.b.c.k.FloatingActionButton_fabSize
            int r1 = r11.getInt(r1, r2)
            r0.i = r1
            int r1 = c.b.b.c.k.FloatingActionButton_fabCustomSize
            int r1 = r11.getDimensionPixelSize(r1, r10)
            r0.j = r1
            int r1 = c.b.b.c.k.FloatingActionButton_borderWidth
            int r1 = r11.getDimensionPixelSize(r1, r10)
            r0.f14005h = r1
            int r1 = c.b.b.c.k.FloatingActionButton_elevation
            r2 = 0
            float r12 = r11.getDimension(r1, r2)
            int r1 = c.b.b.c.k.FloatingActionButton_hoveredFocusedTranslationZ
            float r13 = r11.getDimension(r1, r2)
            int r1 = c.b.b.c.k.FloatingActionButton_pressedTranslationZ
            float r14 = r11.getDimension(r1, r2)
            int r1 = c.b.b.c.k.FloatingActionButton_useCompatPadding
            boolean r1 = r11.getBoolean(r1, r10)
            r0.m = r1
            android.content.res.Resources r1 = r20.getResources()
            int r2 = c.b.b.c.d.mtrl_fab_min_touch_target
            int r15 = r1.getDimensionPixelSize(r2)
            int r1 = c.b.b.c.k.FloatingActionButton_maxImageSize
            int r1 = r11.getDimensionPixelSize(r1, r10)
            r0.l = r1
            int r1 = c.b.b.c.k.FloatingActionButton_showMotionSpec
            c.b.b.c.a.h r6 = c.b.b.c.a.h.a((android.content.Context) r9, (android.content.res.TypedArray) r11, (int) r1)
            int r1 = c.b.b.c.k.FloatingActionButton_hideMotionSpec
            c.b.b.c.a.h r5 = c.b.b.c.a.h.a((android.content.Context) r9, (android.content.res.TypedArray) r11, (int) r1)
            c.b.b.c.o.h r4 = new c.b.b.c.o.h
            int r16 = f13999b
            r17 = -1
            r1 = r4
            r2 = r9
            r3 = r22
            r9 = r4
            r4 = r23
            r18 = r5
            r5 = r16
            r19 = r6
            r6 = r17
            r1.<init>(r2, r3, r4, r5, r6)
            boolean r1 = r0.a((c.b.b.c.o.h) r9)
            int r2 = c.b.b.c.k.FloatingActionButton_ensureMinTouchTargetSize
            boolean r2 = r11.getBoolean(r2, r10)
            r11.recycle()
            androidx.appcompat.widget.u r3 = new androidx.appcompat.widget.u
            r3.<init>(r0)
            r0.p = r3
            androidx.appcompat.widget.u r3 = r0.p
            r3.a(r7, r8)
            c.b.b.c.i.c r3 = new c.b.b.c.i.c
            r3.<init>(r0)
            r0.q = r3
            com.google.android.material.floatingactionbutton.n r3 = r20.getImpl()
            r3.a((c.b.b.c.o.h) r9, (boolean) r1)
            com.google.android.material.floatingactionbutton.n r1 = r20.getImpl()
            android.content.res.ColorStateList r3 = r0.f14000c
            android.graphics.PorterDuff$Mode r4 = r0.f14001d
            android.content.res.ColorStateList r5 = r0.f14004g
            int r6 = r0.f14005h
            r1.a((android.content.res.ColorStateList) r3, (android.graphics.PorterDuff.Mode) r4, (android.content.res.ColorStateList) r5, (int) r6)
            com.google.android.material.floatingactionbutton.n r1 = r20.getImpl()
            r1.b((int) r15)
            com.google.android.material.floatingactionbutton.n r1 = r20.getImpl()
            r1.a((float) r12)
            com.google.android.material.floatingactionbutton.n r1 = r20.getImpl()
            r1.b((float) r13)
            com.google.android.material.floatingactionbutton.n r1 = r20.getImpl()
            r1.d(r14)
            com.google.android.material.floatingactionbutton.n r1 = r20.getImpl()
            int r3 = r0.l
            r1.a((int) r3)
            com.google.android.material.floatingactionbutton.n r1 = r20.getImpl()
            r3 = r19
            r1.b((c.b.b.c.a.h) r3)
            com.google.android.material.floatingactionbutton.n r1 = r20.getImpl()
            r3 = r18
            r1.a((c.b.b.c.a.h) r3)
            com.google.android.material.floatingactionbutton.n r1 = r20.getImpl()
            r1.a((boolean) r2)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX
            r0.setScaleType(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private int a(int i2) {
        int i3 = this.j;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        if (i2 == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? a(1) : a(0);
        }
        return resources.getDimensionPixelSize(i2 != 1 ? d.design_fab_size_normal : d.design_fab_size_mini);
    }

    private static int a(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i2, size);
        }
        if (mode == 0) {
            return i2;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    private boolean a(h hVar) {
        return hVar.h().a() == -1.0f;
    }

    private n.e c(a aVar) {
        if (aVar == null) {
            return null;
        }
        return new i(this, aVar);
    }

    private void c(Rect rect) {
        int i2 = rect.left;
        Rect rect2 = this.n;
        rect.left = i2 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private n d() {
        return Build.VERSION.SDK_INT >= 21 ? new o(this, new b()) : new n(this, new b());
    }

    private void e() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f14002e;
            if (colorStateList == null) {
                androidx.core.graphics.drawable.a.b(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f14003f;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C0142q.a(colorForState, mode));
        }
    }

    private n getImpl() {
        if (this.r == null) {
            this.r = d();
        }
        return this.r;
    }

    public void a(Animator.AnimatorListener animatorListener) {
        getImpl().a(animatorListener);
    }

    public void a(c.b.b.c.a.k<? extends FloatingActionButton> kVar) {
        getImpl().a((n.d) new c(kVar));
    }

    public void a(a aVar) {
        a(aVar, true);
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar, boolean z) {
        getImpl().a(c(aVar), z);
    }

    public boolean a() {
        return this.q.b();
    }

    @Deprecated
    public boolean a(Rect rect) {
        if (!y.A(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        c(rect);
        return true;
    }

    public void b(Animator.AnimatorListener animatorListener) {
        getImpl().b(animatorListener);
    }

    public void b(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        c(rect);
    }

    public void b(a aVar) {
        b(aVar, true);
    }

    /* access modifiers changed from: package-private */
    public void b(a aVar, boolean z) {
        getImpl().b(c(aVar), z);
    }

    public boolean b() {
        return getImpl().j();
    }

    public boolean c() {
        return getImpl().k();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().a(getDrawableState());
    }

    public ColorStateList getBackgroundTintList() {
        return this.f14000c;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f14001d;
    }

    public float getCompatElevation() {
        return getImpl().c();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().g();
    }

    public Drawable getContentBackground() {
        return getImpl().b();
    }

    public int getCustomSize() {
        return this.j;
    }

    public int getExpandedComponentIdHint() {
        return this.q.a();
    }

    public c.b.b.c.a.h getHideMotionSpec() {
        return getImpl().e();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f14004g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f14004g;
    }

    public h getShapeAppearance() {
        h h2 = getImpl().h();
        g.a(h2);
        return h2;
    }

    public c.b.b.c.a.h getShowMotionSpec() {
        return getImpl().i();
    }

    public int getSize() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return a(this.i);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f14002e;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f14003f;
    }

    public boolean getUseCompatPadding() {
        return this.m;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().l();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().m();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().o();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int sizeDimension = getSizeDimension();
        this.k = (sizeDimension - this.l) / 2;
        getImpl().x();
        int min = Math.min(a(sizeDimension, i2), a(sizeDimension, i3));
        Rect rect = this.n;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c.b.b.c.p.b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c.b.b.c.p.b bVar = (c.b.b.c.p.b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        c.b.b.c.i.c cVar = this.q;
        Bundle bundle = bVar.f4894c.get("expandableWidgetHelper");
        g.a(bundle);
        cVar.a(bundle);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        c.b.b.c.p.b bVar = new c.b.b.c.p.b(onSaveInstanceState);
        bVar.f4894c.put("expandableWidgetHelper", this.q.c());
        return bVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !a(this.o) || this.o.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setBackgroundColor(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f14000c != colorStateList) {
            this.f14000c = colorStateList;
            getImpl().a(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f14001d != mode) {
            this.f14001d = mode;
            getImpl().a(mode);
        }
    }

    public void setCompatElevation(float f2) {
        getImpl().a(f2);
    }

    public void setCompatElevationResource(int i2) {
        setCompatElevation(getResources().getDimension(i2));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        getImpl().b(f2);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i2) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i2));
    }

    public void setCompatPressedTranslationZ(float f2) {
        getImpl().d(f2);
    }

    public void setCompatPressedTranslationZResource(int i2) {
        setCompatPressedTranslationZ(getResources().getDimension(i2));
    }

    public void setCustomSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i2 != this.j) {
            this.j = i2;
            getImpl().y();
            requestLayout();
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        getImpl().e(f2);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().d()) {
            getImpl().a(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i2) {
        this.q.a(i2);
    }

    public void setHideMotionSpec(c.b.b.c.a.h hVar) {
        getImpl().a(hVar);
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(c.b.b.c.a.h.a(getContext(), i2));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().w();
            if (this.f14002e != null) {
                e();
            }
        }
    }

    public void setImageResource(int i2) {
        this.p.a(i2);
        e();
    }

    public void setRippleColor(int i2) {
        setRippleColor(ColorStateList.valueOf(i2));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f14004g != colorStateList) {
            this.f14004g = colorStateList;
            getImpl().b(this.f14004g);
        }
    }

    public void setScaleX(float f2) {
        super.setScaleX(f2);
        getImpl().q();
    }

    public void setScaleY(float f2) {
        super.setScaleY(f2);
        getImpl().q();
    }

    public void setShapeAppearance(h hVar) {
        getImpl().a(hVar, a(hVar));
    }

    public void setShowMotionSpec(c.b.b.c.a.h hVar) {
        getImpl().b(hVar);
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(c.b.b.c.a.h.a(getContext(), i2));
    }

    public void setSize(int i2) {
        this.j = 0;
        if (i2 != this.i) {
            this.i = i2;
            getImpl().y();
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f14002e != colorStateList) {
            this.f14002e = colorStateList;
            e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f14003f != mode) {
            this.f14003f = mode;
            e();
        }
    }

    public void setTranslationX(float f2) {
        super.setTranslationX(f2);
        getImpl().r();
    }

    public void setTranslationY(float f2) {
        super.setTranslationY(f2);
        getImpl().r();
    }

    public void setTranslationZ(float f2) {
        super.setTranslationZ(f2);
        getImpl().r();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.m != z) {
            this.m = z;
            getImpl().n();
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
    }
}
