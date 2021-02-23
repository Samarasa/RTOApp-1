package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.b.b.c.a.b;
import c.b.b.c.a.i;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    private final i f14197c = new i(75, 150);

    /* renamed from: d  reason: collision with root package name */
    private final i f14198d = new i(0, 150);

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a(View view, boolean z, boolean z2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        i iVar = z ? this.f14197c : this.f14198d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        iVar.a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    /* access modifiers changed from: protected */
    public AnimatorSet b(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        a(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        b.a(animatorSet, arrayList);
        animatorSet.addListener(new g(this, z, view2));
        return animatorSet;
    }

    public boolean b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.b(coordinatorLayout, view, motionEvent);
    }
}
