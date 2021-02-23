package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewParent;
import b.h.j.y;
import b.j.b.g;
import com.google.android.material.behavior.SwipeDismissBehavior;

class b extends g.a {

    /* renamed from: a  reason: collision with root package name */
    private int f13919a;

    /* renamed from: b  reason: collision with root package name */
    private int f13920b = -1;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SwipeDismissBehavior f13921c;

    b(SwipeDismissBehavior swipeDismissBehavior) {
        this.f13921c = swipeDismissBehavior;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0034 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(android.view.View r6, float r7) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x0036
            int r6 = b.h.j.y.m(r6)
            if (r6 != r2) goto L_0x000f
            r6 = 1
            goto L_0x0010
        L_0x000f:
            r6 = 0
        L_0x0010:
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r5.f13921c
            int r3 = r3.f13912f
            r4 = 2
            if (r3 != r4) goto L_0x0018
            return r2
        L_0x0018:
            if (r3 != 0) goto L_0x0027
            if (r6 == 0) goto L_0x0021
            int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x0026
            goto L_0x0025
        L_0x0021:
            int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x0026
        L_0x0025:
            r1 = 1
        L_0x0026:
            return r1
        L_0x0027:
            if (r3 != r2) goto L_0x0035
            if (r6 == 0) goto L_0x0030
            int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x0035
            goto L_0x0034
        L_0x0030:
            int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            return r1
        L_0x0036:
            int r7 = r6.getLeft()
            int r0 = r5.f13919a
            int r7 = r7 - r0
            int r6 = r6.getWidth()
            float r6 = (float) r6
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r5.f13921c
            float r0 = r0.f13913g
            float r6 = r6 * r0
            int r6 = java.lang.Math.round(r6)
            int r7 = java.lang.Math.abs(r7)
            if (r7 < r6) goto L_0x0053
            r1 = 1
        L_0x0053:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.b.a(android.view.View, float):boolean");
    }

    public int a(View view) {
        return view.getWidth();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r5 != false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r5 != false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r5 = r2.f13919a;
        r3 = r3.getWidth() + r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(android.view.View r3, int r4, int r5) {
        /*
            r2 = this;
            int r5 = b.h.j.y.m(r3)
            r0 = 1
            if (r5 != r0) goto L_0x0009
            r5 = 1
            goto L_0x000a
        L_0x0009:
            r5 = 0
        L_0x000a:
            com.google.android.material.behavior.SwipeDismissBehavior r1 = r2.f13921c
            int r1 = r1.f13912f
            if (r1 != 0) goto L_0x0024
            if (r5 == 0) goto L_0x001c
        L_0x0012:
            int r5 = r2.f13919a
            int r3 = r3.getWidth()
            int r5 = r5 - r3
            int r3 = r2.f13919a
            goto L_0x0037
        L_0x001c:
            int r5 = r2.f13919a
            int r3 = r3.getWidth()
            int r3 = r3 + r5
            goto L_0x0037
        L_0x0024:
            if (r1 != r0) goto L_0x0029
            if (r5 == 0) goto L_0x0012
            goto L_0x001c
        L_0x0029:
            int r5 = r2.f13919a
            int r0 = r3.getWidth()
            int r5 = r5 - r0
            int r0 = r2.f13919a
            int r3 = r3.getWidth()
            int r3 = r3 + r0
        L_0x0037:
            int r3 = com.google.android.material.behavior.SwipeDismissBehavior.a((int) r5, (int) r4, (int) r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.b.a(android.view.View, int, int):int");
    }

    public void a(View view, float f2, float f3) {
        boolean z;
        int i;
        SwipeDismissBehavior.a aVar;
        this.f13920b = -1;
        int width = view.getWidth();
        if (a(view, f2)) {
            int left = view.getLeft();
            int i2 = this.f13919a;
            i = left < i2 ? i2 - width : i2 + width;
            z = true;
        } else {
            i = this.f13919a;
            z = false;
        }
        if (this.f13921c.f13907a.d(i, view.getTop())) {
            y.a(view, (Runnable) new SwipeDismissBehavior.b(view, z));
        } else if (z && (aVar = this.f13921c.f13908b) != null) {
            aVar.a(view);
        }
    }

    public void a(View view, int i) {
        this.f13920b = i;
        this.f13919a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public void a(View view, int i, int i2, int i3, int i4) {
        float width = ((float) this.f13919a) + (((float) view.getWidth()) * this.f13921c.f13914h);
        float width2 = ((float) this.f13919a) + (((float) view.getWidth()) * this.f13921c.i);
        float f2 = (float) i;
        if (f2 <= width) {
            view.setAlpha(1.0f);
        } else if (f2 >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.a(0.0f, 1.0f - SwipeDismissBehavior.b(width, width2, f2), 1.0f));
        }
    }

    public int b(View view, int i, int i2) {
        return view.getTop();
    }

    public boolean b(View view, int i) {
        return this.f13920b == -1 && this.f13921c.a(view);
    }

    public void c(int i) {
        SwipeDismissBehavior.a aVar = this.f13921c.f13908b;
        if (aVar != null) {
            aVar.a(i);
        }
    }
}
