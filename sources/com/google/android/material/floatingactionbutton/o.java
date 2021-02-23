package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import b.h.i.g;
import c.b.b.c.c;
import c.b.b.c.n.b;
import c.b.b.c.o.e;
import c.b.b.c.o.h;
import java.util.ArrayList;

class o extends n {

    static class a extends e {
        a(h hVar) {
            super(hVar);
        }

        public boolean isStateful() {
            return true;
        }
    }

    o(FloatingActionButton floatingActionButton, b bVar) {
        super(floatingActionButton, bVar);
    }

    private Animator a(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.F, "elevation", new float[]{f2}).setDuration(0)).with(ObjectAnimator.ofFloat(this.F, View.TRANSLATION_Z, new float[]{f3}).setDuration(100));
        animatorSet.setInterpolator(n.f14043a);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    public e a() {
        h hVar = this.f14050h;
        g.a(hVar);
        h hVar2 = hVar;
        if (this.m) {
            hVar2.a(((float) this.F.getSizeDimension()) / 2.0f);
        }
        return new a(hVar2);
    }

    /* access modifiers changed from: package-private */
    public b a(int i, ColorStateList colorStateList) {
        Context context = this.F.getContext();
        h hVar = this.f14050h;
        g.a(hVar);
        b bVar = new b(hVar);
        bVar.a(b.h.a.a.a(context, c.design_fab_stroke_top_outer_color), b.h.a.a.a(context, c.design_fab_stroke_top_inner_color), b.h.a.a.a(context, c.design_fab_stroke_end_inner_color), b.h.a.a.a(context, c.design_fab_stroke_end_outer_color));
        bVar.a((float) i);
        bVar.a(colorStateList);
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public void a(float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT == 21) {
            this.F.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(n.f14044b, a(f2, f4));
            stateListAnimator.addState(n.f14045c, a(f2, f3));
            stateListAnimator.addState(n.f14046d, a(f2, f3));
            stateListAnimator.addState(n.f14047e, a(f2, f3));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.F, "elevation", new float[]{f2}).setDuration(0));
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.F;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.F, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(n.f14043a);
            stateListAnimator.addState(n.f14048f, animatorSet);
            stateListAnimator.addState(n.f14049g, a(0.0f, 0.0f));
            this.F.setStateListAnimator(stateListAnimator);
        }
        if (t()) {
            x();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        this.i = a();
        this.i.setTintList(colorStateList);
        if (mode != null) {
            this.i.setTintMode(mode);
        }
        this.i.a(this.F.getContext());
        if (i > 0) {
            this.k = a(i, colorStateList);
            b bVar = this.k;
            g.a(bVar);
            e eVar = this.i;
            g.a(eVar);
            drawable = new LayerDrawable(new Drawable[]{bVar, eVar});
        } else {
            this.k = null;
            drawable = this.i;
        }
        this.j = new RippleDrawable(c.b.b.c.m.a.a(colorStateList2), drawable, (Drawable) null);
        this.l = this.j;
    }

    /* access modifiers changed from: package-private */
    public void a(Rect rect) {
        if (this.G.a()) {
            super.a(rect);
            return;
        }
        int sizeDimension = !u() ? (this.r - this.F.getSizeDimension()) / 2 : 0;
        rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
    }

    /* access modifiers changed from: package-private */
    public void a(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f2 = 0.0f;
            if (this.F.isEnabled()) {
                this.F.setElevation(this.o);
                if (this.F.isPressed()) {
                    floatingActionButton = this.F;
                    f2 = this.q;
                } else if (this.F.isFocused() || this.F.isHovered()) {
                    floatingActionButton = this.F;
                    f2 = this.p;
                }
                floatingActionButton.setTranslationZ(f2);
            }
            this.F.setElevation(0.0f);
            floatingActionButton = this.F;
            floatingActionButton.setTranslationZ(f2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(ColorStateList colorStateList) {
        Drawable drawable = this.j;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(c.b.b.c.m.a.a(colorStateList));
        } else {
            super.b(colorStateList);
        }
    }

    public float c() {
        return this.F.getElevation();
    }

    /* access modifiers changed from: package-private */
    public void l() {
    }

    /* access modifiers changed from: package-private */
    public void n() {
        x();
    }

    /* access modifiers changed from: package-private */
    public boolean s() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean t() {
        return this.G.a() || !u();
    }

    /* access modifiers changed from: package-private */
    public void v() {
    }
}
