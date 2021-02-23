package com.google.android.material.bottomsheet;

import android.view.View;
import b.h.d.a;
import b.j.b.g;
import java.lang.ref.WeakReference;

class c extends g.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BottomSheetBehavior f13964a;

    c(BottomSheetBehavior bottomSheetBehavior) {
        this.f13964a = bottomSheetBehavior;
    }

    public int a(View view, int i, int i2) {
        return view.getLeft();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        if (java.lang.Math.abs(r8 - r6.f13964a.n) < java.lang.Math.abs(r8 - r6.f13964a.p)) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ab, code lost:
        if (java.lang.Math.abs(r8 - r6.f13964a.m) < java.lang.Math.abs(r8 - r6.f13964a.p)) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d4, code lost:
        if (java.lang.Math.abs(r8 - r0) < java.lang.Math.abs(r8 - r6.f13964a.p)) goto L_0x0086;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0109 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r7, float r8, float r9) {
        /*
            r6 = this;
            r0 = 0
            r1 = 4
            r2 = 6
            r3 = 3
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x0026
            com.google.android.material.bottomsheet.BottomSheetBehavior r8 = r6.f13964a
            boolean r8 = r8.f13946c
            if (r8 == 0) goto L_0x0017
        L_0x0010:
            com.google.android.material.bottomsheet.BottomSheetBehavior r8 = r6.f13964a
            int r8 = r8.m
        L_0x0014:
            r1 = 3
            goto L_0x00d7
        L_0x0017:
            int r8 = r7.getTop()
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r6.f13964a
            int r0 = r9.n
            if (r8 <= r0) goto L_0x0023
            r8 = r0
            goto L_0x008a
        L_0x0023:
            int r8 = r9.l
            goto L_0x0014
        L_0x0026:
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = r6.f13964a
            boolean r5 = r4.r
            if (r5 == 0) goto L_0x004f
            boolean r4 = r4.a((android.view.View) r7, (float) r9)
            if (r4 == 0) goto L_0x004f
            int r4 = r7.getTop()
            com.google.android.material.bottomsheet.BottomSheetBehavior r5 = r6.f13964a
            int r5 = r5.p
            if (r4 > r5) goto L_0x0048
            float r4 = java.lang.Math.abs(r8)
            float r5 = java.lang.Math.abs(r9)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x004f
        L_0x0048:
            com.google.android.material.bottomsheet.BottomSheetBehavior r8 = r6.f13964a
            int r8 = r8.z
            r1 = 5
            goto L_0x00d7
        L_0x004f:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x008c
            float r8 = java.lang.Math.abs(r8)
            float r9 = java.lang.Math.abs(r9)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0060
            goto L_0x008c
        L_0x0060:
            com.google.android.material.bottomsheet.BottomSheetBehavior r8 = r6.f13964a
            boolean r8 = r8.f13946c
            if (r8 == 0) goto L_0x006d
        L_0x0068:
            com.google.android.material.bottomsheet.BottomSheetBehavior r8 = r6.f13964a
            int r8 = r8.p
            goto L_0x00d7
        L_0x006d:
            int r8 = r7.getTop()
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r6.f13964a
            int r9 = r9.n
            int r9 = r8 - r9
            int r9 = java.lang.Math.abs(r9)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r6.f13964a
            int r0 = r0.p
            int r8 = r8 - r0
            int r8 = java.lang.Math.abs(r8)
            if (r9 >= r8) goto L_0x0068
        L_0x0086:
            com.google.android.material.bottomsheet.BottomSheetBehavior r8 = r6.f13964a
            int r8 = r8.n
        L_0x008a:
            r1 = 6
            goto L_0x00d7
        L_0x008c:
            int r8 = r7.getTop()
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r6.f13964a
            boolean r9 = r9.f13946c
            if (r9 == 0) goto L_0x00af
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r6.f13964a
            int r9 = r9.m
            int r9 = r8 - r9
            int r9 = java.lang.Math.abs(r9)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r6.f13964a
            int r0 = r0.p
            int r8 = r8 - r0
            int r8 = java.lang.Math.abs(r8)
            if (r9 >= r8) goto L_0x0068
            goto L_0x0010
        L_0x00af:
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r6.f13964a
            int r0 = r9.n
            if (r8 >= r0) goto L_0x00c5
            int r9 = r9.p
            int r9 = r8 - r9
            int r9 = java.lang.Math.abs(r9)
            if (r8 >= r9) goto L_0x0086
            com.google.android.material.bottomsheet.BottomSheetBehavior r8 = r6.f13964a
            int r8 = r8.l
            goto L_0x0014
        L_0x00c5:
            int r9 = r8 - r0
            int r9 = java.lang.Math.abs(r9)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r6.f13964a
            int r0 = r0.p
            int r8 = r8 - r0
            int r8 = java.lang.Math.abs(r8)
            if (r9 >= r8) goto L_0x0068
            goto L_0x0086
        L_0x00d7:
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r6.f13964a
            b.j.b.g r9 = r9.u
            int r0 = r7.getLeft()
            boolean r8 = r9.d(r0, r8)
            if (r8 == 0) goto L_0x0109
            com.google.android.material.bottomsheet.BottomSheetBehavior r8 = r6.f13964a
            r9 = 2
            r8.f((int) r9)
            if (r1 != r3) goto L_0x00fe
            com.google.android.material.bottomsheet.BottomSheetBehavior r8 = r6.f13964a
            android.animation.ValueAnimator r8 = r8.k
            if (r8 == 0) goto L_0x00fe
            com.google.android.material.bottomsheet.BottomSheetBehavior r8 = r6.f13964a
            android.animation.ValueAnimator r8 = r8.k
            r8.reverse()
        L_0x00fe:
            com.google.android.material.bottomsheet.BottomSheetBehavior$c r8 = new com.google.android.material.bottomsheet.BottomSheetBehavior$c
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = r6.f13964a
            r8.<init>(r7, r1)
            b.h.j.y.a((android.view.View) r7, (java.lang.Runnable) r8)
            goto L_0x0121
        L_0x0109:
            if (r1 != r3) goto L_0x011c
            com.google.android.material.bottomsheet.BottomSheetBehavior r7 = r6.f13964a
            android.animation.ValueAnimator r7 = r7.k
            if (r7 == 0) goto L_0x011c
            com.google.android.material.bottomsheet.BottomSheetBehavior r7 = r6.f13964a
            android.animation.ValueAnimator r7 = r7.k
            r7.reverse()
        L_0x011c:
            com.google.android.material.bottomsheet.BottomSheetBehavior r7 = r6.f13964a
            r7.f((int) r1)
        L_0x0121:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.c.a(android.view.View, float, float):void");
    }

    public void a(View view, int i, int i2, int i3, int i4) {
        this.f13964a.a(i2);
    }

    public int b(View view) {
        BottomSheetBehavior bottomSheetBehavior = this.f13964a;
        return bottomSheetBehavior.r ? bottomSheetBehavior.z : bottomSheetBehavior.p;
    }

    public int b(View view, int i, int i2) {
        int d2 = this.f13964a.e();
        BottomSheetBehavior bottomSheetBehavior = this.f13964a;
        return a.a(i, d2, bottomSheetBehavior.r ? bottomSheetBehavior.z : bottomSheetBehavior.p);
    }

    public boolean b(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.f13964a;
        int i2 = bottomSheetBehavior.t;
        if (i2 == 1 || bottomSheetBehavior.G) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.E == i) {
            WeakReference<View> weakReference = bottomSheetBehavior.B;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        WeakReference<V> weakReference2 = this.f13964a.A;
        return weakReference2 != null && weakReference2.get() == view;
    }

    public void c(int i) {
        if (i == 1) {
            this.f13964a.f(1);
        }
    }
}
