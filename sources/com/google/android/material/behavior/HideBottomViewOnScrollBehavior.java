package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.b.b.c.a.a;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.b<V> {

    /* renamed from: a  reason: collision with root package name */
    private int f13903a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f13904b = 2;

    /* renamed from: c  reason: collision with root package name */
    private int f13905c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ViewPropertyAnimator f13906d;

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f13906d = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new a(this));
    }

    public void a(V v) {
        if (this.f13904b != 1) {
            ViewPropertyAnimator viewPropertyAnimator = this.f13906d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f13904b = 1;
            a(v, this.f13903a + this.f13905c, 175, a.f4751c);
        }
    }

    public void a(V v, int i) {
        this.f13905c = i;
        if (this.f13904b == 1) {
            v.setTranslationY((float) (this.f13903a + this.f13905c));
        }
    }

    public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        if (i2 > 0) {
            a(v);
        } else if (i2 < 0) {
            b(v);
        }
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f13903a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.a(coordinatorLayout, v, i);
    }

    public void b(V v) {
        if (this.f13904b != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.f13906d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f13904b = 2;
            a(v, 0, 225, a.f4752d);
        }
    }

    public boolean b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return i == 2;
    }
}
