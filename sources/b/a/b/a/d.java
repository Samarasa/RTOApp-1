package b.a.b.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

class d extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    private b f2064a;

    /* renamed from: b  reason: collision with root package name */
    private Rect f2065b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f2066c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f2067d;

    /* renamed from: e  reason: collision with root package name */
    private int f2068e = 255;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2069f;

    /* renamed from: g  reason: collision with root package name */
    private int f2070g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f2071h = -1;
    private boolean i;
    private Runnable j;
    private long k;
    private long l;
    private a m;

    static class a implements Drawable.Callback {

        /* renamed from: a  reason: collision with root package name */
        private Drawable.Callback f2072a;

        a() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f2072a;
            this.f2072a = null;
            return callback;
        }

        public a a(Drawable.Callback callback) {
            this.f2072a = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f2072a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f2072a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    static abstract class b extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a  reason: collision with root package name */
        final d f2073a;

        /* renamed from: b  reason: collision with root package name */
        Resources f2074b;

        /* renamed from: c  reason: collision with root package name */
        int f2075c = 160;

        /* renamed from: d  reason: collision with root package name */
        int f2076d;

        /* renamed from: e  reason: collision with root package name */
        int f2077e;

        /* renamed from: f  reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f2078f;

        /* renamed from: g  reason: collision with root package name */
        Drawable[] f2079g;

        /* renamed from: h  reason: collision with root package name */
        int f2080h;
        boolean i;
        boolean j;
        Rect k;
        boolean l;
        boolean m;
        int n;
        int o;
        int p;
        int q;
        boolean r;
        int s;
        boolean t;
        boolean u;
        boolean v;
        boolean w;
        boolean x;
        boolean y;
        int z;

        b(b bVar, d dVar, Resources resources) {
            this.i = false;
            this.l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.f2073a = dVar;
            this.f2074b = resources != null ? resources : bVar != null ? bVar.f2074b : null;
            this.f2075c = d.a(resources, bVar != null ? bVar.f2075c : 0);
            if (bVar != null) {
                this.f2076d = bVar.f2076d;
                this.f2077e = bVar.f2077e;
                this.v = true;
                this.w = true;
                this.i = bVar.i;
                this.l = bVar.l;
                this.x = bVar.x;
                this.y = bVar.y;
                this.z = bVar.z;
                this.A = bVar.A;
                this.B = bVar.B;
                this.C = bVar.C;
                this.D = bVar.D;
                this.E = bVar.E;
                this.F = bVar.F;
                this.G = bVar.G;
                this.H = bVar.H;
                this.I = bVar.I;
                if (bVar.f2075c == this.f2075c) {
                    if (bVar.j) {
                        this.k = new Rect(bVar.k);
                        this.j = true;
                    }
                    if (bVar.m) {
                        this.n = bVar.n;
                        this.o = bVar.o;
                        this.p = bVar.p;
                        this.q = bVar.q;
                        this.m = true;
                    }
                }
                if (bVar.r) {
                    this.s = bVar.s;
                    this.r = true;
                }
                if (bVar.t) {
                    this.u = bVar.u;
                    this.t = true;
                }
                Drawable[] drawableArr = bVar.f2079g;
                this.f2079g = new Drawable[drawableArr.length];
                this.f2080h = bVar.f2080h;
                SparseArray<Drawable.ConstantState> sparseArray = bVar.f2078f;
                this.f2078f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f2080h);
                int i2 = this.f2080h;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null) {
                        Drawable.ConstantState constantState = drawableArr[i3].getConstantState();
                        if (constantState != null) {
                            this.f2078f.put(i3, constantState);
                        } else {
                            this.f2079g[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.f2079g = new Drawable[10];
            this.f2080h = 0;
        }

        private Drawable b(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f2073a);
            return mutate;
        }

        private void n() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f2078f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f2079g[this.f2078f.keyAt(i2)] = b(this.f2078f.valueAt(i2).newDrawable(this.f2074b));
                }
                this.f2078f = null;
            }
        }

        public final int a(Drawable drawable) {
            int i2 = this.f2080h;
            if (i2 >= this.f2079g.length) {
                a(i2, i2 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f2073a);
            this.f2079g[i2] = drawable;
            this.f2080h++;
            this.f2077e = drawable.getChangingConfigurations() | this.f2077e;
            k();
            this.k = null;
            this.j = false;
            this.m = false;
            this.v = false;
            return i2;
        }

        public final Drawable a(int i2) {
            int indexOfKey;
            Drawable drawable = this.f2079g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f2078f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable b2 = b(this.f2078f.valueAt(indexOfKey).newDrawable(this.f2074b));
            this.f2079g[i2] = b2;
            this.f2078f.removeAt(indexOfKey);
            if (this.f2078f.size() == 0) {
                this.f2078f = null;
            }
            return b2;
        }

        public void a(int i2, int i3) {
            Drawable[] drawableArr = new Drawable[i3];
            System.arraycopy(this.f2079g, 0, drawableArr, 0, i2);
            this.f2079g = drawableArr;
        }

        /* access modifiers changed from: package-private */
        public final void a(Resources.Theme theme) {
            if (theme != null) {
                n();
                int i2 = this.f2080h;
                Drawable[] drawableArr = this.f2079g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null && drawableArr[i3].canApplyTheme()) {
                        drawableArr[i3].applyTheme(theme);
                        this.f2077e |= drawableArr[i3].getChangingConfigurations();
                    }
                }
                a(theme.getResources());
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(Resources resources) {
            if (resources != null) {
                this.f2074b = resources;
                int a2 = d.a(resources, this.f2075c);
                int i2 = this.f2075c;
                this.f2075c = a2;
                if (i2 != a2) {
                    this.m = false;
                    this.j = false;
                }
            }
        }

        public final void a(boolean z2) {
            this.l = z2;
        }

        public synchronized boolean a() {
            if (this.v) {
                return this.w;
            }
            n();
            this.v = true;
            int i2 = this.f2080h;
            Drawable[] drawableArr = this.f2079g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    this.w = false;
                    return false;
                }
            }
            this.w = true;
            return true;
        }

        /* access modifiers changed from: protected */
        public void b() {
            this.m = true;
            n();
            int i2 = this.f2080h;
            Drawable[] drawableArr = this.f2079g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        public final void b(int i2) {
            this.A = i2;
        }

        public final void b(boolean z2) {
            this.i = z2;
        }

        /* access modifiers changed from: package-private */
        public final boolean b(int i2, int i3) {
            int i4 = this.f2080h;
            Drawable[] drawableArr = this.f2079g;
            boolean z2 = false;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i5].setLayoutDirection(i2) : false;
                    if (i5 == i3) {
                        z2 = layoutDirection;
                    }
                }
            }
            this.z = i2;
            return z2;
        }

        /* access modifiers changed from: package-private */
        public final int c() {
            return this.f2079g.length;
        }

        public final void c(int i2) {
            this.B = i2;
        }

        public boolean canApplyTheme() {
            int i2 = this.f2080h;
            Drawable[] drawableArr = this.f2079g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f2078f.get(i3);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        public final int d() {
            return this.f2080h;
        }

        public final int e() {
            if (!this.m) {
                b();
            }
            return this.o;
        }

        public final int f() {
            if (!this.m) {
                b();
            }
            return this.q;
        }

        public final int g() {
            if (!this.m) {
                b();
            }
            return this.p;
        }

        public int getChangingConfigurations() {
            return this.f2076d | this.f2077e;
        }

        public final Rect h() {
            if (this.i) {
                return null;
            }
            if (this.k != null || this.j) {
                return this.k;
            }
            n();
            Rect rect = new Rect();
            int i2 = this.f2080h;
            Drawable[] drawableArr = this.f2079g;
            Rect rect2 = null;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getPadding(rect)) {
                    if (rect2 == null) {
                        rect2 = new Rect(0, 0, 0, 0);
                    }
                    int i4 = rect.left;
                    if (i4 > rect2.left) {
                        rect2.left = i4;
                    }
                    int i5 = rect.top;
                    if (i5 > rect2.top) {
                        rect2.top = i5;
                    }
                    int i6 = rect.right;
                    if (i6 > rect2.right) {
                        rect2.right = i6;
                    }
                    int i7 = rect.bottom;
                    if (i7 > rect2.bottom) {
                        rect2.bottom = i7;
                    }
                }
            }
            this.j = true;
            this.k = rect2;
            return rect2;
        }

        public final int i() {
            if (!this.m) {
                b();
            }
            return this.n;
        }

        public final int j() {
            if (this.r) {
                return this.s;
            }
            n();
            int i2 = this.f2080h;
            Drawable[] drawableArr = this.f2079g;
            int opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i3 = 1; i3 < i2; i3++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
            }
            this.s = opacity;
            this.r = true;
            return opacity;
        }

        /* access modifiers changed from: package-private */
        public void k() {
            this.r = false;
            this.t = false;
        }

        public final boolean l() {
            return this.l;
        }

        /* access modifiers changed from: package-private */
        public abstract void m();
    }

    d() {
    }

    static int a(Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }

    private void a(Drawable drawable) {
        if (this.m == null) {
            this.m = new a();
        }
        a aVar = this.m;
        aVar.a(drawable.getCallback());
        drawable.setCallback(aVar);
        try {
            if (this.f2064a.A <= 0 && this.f2069f) {
                drawable.setAlpha(this.f2068e);
            }
            if (this.f2064a.E) {
                drawable.setColorFilter(this.f2064a.D);
            } else {
                if (this.f2064a.H) {
                    androidx.core.graphics.drawable.a.a(drawable, this.f2064a.F);
                }
                if (this.f2064a.I) {
                    androidx.core.graphics.drawable.a.a(drawable, this.f2064a.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f2064a.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f2064a.C);
            }
            Rect rect = this.f2065b;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.m.a());
        }
    }

    private boolean c() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    /* access modifiers changed from: package-private */
    public b a() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final void a(Resources resources) {
        this.f2064a.a(resources);
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar) {
        this.f2064a = bVar;
        int i2 = this.f2070g;
        if (i2 >= 0) {
            this.f2066c = bVar.a(i2);
            Drawable drawable = this.f2066c;
            if (drawable != null) {
                a(drawable);
            }
        }
        this.f2071h = -1;
        this.f2067d = null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f2069f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f2066c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.k
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0020
            int r9 = r13.f2068e
            r3.setAlpha(r9)
            goto L_0x0036
        L_0x0020:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            b.a.b.a.d$b r9 = r13.f2064a
            int r9 = r9.A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f2068e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x0039
        L_0x0036:
            r13.k = r7
        L_0x0038:
            r3 = 0
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.f2067d
            if (r9 == 0) goto L_0x0064
            long r10 = r13.l
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0066
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0051
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f2067d = r0
            r0 = -1
            r13.f2071h = r0
            goto L_0x0064
        L_0x0051:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            b.a.b.a.d$b r4 = r13.f2064a
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f2068e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0067
        L_0x0064:
            r13.l = r7
        L_0x0066:
            r0 = r3
        L_0x0067:
            if (r14 == 0) goto L_0x0073
            if (r0 == 0) goto L_0x0073
            java.lang.Runnable r14 = r13.j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.b.a.d.a(boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r9) {
        /*
            r8 = this;
            int r0 = r8.f2070g
            r1 = 0
            if (r9 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            b.a.b.a.d$b r0 = r8.f2064a
            int r0 = r0.B
            r4 = -1
            r5 = 0
            r6 = 0
            if (r0 <= 0) goto L_0x0035
            android.graphics.drawable.Drawable r0 = r8.f2067d
            if (r0 == 0) goto L_0x001b
            r0.setVisible(r1, r1)
        L_0x001b:
            android.graphics.drawable.Drawable r0 = r8.f2066c
            if (r0 == 0) goto L_0x002e
            r8.f2067d = r0
            int r0 = r8.f2070g
            r8.f2071h = r0
            b.a.b.a.d$b r0 = r8.f2064a
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r8.l = r0
            goto L_0x003c
        L_0x002e:
            r8.f2067d = r5
            r8.f2071h = r4
            r8.l = r6
            goto L_0x003c
        L_0x0035:
            android.graphics.drawable.Drawable r0 = r8.f2066c
            if (r0 == 0) goto L_0x003c
            r0.setVisible(r1, r1)
        L_0x003c:
            if (r9 < 0) goto L_0x005c
            b.a.b.a.d$b r0 = r8.f2064a
            int r1 = r0.f2080h
            if (r9 >= r1) goto L_0x005c
            android.graphics.drawable.Drawable r0 = r0.a((int) r9)
            r8.f2066c = r0
            r8.f2070g = r9
            if (r0 == 0) goto L_0x0060
            b.a.b.a.d$b r9 = r8.f2064a
            int r9 = r9.A
            if (r9 <= 0) goto L_0x0058
            long r4 = (long) r9
            long r2 = r2 + r4
            r8.k = r2
        L_0x0058:
            r8.a((android.graphics.drawable.Drawable) r0)
            goto L_0x0060
        L_0x005c:
            r8.f2066c = r5
            r8.f2070g = r4
        L_0x0060:
            long r0 = r8.k
            r9 = 1
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x006d
            long r0 = r8.l
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x007f
        L_0x006d:
            java.lang.Runnable r0 = r8.j
            if (r0 != 0) goto L_0x0079
            b.a.b.a.c r0 = new b.a.b.a.c
            r0.<init>(r8)
            r8.j = r0
            goto L_0x007c
        L_0x0079:
            r8.unscheduleSelf(r0)
        L_0x007c:
            r8.a((boolean) r9)
        L_0x007f:
            r8.invalidateSelf()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.b.a.d.a(int):boolean");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f2064a.a(theme);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f2070g;
    }

    public boolean canApplyTheme() {
        return this.f2064a.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f2066c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f2067d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getAlpha() {
        return this.f2068e;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f2064a.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f2064a.a()) {
            return null;
        }
        this.f2064a.f2076d = getChangingConfigurations();
        return this.f2064a;
    }

    public Drawable getCurrent() {
        return this.f2066c;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f2065b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f2064a.l()) {
            return this.f2064a.e();
        }
        Drawable drawable = this.f2066c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f2064a.l()) {
            return this.f2064a.i();
        }
        Drawable drawable = this.f2066c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f2064a.l()) {
            return this.f2064a.f();
        }
        Drawable drawable = this.f2066c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f2064a.l()) {
            return this.f2064a.g();
        }
        Drawable drawable = this.f2066c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f2066c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f2064a.j();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f2066c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect h2 = this.f2064a.h();
        if (h2 != null) {
            rect.set(h2);
            z = (h2.right | ((h2.left | h2.top) | h2.bottom)) != 0;
        } else {
            Drawable drawable = this.f2066c;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (c()) {
            int i2 = rect.left;
            rect.left = rect.right;
            rect.right = i2;
        }
        return z;
    }

    public void invalidateDrawable(Drawable drawable) {
        b bVar = this.f2064a;
        if (bVar != null) {
            bVar.k();
        }
        if (drawable == this.f2066c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f2064a.C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f2067d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f2067d = null;
            this.f2071h = -1;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f2066c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f2069f) {
                this.f2066c.setAlpha(this.f2068e);
            }
        }
        if (this.l != 0) {
            this.l = 0;
            z = true;
        }
        if (this.k != 0) {
            this.k = 0;
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.i && super.mutate() == this) {
            b a2 = a();
            a2.m();
            a(a2);
            this.i = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2067d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f2066c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i2) {
        return this.f2064a.b(i2, b());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f2067d;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f2066c;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2067d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f2066c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable == this.f2066c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        if (!this.f2069f || this.f2068e != i2) {
            this.f2069f = true;
            this.f2068e = i2;
            Drawable drawable = this.f2066c;
            if (drawable == null) {
                return;
            }
            if (this.k == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        b bVar = this.f2064a;
        if (bVar.C != z) {
            bVar.C = z;
            Drawable drawable = this.f2066c;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.a(drawable, bVar.C);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f2064a;
        bVar.E = true;
        if (bVar.D != colorFilter) {
            bVar.D = colorFilter;
            Drawable drawable = this.f2066c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        b bVar = this.f2064a;
        if (bVar.x != z) {
            bVar.x = z;
            Drawable drawable = this.f2066c;
            if (drawable != null) {
                drawable.setDither(bVar.x);
            }
        }
    }

    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f2066c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, f2, f3);
        }
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f2065b;
        if (rect == null) {
            this.f2065b = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f2066c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, i2, i3, i4, i5);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        b bVar = this.f2064a;
        bVar.H = true;
        if (bVar.F != colorStateList) {
            bVar.F = colorStateList;
            androidx.core.graphics.drawable.a.a(this.f2066c, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f2064a;
        bVar.I = true;
        if (bVar.G != mode) {
            bVar.G = mode;
            androidx.core.graphics.drawable.a.a(this.f2066c, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f2067d;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f2066c;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f2066c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
