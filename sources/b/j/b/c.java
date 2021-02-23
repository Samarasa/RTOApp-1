package b.j.b;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import b.e.j;
import b.h.j.B;
import b.h.j.C0195a;
import b.h.j.a.e;
import b.h.j.y;
import b.j.b.d;
import java.util.ArrayList;
import java.util.List;

public abstract class c extends C0195a {

    /* renamed from: d  reason: collision with root package name */
    private static final Rect f2605d = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: e  reason: collision with root package name */
    private static final d.a<b.h.j.a.c> f2606e = new a();

    /* renamed from: f  reason: collision with root package name */
    private static final d.b<j<b.h.j.a.c>, b.h.j.a.c> f2607f = new b();

    /* renamed from: g  reason: collision with root package name */
    private final Rect f2608g = new Rect();

    /* renamed from: h  reason: collision with root package name */
    private final Rect f2609h = new Rect();
    private final Rect i = new Rect();
    private final int[] j = new int[2];
    private final AccessibilityManager k;
    private final View l;
    private a m;
    int n = Integer.MIN_VALUE;
    int o = Integer.MIN_VALUE;
    private int p = Integer.MIN_VALUE;

    private class a extends b.h.j.a.d {
        a() {
        }

        public b.h.j.a.c a(int i) {
            return b.h.j.a.c.a(c.this.b(i));
        }

        public boolean a(int i, int i2, Bundle bundle) {
            return c.this.b(i, i2, bundle);
        }

        public b.h.j.a.c b(int i) {
            int i2 = i == 2 ? c.this.n : c.this.o;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i2);
        }
    }

    public c(View view) {
        if (view != null) {
            this.l = view;
            this.k = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (y.k(view) == 0) {
                y.e(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect a(View view, int i2, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i2 == 17) {
            rect.set(width, 0, width, height);
        } else if (i2 == 33) {
            rect.set(0, height, width, height);
        } else if (i2 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i2 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    private void a(int i2, Rect rect) {
        b(i2).a(rect);
    }

    private boolean a(int i2, Bundle bundle) {
        return y.a(this.l, i2, bundle);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(android.graphics.Rect r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0032
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x000a
            goto L_0x0032
        L_0x000a:
            android.view.View r4 = r3.l
            int r4 = r4.getWindowVisibility()
            if (r4 == 0) goto L_0x0013
            return r0
        L_0x0013:
            android.view.View r4 = r3.l
        L_0x0015:
            android.view.ViewParent r4 = r4.getParent()
            boolean r1 = r4 instanceof android.view.View
            if (r1 == 0) goto L_0x002f
            android.view.View r4 = (android.view.View) r4
            float r1 = r4.getAlpha()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x002e
            int r1 = r4.getVisibility()
            if (r1 == 0) goto L_0x0015
        L_0x002e:
            return r0
        L_0x002f:
            if (r4 == 0) goto L_0x0032
            r0 = 1
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.b.c.a(android.graphics.Rect):boolean");
    }

    private AccessibilityEvent b(int i2, int i3) {
        return i2 != -1 ? c(i2, i3) : e(i3);
    }

    private boolean b(int i2, Rect rect) {
        Object obj;
        j<b.h.j.a.c> f2 = f();
        int i3 = this.o;
        int i4 = Integer.MIN_VALUE;
        b.h.j.a.c a2 = i3 == Integer.MIN_VALUE ? null : f2.a(i3);
        if (i2 == 1 || i2 == 2) {
            obj = d.a(f2, f2607f, f2606e, a2, i2, y.m(this.l) == 1, false);
        } else if (i2 == 17 || i2 == 33 || i2 == 66 || i2 == 130) {
            Rect rect2 = new Rect();
            int i5 = this.o;
            if (i5 != Integer.MIN_VALUE) {
                a(i5, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                a(this.l, i2, rect2);
            }
            obj = d.a(f2, f2607f, f2606e, a2, rect2, i2);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        b.h.j.a.c cVar = (b.h.j.a.c) obj;
        if (cVar != null) {
            i4 = f2.c(f2.a(cVar));
        }
        return c(i4);
    }

    private AccessibilityEvent c(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        b.h.j.a.c b2 = b(i2);
        obtain.getText().add(b2.h());
        obtain.setContentDescription(b2.e());
        obtain.setScrollable(b2.s());
        obtain.setPassword(b2.r());
        obtain.setEnabled(b2.n());
        obtain.setChecked(b2.l());
        a(i2, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(b2.d());
            e.a(obtain, this.l, i2);
            obtain.setPackageName(this.l.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    private boolean c(int i2, int i3, Bundle bundle) {
        return i3 != 1 ? i3 != 2 ? i3 != 64 ? i3 != 128 ? a(i2, i3, bundle) : d(i2) : h(i2) : a(i2) : c(i2);
    }

    private boolean d() {
        int i2 = this.o;
        return i2 != Integer.MIN_VALUE && a(i2, 16, (Bundle) null);
    }

    private boolean d(int i2) {
        if (this.n != i2) {
            return false;
        }
        this.n = Integer.MIN_VALUE;
        this.l.invalidate();
        a(i2, 65536);
        return true;
    }

    private AccessibilityEvent e(int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        this.l.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private b.h.j.a.c e() {
        b.h.j.a.c b2 = b.h.j.a.c.b(this.l);
        y.a(this.l, b2);
        ArrayList arrayList = new ArrayList();
        a((List<Integer>) arrayList);
        if (b2.c() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                b2.a(this.l, ((Integer) arrayList.get(i2)).intValue());
            }
            return b2;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    private j<b.h.j.a.c> f() {
        ArrayList arrayList = new ArrayList();
        a((List<Integer>) arrayList);
        j<b.h.j.a.c> jVar = new j<>();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            jVar.c(i2, f(i2));
        }
        return jVar;
    }

    private b.h.j.a.c f(int i2) {
        b.h.j.a.c v = b.h.j.a.c.v();
        v.f(true);
        v.g(true);
        v.b((CharSequence) "android.view.View");
        v.c(f2605d);
        v.d(f2605d);
        v.c(this.l);
        a(i2, v);
        if (v.h() == null && v.e() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        v.a(this.f2609h);
        if (!this.f2609h.equals(f2605d)) {
            int b2 = v.b();
            if ((b2 & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((b2 & 128) == 0) {
                v.d((CharSequence) this.l.getContext().getPackageName());
                v.c(this.l, i2);
                if (this.n == i2) {
                    v.a(true);
                    v.a(128);
                } else {
                    v.a(false);
                    v.a(64);
                }
                boolean z = this.o == i2;
                if (z) {
                    v.a(2);
                } else if (v.o()) {
                    v.a(1);
                }
                v.h(z);
                this.l.getLocationOnScreen(this.j);
                v.b(this.f2608g);
                if (this.f2608g.equals(f2605d)) {
                    v.a(this.f2608g);
                    if (v.f2540c != -1) {
                        b.h.j.a.c v2 = b.h.j.a.c.v();
                        for (int i3 = v.f2540c; i3 != -1; i3 = v2.f2540c) {
                            v2.b(this.l, -1);
                            v2.c(f2605d);
                            a(i3, v2);
                            v2.a(this.f2609h);
                            Rect rect = this.f2608g;
                            Rect rect2 = this.f2609h;
                            rect.offset(rect2.left, rect2.top);
                        }
                        v2.w();
                    }
                    this.f2608g.offset(this.j[0] - this.l.getScrollX(), this.j[1] - this.l.getScrollY());
                }
                if (this.l.getLocalVisibleRect(this.i)) {
                    this.i.offset(this.j[0] - this.l.getScrollX(), this.j[1] - this.l.getScrollY());
                    if (this.f2608g.intersect(this.i)) {
                        v.d(this.f2608g);
                        if (a(this.f2608g)) {
                            v.n(true);
                        }
                    }
                }
                return v;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    private static int g(int i2) {
        if (i2 == 19) {
            return 33;
        }
        if (i2 != 21) {
            return i2 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean h(int i2) {
        int i3;
        if (!this.k.isEnabled() || !this.k.isTouchExplorationEnabled() || (i3 = this.n) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            d(i3);
        }
        this.n = i2;
        this.l.invalidate();
        a(i2, 32768);
        return true;
    }

    private void i(int i2) {
        int i3 = this.p;
        if (i3 != i2) {
            this.p = i2;
            a(i2, 128);
            a(i3, 256);
        }
    }

    /* access modifiers changed from: protected */
    public abstract int a(float f2, float f3);

    public b.h.j.a.d a(View view) {
        if (this.m == null) {
            this.m = new a();
        }
        return this.m;
    }

    /* access modifiers changed from: protected */
    public void a(int i2, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(int i2, b.h.j.a.c cVar);

    /* access modifiers changed from: protected */
    public void a(int i2, boolean z) {
    }

    public void a(View view, b.h.j.a.c cVar) {
        super.a(view, cVar);
        a(cVar);
    }

    /* access modifiers changed from: protected */
    public void a(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public void a(b.h.j.a.c cVar) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(List<Integer> list);

    public final void a(boolean z, int i2, Rect rect) {
        int i3 = this.o;
        if (i3 != Integer.MIN_VALUE) {
            a(i3);
        }
        if (z) {
            b(i2, rect);
        }
    }

    public final boolean a(int i2) {
        if (this.o != i2) {
            return false;
        }
        this.o = Integer.MIN_VALUE;
        a(i2, false);
        a(i2, 8);
        return true;
    }

    public final boolean a(int i2, int i3) {
        ViewParent parent;
        if (i2 == Integer.MIN_VALUE || !this.k.isEnabled() || (parent = this.l.getParent()) == null) {
            return false;
        }
        return B.a(parent, this.l, b(i2, i3));
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(int i2, int i3, Bundle bundle);

    public final boolean a(KeyEvent keyEvent) {
        int i2 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int g2 = g(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i2 < repeatCount && b(g2, (Rect) null)) {
                            i2++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            d();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return b(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return b(1, (Rect) null);
            }
            return false;
        }
    }

    public final boolean a(MotionEvent motionEvent) {
        if (!this.k.isEnabled() || !this.k.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int a2 = a(motionEvent.getX(), motionEvent.getY());
            i(a2);
            return a2 != Integer.MIN_VALUE;
        } else if (action != 10 || this.p == Integer.MIN_VALUE) {
            return false;
        } else {
            i(Integer.MIN_VALUE);
            return true;
        }
    }

    public final int b() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public b.h.j.a.c b(int i2) {
        return i2 == -1 ? e() : f(i2);
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        a(accessibilityEvent);
    }

    /* access modifiers changed from: package-private */
    public boolean b(int i2, int i3, Bundle bundle) {
        return i2 != -1 ? c(i2, i3, bundle) : a(i3, bundle);
    }

    public final int c() {
        return this.o;
    }

    public final boolean c(int i2) {
        int i3;
        if ((!this.l.isFocused() && !this.l.requestFocus()) || (i3 = this.o) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            a(i3);
        }
        this.o = i2;
        a(i2, true);
        a(i2, 8);
        return true;
    }
}
