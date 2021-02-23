package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.h.j.y;
import b.j.a.c;
import c.b.b.c.a.k;
import c.b.b.c.j;
import c.b.b.c.o.e;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.a {
    private static final int P = j.Widget_MaterialComponents_BottomAppBar;
    private final int Q;
    private final e R;
    private Animator S;
    /* access modifiers changed from: private */
    public Animator T;
    private int U;
    private int V;
    private boolean W;
    private int aa;
    private ArrayList<a> ba;
    private boolean ca;
    private Behavior da;
    AnimatorListenerAdapter ea;
    k<FloatingActionButton> fa;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final Rect f13922e = new Rect();
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public WeakReference<BottomAppBar> f13923f;

        /* renamed from: g  reason: collision with root package name */
        private final View.OnLayoutChangeListener f13924g = new g(this);

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean a(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f13923f = new WeakReference<>(bottomAppBar);
            View c2 = bottomAppBar.w();
            if (c2 != null && !y.A(c2)) {
                ((CoordinatorLayout.e) c2.getLayoutParams()).f830d = 49;
                if (c2 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) c2;
                    floatingActionButton.addOnLayoutChangeListener(this.f13924g);
                    bottomAppBar.a(floatingActionButton);
                }
                bottomAppBar.z();
            }
            coordinatorLayout.c((View) bottomAppBar, i);
            return super.a(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: a */
        public boolean b(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.b(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }
    }

    interface a {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    static class b extends c {
        public static final Parcelable.Creator<b> CREATOR = new h();

        /* renamed from: c  reason: collision with root package name */
        int f13925c;

        /* renamed from: d  reason: collision with root package name */
        boolean f13926d;

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13925c = parcel.readInt();
            this.f13926d = parcel.readInt() != 0;
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13925c);
            parcel.writeInt(this.f13926d ? 1 : 0);
        }
    }

    private void a(int i, boolean z) {
        if (y.A(this)) {
            Animator animator = this.T;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!x()) {
                i = 0;
                z = false;
            }
            a(i, z, (List<Animator>) arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.T = animatorSet;
            this.T.addListener(new d(this));
            this.T.start();
        }
    }

    private void a(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            if (Math.abs(actionMenuView.getTranslationX() - ((float) a(actionMenuView, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.addListener(new e(this, actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.a((Animator.AnimatorListener) this.ea);
        floatingActionButton.b((Animator.AnimatorListener) new f(this));
        floatingActionButton.a((k<? extends FloatingActionButton>) this.fa);
    }

    private void b(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v(), "translationX", new float[]{d(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    /* access modifiers changed from: private */
    public void b(ActionMenuView actionMenuView, int i, boolean z) {
        actionMenuView.setTranslationX((float) a(actionMenuView, i, z));
    }

    /* access modifiers changed from: private */
    public float d(int i) {
        int i2 = 1;
        boolean z = y.m(this) == 1;
        if (i != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.Q;
        if (z) {
            i2 = -1;
        }
        return (float) (measuredWidth * i2);
    }

    private void e(int i) {
        if (this.U != i && y.A(this)) {
            Animator animator = this.S;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.V == 1) {
                b(i, arrayList);
            } else {
                a(i, (List<Animator>) arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.S = animatorSet;
            this.S.addListener(new a(this));
            this.S.start();
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return d(this.U);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().a();
    }

    private i getTopEdgeTreatment() {
        return (i) this.R.h().f();
    }

    private void s() {
        Animator animator = this.T;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.S;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* access modifiers changed from: private */
    public void t() {
        ArrayList<a> arrayList;
        int i = this.aa - 1;
        this.aa = i;
        if (i == 0 && (arrayList = this.ba) != null) {
            Iterator<a> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public void u() {
        ArrayList<a> arrayList;
        int i = this.aa;
        this.aa = i + 1;
        if (i == 0 && (arrayList = this.ba) != null) {
            Iterator<a> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public FloatingActionButton v() {
        View w = w();
        if (w instanceof FloatingActionButton) {
            return (FloatingActionButton) w;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View w() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.c((android.view.View) r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.w():android.view.View");
    }

    private boolean x() {
        FloatingActionButton v = v();
        return v != null && v.c();
    }

    private void y() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!x()) {
                b(actionMenuView, 0, false);
            } else {
                b(actionMenuView, this.U, this.ca);
            }
        }
    }

    /* access modifiers changed from: private */
    public void z() {
        getTopEdgeTreatment().e(getFabTranslationX());
        View w = w();
        this.R.b((!this.ca || !x()) ? 0.0f : 1.0f);
        if (w != null) {
            w.setTranslationY(getFabTranslationY());
            w.setTranslationX(getFabTranslationX());
        }
    }

    /* access modifiers changed from: protected */
    public int a(ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2 = y.m(this) == 1;
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.b) && (((Toolbar.b) childAt.getLayoutParams()).f186a & 8388615) == 8388611) {
                i2 = Math.max(i2, z2 ? childAt.getLeft() : childAt.getRight());
            }
        }
        int right = i2 - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft());
        if (i != 1 || !z) {
            return 0;
        }
        return right;
    }

    /* access modifiers changed from: protected */
    public void a(int i, List<Animator> list) {
        FloatingActionButton v = v();
        if (v != null && !v.b()) {
            u();
            v.a((FloatingActionButton.a) new c(this, i));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(int i) {
        float f2 = (float) i;
        if (f2 == getTopEdgeTreatment().f()) {
            return false;
        }
        getTopEdgeTreatment().d(f2);
        this.R.invalidateSelf();
        return true;
    }

    public ColorStateList getBackgroundTint() {
        return this.R.i();
    }

    public Behavior getBehavior() {
        if (this.da == null) {
            this.da = new Behavior();
        }
        return this.da;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().a();
    }

    public int getFabAlignmentMode() {
        return this.U;
    }

    public int getFabAnimationMode() {
        return this.V;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().b();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().e();
    }

    public boolean getHideOnScroll() {
        return this.W;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            s();
            z();
        }
        y();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        this.U = bVar.f13925c;
        this.ca = bVar.f13926d;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f13925c = this.U;
        bVar.f13926d = this.ca;
        return bVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.a((Drawable) this.R, colorStateList);
    }

    public void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().a(f2);
            this.R.invalidateSelf();
            z();
        }
    }

    public void setElevation(float f2) {
        this.R.a(f2);
        getBehavior().a(this, this.R.g() - this.R.f());
    }

    public void setFabAlignmentMode(int i) {
        e(i);
        a(i, this.ca);
        this.U = i;
    }

    public void setFabAnimationMode(int i) {
        this.V = i;
    }

    public void setFabCradleMargin(float f2) {
        if (f2 != getFabCradleMargin()) {
            getTopEdgeTreatment().b(f2);
            this.R.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().c(f2);
            this.R.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.W = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
