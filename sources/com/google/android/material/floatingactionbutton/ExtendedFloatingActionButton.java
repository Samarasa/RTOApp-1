package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.h.i.g;
import b.h.j.y;
import c.b.b.c.a.b;
import c.b.b.c.a.h;
import c.b.b.c.j;
import c.b.b.c.k;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.a {
    private static final int r = j.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;
    private static final Property<View, Float> s = new f(Float.class, "width");
    private static final Property<View, Float> t = new g(Float.class, "height");
    private static final Property<View, Float> u = new h(Float.class, "cornerRadius");
    private h A;
    private h B;
    private h C;
    private h D;
    private h E;
    private h F;
    private h G;
    private final CoordinatorLayout.b<ExtendedFloatingActionButton> H;
    private int I;
    private ArrayList<Animator.AnimatorListener> J;
    private ArrayList<Animator.AnimatorListener> K;
    private ArrayList<Animator.AnimatorListener> L;
    private ArrayList<Animator.AnimatorListener> M;
    private boolean N;
    private boolean O;
    /* access modifiers changed from: private */
    public final Rect v;
    /* access modifiers changed from: private */
    public int w;
    /* access modifiers changed from: private */
    public Animator x;
    /* access modifiers changed from: private */
    public Animator y;
    private h z;

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.b<T> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f13994a;

        /* renamed from: b  reason: collision with root package name */
        private a f13995b;

        /* renamed from: c  reason: collision with root package name */
        private a f13996c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f13997d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f13998e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f13997d = false;
            this.f13998e = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.ExtendedFloatingActionButton_Behavior_Layout);
            this.f13997d = obtainStyledAttributes.getBoolean(k.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f13998e = obtainStyledAttributes.getBoolean(k.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }

        private void a(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            Rect a2 = extendedFloatingActionButton.v;
            if (a2 != null && a2.centerX() > 0 && a2.centerY() > 0) {
                CoordinatorLayout.e eVar = (CoordinatorLayout.e) extendedFloatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = extendedFloatingActionButton.getRight() >= coordinatorLayout.getWidth() - eVar.rightMargin ? a2.right : extendedFloatingActionButton.getLeft() <= eVar.leftMargin ? -a2.left : 0;
                if (extendedFloatingActionButton.getBottom() >= coordinatorLayout.getHeight() - eVar.bottomMargin) {
                    i = a2.bottom;
                } else if (extendedFloatingActionButton.getTop() <= eVar.topMargin) {
                    i = -a2.top;
                }
                if (i != 0) {
                    y.c((View) extendedFloatingActionButton, i);
                }
                if (i2 != 0) {
                    y.b((View) extendedFloatingActionButton, i2);
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

        private boolean a(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f13997d || this.f13998e) && ((CoordinatorLayout.e) extendedFloatingActionButton.getLayoutParams()).c() == view.getId() && extendedFloatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!a((View) appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f13994a == null) {
                this.f13994a = new Rect();
            }
            Rect rect = this.f13994a;
            f.a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                b(extendedFloatingActionButton);
                return true;
            }
            a(extendedFloatingActionButton);
            return true;
        }

        private boolean b(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!a(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.e) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                b(extendedFloatingActionButton);
                return true;
            }
            a(extendedFloatingActionButton);
            return true;
        }

        public void a(CoordinatorLayout.e eVar) {
            if (eVar.f834h == 0) {
                eVar.f834h = 80;
            }
        }

        /* access modifiers changed from: protected */
        public void a(ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (this.f13998e) {
                extendedFloatingActionButton.a(this.f13996c);
            } else if (this.f13997d) {
                extendedFloatingActionButton.c(false, true, this.f13995b);
            }
        }

        public boolean a(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> b2 = coordinatorLayout.b((View) extendedFloatingActionButton);
            int size = b2.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = b2.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (a(view) && b(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (a(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.c((View) extendedFloatingActionButton, i);
            a(coordinatorLayout, extendedFloatingActionButton);
            return true;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            Rect a2 = extendedFloatingActionButton.v;
            rect.set(extendedFloatingActionButton.getLeft() + a2.left, extendedFloatingActionButton.getTop() + a2.top, extendedFloatingActionButton.getRight() - a2.right, extendedFloatingActionButton.getBottom() - a2.bottom);
            return true;
        }

        /* renamed from: a */
        public boolean b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!a(view)) {
                return false;
            } else {
                b(view, extendedFloatingActionButton);
                return false;
            }
        }

        /* access modifiers changed from: protected */
        public void b(ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (this.f13998e) {
                extendedFloatingActionButton.b(this.f13996c);
            } else if (this.f13997d) {
                extendedFloatingActionButton.a(false, true, this.f13995b);
            }
        }
    }

    public static abstract class a {
        public abstract void a(ExtendedFloatingActionButton extendedFloatingActionButton);

        public abstract void b(ExtendedFloatingActionButton extendedFloatingActionButton);

        public abstract void c(ExtendedFloatingActionButton extendedFloatingActionButton);

        public abstract void d(ExtendedFloatingActionButton extendedFloatingActionButton);
    }

    private int a(int i) {
        return (i - 1) / 2;
    }

    private AnimatorSet a(h hVar) {
        ArrayList arrayList = new ArrayList();
        if (hVar.c("opacity")) {
            arrayList.add(hVar.a("opacity", (View) this, (Property<View, Float>) View.ALPHA));
        }
        if (hVar.c("scale")) {
            arrayList.add(hVar.a("scale", (View) this, (Property<View, Float>) View.SCALE_Y));
            arrayList.add(hVar.a("scale", (View) this, (Property<View, Float>) View.SCALE_X));
        }
        if (hVar.c("width")) {
            arrayList.add(hVar.a("width", (View) this, s));
        }
        if (hVar.c("height")) {
            arrayList.add(hVar.a("height", (View) this, t));
        }
        if (hVar.c("cornerRadius") && !this.O) {
            arrayList.add(hVar.a("cornerRadius", (View) this, u));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet a(h hVar, boolean z2) {
        int collapsedSize = getCollapsedSize();
        if (hVar.c("width")) {
            PropertyValuesHolder[] a2 = hVar.a("width");
            if (z2) {
                a2[0].setFloatValues(new float[]{(float) getMeasuredWidth(), (float) collapsedSize});
            } else {
                a2[0].setFloatValues(new float[]{(float) getWidth(), (float) getMeasuredWidth()});
            }
            hVar.a("width", a2);
        }
        if (hVar.c("height")) {
            PropertyValuesHolder[] a3 = hVar.a("height");
            if (z2) {
                a3[0].setFloatValues(new float[]{(float) getMeasuredHeight(), (float) collapsedSize});
            } else {
                a3[0].setFloatValues(new float[]{(float) getHeight(), (float) getMeasuredHeight()});
            }
            hVar.a("height", a3);
        }
        return a(hVar);
    }

    /* access modifiers changed from: private */
    public void a(int i, boolean z2) {
        super.setVisibility(i);
        if (z2) {
            this.I = i;
        }
    }

    /* access modifiers changed from: private */
    public void a(boolean z2, boolean z3, a aVar) {
        if (!g()) {
            Animator animator = this.x;
            if (animator != null) {
                animator.cancel();
            }
            if (!z3 || !i()) {
                a(z2 ? 8 : 4, z2);
                if (aVar != null) {
                    aVar.b(this);
                    return;
                }
                return;
            }
            AnimatorSet a2 = a(getCurrentHideMotionSpec());
            a2.addListener(new c(this, z2, aVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.K;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    a2.addListener(it.next());
                }
            }
            a2.start();
        }
    }

    private void b(boolean z2, boolean z3, a aVar) {
        if (z2 != this.N && getIcon() != null && !TextUtils.isEmpty(getText())) {
            this.N = z2;
            Animator animator = this.y;
            if (animator != null) {
                animator.cancel();
            }
            if (z3 && i()) {
                measure(0, 0);
                AnimatorSet a2 = a(this.N ? getCurrentExtendMotionSpec() : getCurrentShrinkMotionSpec(), !this.N);
                a2.addListener(new e(this, aVar, z2));
                ArrayList<Animator.AnimatorListener> arrayList = z2 ? this.M : this.L;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a2.addListener(it.next());
                    }
                }
                a2.start();
            } else if (z2) {
                f();
                if (aVar != null) {
                    aVar.a(this);
                }
            } else {
                j();
                if (aVar != null) {
                    aVar.d(this);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void c(boolean z2, boolean z3, a aVar) {
        if (!h()) {
            Animator animator = this.x;
            if (animator != null) {
                animator.cancel();
            }
            if (!z3 || !i()) {
                a(0, z2);
                setAlpha(1.0f);
                setScaleY(1.0f);
                setScaleX(1.0f);
                if (aVar != null) {
                    aVar.c(this);
                    return;
                }
                return;
            }
            AnimatorSet a2 = a(getCurrentShowMotionSpec());
            a2.addListener(new d(this, z2, aVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.J;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    a2.addListener(it.next());
                }
            }
            a2.start();
        }
    }

    private void f() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            measure(0, 0);
            layoutParams.width = getMeasuredWidth();
            layoutParams.height = getMeasuredHeight();
            requestLayout();
        }
    }

    private boolean g() {
        return getVisibility() == 0 ? this.w == 1 : this.w != 2;
    }

    private int getCollapsedSize() {
        return (Math.min(y.q(this), y.p(this)) * 2) + getIconSize();
    }

    private h getCurrentExtendMotionSpec() {
        h hVar = this.B;
        if (hVar != null) {
            return hVar;
        }
        if (this.F == null) {
            this.F = h.a(getContext(), c.b.b.c.a.mtrl_extended_fab_extend_motion_spec);
        }
        h hVar2 = this.F;
        g.a(hVar2);
        return hVar2;
    }

    private h getCurrentHideMotionSpec() {
        h hVar = this.A;
        if (hVar != null) {
            return hVar;
        }
        if (this.E == null) {
            this.E = h.a(getContext(), c.b.b.c.a.mtrl_extended_fab_hide_motion_spec);
        }
        h hVar2 = this.E;
        g.a(hVar2);
        return hVar2;
    }

    private h getCurrentShowMotionSpec() {
        h hVar = this.z;
        if (hVar != null) {
            return hVar;
        }
        if (this.D == null) {
            this.D = h.a(getContext(), c.b.b.c.a.mtrl_extended_fab_show_motion_spec);
        }
        h hVar2 = this.D;
        g.a(hVar2);
        return hVar2;
    }

    private h getCurrentShrinkMotionSpec() {
        h hVar = this.C;
        if (hVar != null) {
            return hVar;
        }
        if (this.G == null) {
            this.G = h.a(getContext(), c.b.b.c.a.mtrl_extended_fab_shrink_motion_spec);
        }
        h hVar2 = this.G;
        g.a(hVar2);
        return hVar2;
    }

    private boolean h() {
        return getVisibility() != 0 ? this.w == 2 : this.w != 1;
    }

    private boolean i() {
        return y.A(this) && !isInEditMode();
    }

    private void j() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            int collapsedSize = getCollapsedSize();
            layoutParams.width = collapsedSize;
            layoutParams.height = collapsedSize;
            requestLayout();
        }
    }

    public void a(a aVar) {
        b(true, true, aVar);
    }

    public void b(a aVar) {
        b(false, true, aVar);
    }

    public CoordinatorLayout.b<ExtendedFloatingActionButton> getBehavior() {
        return this.H;
    }

    public h getExtendMotionSpec() {
        return this.B;
    }

    public h getHideMotionSpec() {
        return this.A;
    }

    public h getShowMotionSpec() {
        return this.z;
    }

    public h getShrinkMotionSpec() {
        return this.C;
    }

    public final int getUserSetVisibility() {
        return this.I;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.N && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.N = false;
            j();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.O) {
            getShapeAppearanceModel().a((float) a(getMeasuredHeight()));
        }
    }

    public void setCornerRadius(int i) {
        this.O = i == -1;
        if (this.O) {
            i = a(getMeasuredHeight());
        } else if (i < 0) {
            i = 0;
        }
        super.setCornerRadius(i);
    }

    public void setExtendMotionSpec(h hVar) {
        this.B = hVar;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(h.a(getContext(), i));
    }

    public void setHideMotionSpec(h hVar) {
        this.A = hVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(h.a(getContext(), i));
    }

    public void setShapeAppearanceModel(c.b.b.c.o.h hVar) {
        this.O = hVar.j();
        super.setShapeAppearanceModel(hVar);
    }

    public void setShowMotionSpec(h hVar) {
        this.z = hVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(h.a(getContext(), i));
    }

    public void setShrinkMotionSpec(h hVar) {
        this.C = hVar;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(h.a(getContext(), i));
    }

    public void setVisibility(int i) {
        a(i, true);
    }
}
