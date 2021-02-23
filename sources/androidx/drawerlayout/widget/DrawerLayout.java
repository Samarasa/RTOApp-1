package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import b.h.j.C0195a;
import b.h.j.C0197c;
import b.h.j.a.c;
import b.h.j.y;
import b.j.b.g;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f986a = {16843828};

    /* renamed from: b  reason: collision with root package name */
    static final int[] f987b = {16842931};

    /* renamed from: c  reason: collision with root package name */
    static final boolean f988c = (Build.VERSION.SDK_INT >= 19);

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f989d;
    private float A;
    private Drawable B;
    private Drawable C;
    private Drawable D;
    private CharSequence E;
    private CharSequence F;
    private Object G;
    private boolean H;
    private Drawable I;
    private Drawable J;
    private Drawable K;
    private Drawable L;
    private final ArrayList<View> M;
    private Rect N;
    private Matrix O;

    /* renamed from: e  reason: collision with root package name */
    private final b f990e;

    /* renamed from: f  reason: collision with root package name */
    private float f991f;

    /* renamed from: g  reason: collision with root package name */
    private int f992g;

    /* renamed from: h  reason: collision with root package name */
    private int f993h;
    private float i;
    private Paint j;
    private final g k;
    private final g l;
    private final f m;
    private final f n;
    private int o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private c x;
    private List<c> y;
    private float z;

    class a extends C0195a {

        /* renamed from: d  reason: collision with root package name */
        private final Rect f994d = new Rect();

        a() {
        }

        private void a(b.h.j.a.c cVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.g(childAt)) {
                    cVar.a(childAt);
                }
            }
        }

        private void a(b.h.j.a.c cVar, b.h.j.a.c cVar2) {
            Rect rect = this.f994d;
            cVar2.a(rect);
            cVar.c(rect);
            cVar2.b(rect);
            cVar.d(rect);
            cVar.n(cVar2.u());
            cVar.d(cVar2.g());
            cVar.b(cVar2.d());
            cVar.c(cVar2.e());
            cVar.f(cVar2.n());
            cVar.d(cVar2.m());
            cVar.g(cVar2.o());
            cVar.h(cVar2.p());
            cVar.a(cVar2.j());
            cVar.m(cVar2.t());
            cVar.j(cVar2.q());
            cVar.a(cVar2.b());
        }

        public void a(View view, b.h.j.a.c cVar) {
            if (DrawerLayout.f988c) {
                super.a(view, cVar);
            } else {
                b.h.j.a.c a2 = b.h.j.a.c.a(cVar);
                super.a(view, a2);
                cVar.d(view);
                ViewParent r = y.r(view);
                if (r instanceof View) {
                    cVar.c((View) r);
                }
                a(cVar, a2);
                a2.w();
                a(cVar, (ViewGroup) view);
            }
            cVar.b((CharSequence) DrawerLayout.class.getName());
            cVar.g(false);
            cVar.h(false);
            cVar.b(c.a.f2542a);
            cVar.b(c.a.f2543b);
        }

        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence d2;
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View d3 = DrawerLayout.this.d();
            if (d3 == null || (d2 = DrawerLayout.this.d(DrawerLayout.this.e(d3))) == null) {
                return true;
            }
            text.add(d2);
            return true;
        }

        public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f988c || DrawerLayout.g(view)) {
                return super.a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        public void b(View view, AccessibilityEvent accessibilityEvent) {
            super.b(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }
    }

    static final class b extends C0195a {
        b() {
        }

        public void a(View view, b.h.j.a.c cVar) {
            super.a(view, cVar);
            if (!DrawerLayout.g(view)) {
                cVar.c((View) null);
            }
        }
    }

    public interface c {
        void a(int i);

        void a(View view);

        void a(View view, float f2);

        void b(View view);
    }

    public static class d extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f996a = 0;

        /* renamed from: b  reason: collision with root package name */
        float f997b;

        /* renamed from: c  reason: collision with root package name */
        boolean f998c;

        /* renamed from: d  reason: collision with root package name */
        int f999d;

        public d(int i, int i2) {
            super(i, i2);
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f987b);
            this.f996a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public d(d dVar) {
            super(dVar);
            this.f996a = dVar.f996a;
        }
    }

    protected static class e extends b.j.a.c {
        public static final Parcelable.Creator<e> CREATOR = new b();

        /* renamed from: c  reason: collision with root package name */
        int f1000c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f1001d;

        /* renamed from: e  reason: collision with root package name */
        int f1002e;

        /* renamed from: f  reason: collision with root package name */
        int f1003f;

        /* renamed from: g  reason: collision with root package name */
        int f1004g;

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1000c = parcel.readInt();
            this.f1001d = parcel.readInt();
            this.f1002e = parcel.readInt();
            this.f1003f = parcel.readInt();
            this.f1004g = parcel.readInt();
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1000c);
            parcel.writeInt(this.f1001d);
            parcel.writeInt(this.f1002e);
            parcel.writeInt(this.f1003f);
            parcel.writeInt(this.f1004g);
        }
    }

    private class f extends g.a {

        /* renamed from: a  reason: collision with root package name */
        private final int f1005a;

        /* renamed from: b  reason: collision with root package name */
        private g f1006b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f1007c = new c(this);

        f(int i) {
            this.f1005a = i;
        }

        private void c() {
            int i = 3;
            if (this.f1005a == 3) {
                i = 5;
            }
            View b2 = DrawerLayout.this.b(i);
            if (b2 != null) {
                DrawerLayout.this.a(b2);
            }
        }

        public int a(View view) {
            if (DrawerLayout.this.j(view)) {
                return view.getWidth();
            }
            return 0;
        }

        public int a(View view, int i, int i2) {
            int width;
            int width2;
            if (DrawerLayout.this.a(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = DrawerLayout.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i, width));
        }

        /* access modifiers changed from: package-private */
        public void a() {
            View view;
            int i;
            int c2 = this.f1006b.c();
            int i2 = 0;
            boolean z = this.f1005a == 3;
            if (z) {
                view = DrawerLayout.this.b(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + c2;
            } else {
                view = DrawerLayout.this.b(5);
                i = DrawerLayout.this.getWidth() - c2;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.d(view) == 0) {
                this.f1006b.b(view, i, view.getTop());
                ((d) view.getLayoutParams()).f998c = true;
                DrawerLayout.this.invalidate();
                c();
                DrawerLayout.this.a();
            }
        }

        public void a(int i, int i2) {
            DrawerLayout drawerLayout;
            int i3;
            if ((i & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                i3 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                i3 = 5;
            }
            View b2 = drawerLayout.b(i3);
            if (b2 != null && DrawerLayout.this.d(b2) == 0) {
                this.f1006b.a(b2, i2);
            }
        }

        public void a(View view, float f2, float f3) {
            int i;
            float f4 = DrawerLayout.this.f(view);
            int width = view.getWidth();
            if (DrawerLayout.this.a(view, 3)) {
                i = (f2 > 0.0f || (f2 == 0.0f && f4 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f2 < 0.0f || (f2 == 0.0f && f4 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f1006b.d(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        public void a(View view, int i) {
            ((d) view.getLayoutParams()).f998c = false;
            c();
        }

        public void a(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.a(view, 3) ? (float) (i + width) : (float) (DrawerLayout.this.getWidth() - i)) / ((float) width);
            DrawerLayout.this.c(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        public void a(g gVar) {
            this.f1006b = gVar;
        }

        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        public void b() {
            DrawerLayout.this.removeCallbacks(this.f1007c);
        }

        public void b(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f1007c, 160);
        }

        public boolean b(int i) {
            return false;
        }

        public boolean b(View view, int i) {
            return DrawerLayout.this.j(view) && DrawerLayout.this.a(view, this.f1005a) && DrawerLayout.this.d(view) == 0;
        }

        public void c(int i) {
            DrawerLayout.this.a(this.f1005a, i, this.f1006b.b());
        }
    }

    static {
        boolean z2 = true;
        if (Build.VERSION.SDK_INT < 21) {
            z2 = false;
        }
        f989d = z2;
    }

    public DrawerLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f990e = new b();
        this.f993h = -1728053248;
        this.j = new Paint();
        this.q = true;
        this.r = 3;
        this.s = 3;
        this.t = 3;
        this.u = 3;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.f992g = (int) ((64.0f * f2) + 0.5f);
        float f3 = 400.0f * f2;
        this.m = new f(3);
        this.n = new f(5);
        this.k = g.a((ViewGroup) this, 1.0f, (g.a) this.m);
        this.k.d(1);
        this.k.a(f3);
        this.m.a(this.k);
        this.l = g.a((ViewGroup) this, 1.0f, (g.a) this.n);
        this.l.d(2);
        this.l.a(f3);
        this.n.a(this.l);
        setFocusableInTouchMode(true);
        y.e(this, 1);
        y.a((View) this, (C0195a) new a());
        setMotionEventSplittingEnabled(false);
        if (y.j(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new a(this));
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f986a);
                try {
                    this.B = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.B = null;
            }
        }
        this.f991f = f2 * 10.0f;
        this.M = new ArrayList<>();
    }

    private boolean a(float f2, float f3, View view) {
        if (this.N == null) {
            this.N = new Rect();
        }
        view.getHitRect(this.N);
        return this.N.contains((int) f2, (int) f3);
    }

    private boolean a(Drawable drawable, int i2) {
        if (drawable == null || !androidx.core.graphics.drawable.a.f(drawable)) {
            return false;
        }
        androidx.core.graphics.drawable.a.a(drawable, i2);
        return true;
    }

    private boolean a(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent b2 = b(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(b2);
            b2.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent b(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.O == null) {
                this.O = new Matrix();
            }
            matrix.invert(this.O);
            obtain.transform(this.O);
        }
        return obtain;
    }

    private void c(View view, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            y.e(childAt, ((z2 || j(childAt)) && (!z2 || childAt != view)) ? 4 : 1);
        }
    }

    static String e(int i2) {
        return (i2 & 3) == 3 ? "LEFT" : (i2 & 5) == 5 ? "RIGHT" : Integer.toHexString(i2);
    }

    private boolean e() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((d) getChildAt(i2).getLayoutParams()).f998c) {
                return true;
            }
        }
        return false;
    }

    private boolean f() {
        return d() != null;
    }

    private Drawable g() {
        int m2 = y.m(this);
        if (m2 == 0) {
            Drawable drawable = this.I;
            if (drawable != null) {
                a(drawable, m2);
                return this.I;
            }
        } else {
            Drawable drawable2 = this.J;
            if (drawable2 != null) {
                a(drawable2, m2);
                return this.J;
            }
        }
        return this.K;
    }

    static boolean g(View view) {
        return (y.k(view) == 4 || y.k(view) == 2) ? false : true;
    }

    private Drawable h() {
        int m2 = y.m(this);
        if (m2 == 0) {
            Drawable drawable = this.J;
            if (drawable != null) {
                a(drawable, m2);
                return this.J;
            }
        } else {
            Drawable drawable2 = this.I;
            if (drawable2 != null) {
                a(drawable2, m2);
                return this.I;
            }
        }
        return this.L;
    }

    private void i() {
        if (!f989d) {
            this.C = g();
            this.D = h();
        }
    }

    private static boolean m(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.w) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.w = true;
        }
    }

    public void a(int i2) {
        a(i2, true);
    }

    public void a(int i2, int i3) {
        View b2;
        int a2 = C0197c.a(i3, y.m(this));
        if (i3 == 3) {
            this.r = i2;
        } else if (i3 == 5) {
            this.s = i2;
        } else if (i3 == 8388611) {
            this.t = i2;
        } else if (i3 == 8388613) {
            this.u = i2;
        }
        if (i2 != 0) {
            (a2 == 3 ? this.k : this.l).a();
        }
        if (i2 == 1) {
            View b3 = b(a2);
            if (b3 != null) {
                a(b3);
            }
        } else if (i2 == 2 && (b2 = b(a2)) != null) {
            l(b2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3, View view) {
        int e2 = this.k.e();
        int e3 = this.l.e();
        int i4 = 2;
        if (e2 == 1 || e3 == 1) {
            i4 = 1;
        } else if (!(e2 == 2 || e3 == 2)) {
            i4 = 0;
        }
        if (view != null && i3 == 0) {
            float f2 = ((d) view.getLayoutParams()).f997b;
            if (f2 == 0.0f) {
                b(view);
            } else if (f2 == 1.0f) {
                c(view);
            }
        }
        if (i4 != this.o) {
            this.o = i4;
            List<c> list = this.y;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.y.get(size).a(i4);
                }
            }
        }
    }

    public void a(int i2, boolean z2) {
        View b2 = b(i2);
        if (b2 != null) {
            a(b2, z2);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + e(i2));
    }

    public void a(View view) {
        a(view, true);
    }

    /* access modifiers changed from: package-private */
    public void a(View view, float f2) {
        List<c> list = this.y;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.y.get(size).a(view, f2);
            }
        }
    }

    public void a(View view, boolean z2) {
        g gVar;
        int i2;
        if (j(view)) {
            d dVar = (d) view.getLayoutParams();
            if (this.q) {
                dVar.f997b = 0.0f;
                dVar.f999d = 0;
            } else if (z2) {
                dVar.f999d |= 4;
                if (a(view, 3)) {
                    gVar = this.k;
                    i2 = -view.getWidth();
                } else {
                    gVar = this.l;
                    i2 = getWidth();
                }
                gVar.b(view, i2, view.getTop());
            } else {
                b(view, 0.0f);
                a(dVar.f996a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void a(c cVar) {
        if (cVar != null) {
            if (this.y == null) {
                this.y = new ArrayList();
            }
            this.y.add(cVar);
        }
    }

    public void a(Object obj, boolean z2) {
        this.G = obj;
        this.H = z2;
        setWillNotDraw(!z2 && getBackground() == null);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z2) {
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            d dVar = (d) childAt.getLayoutParams();
            if (j(childAt) && (!z2 || dVar.f998c)) {
                z3 |= a(childAt, 3) ? this.k.b(childAt, -childAt.getWidth(), childAt.getTop()) : this.l.b(childAt, getWidth(), childAt.getTop());
                dVar.f998c = false;
            }
        }
        this.m.b();
        this.n.b();
        if (z3) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(View view, int i2) {
        return (e(view) & i2) == i2;
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z2 = false;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!j(childAt)) {
                    this.M.add(childAt);
                } else if (i(childAt)) {
                    childAt.addFocusables(arrayList, i2, i3);
                    z2 = true;
                }
            }
            if (!z2) {
                int size = this.M.size();
                for (int i5 = 0; i5 < size; i5++) {
                    View view = this.M.get(i5);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i2, i3);
                    }
                }
            }
            this.M.clear();
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        y.e(view, (c() != null || j(view)) ? 4 : 1);
        if (!f988c) {
            y.a(view, (C0195a) this.f990e);
        }
    }

    /* access modifiers changed from: package-private */
    public View b(int i2) {
        int a2 = C0197c.a(i2, y.m(this)) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((e(childAt) & 7) == a2) {
                return childAt;
            }
        }
        return null;
    }

    public void b() {
        a(false);
    }

    public void b(int i2, boolean z2) {
        View b2 = b(i2);
        if (b2 != null) {
            b(b2, z2);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + e(i2));
    }

    /* access modifiers changed from: package-private */
    public void b(View view) {
        View rootView;
        d dVar = (d) view.getLayoutParams();
        if ((dVar.f999d & 1) == 1) {
            dVar.f999d = 0;
            List<c> list = this.y;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.y.get(size).b(view);
                }
            }
            c(view, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(View view, float f2) {
        float f3 = f(view);
        float width = (float) view.getWidth();
        int i2 = ((int) (width * f2)) - ((int) (f3 * width));
        if (!a(view, 3)) {
            i2 = -i2;
        }
        view.offsetLeftAndRight(i2);
        c(view, f2);
    }

    public void b(View view, boolean z2) {
        if (j(view)) {
            d dVar = (d) view.getLayoutParams();
            if (this.q) {
                dVar.f997b = 1.0f;
                dVar.f999d = 1;
                c(view, true);
            } else if (z2) {
                dVar.f999d |= 2;
                if (a(view, 3)) {
                    this.k.b(view, 0, view.getTop());
                } else {
                    this.l.b(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                b(view, 1.0f);
                a(dVar.f996a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void b(c cVar) {
        List<c> list;
        if (cVar != null && (list = this.y) != null) {
            list.remove(cVar);
        }
    }

    public int c(int i2) {
        int m2 = y.m(this);
        if (i2 == 3) {
            int i3 = this.r;
            if (i3 != 3) {
                return i3;
            }
            int i4 = m2 == 0 ? this.t : this.u;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        } else if (i2 == 5) {
            int i5 = this.s;
            if (i5 != 3) {
                return i5;
            }
            int i6 = m2 == 0 ? this.u : this.t;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        } else if (i2 == 8388611) {
            int i7 = this.t;
            if (i7 != 3) {
                return i7;
            }
            int i8 = m2 == 0 ? this.r : this.s;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        } else if (i2 != 8388613) {
            return 0;
        } else {
            int i9 = this.u;
            if (i9 != 3) {
                return i9;
            }
            int i10 = m2 == 0 ? this.s : this.r;
            if (i10 != 3) {
                return i10;
            }
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public View c() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((((d) childAt.getLayoutParams()).f999d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void c(View view) {
        d dVar = (d) view.getLayoutParams();
        if ((dVar.f999d & 1) == 0) {
            dVar.f999d = 1;
            List<c> list = this.y;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.y.get(size).a(view);
                }
            }
            c(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(View view, float f2) {
        d dVar = (d) view.getLayoutParams();
        if (f2 != dVar.f997b) {
            dVar.f997b = f2;
            a(view, f2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            f2 = Math.max(f2, ((d) getChildAt(i2).getLayoutParams()).f997b);
        }
        this.i = f2;
        boolean a2 = this.k.a(true);
        boolean a3 = this.l.a(true);
        if (a2 || a3) {
            y.E(this);
        }
    }

    public int d(View view) {
        if (j(view)) {
            return c(((d) view.getLayoutParams()).f996a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    public View d() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (j(childAt) && k(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public CharSequence d(int i2) {
        int a2 = C0197c.a(i2, y.m(this));
        if (a2 == 3) {
            return this.E;
        }
        if (a2 == 5) {
            return this.F;
        }
        return null;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.i <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            View childAt = getChildAt(i2);
            if (a(x2, y2, childAt) && !h(childAt) && a(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        int i2;
        Drawable drawable;
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean h2 = h(view2);
        int width = getWidth();
        int save = canvas.save();
        int i3 = 0;
        if (h2) {
            int childCount = getChildCount();
            i2 = width;
            int i4 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt != view2 && childAt.getVisibility() == 0 && m(childAt) && j(childAt) && childAt.getHeight() >= height) {
                    if (a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i4) {
                            i4 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < i2) {
                            i2 = left;
                        }
                    }
                }
            }
            canvas.clipRect(i4, 0, i2, getHeight());
            i3 = i4;
        } else {
            i2 = width;
        }
        boolean drawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(save);
        float f2 = this.i;
        if (f2 <= 0.0f || !h2) {
            if (this.C != null && a(view2, 3)) {
                int intrinsicWidth = this.C.getIntrinsicWidth();
                int right2 = view.getRight();
                float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.k.c()), 1.0f));
                this.C.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.C.setAlpha((int) (max * 255.0f));
                drawable = this.C;
            } else if (this.D != null && a(view2, 5)) {
                int intrinsicWidth2 = this.D.getIntrinsicWidth();
                int left2 = view.getLeft();
                float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.l.c()), 1.0f));
                this.D.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.D.setAlpha((int) (max2 * 255.0f));
                drawable = this.D;
            }
            drawable.draw(canvas);
        } else {
            int i6 = this.f993h;
            this.j.setColor((i6 & 16777215) | (((int) (((float) ((-16777216 & i6) >>> 24)) * f2)) << 24));
            canvas.drawRect((float) i3, 0.0f, (float) i2, (float) getHeight(), this.j);
        }
        return drawChild;
    }

    /* access modifiers changed from: package-private */
    public int e(View view) {
        return C0197c.a(((d) view.getLayoutParams()).f996a, y.m(this));
    }

    /* access modifiers changed from: package-private */
    public float f(View view) {
        return ((d) view.getLayoutParams()).f997b;
    }

    public boolean f(int i2) {
        View b2 = b(i2);
        if (b2 != null) {
            return i(b2);
        }
        return false;
    }

    public boolean g(int i2) {
        View b2 = b(i2);
        if (b2 != null) {
            return k(b2);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d ? new d((d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    public float getDrawerElevation() {
        if (f989d) {
            return this.f991f;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.B;
    }

    public void h(int i2) {
        b(i2, true);
    }

    /* access modifiers changed from: package-private */
    public boolean h(View view) {
        return ((d) view.getLayoutParams()).f996a == 0;
    }

    public boolean i(View view) {
        if (j(view)) {
            return (((d) view.getLayoutParams()).f999d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    public boolean j(View view) {
        int a2 = C0197c.a(((d) view.getLayoutParams()).f996a, y.m(view));
        return ((a2 & 3) == 0 && (a2 & 5) == 0) ? false : true;
    }

    public boolean k(View view) {
        if (j(view)) {
            return ((d) view.getLayoutParams()).f997b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void l(View view) {
        b(view, true);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r4.G;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.H
            if (r0 == 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r4.B
            if (r0 == 0) goto L_0x002e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            r2 = 0
            if (r0 < r1) goto L_0x001d
            java.lang.Object r0 = r4.G
            if (r0 == 0) goto L_0x001d
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            int r0 = r0.getSystemWindowInsetTop()
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r1 = r4.B
            int r3 = r4.getWidth()
            r1.setBounds(r2, r2, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.B
            r0.draw(r5)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        r7 = r6.k.b((int) r0, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            b.j.b.g r1 = r6.k
            boolean r1 = r1.b((android.view.MotionEvent) r7)
            b.j.b.g r2 = r6.l
            boolean r2 = r2.b((android.view.MotionEvent) r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x003a
            if (r0 == r2) goto L_0x0031
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L_0x001e
            if (r0 == r4) goto L_0x0031
            goto L_0x0038
        L_0x001e:
            b.j.b.g r7 = r6.k
            boolean r7 = r7.a((int) r4)
            if (r7 == 0) goto L_0x0038
            androidx.drawerlayout.widget.DrawerLayout$f r7 = r6.m
            r7.b()
            androidx.drawerlayout.widget.DrawerLayout$f r7 = r6.n
            r7.b()
            goto L_0x0038
        L_0x0031:
            r6.a((boolean) r2)
            r6.v = r3
            r6.w = r3
        L_0x0038:
            r7 = 0
            goto L_0x0064
        L_0x003a:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.z = r0
            r6.A = r7
            float r4 = r6.i
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x005f
            b.j.b.g r4 = r6.k
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.b((int) r0, (int) r7)
            if (r7 == 0) goto L_0x005f
            boolean r7 = r6.h((android.view.View) r7)
            if (r7 == 0) goto L_0x005f
            r7 = 1
            goto L_0x0060
        L_0x005f:
            r7 = 0
        L_0x0060:
            r6.v = r3
            r6.w = r3
        L_0x0064:
            if (r1 != 0) goto L_0x0074
            if (r7 != 0) goto L_0x0074
            boolean r7 = r6.e()
            if (r7 != 0) goto L_0x0074
            boolean r7 = r6.w
            if (r7 == 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r2 = 0
        L_0x0074:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || !f()) {
            return super.onKeyDown(i2, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyUp(i2, keyEvent);
        }
        View d2 = d();
        if (d2 != null && d(d2) == 0) {
            b();
        }
        return d2 != null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        float f2;
        int i6;
        int measuredHeight;
        int i7;
        int i8;
        this.p = true;
        int i9 = i4 - i2;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (h(childAt)) {
                    int i11 = dVar.leftMargin;
                    childAt.layout(i11, dVar.topMargin, childAt.getMeasuredWidth() + i11, dVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f3 = (float) measuredWidth;
                        i6 = (-measuredWidth) + ((int) (dVar.f997b * f3));
                        f2 = ((float) (measuredWidth + i6)) / f3;
                    } else {
                        float f4 = (float) measuredWidth;
                        int i12 = i9 - ((int) (dVar.f997b * f4));
                        f2 = ((float) (i9 - i12)) / f4;
                        i6 = i12;
                    }
                    boolean z3 = f2 != dVar.f997b;
                    int i13 = dVar.f996a & 112;
                    if (i13 != 16) {
                        if (i13 != 80) {
                            measuredHeight = dVar.topMargin;
                            i7 = measuredWidth + i6;
                            i8 = measuredHeight2 + measuredHeight;
                        } else {
                            int i14 = i5 - i3;
                            measuredHeight = (i14 - dVar.bottomMargin) - childAt.getMeasuredHeight();
                            i7 = measuredWidth + i6;
                            i8 = i14 - dVar.bottomMargin;
                        }
                        childAt.layout(i6, measuredHeight, i7, i8);
                    } else {
                        int i15 = i5 - i3;
                        int i16 = (i15 - measuredHeight2) / 2;
                        int i17 = dVar.topMargin;
                        if (i16 < i17) {
                            i16 = i17;
                        } else {
                            int i18 = i16 + measuredHeight2;
                            int i19 = dVar.bottomMargin;
                            if (i18 > i15 - i19) {
                                i16 = (i15 - i19) - measuredHeight2;
                            }
                        }
                        childAt.layout(i6, i16, measuredWidth + i6, measuredHeight2 + i16);
                    }
                    if (z3) {
                        c(childAt, f2);
                    }
                    int i20 = dVar.f997b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i20) {
                        childAt.setVisibility(i20);
                    }
                }
            }
        }
        this.p = false;
        this.q = false;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i4 = 0;
        boolean z2 = this.G != null && y.j(this);
        int m2 = y.m(this);
        int childCount = getChildCount();
        int i5 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (z2) {
                    int a2 = C0197c.a(dVar.f996a, m2);
                    if (y.j(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.G;
                            if (a2 == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i4, windowInsets.getSystemWindowInsetBottom());
                            } else if (a2 == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i4, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.G;
                        if (a2 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i4, windowInsets2.getSystemWindowInsetBottom());
                        } else if (a2 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i4, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        dVar.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        dVar.topMargin = windowInsets2.getSystemWindowInsetTop();
                        dVar.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        dVar.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (h(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - dVar.leftMargin) - dVar.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - dVar.topMargin) - dVar.bottomMargin, 1073741824));
                } else if (j(childAt)) {
                    if (f989d) {
                        float i6 = y.i(childAt);
                        float f2 = this.f991f;
                        if (i6 != f2) {
                            y.a(childAt, f2);
                        }
                    }
                    int e2 = e(childAt) & 7;
                    boolean z5 = e2 == 3;
                    if ((!z5 || !z3) && (z5 || !z4)) {
                        if (z5) {
                            z3 = true;
                        } else {
                            z4 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i2, this.f992g + dVar.leftMargin + dVar.rightMargin, dVar.width), ViewGroup.getChildMeasureSpec(i3, dVar.topMargin + dVar.bottomMargin, dVar.height));
                        i5++;
                        i4 = 0;
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + e(e2) + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i5 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            int i7 = i2;
            int i8 = i3;
            i5++;
            i4 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View b2;
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.a());
        int i2 = eVar.f1000c;
        if (!(i2 == 0 || (b2 = b(i2)) == null)) {
            l(b2);
        }
        int i3 = eVar.f1001d;
        if (i3 != 3) {
            a(i3, 3);
        }
        int i4 = eVar.f1002e;
        if (i4 != 3) {
            a(i4, 5);
        }
        int i5 = eVar.f1003f;
        if (i5 != 3) {
            a(i5, 8388611);
        }
        int i6 = eVar.f1004g;
        if (i6 != 3) {
            a(i6, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        i();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            d dVar = (d) getChildAt(i2).getLayoutParams();
            boolean z2 = true;
            boolean z3 = dVar.f999d == 1;
            if (dVar.f999d != 2) {
                z2 = false;
            }
            if (z3 || z2) {
                eVar.f1000c = dVar.f996a;
            } else {
                i2++;
            }
        }
        eVar.f1001d = this.r;
        eVar.f1002e = this.s;
        eVar.f1003f = this.t;
        eVar.f1004g = this.u;
        return eVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        View c2;
        this.k.a(motionEvent);
        this.l.a(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                View b2 = this.k.b((int) x2, (int) y2);
                if (b2 != null && h(b2)) {
                    float f2 = x2 - this.z;
                    float f3 = y2 - this.A;
                    int d2 = this.k.d();
                    if (!((f2 * f2) + (f3 * f3) >= ((float) (d2 * d2)) || (c2 = c()) == null || d(c2) == 2)) {
                        z2 = false;
                        a(z2);
                        this.v = false;
                    }
                }
                z2 = true;
                a(z2);
                this.v = false;
            } else if (action == 3) {
                a(true);
            }
            return true;
        }
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        this.z = x3;
        this.A = y3;
        this.v = false;
        this.w = false;
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        this.v = z2;
        if (z2) {
            a(true);
        }
    }

    public void requestLayout() {
        if (!this.p) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f2) {
        this.f991f = f2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (j(childAt)) {
                y.a(childAt, this.f991f);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(c cVar) {
        c cVar2 = this.x;
        if (cVar2 != null) {
            b(cVar2);
        }
        if (cVar != null) {
            a(cVar);
        }
        this.x = cVar;
    }

    public void setDrawerLockMode(int i2) {
        a(i2, 3);
        a(i2, 5);
    }

    public void setScrimColor(int i2) {
        this.f993h = i2;
        invalidate();
    }

    public void setStatusBarBackground(int i2) {
        this.B = i2 != 0 ? b.h.a.a.c(getContext(), i2) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.B = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i2) {
        this.B = new ColorDrawable(i2);
        invalidate();
    }
}
