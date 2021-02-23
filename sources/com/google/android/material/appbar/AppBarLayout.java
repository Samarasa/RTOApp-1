package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.h.j.I;
import b.h.j.k;
import b.h.j.q;
import b.h.j.y;
import c.b.b.c.d;
import c.b.b.c.g;
import c.b.b.c.j;
import c.b.b.c.o.e;
import com.google.android.material.internal.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@CoordinatorLayout.c(Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private int f13848a;

    /* renamed from: b  reason: collision with root package name */
    private int f13849b;

    /* renamed from: c  reason: collision with root package name */
    private int f13850c;

    /* renamed from: d  reason: collision with root package name */
    private int f13851d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13852e;

    /* renamed from: f  reason: collision with root package name */
    private int f13853f;

    /* renamed from: g  reason: collision with root package name */
    private I f13854g;

    /* renamed from: h  reason: collision with root package name */
    private List<a> f13855h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private WeakReference<View> n;
    private ValueAnimator o;
    private int[] p;
    private Drawable q;

    protected static class BaseBehavior<T extends AppBarLayout> extends g<T> {
        /* access modifiers changed from: private */
        public int k;
        private int l;
        private ValueAnimator m;
        private int n = -1;
        private boolean o;
        private float p;
        private WeakReference<View> q;
        private a r;

        public static abstract class a<T extends AppBarLayout> {
            public abstract boolean a(T t);
        }

        protected static class b extends b.j.a.c {
            public static final Parcelable.Creator<b> CREATOR = new d();

            /* renamed from: c  reason: collision with root package name */
            int f13856c;

            /* renamed from: d  reason: collision with root package name */
            float f13857d;

            /* renamed from: e  reason: collision with root package name */
            boolean f13858e;

            public b(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f13856c = parcel.readInt();
                this.f13857d = parcel.readFloat();
                this.f13858e = parcel.readByte() != 0;
            }

            public b(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f13856c);
                parcel.writeFloat(this.f13857d);
                parcel.writeByte(this.f13858e ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private View a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof k) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View a(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private void a(CoordinatorLayout coordinatorLayout, T t, int i, float f2) {
            int abs = Math.abs(c() - i);
            float abs2 = Math.abs(f2);
            a(coordinatorLayout, t, i, abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f));
        }

        private void a(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int c2 = c();
            if (c2 == i) {
                ValueAnimator valueAnimator = this.m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.m;
            if (valueAnimator2 == null) {
                this.m = new ValueAnimator();
                this.m.setInterpolator(c.b.b.c.a.a.f4753e);
                this.m.addUpdateListener(new c(this, coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.m.setDuration((long) Math.min(i2, 600));
            this.m.setIntValues(new int[]{c2, i});
            this.m.start();
        }

        private void a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View a2 = a((AppBarLayout) t, i);
            if (a2 != null) {
                int a3 = ((b) a2.getLayoutParams()).a();
                boolean z2 = false;
                if ((a3 & 1) != 0) {
                    int n2 = y.n(a2);
                    if (i2 <= 0 || (a3 & 12) == 0 ? !((a3 & 2) == 0 || (-i) < (a2.getBottom() - n2) - t.getTopInset()) : (-i) >= (a2.getBottom() - n2) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.c()) {
                    z2 = t.a(a(coordinatorLayout));
                }
                boolean a4 = t.a(z2);
                if (Build.VERSION.SDK_INT < 11) {
                    return;
                }
                if (z || (a4 && c(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        private static boolean a(int i, int i2) {
            return (i & i2) == i2;
        }

        private boolean a(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.b() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        private int b(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                b bVar = (b) childAt.getLayoutParams();
                if (a(bVar.a(), 32)) {
                    top -= bVar.topMargin;
                    bottom += bVar.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        private int c(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                b bVar = (b) childAt.getLayoutParams();
                Interpolator b2 = bVar.b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b2 != null) {
                    int a2 = bVar.a();
                    if ((a2 & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + bVar.topMargin + bVar.bottomMargin;
                        if ((a2 & 2) != 0) {
                            i2 -= y.n(childAt);
                        }
                    }
                    if (y.j(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f2 = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f2 * b2.getInterpolation(((float) (abs - childAt.getTop())) / f2)));
                    }
                }
            }
            return i;
        }

        private boolean c(CoordinatorLayout coordinatorLayout, T t) {
            List<View> c2 = coordinatorLayout.c((View) t);
            int size = c2.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.b d2 = ((CoordinatorLayout.e) c2.get(i).getLayoutParams()).d();
                if (d2 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) d2).c() != 0;
                }
            }
            return false;
        }

        private void d(CoordinatorLayout coordinatorLayout, T t) {
            int c2 = c();
            int b2 = b(t, c2);
            if (b2 >= 0) {
                View childAt = t.getChildAt(b2);
                b bVar = (b) childAt.getLayoutParams();
                int a2 = bVar.a();
                if ((a2 & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (b2 == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (a(a2, 2)) {
                        i2 += y.n(childAt);
                    } else if (a(a2, 5)) {
                        int n2 = y.n(childAt) + i2;
                        if (c2 < n2) {
                            i = n2;
                        } else {
                            i2 = n2;
                        }
                    }
                    if (a(a2, 32)) {
                        i += bVar.topMargin;
                        i2 -= bVar.bottomMargin;
                    }
                    if (c2 < (i2 + i) / 2) {
                        i = i2;
                    }
                    a(coordinatorLayout, t, b.h.d.a.a(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int b(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int c2 = c();
            int i4 = 0;
            if (i2 == 0 || c2 < i2 || c2 > i3) {
                this.k = 0;
            } else {
                int a2 = b.h.d.a.a(i, i2, i3);
                if (c2 != a2) {
                    int c3 = t.a() ? c(t, a2) : a2;
                    boolean a3 = a(c3);
                    i4 = c2 - a2;
                    this.k = a2 - c3;
                    if (!a3 && t.a()) {
                        coordinatorLayout.a((View) t);
                    }
                    t.a(b());
                    a(coordinatorLayout, t, a2, a2 < c2 ? -1 : 1, false);
                }
            }
            return i4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void e(CoordinatorLayout coordinatorLayout, T t) {
            d(coordinatorLayout, t);
            if (t.c()) {
                t.a(t.a(a(coordinatorLayout)));
            }
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof b) {
                b bVar = (b) parcelable;
                super.a(coordinatorLayout, t, bVar.a());
                this.n = bVar.f13856c;
                this.p = bVar.f13857d;
                this.o = bVar.f13858e;
                return;
            }
            super.a(coordinatorLayout, t, parcelable);
            this.n = -1;
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.l == 0 || i == 1) {
                d(coordinatorLayout, t);
                if (t.c()) {
                    t.a(t.a(view));
                }
            }
            this.q = new WeakReference<>(view);
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = a(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = a(coordinatorLayout, t, i2, i5, i4);
                }
            }
            if (t.c()) {
                t.a(t.a(view));
            }
        }

        public boolean a(CoordinatorLayout coordinatorLayout, T t, int i) {
            boolean a2 = super.a(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i2 = this.n;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i2);
                c(coordinatorLayout, t, (-childAt.getBottom()) + (this.o ? y.n(childAt) + t.getTopInset() : Math.round(((float) childAt.getHeight()) * this.p)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i3 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        a(coordinatorLayout, t, i3, 0.0f);
                    } else {
                        c(coordinatorLayout, t, i3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        a(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        c(coordinatorLayout, t, 0);
                    }
                }
            }
            t.d();
            this.n = -1;
            a(b.h.d.a.a(b(), -t.getTotalScrollRange(), 0));
            a(coordinatorLayout, t, b(), 0, true);
            t.a(b());
            return a2;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.e) t.getLayoutParams()).height != -2) {
                return super.a(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.a((View) t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public boolean b(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.c() || a(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.m) != null) {
                valueAnimator.cancel();
            }
            this.q = null;
            this.l = i2;
            return z;
        }

        /* access modifiers changed from: package-private */
        public boolean a(T t) {
            a aVar = this.r;
            if (aVar != null) {
                return aVar.a(t);
            }
            WeakReference<View> weakReference = this.q;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return view != null && view.isShown() && !view.canScrollVertically(-1);
        }

        /* access modifiers changed from: package-private */
        public int b(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* renamed from: b */
        public Parcelable d(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable d2 = super.d(coordinatorLayout, t);
            int b2 = b();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + b2;
                if (childAt.getTop() + b2 > 0 || bottom < 0) {
                    i++;
                } else {
                    b bVar = new b(d2);
                    bVar.f13856c = i;
                    if (bottom == y.n(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    bVar.f13858e = z;
                    bVar.f13857d = ((float) bottom) / ((float) childAt.getHeight());
                    return bVar;
                }
            }
            return d2;
        }

        /* access modifiers changed from: package-private */
        public int c() {
            return b() + this.k;
        }

        /* access modifiers changed from: package-private */
        public int c(T t) {
            return t.getTotalScrollRange();
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.a(coordinatorLayout, appBarLayout, parcelable);
        }

        public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.a(coordinatorLayout, appBarLayout, view, i);
        }

        public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.a(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.a(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        public /* bridge */ /* synthetic */ boolean a(int i) {
            return super.a(i);
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.a(coordinatorLayout, appBarLayout, i);
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.a(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.b(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public /* bridge */ /* synthetic */ Parcelable b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.d(coordinatorLayout, appBarLayout);
        }
    }

    public static class ScrollingViewBehavior extends h {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.b.c.k.ScrollingViewBehavior_Layout);
            b(obtainStyledAttributes.getDimensionPixelSize(c.b.b.c.k.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        private static int a(AppBarLayout appBarLayout) {
            CoordinatorLayout.b d2 = ((CoordinatorLayout.e) appBarLayout.getLayoutParams()).d();
            if (d2 instanceof BaseBehavior) {
                return ((BaseBehavior) d2).c();
            }
            return 0;
        }

        private void a(View view, View view2) {
            CoordinatorLayout.b d2 = ((CoordinatorLayout.e) view2.getLayoutParams()).d();
            if (d2 instanceof BaseBehavior) {
                y.c(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) d2).k) + d()) - a(view2));
            }
        }

        private void b(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.c()) {
                    appBarLayout.a(appBarLayout.a(view));
                }
            }
        }

        /* access modifiers changed from: package-private */
        public AppBarLayout a(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.a(coordinatorLayout, view, i);
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.a(coordinatorLayout, view, i, i2, i3, i4);
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout a2 = a((List) coordinatorLayout.b(view));
            if (a2 != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f13888d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    a2.a(false, !z);
                    return true;
                }
            }
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* access modifiers changed from: package-private */
        public float b(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int a2 = a(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + a2 > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) a2) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            a(view, view2);
            b(view, view2);
            return false;
        }

        /* access modifiers changed from: package-private */
        public int c(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.c(view);
        }
    }

    public interface a<T extends AppBarLayout> {
        void a(T t, int i);
    }

    public static class b extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        int f13859a = 1;

        /* renamed from: b  reason: collision with root package name */
        Interpolator f13860b;

        public b(int i, int i2) {
            super(i, i2);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.b.c.k.AppBarLayout_Layout);
            this.f13859a = obtainStyledAttributes.getInt(c.b.b.c.k.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(c.b.b.c.k.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f13860b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(c.b.b.c.k.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public int a() {
            return this.f13859a;
        }

        public Interpolator b() {
            return this.f13860b;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            int i = this.f13859a;
            return (i & 1) == 1 && (i & 10) != 0;
        }
    }

    public interface c extends a<AppBarLayout> {
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.b.b.c.b.appBarLayoutStyle);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f13849b = -1;
        this.f13850c = -1;
        this.f13851d = -1;
        this.f13853f = 0;
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 21) {
            k.a(this);
            k.a(this, attributeSet, i2, j.Widget_Design_AppBarLayout);
        }
        TypedArray a2 = v.a(context, attributeSet, c.b.b.c.k.AppBarLayout, i2, j.Widget_Design_AppBarLayout, new int[0]);
        y.a((View) this, a2.getDrawable(c.b.b.c.k.AppBarLayout_android_background));
        if (getBackground() instanceof ColorDrawable) {
            e eVar = new e();
            eVar.a(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            eVar.a(context);
            y.a((View) this, (Drawable) eVar);
        }
        if (a2.hasValue(c.b.b.c.k.AppBarLayout_expanded)) {
            a(a2.getBoolean(c.b.b.c.k.AppBarLayout_expanded, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && a2.hasValue(c.b.b.c.k.AppBarLayout_elevation)) {
            k.a(this, (float) a2.getDimensionPixelSize(c.b.b.c.k.AppBarLayout_elevation, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (a2.hasValue(c.b.b.c.k.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(a2.getBoolean(c.b.b.c.k.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (a2.hasValue(c.b.b.c.k.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(a2.getBoolean(c.b.b.c.k.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.l = a2.getBoolean(c.b.b.c.k.AppBarLayout_liftOnScroll, false);
        this.m = a2.getResourceId(c.b.b.c.k.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(a2.getDrawable(c.b.b.c.k.AppBarLayout_statusBarForeground));
        a2.recycle();
        y.a((View) this, (q) new a(this));
    }

    private void a(e eVar, boolean z) {
        float dimension = getResources().getDimension(d.design_appbar_elevation);
        float f2 = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.o = ValueAnimator.ofFloat(new float[]{f2, dimension});
        this.o.setDuration((long) getResources().getInteger(g.app_bar_elevation_anim_duration));
        this.o.setInterpolator(c.b.b.c.a.a.f4749a);
        this.o.addUpdateListener(new b(this, eVar));
        this.o.start();
    }

    private void a(boolean z, boolean z2, boolean z3) {
        int i2 = 0;
        int i3 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i2 = 8;
        }
        this.f13853f = i3 | i2;
        requestLayout();
    }

    private boolean b(boolean z) {
        if (this.j == z) {
            return false;
        }
        this.j = z;
        refreshDrawableState();
        return true;
    }

    private void e() {
        WeakReference<View> weakReference = this.n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.n = null;
    }

    private View f() {
        if (this.n == null && this.m != -1) {
            Activity a2 = com.google.android.material.internal.e.a(getContext());
            View findViewById = a2 != null ? a2.findViewById(this.m) : getParent() instanceof ViewGroup ? ((ViewGroup) getParent()).findViewById(this.m) : null;
            if (findViewById != null) {
                this.n = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.n;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private boolean g() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((b) getChildAt(i2).getLayoutParams()).c()) {
                return true;
            }
        }
        return false;
    }

    private void h() {
        this.f13849b = -1;
        this.f13850c = -1;
        this.f13851d = -1;
    }

    private boolean i() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return childAt.getVisibility() != 8 && !y.j(childAt);
    }

    /* access modifiers changed from: package-private */
    public I a(I i2) {
        I i3 = y.j(this) ? i2 : null;
        if (!b.h.i.c.a(this.f13854g, i3)) {
            this.f13854g = i3;
            requestLayout();
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        this.f13848a = i2;
        if (!willNotDraw()) {
            y.E(this);
        }
        List<a> list = this.f13855h;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = this.f13855h.get(i3);
                if (aVar != null) {
                    aVar.a(this, i2);
                }
            }
        }
    }

    public void a(a aVar) {
        if (this.f13855h == null) {
            this.f13855h = new ArrayList();
        }
        if (aVar != null && !this.f13855h.contains(aVar)) {
            this.f13855h.add(aVar);
        }
    }

    public void a(c cVar) {
        a((a) cVar);
    }

    public void a(boolean z, boolean z2) {
        a(z, z2, true);
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f13852e;
    }

    /* access modifiers changed from: package-private */
    public boolean a(View view) {
        View f2 = f();
        if (f2 != null) {
            view = f2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    /* access modifiers changed from: package-private */
    public boolean a(boolean z) {
        if (this.k == z) {
            return false;
        }
        this.k = z;
        refreshDrawableState();
        if (!this.l || !(getBackground() instanceof e)) {
            return true;
        }
        a((e) getBackground(), z);
        return true;
    }

    public void b(a aVar) {
        List<a> list = this.f13855h;
        if (list != null && aVar != null) {
            list.remove(aVar);
        }
    }

    public void b(c cVar) {
        b((a) cVar);
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return getTotalScrollRange() != 0;
    }

    public boolean c() {
        return this.l;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.f13853f = 0;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.q != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f13848a));
            this.q.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.q;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public b generateDefaultLayoutParams() {
        return new b(-1, -2);
    }

    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (Build.VERSION.SDK_INT < 19 || !(layoutParams instanceof LinearLayout.LayoutParams)) ? layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams) : new b((LinearLayout.LayoutParams) layoutParams);
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i2;
        int n2;
        int i3 = this.f13850c;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            b bVar = (b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = bVar.f13859a;
            if ((i5 & 5) == 5) {
                int i6 = bVar.topMargin + bVar.bottomMargin;
                if ((i5 & 8) != 0) {
                    n2 = y.n(childAt);
                } else if ((i5 & 2) != 0) {
                    n2 = measuredHeight - y.n(childAt);
                } else {
                    i2 = i6 + measuredHeight;
                    if (childCount == 0 && y.j(childAt)) {
                        i2 = Math.min(i2, measuredHeight - getTopInset());
                    }
                    i4 += i2;
                }
                i2 = i6 + n2;
                i2 = Math.min(i2, measuredHeight - getTopInset());
                i4 += i2;
            } else if (i4 > 0) {
                break;
            }
        }
        int max = Math.max(0, i4);
        this.f13850c = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i2 = this.f13851d;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            b bVar = (b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + bVar.topMargin + bVar.bottomMargin;
            int i5 = bVar.f13859a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight;
            if ((i5 & 2) != 0) {
                i4 -= y.n(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.f13851d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.m;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int n2 = y.n(this);
        if (n2 == 0) {
            int childCount = getChildCount();
            n2 = childCount >= 1 ? y.n(getChildAt(childCount - 1)) : 0;
            if (n2 == 0) {
                return getHeight() / 3;
            }
        }
        return (n2 * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f13853f;
    }

    public Drawable getStatusBarForeground() {
        return this.q;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        I i2 = this.f13854g;
        if (i2 != null) {
            return i2.e();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i2 = this.f13849b;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            b bVar = (b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = bVar.f13859a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight + bVar.topMargin + bVar.bottomMargin;
            if (i3 == 0 && y.j(childAt)) {
                i4 -= getTopInset();
            }
            if ((i5 & 2) != 0) {
                i4 -= y.n(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.f13849b = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        if (this.p == null) {
            this.p = new int[4];
        }
        int[] iArr = this.p;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        iArr[0] = this.j ? c.b.b.c.b.state_liftable : -c.b.b.c.b.state_liftable;
        iArr[1] = (!this.j || !this.k) ? -c.b.b.c.b.state_lifted : c.b.b.c.b.state_lifted;
        iArr[2] = this.j ? c.b.b.c.b.state_collapsible : -c.b.b.c.b.state_collapsible;
        iArr[3] = (!this.j || !this.k) ? -c.b.b.c.b.state_collapsed : c.b.b.c.b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (y.j(this) && i()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                y.c(getChildAt(childCount), topInset);
            }
        }
        h();
        boolean z2 = false;
        this.f13852e = false;
        int childCount2 = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount2) {
                break;
            } else if (((b) getChildAt(i6).getLayoutParams()).b() != null) {
                this.f13852e = true;
                break;
            } else {
                i6++;
            }
        }
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.i) {
            if (this.l || g()) {
                z2 = true;
            }
            b(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != 1073741824 && y.j(this) && i()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = b.h.d.a.a(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i3));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        h();
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        if (getBackground() instanceof e) {
            ((e) getBackground()).a(f2);
        }
    }

    public void setExpanded(boolean z) {
        a(z, y.A(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.l = z;
    }

    public void setLiftOnScrollTargetViewId(int i2) {
        this.m = i2;
        e();
    }

    public void setOrientation(int i2) {
        if (i2 == 1) {
            super.setOrientation(i2);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.q = drawable3;
            Drawable drawable4 = this.q;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.q.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.a(this.q, y.m(this));
                this.q.setVisible(getVisibility() == 0, false);
                this.q.setCallback(this);
            }
            y.E(this);
        }
    }

    public void setStatusBarForegroundColor(int i2) {
        setStatusBarForeground(new ColorDrawable(i2));
    }

    public void setStatusBarForegroundResource(int i2) {
        setStatusBarForeground(b.a.a.a.a.b(getContext(), i2));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            k.a(this, f2);
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q;
    }
}
