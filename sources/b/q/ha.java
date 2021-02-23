package b.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import b.q.C0204a;
import b.q.E;

public abstract class ha extends E {
    private static final String[] K = {"android:visibility:visibility", "android:visibility:parent"};
    private int L = 3;

    private static class a extends AnimatorListenerAdapter implements E.c, C0204a.C0043a {

        /* renamed from: a  reason: collision with root package name */
        private final View f2748a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2749b;

        /* renamed from: c  reason: collision with root package name */
        private final ViewGroup f2750c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f2751d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f2752e;

        /* renamed from: f  reason: collision with root package name */
        boolean f2753f = false;

        a(View view, int i, boolean z) {
            this.f2748a = view;
            this.f2749b = i;
            this.f2750c = (ViewGroup) view.getParent();
            this.f2751d = z;
            a(true);
        }

        private void a() {
            if (!this.f2753f) {
                ba.a(this.f2748a, this.f2749b);
                ViewGroup viewGroup = this.f2750c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            a(false);
        }

        private void a(boolean z) {
            ViewGroup viewGroup;
            if (this.f2751d && this.f2752e != z && (viewGroup = this.f2750c) != null) {
                this.f2752e = z;
                S.a(viewGroup, z);
            }
        }

        public void a(E e2) {
        }

        public void b(E e2) {
            a(false);
        }

        public void c(E e2) {
            a();
            e2.b((E.c) this);
        }

        public void d(E e2) {
            a(true);
        }

        public void onAnimationCancel(Animator animator) {
            this.f2753f = true;
        }

        public void onAnimationEnd(Animator animator) {
            a();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f2753f) {
                ba.a(this.f2748a, this.f2749b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f2753f) {
                ba.a(this.f2748a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        boolean f2754a;

        /* renamed from: b  reason: collision with root package name */
        boolean f2755b;

        /* renamed from: c  reason: collision with root package name */
        int f2756c;

        /* renamed from: d  reason: collision with root package name */
        int f2757d;

        /* renamed from: e  reason: collision with root package name */
        ViewGroup f2758e;

        /* renamed from: f  reason: collision with root package name */
        ViewGroup f2759f;

        b() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        if (r9 == 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        if (r0.f2758e == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        if (r0.f2756c == 0) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private b.q.ha.b b(b.q.M r8, b.q.M r9) {
        /*
            r7 = this;
            b.q.ha$b r0 = new b.q.ha$b
            r0.<init>()
            r1 = 0
            r0.f2754a = r1
            r0.f2755b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f2704a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f2704a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f2756c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f2704a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f2758e = r6
            goto L_0x0037
        L_0x0033:
            r0.f2756c = r4
            r0.f2758e = r3
        L_0x0037:
            if (r9 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f2704a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f2704a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f2757d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f2704a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f2759f = r2
            goto L_0x005e
        L_0x005a:
            r0.f2757d = r4
            r0.f2759f = r3
        L_0x005e:
            r2 = 1
            if (r8 == 0) goto L_0x0086
            if (r9 == 0) goto L_0x0086
            int r8 = r0.f2756c
            int r9 = r0.f2757d
            if (r8 != r9) goto L_0x0070
            android.view.ViewGroup r8 = r0.f2758e
            android.view.ViewGroup r9 = r0.f2759f
            if (r8 != r9) goto L_0x0070
            return r0
        L_0x0070:
            int r8 = r0.f2756c
            int r9 = r0.f2757d
            if (r8 == r9) goto L_0x007c
            if (r8 != 0) goto L_0x0079
            goto L_0x0097
        L_0x0079:
            if (r9 != 0) goto L_0x009a
            goto L_0x008c
        L_0x007c:
            android.view.ViewGroup r8 = r0.f2759f
            if (r8 != 0) goto L_0x0081
            goto L_0x0097
        L_0x0081:
            android.view.ViewGroup r8 = r0.f2758e
            if (r8 != 0) goto L_0x009a
            goto L_0x008c
        L_0x0086:
            if (r8 != 0) goto L_0x0091
            int r8 = r0.f2757d
            if (r8 != 0) goto L_0x0091
        L_0x008c:
            r0.f2755b = r2
        L_0x008e:
            r0.f2754a = r2
            goto L_0x009a
        L_0x0091:
            if (r9 != 0) goto L_0x009a
            int r8 = r0.f2756c
            if (r8 != 0) goto L_0x009a
        L_0x0097:
            r0.f2755b = r1
            goto L_0x008e
        L_0x009a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.ha.b(b.q.M, b.q.M):b.q.ha$b");
    }

    private void d(M m) {
        m.f2704a.put("android:visibility:visibility", Integer.valueOf(m.f2705b.getVisibility()));
        m.f2704a.put("android:visibility:parent", m.f2705b.getParent());
        int[] iArr = new int[2];
        m.f2705b.getLocationOnScreen(iArr);
        m.f2704a.put("android:visibility:screenLocation", iArr);
    }

    public abstract Animator a(ViewGroup viewGroup, View view, M m, M m2);

    public Animator a(ViewGroup viewGroup, M m, int i, M m2, int i2) {
        if ((this.L & 1) != 1 || m2 == null) {
            return null;
        }
        if (m == null) {
            View view = (View) m2.f2705b.getParent();
            if (b(a(view, false), b(view, false)).f2754a) {
                return null;
            }
        }
        return a(viewGroup, m2.f2705b, m, m2);
    }

    public Animator a(ViewGroup viewGroup, M m, M m2) {
        b b2 = b(m, m2);
        if (!b2.f2754a) {
            return null;
        }
        if (b2.f2758e == null && b2.f2759f == null) {
            return null;
        }
        if (b2.f2755b) {
            return a(viewGroup, m, b2.f2756c, m2, b2.f2757d);
        }
        return b(viewGroup, m, b2.f2756c, m2, b2.f2757d);
    }

    public void a(int i) {
        if ((i & -4) == 0) {
            this.L = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public void a(M m) {
        d(m);
    }

    public boolean a(M m, M m2) {
        if (m == null && m2 == null) {
            return false;
        }
        if (m != null && m2 != null && m2.f2704a.containsKey("android:visibility:visibility") != m.f2704a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b b2 = b(m, m2);
        if (b2.f2754a) {
            return b2.f2756c == 0 || b2.f2757d == 0;
        }
        return false;
    }

    public abstract Animator b(ViewGroup viewGroup, View view, M m, M m2);

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e9 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator b(android.view.ViewGroup r7, b.q.M r8, int r9, b.q.M r10, int r11) {
        /*
            r6 = this;
            int r9 = r6.L
            r0 = 2
            r9 = r9 & r0
            r1 = 0
            if (r9 == r0) goto L_0x0008
            return r1
        L_0x0008:
            if (r8 == 0) goto L_0x000d
            android.view.View r9 = r8.f2705b
            goto L_0x000e
        L_0x000d:
            r9 = r1
        L_0x000e:
            if (r10 == 0) goto L_0x0013
            android.view.View r2 = r10.f2705b
            goto L_0x0014
        L_0x0013:
            r2 = r1
        L_0x0014:
            r3 = 1
            if (r2 == 0) goto L_0x0036
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x001e
            goto L_0x0036
        L_0x001e:
            r4 = 4
            if (r11 != r4) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            if (r9 != r2) goto L_0x0026
        L_0x0024:
            r9 = r1
            goto L_0x007f
        L_0x0026:
            boolean r2 = r6.z
            if (r2 == 0) goto L_0x002b
            goto L_0x0043
        L_0x002b:
            android.view.ViewParent r2 = r9.getParent()
            android.view.View r2 = (android.view.View) r2
        L_0x0031:
            android.view.View r9 = b.q.L.a(r7, r9, r2)
            goto L_0x0039
        L_0x0036:
            if (r2 == 0) goto L_0x003b
            r9 = r2
        L_0x0039:
            r2 = r1
            goto L_0x007f
        L_0x003b:
            if (r9 == 0) goto L_0x007d
            android.view.ViewParent r2 = r9.getParent()
            if (r2 != 0) goto L_0x0044
        L_0x0043:
            goto L_0x0039
        L_0x0044:
            android.view.ViewParent r2 = r9.getParent()
            boolean r2 = r2 instanceof android.view.View
            if (r2 == 0) goto L_0x007d
            android.view.ViewParent r2 = r9.getParent()
            android.view.View r2 = (android.view.View) r2
            b.q.M r4 = r6.b((android.view.View) r2, (boolean) r3)
            b.q.M r5 = r6.a((android.view.View) r2, (boolean) r3)
            b.q.ha$b r4 = r6.b(r4, r5)
            boolean r4 = r4.f2754a
            if (r4 != 0) goto L_0x0063
            goto L_0x0031
        L_0x0063:
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x007b
            int r2 = r2.getId()
            r4 = -1
            if (r2 == r4) goto L_0x007b
            android.view.View r2 = r7.findViewById(r2)
            if (r2 == 0) goto L_0x007b
            boolean r2 = r6.z
            if (r2 == 0) goto L_0x007b
            goto L_0x0039
        L_0x007b:
            r9 = r1
            goto L_0x0039
        L_0x007d:
            r9 = r1
            r2 = r9
        L_0x007f:
            r4 = 0
            if (r9 == 0) goto L_0x00c7
            if (r8 == 0) goto L_0x00c7
            java.util.Map<java.lang.String, java.lang.Object> r11 = r8.f2704a
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r11 = r11.get(r1)
            int[] r11 = (int[]) r11
            r1 = r11[r4]
            r11 = r11[r3]
            int[] r0 = new int[r0]
            r7.getLocationOnScreen(r0)
            r2 = r0[r4]
            int r1 = r1 - r2
            int r2 = r9.getLeft()
            int r1 = r1 - r2
            r9.offsetLeftAndRight(r1)
            r0 = r0[r3]
            int r11 = r11 - r0
            int r0 = r9.getTop()
            int r11 = r11 - r0
            r9.offsetTopAndBottom(r11)
            b.q.Q r11 = b.q.S.a(r7)
            r11.a(r9)
            android.animation.Animator r7 = r6.b(r7, r9, r8, r10)
            if (r7 != 0) goto L_0x00be
            r11.b(r9)
            goto L_0x00c6
        L_0x00be:
            b.q.ga r8 = new b.q.ga
            r8.<init>(r6, r11, r9)
            r7.addListener(r8)
        L_0x00c6:
            return r7
        L_0x00c7:
            if (r2 == 0) goto L_0x00e9
            int r9 = r2.getVisibility()
            b.q.ba.a((android.view.View) r2, (int) r4)
            android.animation.Animator r7 = r6.b(r7, r2, r8, r10)
            if (r7 == 0) goto L_0x00e5
            b.q.ha$a r8 = new b.q.ha$a
            r8.<init>(r2, r11, r3)
            r7.addListener(r8)
            b.q.C0204a.a(r7, r8)
            r6.a((b.q.E.c) r8)
            goto L_0x00e8
        L_0x00e5:
            b.q.ba.a((android.view.View) r2, (int) r9)
        L_0x00e8:
            return r7
        L_0x00e9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.ha.b(android.view.ViewGroup, b.q.M, int, b.q.M, int):android.animation.Animator");
    }

    public void c(M m) {
        d(m);
    }

    public String[] o() {
        return K;
    }
}
