package androidx.appcompat.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.t;
import b.a.f;
import b.h.j.m;
import b.h.j.n;
import b.h.j.o;
import b.h.j.p;
import b.h.j.y;

public class ActionBarOverlayLayout extends ViewGroup implements Q, o, m, n {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f401a = {b.a.a.actionBarSize, 16842841};
    private final Runnable A;
    private final p B;

    /* renamed from: b  reason: collision with root package name */
    private int f402b;

    /* renamed from: c  reason: collision with root package name */
    private int f403c;

    /* renamed from: d  reason: collision with root package name */
    private ContentFrameLayout f404d;

    /* renamed from: e  reason: collision with root package name */
    ActionBarContainer f405e;

    /* renamed from: f  reason: collision with root package name */
    private S f406f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f407g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f408h;
    private boolean i;
    private boolean j;
    private boolean k;
    boolean l;
    private int m;
    private int n;
    private final Rect o;
    private final Rect p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private a v;
    private OverScroller w;
    ViewPropertyAnimator x;
    final AnimatorListenerAdapter y;
    private final Runnable z;

    public interface a {
        void a();

        void a(boolean z);

        void b();

        void c();

        void d();

        void onWindowVisibilityChanged(int i);
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public b(int i, int i2) {
            super(i, i2);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f403c = 0;
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.y = new C0116d(this);
        this.z = new C0118e(this);
        this.A = new C0120f(this);
        a(context);
        this.B = new p(this);
    }

    private S a(View view) {
        if (view instanceof S) {
            return (S) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f401a);
        boolean z2 = false;
        this.f402b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f407g = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f407g == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.f408h = z2;
        this.w = new OverScroller(context);
    }

    private boolean a(float f2, float f3) {
        this.w.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.w.getFinalY() > this.f405e.getHeight();
    }

    private boolean a(View view, Rect rect, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        int i2;
        int i3;
        int i4;
        int i5;
        b bVar = (b) view.getLayoutParams();
        if (!z2 || bVar.leftMargin == (i5 = rect.left)) {
            z6 = false;
        } else {
            bVar.leftMargin = i5;
            z6 = true;
        }
        if (z3 && bVar.topMargin != (i4 = rect.top)) {
            bVar.topMargin = i4;
            z6 = true;
        }
        if (z5 && bVar.rightMargin != (i3 = rect.right)) {
            bVar.rightMargin = i3;
            z6 = true;
        }
        if (!z4 || bVar.bottomMargin == (i2 = rect.bottom)) {
            return z6;
        }
        bVar.bottomMargin = i2;
        return true;
    }

    private void k() {
        h();
        this.A.run();
    }

    private void l() {
        h();
        postDelayed(this.A, 600);
    }

    private void m() {
        h();
        postDelayed(this.z, 600);
    }

    private void n() {
        h();
        this.z.run();
    }

    public void a(int i2) {
        j();
        if (i2 == 2) {
            this.f406f.m();
        } else if (i2 == 5) {
            this.f406f.n();
        } else if (i2 == 109) {
            setOverlayMode(true);
        }
    }

    public void a(Menu menu, t.a aVar) {
        j();
        this.f406f.a(menu, aVar);
    }

    public void a(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    public void a(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    public void a(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        a(view, i2, i3, i4, i5, i6);
    }

    public void a(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    public boolean a() {
        j();
        return this.f406f.a();
    }

    public boolean a(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    public void b() {
        j();
        this.f406f.b();
    }

    public void b(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    public boolean c() {
        j();
        return this.f406f.c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    public boolean d() {
        j();
        return this.f406f.d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f407g != null && !this.f408h) {
            int bottom = this.f405e.getVisibility() == 0 ? (int) (((float) this.f405e.getBottom()) + this.f405e.getTranslationY() + 0.5f) : 0;
            this.f407g.setBounds(0, bottom, getWidth(), this.f407g.getIntrinsicHeight() + bottom);
            this.f407g.draw(canvas);
        }
    }

    public boolean e() {
        j();
        return this.f406f.e();
    }

    public boolean f() {
        j();
        return this.f406f.f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        j();
        int t2 = y.t(this) & 256;
        boolean a2 = a((View) this.f405e, rect, true, true, false, true);
        this.r.set(rect);
        Oa.a(this, this.r, this.o);
        if (!this.s.equals(this.r)) {
            this.s.set(this.r);
            a2 = true;
        }
        if (!this.p.equals(this.o)) {
            this.p.set(this.o);
            a2 = true;
        }
        if (a2) {
            requestLayout();
        }
        return true;
    }

    public void g() {
        j();
        this.f406f.g();
    }

    /* access modifiers changed from: protected */
    public b generateDefaultLayoutParams() {
        return new b(-1, -1);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f405e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.B.a();
    }

    public CharSequence getTitle() {
        j();
        return this.f406f.getTitle();
    }

    /* access modifiers changed from: package-private */
    public void h() {
        removeCallbacks(this.z);
        removeCallbacks(this.A);
        ViewPropertyAnimator viewPropertyAnimator = this.x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean i() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        if (this.f404d == null) {
            this.f404d = (ContentFrameLayout) findViewById(f.action_bar_activity_content);
            this.f405e = (ActionBarContainer) findViewById(f.action_bar_container);
            this.f406f = a(findViewById(f.action_bar));
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(getContext());
        y.F(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = bVar.leftMargin + paddingLeft;
                int i8 = bVar.topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        j();
        measureChildWithMargins(this.f405e, i2, 0, i3, 0);
        b bVar = (b) this.f405e.getLayoutParams();
        int max = Math.max(0, this.f405e.getMeasuredWidth() + bVar.leftMargin + bVar.rightMargin);
        int max2 = Math.max(0, this.f405e.getMeasuredHeight() + bVar.topMargin + bVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f405e.getMeasuredState());
        boolean z2 = (y.t(this) & 256) != 0;
        if (z2) {
            i4 = this.f402b;
            if (this.j && this.f405e.getTabContainer() != null) {
                i4 += this.f402b;
            }
        } else {
            i4 = this.f405e.getVisibility() != 8 ? this.f405e.getMeasuredHeight() : 0;
        }
        this.q.set(this.o);
        this.t.set(this.r);
        Rect rect = (this.i || z2) ? this.t : this.q;
        rect.top += i4;
        rect.bottom += 0;
        a((View) this.f404d, this.q, true, true, true, true);
        if (!this.u.equals(this.t)) {
            this.u.set(this.t);
            this.f404d.a(this.t);
        }
        measureChildWithMargins(this.f404d, i2, 0, i3, 0);
        b bVar2 = (b) this.f404d.getLayoutParams();
        int max3 = Math.max(max, this.f404d.getMeasuredWidth() + bVar2.leftMargin + bVar2.rightMargin);
        int max4 = Math.max(max2, this.f404d.getMeasuredHeight() + bVar2.topMargin + bVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f404d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.k || !z2) {
            return false;
        }
        if (a(f2, f3)) {
            k();
        } else {
            n();
        }
        this.l = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        this.m += i3;
        setActionBarHideOffset(this.m);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.B.a(view, view2, i2);
        this.m = getActionBarHideOffset();
        h();
        a aVar = this.v;
        if (aVar != null) {
            aVar.d();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f405e.getVisibility() != 0) {
            return false;
        }
        return this.k;
    }

    public void onStopNestedScroll(View view) {
        if (this.k && !this.l) {
            if (this.m <= this.f405e.getHeight()) {
                m();
            } else {
                l();
            }
        }
        a aVar = this.v;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i2);
        }
        j();
        int i3 = this.n ^ i2;
        this.n = i2;
        boolean z2 = false;
        boolean z3 = (i2 & 4) == 0;
        if ((i2 & 256) != 0) {
            z2 = true;
        }
        a aVar = this.v;
        if (aVar != null) {
            aVar.a(!z2);
            if (z3 || !z2) {
                this.v.a();
            } else {
                this.v.c();
            }
        }
        if ((i3 & 256) != 0 && this.v != null) {
            y.F(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f403c = i2;
        a aVar = this.v;
        if (aVar != null) {
            aVar.onWindowVisibilityChanged(i2);
        }
    }

    public void setActionBarHideOffset(int i2) {
        h();
        this.f405e.setTranslationY((float) (-Math.max(0, Math.min(i2, this.f405e.getHeight()))));
    }

    public void setActionBarVisibilityCallback(a aVar) {
        this.v = aVar;
        if (getWindowToken() != null) {
            this.v.onWindowVisibilityChanged(this.f403c);
            int i2 = this.n;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                y.F(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.j = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.k) {
            this.k = z2;
            if (!z2) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i2) {
        j();
        this.f406f.setIcon(i2);
    }

    public void setIcon(Drawable drawable) {
        j();
        this.f406f.setIcon(drawable);
    }

    public void setLogo(int i2) {
        j();
        this.f406f.b(i2);
    }

    public void setOverlayMode(boolean z2) {
        this.i = z2;
        this.f408h = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        this.f406f.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        this.f406f.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
