package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.h.j.y;

abstract class g<V extends View> extends i<V> {

    /* renamed from: d  reason: collision with root package name */
    private Runnable f13880d;

    /* renamed from: e  reason: collision with root package name */
    OverScroller f13881e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13882f;

    /* renamed from: g  reason: collision with root package name */
    private int f13883g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f13884h;
    private int i = -1;
    private VelocityTracker j;

    private class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final CoordinatorLayout f13885a;

        /* renamed from: b  reason: collision with root package name */
        private final V f13886b;

        a(CoordinatorLayout coordinatorLayout, V v) {
            this.f13885a = coordinatorLayout;
            this.f13886b = v;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f13886b != null && (overScroller = g.this.f13881e) != null) {
                if (overScroller.computeScrollOffset()) {
                    g gVar = g.this;
                    gVar.c(this.f13885a, this.f13886b, gVar.f13881e.getCurrY());
                    y.a((View) this.f13886b, (Runnable) this);
                    return;
                }
                g.this.e(this.f13885a, this.f13886b);
            }
        }
    }

    public g() {
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void d() {
        if (this.j == null) {
            this.j = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
        return b(coordinatorLayout, v, c() - i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    public abstract boolean a(V v);

    /* access modifiers changed from: package-private */
    public final boolean a(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, float f2) {
        V v2 = v;
        Runnable runnable = this.f13880d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f13880d = null;
        }
        if (this.f13881e == null) {
            this.f13881e = new OverScroller(v.getContext());
        }
        this.f13881e.fling(0, b(), 0, Math.round(f2), 0, 0, i2, i3);
        if (this.f13881e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            this.f13880d = new a(coordinatorLayout, v);
            y.a((View) v, this.f13880d);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        e(coordinatorLayout, v);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0 != 3) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.i = r0
        L_0x0012:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x001f
            boolean r0 = r4.f13882f
            if (r0 == 0) goto L_0x001f
            return r2
        L_0x001f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L_0x0060
            r5 = -1
            if (r0 == r2) goto L_0x0051
            if (r0 == r1) goto L_0x002f
            r6 = 3
            if (r0 == r6) goto L_0x0051
            goto L_0x0083
        L_0x002f:
            int r6 = r4.f13883g
            if (r6 != r5) goto L_0x0034
            goto L_0x0083
        L_0x0034:
            int r6 = r7.findPointerIndex(r6)
            if (r6 != r5) goto L_0x003b
            goto L_0x0083
        L_0x003b:
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.f13884h
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.i
            if (r6 <= r0) goto L_0x0083
            r4.f13882f = r2
            r4.f13884h = r5
            goto L_0x0083
        L_0x0051:
            r4.f13882f = r3
            r4.f13883g = r5
            android.view.VelocityTracker r5 = r4.j
            if (r5 == 0) goto L_0x0083
            r5.recycle()
            r5 = 0
            r4.j = r5
            goto L_0x0083
        L_0x0060:
            r4.f13882f = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.a(r6)
            if (r2 == 0) goto L_0x0083
            boolean r5 = r5.a((android.view.View) r6, (int) r0, (int) r1)
            if (r5 == 0) goto L_0x0083
            r4.f13884h = r1
            int r5 = r7.getPointerId(r3)
            r4.f13883g = r5
            r4.d()
        L_0x0083:
            android.view.VelocityTracker r5 = r4.j
            if (r5 == 0) goto L_0x008a
            r5.addMovement(r7)
        L_0x008a:
            boolean r5 = r4.f13882f
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.g.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public abstract int b(V v);

    /* access modifiers changed from: package-private */
    public abstract int b(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4);

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r0 != 3) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r11.i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r12.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r11.i = r0
        L_0x0012:
            int r0 = r14.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008d
            r3 = -1
            if (r0 == r1) goto L_0x005c
            r4 = 2
            if (r0 == r4) goto L_0x0025
            r12 = 3
            if (r0 == r12) goto L_0x007e
            goto L_0x00ae
        L_0x0025:
            int r0 = r11.f13883g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r3) goto L_0x002e
            return r2
        L_0x002e:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r2 = r11.f13884h
            int r2 = r2 - r0
            boolean r3 = r11.f13882f
            if (r3 != 0) goto L_0x0049
            int r3 = java.lang.Math.abs(r2)
            int r4 = r11.i
            if (r3 <= r4) goto L_0x0049
            r11.f13882f = r1
            if (r2 <= 0) goto L_0x0048
            int r2 = r2 - r4
            goto L_0x0049
        L_0x0048:
            int r2 = r2 + r4
        L_0x0049:
            r6 = r2
            boolean r2 = r11.f13882f
            if (r2 == 0) goto L_0x00ae
            r11.f13884h = r0
            int r7 = r11.b(r13)
            r8 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r3.a((androidx.coordinatorlayout.widget.CoordinatorLayout) r4, r5, (int) r6, (int) r7, (int) r8)
            goto L_0x00ae
        L_0x005c:
            android.view.VelocityTracker r0 = r11.j
            if (r0 == 0) goto L_0x007e
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.j
            int r4 = r11.f13883g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.c(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.a((androidx.coordinatorlayout.widget.CoordinatorLayout) r6, r7, (int) r8, (int) r9, (float) r10)
        L_0x007e:
            r11.f13882f = r2
            r11.f13883g = r3
            android.view.VelocityTracker r12 = r11.j
            if (r12 == 0) goto L_0x00ae
            r12.recycle()
            r12 = 0
            r11.j = r12
            goto L_0x00ae
        L_0x008d:
            float r0 = r14.getX()
            int r0 = (int) r0
            float r3 = r14.getY()
            int r3 = (int) r3
            boolean r12 = r12.a((android.view.View) r13, (int) r0, (int) r3)
            if (r12 == 0) goto L_0x00b6
            boolean r12 = r11.a(r13)
            if (r12 == 0) goto L_0x00b6
            r11.f13884h = r3
            int r12 = r14.getPointerId(r2)
            r11.f13883g = r12
            r11.d()
        L_0x00ae:
            android.view.VelocityTracker r12 = r11.j
            if (r12 == 0) goto L_0x00b5
            r12.addMovement(r14)
        L_0x00b5:
            return r1
        L_0x00b6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.g.b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public abstract int c();

    /* access modifiers changed from: package-private */
    public abstract int c(V v);

    /* access modifiers changed from: package-private */
    public int c(CoordinatorLayout coordinatorLayout, V v, int i2) {
        return b(coordinatorLayout, v, i2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    public abstract void e(CoordinatorLayout coordinatorLayout, V v);
}
