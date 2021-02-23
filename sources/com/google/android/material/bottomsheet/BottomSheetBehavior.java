package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.h.j.y;
import b.j.b.g;
import c.b.b.c.d;
import c.b.b.c.j;
import c.b.b.c.o.e;
import c.b.b.c.o.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.b<V> {

    /* renamed from: a  reason: collision with root package name */
    private static final int f13944a = j.Widget_Design_BottomSheet_Modal;
    WeakReference<V> A;
    WeakReference<View> B;
    private a C;
    private VelocityTracker D;
    int E;
    private int F;
    boolean G;
    private Map<View, Integer> H;
    private final g.a I = new c(this);

    /* renamed from: b  reason: collision with root package name */
    private int f13945b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f13946c = true;

    /* renamed from: d  reason: collision with root package name */
    private float f13947d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f13948e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13949f;

    /* renamed from: g  reason: collision with root package name */
    private int f13950g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f13951h;
    /* access modifiers changed from: private */
    public e i;
    private h j;
    /* access modifiers changed from: private */
    public ValueAnimator k;
    int l;
    int m;
    int n;
    float o = 0.5f;
    int p;
    float q = -1.0f;
    boolean r;
    /* access modifiers changed from: private */
    public boolean s;
    int t = 4;
    g u;
    private boolean v;
    private int w;
    private boolean x;
    int y;
    int z;

    public static abstract class a {
        public abstract void a(View view, float f2);

        public abstract void a(View view, int i);
    }

    protected static class b extends b.j.a.c {
        public static final Parcelable.Creator<b> CREATOR = new d();

        /* renamed from: c  reason: collision with root package name */
        final int f13952c;

        /* renamed from: d  reason: collision with root package name */
        int f13953d;

        /* renamed from: e  reason: collision with root package name */
        boolean f13954e;

        /* renamed from: f  reason: collision with root package name */
        boolean f13955f;

        /* renamed from: g  reason: collision with root package name */
        boolean f13956g;

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13952c = parcel.readInt();
            this.f13953d = parcel.readInt();
            boolean z = false;
            this.f13954e = parcel.readInt() == 1;
            this.f13955f = parcel.readInt() == 1;
            this.f13956g = parcel.readInt() == 1 ? true : z;
        }

        public b(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f13952c = bottomSheetBehavior.t;
            this.f13953d = bottomSheetBehavior.f13948e;
            this.f13954e = bottomSheetBehavior.f13946c;
            this.f13955f = bottomSheetBehavior.r;
            this.f13956g = bottomSheetBehavior.s;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13952c);
            parcel.writeInt(this.f13953d);
            parcel.writeInt(this.f13954e ? 1 : 0);
            parcel.writeInt(this.f13955f ? 1 : 0);
            parcel.writeInt(this.f13956g ? 1 : 0);
        }
    }

    private class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final View f13957a;

        /* renamed from: b  reason: collision with root package name */
        private final int f13958b;

        c(View view, int i) {
            this.f13957a = view;
            this.f13958b = i;
        }

        public void run() {
            g gVar = BottomSheetBehavior.this.u;
            if (gVar == null || !gVar.a(true)) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.t == 2) {
                    bottomSheetBehavior.f(this.f13958b);
                    return;
                }
                return;
            }
            y.a(this.f13957a, (Runnable) this);
        }
    }

    public BottomSheetBehavior() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0058, code lost:
        r9 = r9.data;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomSheetBehavior(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            r7.<init>(r8, r9)
            r0 = 0
            r7.f13945b = r0
            r1 = 1
            r7.f13946c = r1
            r2 = 1056964608(0x3f000000, float:0.5)
            r7.o = r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7.q = r3
            r4 = 4
            r7.t = r4
            com.google.android.material.bottomsheet.c r4 = new com.google.android.material.bottomsheet.c
            r4.<init>(r7)
            r7.I = r4
            int[] r4 = c.b.b.c.k.BottomSheetBehavior_Layout
            android.content.res.TypedArray r4 = r8.obtainStyledAttributes(r9, r4)
            int r5 = c.b.b.c.k.BottomSheetBehavior_Layout_shapeAppearance
            boolean r5 = r4.hasValue(r5)
            r7.f13951h = r5
            int r5 = c.b.b.c.k.BottomSheetBehavior_Layout_backgroundTint
            boolean r5 = r4.hasValue(r5)
            if (r5 == 0) goto L_0x003b
            int r6 = c.b.b.c.k.BottomSheetBehavior_Layout_backgroundTint
            android.content.res.ColorStateList r6 = c.b.b.c.l.c.a((android.content.Context) r8, (android.content.res.TypedArray) r4, (int) r6)
            r7.a((android.content.Context) r8, (android.util.AttributeSet) r9, (boolean) r5, (android.content.res.ColorStateList) r6)
            goto L_0x003e
        L_0x003b:
            r7.a((android.content.Context) r8, (android.util.AttributeSet) r9, (boolean) r5)
        L_0x003e:
            r7.d()
            int r9 = android.os.Build.VERSION.SDK_INT
            r5 = 21
            if (r9 < r5) goto L_0x004f
            int r9 = c.b.b.c.k.BottomSheetBehavior_Layout_android_elevation
            float r9 = r4.getDimension(r9, r3)
            r7.q = r9
        L_0x004f:
            int r9 = c.b.b.c.k.BottomSheetBehavior_Layout_behavior_peekHeight
            android.util.TypedValue r9 = r4.peekValue(r9)
            r3 = -1
            if (r9 == 0) goto L_0x005d
            int r9 = r9.data
            if (r9 != r3) goto L_0x005d
            goto L_0x0063
        L_0x005d:
            int r9 = c.b.b.c.k.BottomSheetBehavior_Layout_behavior_peekHeight
            int r9 = r4.getDimensionPixelSize(r9, r3)
        L_0x0063:
            r7.c((int) r9)
            int r9 = c.b.b.c.k.BottomSheetBehavior_Layout_behavior_hideable
            boolean r9 = r4.getBoolean(r9, r0)
            r7.b((boolean) r9)
            int r9 = c.b.b.c.k.BottomSheetBehavior_Layout_behavior_fitToContents
            boolean r9 = r4.getBoolean(r9, r1)
            r7.a((boolean) r9)
            int r9 = c.b.b.c.k.BottomSheetBehavior_Layout_behavior_skipCollapsed
            boolean r9 = r4.getBoolean(r9, r0)
            r7.c((boolean) r9)
            int r9 = c.b.b.c.k.BottomSheetBehavior_Layout_behavior_saveFlags
            int r9 = r4.getInt(r9, r0)
            r7.d((int) r9)
            int r9 = c.b.b.c.k.BottomSheetBehavior_Layout_behavior_halfExpandedRatio
            float r9 = r4.getFloat(r9, r2)
            r7.a((float) r9)
            int r9 = c.b.b.c.k.BottomSheetBehavior_Layout_behavior_expandedOffset
            int r9 = r4.getInt(r9, r0)
            r7.b((int) r9)
            r4.recycle()
            android.view.ViewConfiguration r8 = android.view.ViewConfiguration.get(r8)
            int r8 = r8.getScaledMaximumFlingVelocity()
            float r8 = (float) r8
            r7.f13947d = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private void a(int i2, int i3) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (this.i != null) {
            if (i2 == 3 && ((i3 == 5 || i3 == 4) && (valueAnimator2 = this.k) != null && valueAnimator2.getAnimatedFraction() == 1.0f)) {
                this.k.reverse();
            }
            if (i2 == 1 && i3 == 3 && (valueAnimator = this.k) != null) {
                valueAnimator.start();
            }
        }
    }

    private void a(Context context, AttributeSet attributeSet, boolean z2) {
        a(context, attributeSet, z2, (ColorStateList) null);
    }

    private void a(Context context, AttributeSet attributeSet, boolean z2, ColorStateList colorStateList) {
        if (this.f13951h) {
            this.j = new h(context, attributeSet, c.b.b.c.b.bottomSheetStyle, f13944a);
            this.i = new e(this.j);
            this.i.a(context);
            if (!z2 || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.i.setTint(typedValue.data);
                return;
            }
            this.i.a(colorStateList);
        }
    }

    private void a(b bVar) {
        int i2 = this.f13945b;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.f13948e = bVar.f13953d;
            }
            int i3 = this.f13945b;
            if (i3 == -1 || (i3 & 2) == 2) {
                this.f13946c = bVar.f13954e;
            }
            int i4 = this.f13945b;
            if (i4 == -1 || (i4 & 4) == 4) {
                this.r = bVar.f13955f;
            }
            int i5 = this.f13945b;
            if (i5 == -1 || (i5 & 8) == 8) {
                this.s = bVar.f13956g;
            }
        }
    }

    private void b() {
        int max = this.f13949f ? Math.max(this.f13950g, this.z - ((this.y * 9) / 16)) : this.f13948e;
        if (this.f13946c) {
            this.p = Math.max(this.z - max, this.m);
        } else {
            this.p = this.z - max;
        }
    }

    private void c() {
        this.n = (int) (((float) this.z) * (1.0f - this.o));
    }

    private void d() {
        this.k = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.k.setDuration(500);
        this.k.addUpdateListener(new b(this));
    }

    private void d(boolean z2) {
        int i2;
        WeakReference<V> weakReference = this.A;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && z2) {
                    if (this.H == null) {
                        this.H = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = coordinatorLayout.getChildAt(i3);
                    if (childAt != this.A.get()) {
                        if (!z2) {
                            Map<View, Integer> map = this.H;
                            if (map != null && map.containsKey(childAt)) {
                                i2 = this.H.get(childAt).intValue();
                            }
                        } else {
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.H.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            i2 = 4;
                        }
                        y.e(childAt, i2);
                    }
                }
                if (!z2) {
                    this.H = null;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public int e() {
        return this.f13946c ? this.m : this.l;
    }

    private float f() {
        VelocityTracker velocityTracker = this.D;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f13947d);
        return this.D.getYVelocity(this.E);
    }

    private void g() {
        this.E = -1;
        VelocityTracker velocityTracker = this.D;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.D = null;
        }
    }

    private void g(int i2) {
        View view = (View) this.A.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !y.z(view)) {
                a(view, i2);
            } else {
                view.post(new a(this, view, i2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public View a(View view) {
        if (y.B(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View a2 = a(viewGroup.getChildAt(i2));
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public void a() {
        super.a();
        this.A = null;
        this.u = null;
    }

    public void a(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.o = f2;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        a aVar;
        float f2;
        float f3;
        View view = (View) this.A.get();
        if (view != null && (aVar = this.C) != null) {
            int i3 = this.p;
            if (i2 > i3) {
                f2 = (float) (i3 - i2);
                f3 = (float) (this.z - i3);
            } else {
                f2 = (float) (i3 - i2);
                f3 = (float) (i3 - e());
            }
            aVar.a(view, f2 / f3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f13949f
            if (r4 != 0) goto L_0x0015
            r3.f13949f = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.f13949f
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f13948e
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.f13949f = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f13948e = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0042
            java.lang.ref.WeakReference<V> r4 = r3.A
            if (r4 == 0) goto L_0x0042
            r3.b()
            int r4 = r3.t
            r0 = 4
            if (r4 != r0) goto L_0x0042
            java.lang.ref.WeakReference<V> r4 = r3.A
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x0042
            if (r5 == 0) goto L_0x003f
            int r4 = r3.t
            r3.g(r4)
            goto L_0x0042
        L_0x003f:
            r4.requestLayout()
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.a(int, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i2) {
        int i3;
        int i4;
        if (i2 == 4) {
            i3 = this.p;
        } else if (i2 == 6) {
            int i5 = this.n;
            if (!this.f13946c || i5 > (i4 = this.m)) {
                i3 = i5;
            } else {
                i3 = i4;
                i2 = 3;
            }
        } else if (i2 == 3) {
            i3 = e();
        } else if (!this.r || i2 != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i2);
        } else {
            i3 = this.z;
        }
        if (this.u.b(view, view.getLeft(), i3)) {
            f(2);
            y.a(view, (Runnable) new c(view, i2));
            return;
        }
        f(i2);
    }

    public void a(CoordinatorLayout.e eVar) {
        super.a(eVar);
        this.A = null;
        this.u = null;
    }

    public void a(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        b bVar = (b) parcelable;
        super.a(coordinatorLayout, v2, bVar.a());
        a(bVar);
        int i2 = bVar.f13952c;
        if (i2 == 1 || i2 == 2) {
            i2 = 4;
        }
        this.t = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.p)) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0099, code lost:
        if (java.lang.Math.abs(r3 - r2.n) < java.lang.Math.abs(r3 - r2.p)) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.e()
            r0 = 3
            if (r3 != r6) goto L_0x000f
            r2.f((int) r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r3 = r2.B
            if (r3 == 0) goto L_0x00bd
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L_0x00bd
            boolean r3 = r2.x
            if (r3 != 0) goto L_0x001f
            goto L_0x00bd
        L_0x001f:
            int r3 = r2.w
            r5 = 6
            r6 = 4
            if (r3 <= 0) goto L_0x002b
            int r3 = r2.e()
            goto L_0x009e
        L_0x002b:
            boolean r3 = r2.r
            if (r3 == 0) goto L_0x003d
            float r3 = r2.f()
            boolean r3 = r2.a((android.view.View) r4, (float) r3)
            if (r3 == 0) goto L_0x003d
            int r3 = r2.z
            r0 = 5
            goto L_0x009e
        L_0x003d:
            int r3 = r2.w
            if (r3 != 0) goto L_0x007e
            int r3 = r4.getTop()
            boolean r1 = r2.f13946c
            if (r1 == 0) goto L_0x005d
            int r5 = r2.m
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.p
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L_0x0082
            int r3 = r2.m
            goto L_0x009e
        L_0x005d:
            int r1 = r2.n
            if (r3 >= r1) goto L_0x006e
            int r6 = r2.p
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto L_0x009b
            int r3 = r2.l
            goto L_0x009e
        L_0x006e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.p
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0082
            goto L_0x009b
        L_0x007e:
            boolean r3 = r2.f13946c
            if (r3 == 0) goto L_0x0086
        L_0x0082:
            int r3 = r2.p
            r0 = 4
            goto L_0x009e
        L_0x0086:
            int r3 = r4.getTop()
            int r0 = r2.n
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.p
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0082
        L_0x009b:
            int r3 = r2.n
            r0 = 6
        L_0x009e:
            b.j.b.g r5 = r2.u
            int r6 = r4.getLeft()
            boolean r3 = r5.b((android.view.View) r4, (int) r6, (int) r3)
            if (r3 == 0) goto L_0x00b7
            r3 = 2
            r2.f((int) r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior$c r3 = new com.google.android.material.bottomsheet.BottomSheetBehavior$c
            r3.<init>(r4, r0)
            b.h.j.y.a((android.view.View) r4, (java.lang.Runnable) r3)
            goto L_0x00ba
        L_0x00b7:
            r2.f((int) r0)
        L_0x00ba:
            r3 = 0
            r2.x = r3
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    public void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr, int i4) {
        int i5;
        if (i4 != 1) {
            WeakReference<View> weakReference = this.B;
            if (view == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = v2.getTop();
                int i6 = top - i3;
                if (i3 <= 0) {
                    if (i3 < 0 && !view.canScrollVertically(-1)) {
                        int i7 = this.p;
                        if (i6 <= i7 || this.r) {
                            iArr[1] = i3;
                            y.c((View) v2, -i3);
                            f(1);
                        } else {
                            iArr[1] = top - i7;
                            y.c((View) v2, -iArr[1]);
                            i5 = 4;
                        }
                    }
                    a(v2.getTop());
                    this.w = i3;
                    this.x = true;
                } else if (i6 < e()) {
                    iArr[1] = top - e();
                    y.c((View) v2, -iArr[1]);
                    i5 = 3;
                } else {
                    iArr[1] = i3;
                    y.c((View) v2, -i3);
                    f(1);
                    a(v2.getTop());
                    this.w = i3;
                    this.x = true;
                }
                f(i5);
                a(v2.getTop());
                this.w = i3;
                this.x = true;
            }
        }
    }

    public void a(boolean z2) {
        if (this.f13946c != z2) {
            this.f13946c = z2;
            if (this.A != null) {
                b();
            }
            f((!this.f13946c || this.t != 6) ? this.t : 3);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(View view, float f2) {
        if (this.s) {
            return true;
        }
        return view.getTop() >= this.p && Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.p)) / ((float) this.f13948e) > 0.5f;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        int i3;
        e eVar;
        if (y.j(coordinatorLayout) && !y.j(v2)) {
            v2.setFitsSystemWindows(true);
        }
        if (this.f13951h && (eVar = this.i) != null) {
            y.a((View) v2, (Drawable) eVar);
        }
        e eVar2 = this.i;
        if (eVar2 != null) {
            float f2 = this.q;
            if (f2 == -1.0f) {
                f2 = y.i(v2);
            }
            eVar2.a(f2);
        }
        if (this.A == null) {
            this.f13950g = coordinatorLayout.getResources().getDimensionPixelSize(d.design_bottom_sheet_peek_height_min);
            this.A = new WeakReference<>(v2);
        }
        if (this.u == null) {
            this.u = g.a((ViewGroup) coordinatorLayout, this.I);
        }
        int top = v2.getTop();
        coordinatorLayout.c((View) v2, i2);
        this.y = coordinatorLayout.getWidth();
        this.z = coordinatorLayout.getHeight();
        this.m = Math.max(0, this.z - v2.getHeight());
        c();
        b();
        int i4 = this.t;
        if (i4 == 3) {
            i3 = e();
        } else if (i4 == 6) {
            i3 = this.n;
        } else if (!this.r || i4 != 5) {
            int i5 = this.t;
            if (i5 == 4) {
                i3 = this.p;
            } else {
                if (i5 == 1 || i5 == 2) {
                    y.c((View) v2, top - v2.getTop());
                }
                this.B = new WeakReference<>(a((View) v2));
                return true;
            }
        } else {
            i3 = this.z;
        }
        y.c((View) v2, i3);
        this.B = new WeakReference<>(a((View) v2));
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000b
            r9.v = r2
            return r1
        L_0x000b:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L_0x0014
            r9.g()
        L_0x0014:
            android.view.VelocityTracker r3 = r9.D
            if (r3 != 0) goto L_0x001e
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.D = r3
        L_0x001e:
            android.view.VelocityTracker r3 = r9.D
            r3.addMovement(r12)
            r3 = 0
            r4 = -1
            r5 = 2
            if (r0 == 0) goto L_0x0039
            if (r0 == r2) goto L_0x002e
            r11 = 3
            if (r0 == r11) goto L_0x002e
            goto L_0x007c
        L_0x002e:
            r9.G = r1
            r9.E = r4
            boolean r11 = r9.v
            if (r11 == 0) goto L_0x007c
            r9.v = r1
            return r1
        L_0x0039:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.F = r7
            int r7 = r9.t
            if (r7 == r5) goto L_0x006b
            java.lang.ref.WeakReference<android.view.View> r7 = r9.B
            if (r7 == 0) goto L_0x0054
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0055
        L_0x0054:
            r7 = r3
        L_0x0055:
            if (r7 == 0) goto L_0x006b
            int r8 = r9.F
            boolean r7 = r10.a((android.view.View) r7, (int) r6, (int) r8)
            if (r7 == 0) goto L_0x006b
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.E = r7
            r9.G = r2
        L_0x006b:
            int r7 = r9.E
            if (r7 != r4) goto L_0x0079
            int r4 = r9.F
            boolean r11 = r10.a((android.view.View) r11, (int) r6, (int) r4)
            if (r11 != 0) goto L_0x0079
            r11 = 1
            goto L_0x007a
        L_0x0079:
            r11 = 0
        L_0x007a:
            r9.v = r11
        L_0x007c:
            boolean r11 = r9.v
            if (r11 != 0) goto L_0x008b
            b.j.b.g r11 = r9.u
            if (r11 == 0) goto L_0x008b
            boolean r11 = r11.b((android.view.MotionEvent) r12)
            if (r11 == 0) goto L_0x008b
            return r2
        L_0x008b:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.B
            if (r11 == 0) goto L_0x0096
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x0096:
            if (r0 != r5) goto L_0x00ce
            if (r3 == 0) goto L_0x00ce
            boolean r11 = r9.v
            if (r11 != 0) goto L_0x00ce
            int r11 = r9.t
            if (r11 == r2) goto L_0x00ce
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.a((android.view.View) r3, (int) r11, (int) r0)
            if (r10 != 0) goto L_0x00ce
            b.j.b.g r10 = r9.u
            if (r10 == 0) goto L_0x00ce
            int r10 = r9.F
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            b.j.b.g r11 = r9.u
            int r11 = r11.d()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00ce
            r1 = 1
        L_0x00ce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.B;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.t != 3 || super.a(coordinatorLayout, v2, view, f2, f3);
    }

    public void b(int i2) {
        if (i2 >= 0) {
            this.l = i2;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void b(boolean z2) {
        if (this.r != z2) {
            this.r = z2;
            if (!z2 && this.t == 5) {
                e(4);
            }
        }
    }

    public boolean b(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.t == 1 && actionMasked == 0) {
            return true;
        }
        g gVar = this.u;
        if (gVar != null) {
            gVar.a(motionEvent);
        }
        if (actionMasked == 0) {
            g();
        }
        if (this.D == null) {
            this.D = VelocityTracker.obtain();
        }
        this.D.addMovement(motionEvent);
        if (actionMasked == 2 && !this.v && Math.abs(((float) this.F) - motionEvent.getY()) > ((float) this.u.d())) {
            this.u.a((View) v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.v;
    }

    public boolean b(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
        this.w = 0;
        this.x = false;
        return (i2 & 2) != 0;
    }

    public final void c(int i2) {
        a(i2, false);
    }

    public void c(boolean z2) {
        this.s = z2;
    }

    public Parcelable d(CoordinatorLayout coordinatorLayout, V v2) {
        return new b(super.d(coordinatorLayout, v2), this);
    }

    public void d(int i2) {
        this.f13945b = i2;
    }

    public final void e(int i2) {
        int i3 = this.t;
        if (i2 != i3) {
            if (this.A != null) {
                g(i2);
                a(i2, i3);
            } else if (i2 == 4 || i2 == 3 || i2 == 6 || (this.r && i2 == 5)) {
                this.t = i2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f(int i2) {
        View view;
        int i3 = this.t;
        if (i3 != i2) {
            this.t = i2;
            WeakReference<V> weakReference = this.A;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i2 == 6 || i2 == 3) {
                    d(true);
                } else if (i2 == 5 || i2 == 4) {
                    d(false);
                }
                y.e(view, 1);
                view.sendAccessibilityEvent(32);
                a(i2, i3);
                a aVar = this.C;
                if (aVar != null) {
                    aVar.a(view, i2);
                }
            }
        }
    }
}
