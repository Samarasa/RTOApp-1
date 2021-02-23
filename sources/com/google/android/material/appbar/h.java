package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.h.d.a;
import b.h.j.C0197c;
import b.h.j.I;
import b.h.j.y;
import java.util.List;

abstract class h extends i<View> {

    /* renamed from: d  reason: collision with root package name */
    final Rect f13888d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    final Rect f13889e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private int f13890f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f13891g;

    public h() {
    }

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static int c(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final int a(View view) {
        if (this.f13891g == 0) {
            return 0;
        }
        float b2 = b(view);
        int i = this.f13891g;
        return a.a((int) (b2 * ((float) i)), 0, i);
    }

    /* access modifiers changed from: package-private */
    public abstract View a(List<View> list);

    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View a2;
        I lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (a2 = a(coordinatorLayout.b(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (y.j(a2) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.e() + lastWindowInsets.b();
        }
        int c2 = size + c(a2);
        int measuredHeight = a2.getMeasuredHeight();
        if (e()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            c2 -= measuredHeight;
        }
        coordinatorLayout.a(view, i, i2, View.MeasureSpec.makeMeasureSpec(c2, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    /* access modifiers changed from: package-private */
    public abstract float b(View view);

    public final void b(int i) {
        this.f13891g = i;
    }

    /* access modifiers changed from: protected */
    public void b(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View a2 = a(coordinatorLayout.b(view));
        if (a2 != null) {
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
            Rect rect = this.f13888d;
            rect.set(coordinatorLayout.getPaddingLeft() + eVar.leftMargin, a2.getBottom() + eVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - eVar.rightMargin, ((coordinatorLayout.getHeight() + a2.getBottom()) - coordinatorLayout.getPaddingBottom()) - eVar.bottomMargin);
            I lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && y.j(coordinatorLayout) && !y.j(view)) {
                rect.left += lastWindowInsets.c();
                rect.right -= lastWindowInsets.d();
            }
            Rect rect2 = this.f13889e;
            C0197c.a(c(eVar.f829c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int a3 = a(a2);
            view.layout(rect2.left, rect2.top - a3, rect2.right, rect2.bottom - a3);
            i2 = rect2.top - a2.getBottom();
        } else {
            super.b(coordinatorLayout, view, i);
            i2 = 0;
        }
        this.f13890f = i2;
    }

    public final int c() {
        return this.f13891g;
    }

    /* access modifiers changed from: package-private */
    public int c(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    public final int d() {
        return this.f13890f;
    }

    /* access modifiers changed from: protected */
    public boolean e() {
        return false;
    }
}
