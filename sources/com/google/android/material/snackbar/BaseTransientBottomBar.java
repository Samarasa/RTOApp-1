package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.h.j.C0195a;
import b.h.j.q;
import b.h.j.y;
import c.b.b.c.h;
import c.b.b.c.k;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.v;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.u;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a  reason: collision with root package name */
    static final Handler f14137a = new Handler(Looper.getMainLooper(), new g());
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f14138b;

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f14139c = {c.b.b.c.b.snackbarStyle};

    /* renamed from: d  reason: collision with root package name */
    private final ViewGroup f14140d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f14141e;

    /* renamed from: f  reason: collision with root package name */
    protected final e f14142f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final r f14143g;

    /* renamed from: h  reason: collision with root package name */
    private int f14144h;
    private View i;
    private final int j;
    /* access modifiers changed from: private */
    public int k;
    private int l;
    private List<a<B>> m;
    private Behavior n;
    private final AccessibilityManager o;
    final u.a p = new j(this);

    public static class Behavior extends SwipeDismissBehavior<View> {
        private final b k = new b(this);

        /* access modifiers changed from: private */
        public void a(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.k.a(baseTransientBottomBar);
        }

        public boolean a(View view) {
            return this.k.a(view);
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.k.a(coordinatorLayout, view, motionEvent);
            return super.a(coordinatorLayout, view, motionEvent);
        }
    }

    public static abstract class a<B> {
        public void a(B b2) {
        }

        public void a(B b2, int i) {
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private u.a f14145a;

        public b(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.b(0.1f);
            swipeDismissBehavior.a(0.6f);
            swipeDismissBehavior.a(0);
        }

        public void a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    u.a().e(this.f14145a);
                }
            } else if (coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                u.a().d(this.f14145a);
            }
        }

        public void a(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f14145a = baseTransientBottomBar.p;
        }

        public boolean a(View view) {
            return view instanceof e;
        }
    }

    protected interface c {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    protected interface d {
        void a(View view, int i, int i2, int i3, int i4);
    }

    protected static class e extends FrameLayout {

        /* renamed from: a  reason: collision with root package name */
        private static final View.OnTouchListener f14146a = new q();

        /* renamed from: b  reason: collision with root package name */
        private d f14147b;

        /* renamed from: c  reason: collision with root package name */
        private c f14148c;

        /* renamed from: d  reason: collision with root package name */
        private int f14149d;

        /* renamed from: e  reason: collision with root package name */
        private final float f14150e;

        /* renamed from: f  reason: collision with root package name */
        private final float f14151f;

        protected e(Context context) {
            this(context, (AttributeSet) null);
        }

        protected e(Context context, AttributeSet attributeSet) {
            super(v.a(context, attributeSet, 0, 0), attributeSet);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(k.SnackbarLayout_elevation)) {
                y.a((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(k.SnackbarLayout_elevation, 0));
            }
            this.f14149d = obtainStyledAttributes.getInt(k.SnackbarLayout_animationMode, 0);
            this.f14150e = obtainStyledAttributes.getFloat(k.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            this.f14151f = obtainStyledAttributes.getFloat(k.SnackbarLayout_actionTextColorAlpha, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f14146a);
            setFocusable(true);
        }

        /* access modifiers changed from: package-private */
        public float getActionTextColorAlpha() {
            return this.f14151f;
        }

        /* access modifiers changed from: package-private */
        public int getAnimationMode() {
            return this.f14149d;
        }

        /* access modifiers changed from: package-private */
        public float getBackgroundOverlayColorAlpha() {
            return this.f14150e;
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            c cVar = this.f14148c;
            if (cVar != null) {
                cVar.onViewAttachedToWindow(this);
            }
            y.F(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            c cVar = this.f14148c;
            if (cVar != null) {
                cVar.onViewDetachedFromWindow(this);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            d dVar = this.f14147b;
            if (dVar != null) {
                dVar.a(this, i, i2, i3, i4);
            }
        }

        /* access modifiers changed from: package-private */
        public void setAnimationMode(int i) {
            this.f14149d = i;
        }

        /* access modifiers changed from: package-private */
        public void setOnAttachStateChangeListener(c cVar) {
            this.f14148c = cVar;
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f14146a);
            super.setOnClickListener(onClickListener);
        }

        /* access modifiers changed from: package-private */
        public void setOnLayoutChangeListener(d dVar) {
            this.f14147b = dVar;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f14138b = i2 >= 16 && i2 <= 19;
    }

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, r rVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (rVar != null) {
            this.f14140d = viewGroup;
            this.f14143g = rVar;
            this.f14141e = viewGroup.getContext();
            v.a(this.f14141e);
            this.f14142f = (e) LayoutInflater.from(this.f14141e).inflate(f(), this.f14140d, false);
            if (this.f14142f.getBackground() == null) {
                y.a((View) this.f14142f, n());
            }
            if (view instanceof SnackbarContentLayout) {
                ((SnackbarContentLayout) view).a(this.f14142f.getActionTextColorAlpha());
            }
            this.f14142f.addView(view);
            this.j = ((ViewGroup.MarginLayoutParams) this.f14142f.getLayoutParams()).bottomMargin;
            y.d(this.f14142f, 1);
            y.e(this.f14142f, 1);
            y.a((View) this.f14142f, true);
            y.a((View) this.f14142f, (q) new h(this));
            y.a((View) this.f14142f, (C0195a) new i(this));
            this.o = (AccessibilityManager) this.f14141e.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    private ValueAnimator a(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(c.b.b.c.a.a.f4749a);
        ofFloat.addUpdateListener(new a(this));
        return ofFloat;
    }

    private ValueAnimator b(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(c.b.b.c.a.a.f4752d);
        ofFloat.addUpdateListener(new b(this));
        return ofFloat;
    }

    private void e(int i2) {
        if (this.f14142f.getAnimationMode() == 1) {
            f(i2);
        } else {
            g(i2);
        }
    }

    private void f(int i2) {
        ValueAnimator a2 = a(1.0f, 0.0f);
        a2.setDuration(75);
        a2.addListener(new p(this, i2));
        a2.start();
    }

    private void g(int i2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, o()});
        valueAnimator.setInterpolator(c.b.b.c.a.a.f4750b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new e(this, i2));
        valueAnimator.addUpdateListener(new f(this));
        valueAnimator.start();
    }

    private int m() {
        View view = this.i;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        this.f14140d.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f14140d.getHeight()) - i2;
    }

    private Drawable n() {
        e eVar = this.f14142f;
        int a2 = c.b.b.c.f.a.a((View) eVar, c.b.b.c.b.colorSurface, c.b.b.c.b.colorOnSurface, eVar.getBackgroundOverlayColorAlpha());
        float dimension = this.f14142f.getResources().getDimension(c.b.b.c.d.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(a2);
        gradientDrawable.setCornerRadius(dimension);
        return gradientDrawable;
    }

    private int o() {
        int height = this.f14142f.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f14142f.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    private void p() {
        ValueAnimator a2 = a(0.0f, 1.0f);
        ValueAnimator b2 = b(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{a2, b2});
        animatorSet.setDuration(150);
        animatorSet.addListener(new o(this));
        animatorSet.start();
    }

    private void q() {
        int o2 = o();
        if (f14138b) {
            y.c((View) this.f14142f, o2);
        } else {
            this.f14142f.setTranslationY((float) o2);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{o2, 0});
        valueAnimator.setInterpolator(c.b.b.c.a.a.f4750b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new c(this));
        valueAnimator.addUpdateListener(new d(this, o2));
        valueAnimator.start();
    }

    /* access modifiers changed from: private */
    public void r() {
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f14142f.getLayoutParams();
        marginLayoutParams.bottomMargin = this.j;
        if (this.i != null) {
            i3 = marginLayoutParams.bottomMargin;
            i2 = this.l;
        } else {
            i3 = marginLayoutParams.bottomMargin;
            i2 = this.k;
        }
        marginLayoutParams.bottomMargin = i3 + i2;
        this.f14142f.setLayoutParams(marginLayoutParams);
    }

    /* access modifiers changed from: protected */
    public void a(int i2) {
        u.a().a(this.p, i2);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f14142f.getAnimationMode() == 1) {
            p();
        } else {
            q();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        if (!j() || this.f14142f.getVisibility() != 0) {
            c(i2);
        } else {
            e(i2);
        }
    }

    public void c() {
        a(3);
    }

    /* access modifiers changed from: package-private */
    public void c(int i2) {
        u.a().b(this.p);
        List<a<B>> list = this.m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.m.get(size).a(this, i2);
            }
        }
        ViewParent parent = this.f14142f.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f14142f);
        }
    }

    public int d() {
        return this.f14144h;
    }

    public B d(int i2) {
        this.f14144h = i2;
        return this;
    }

    /* access modifiers changed from: protected */
    public SwipeDismissBehavior<? extends View> e() {
        return new Behavior();
    }

    /* access modifiers changed from: protected */
    public int f() {
        return g() ? h.mtrl_layout_snackbar : h.design_layout_snackbar;
    }

    /* access modifiers changed from: protected */
    public boolean g() {
        TypedArray obtainStyledAttributes = this.f14141e.obtainStyledAttributes(f14139c);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    public boolean h() {
        return u.a().a(this.p);
    }

    /* access modifiers changed from: package-private */
    public void i() {
        u.a().c(this.p);
        List<a<B>> list = this.m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.m.get(size).a(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.o.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public void k() {
        u.a().a(d(), this.p);
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        if (this.f14142f.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f14142f.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                CoordinatorLayout.e eVar = (CoordinatorLayout.e) layoutParams;
                SwipeDismissBehavior swipeDismissBehavior = this.n;
                if (swipeDismissBehavior == null) {
                    swipeDismissBehavior = e();
                }
                if (swipeDismissBehavior instanceof Behavior) {
                    ((Behavior) swipeDismissBehavior).a((BaseTransientBottomBar<?>) this);
                }
                swipeDismissBehavior.a((SwipeDismissBehavior.a) new k(this));
                eVar.a((CoordinatorLayout.b) swipeDismissBehavior);
                if (this.i == null) {
                    eVar.f833g = 80;
                }
            }
            this.l = m();
            r();
            this.f14140d.addView(this.f14142f);
        }
        this.f14142f.setOnAttachStateChangeListener(new m(this));
        if (!y.A(this.f14142f)) {
            this.f14142f.setOnLayoutChangeListener(new n(this));
        } else if (j()) {
            b();
        } else {
            i();
        }
    }
}
