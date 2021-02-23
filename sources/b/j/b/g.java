package b.j.b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import b.h.j.y;
import java.util.Arrays;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final Interpolator f2616a = new e();

    /* renamed from: b  reason: collision with root package name */
    private int f2617b;

    /* renamed from: c  reason: collision with root package name */
    private int f2618c;

    /* renamed from: d  reason: collision with root package name */
    private int f2619d = -1;

    /* renamed from: e  reason: collision with root package name */
    private float[] f2620e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f2621f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f2622g;

    /* renamed from: h  reason: collision with root package name */
    private float[] f2623h;
    private int[] i;
    private int[] j;
    private int[] k;
    private int l;
    private VelocityTracker m;
    private float n;
    private float o;
    private int p;
    private int q;
    private OverScroller r;
    private final a s;
    private View t;
    private boolean u;
    private final ViewGroup v;
    private final Runnable w = new f(this);

    public static abstract class a {
        public int a(int i) {
            return i;
        }

        public int a(View view) {
            return 0;
        }

        public abstract int a(View view, int i, int i2);

        public void a(int i, int i2) {
        }

        public abstract void a(View view, float f2, float f3);

        public void a(View view, int i) {
        }

        public abstract void a(View view, int i, int i2, int i3, int i4);

        public int b(View view) {
            return 0;
        }

        public abstract int b(View view, int i, int i2);

        public void b(int i, int i2) {
        }

        public boolean b(int i) {
            return false;
        }

        public abstract boolean b(View view, int i);

        public abstract void c(int i);
    }

    private g(Context context, ViewGroup viewGroup, a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar != null) {
            this.v = viewGroup;
            this.s = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.p = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f2618c = viewConfiguration.getScaledTouchSlop();
            this.n = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.o = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.r = new OverScroller(context, f2616a);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    private float a(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        return abs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    private int a(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        return abs > i4 ? i2 > 0 ? i4 : -i4 : i2;
    }

    private int a(View view, int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int a2 = a(i4, (int) this.o, (int) this.n);
        int a3 = a(i5, (int) this.o, (int) this.n);
        int abs = Math.abs(i2);
        int abs2 = Math.abs(i3);
        int abs3 = Math.abs(a2);
        int abs4 = Math.abs(a3);
        int i6 = abs3 + abs4;
        int i7 = abs + abs2;
        if (a2 != 0) {
            f3 = (float) abs3;
            f2 = (float) i6;
        } else {
            f3 = (float) abs;
            f2 = (float) i7;
        }
        float f6 = f3 / f2;
        if (a3 != 0) {
            f5 = (float) abs4;
            f4 = (float) i6;
        } else {
            f5 = (float) abs2;
            f4 = (float) i7;
        }
        float f7 = f5 / f4;
        return (int) ((((float) b(i2, a2, this.s.a(view))) * f6) + (((float) b(i3, a3, this.s.b(view))) * f7));
    }

    public static g a(ViewGroup viewGroup, float f2, a aVar) {
        g a2 = a(viewGroup, aVar);
        a2.f2618c = (int) (((float) a2.f2618c) * (1.0f / f2));
        return a2;
    }

    public static g a(ViewGroup viewGroup, a aVar) {
        return new g(viewGroup.getContext(), viewGroup, aVar);
    }

    private void a(float f2, float f3) {
        this.u = true;
        this.s.a(this.t, f2, f3);
        this.u = false;
        if (this.f2617b == 1) {
            c(0);
        }
    }

    private void a(float f2, float f3, int i2) {
        int i3 = 1;
        if (!a(f2, f3, i2, 1)) {
            i3 = 0;
        }
        if (a(f3, f2, i2, 4)) {
            i3 |= 4;
        }
        if (a(f2, f3, i2, 2)) {
            i3 |= 2;
        }
        if (a(f3, f2, i2, 8)) {
            i3 |= 8;
        }
        if (i3 != 0) {
            int[] iArr = this.j;
            iArr[i2] = iArr[i2] | i3;
            this.s.a(i3, i2);
        }
    }

    private void a(int i2, int i3, int i4, int i5) {
        int left = this.t.getLeft();
        int top = this.t.getTop();
        if (i4 != 0) {
            i2 = this.s.a(this.t, i2, i4);
            y.b(this.t, i2 - left);
        }
        int i6 = i2;
        if (i5 != 0) {
            i3 = this.s.b(this.t, i3, i5);
            y.c(this.t, i3 - top);
        }
        int i7 = i3;
        if (i4 != 0 || i5 != 0) {
            this.s.a(this.t, i6, i7, i6 - left, i7 - top);
        }
    }

    private boolean a(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.i[i2] & i3) != i3 || (this.q & i3) == 0 || (this.k[i2] & i3) == i3 || (this.j[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.f2618c;
        if (abs <= ((float) i4) && abs2 <= ((float) i4)) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.s.b(i3)) {
            return (this.j[i2] & i3) == 0 && abs > ((float) this.f2618c);
        }
        int[] iArr = this.k;
        iArr[i2] = iArr[i2] | i3;
        return false;
    }

    private boolean a(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.s.a(view) > 0;
        boolean z2 = this.s.b(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.f2618c) : z2 && Math.abs(f3) > ((float) this.f2618c);
        }
        int i2 = this.f2618c;
        return (f2 * f2) + (f3 * f3) > ((float) (i2 * i2));
    }

    private float b(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    private int b(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        int width = this.v.getWidth();
        float f2 = (float) (width / 2);
        float b2 = f2 + (b(Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width))) * f2);
        int abs = Math.abs(i3);
        return Math.min(abs > 0 ? Math.round(Math.abs(b2 / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f), 600);
    }

    private void b(float f2, float f3, int i2) {
        f(i2);
        float[] fArr = this.f2620e;
        this.f2622g[i2] = f2;
        fArr[i2] = f2;
        float[] fArr2 = this.f2621f;
        this.f2623h[i2] = f3;
        fArr2[i2] = f3;
        this.i[i2] = e((int) f2, (int) f3);
        this.l |= 1 << i2;
    }

    private boolean b(int i2, int i3, int i4, int i5) {
        int left = this.t.getLeft();
        int top = this.t.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.r.abortAnimation();
            c(0);
            return false;
        }
        this.r.startScroll(left, top, i6, i7, a(this.t, i6, i7, i4, i5));
        c(2);
        return true;
    }

    private void c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (g(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f2622g[pointerId] = x;
                this.f2623h[pointerId] = y;
            }
        }
    }

    private int e(int i2, int i3) {
        int i4 = i2 < this.v.getLeft() + this.p ? 1 : 0;
        if (i3 < this.v.getTop() + this.p) {
            i4 |= 4;
        }
        if (i2 > this.v.getRight() - this.p) {
            i4 |= 2;
        }
        return i3 > this.v.getBottom() - this.p ? i4 | 8 : i4;
    }

    private void e(int i2) {
        if (this.f2620e != null && b(i2)) {
            this.f2620e[i2] = 0.0f;
            this.f2621f[i2] = 0.0f;
            this.f2622g[i2] = 0.0f;
            this.f2623h[i2] = 0.0f;
            this.i[i2] = 0;
            this.j[i2] = 0;
            this.k[i2] = 0;
            this.l = ((1 << i2) ^ -1) & this.l;
        }
    }

    private void f() {
        float[] fArr = this.f2620e;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f2621f, 0.0f);
            Arrays.fill(this.f2622g, 0.0f);
            Arrays.fill(this.f2623h, 0.0f);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            Arrays.fill(this.k, 0);
            this.l = 0;
        }
    }

    private void f(int i2) {
        float[] fArr = this.f2620e;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            float[] fArr6 = this.f2620e;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f2621f;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f2622g;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f2623h;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.i;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.j;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.k;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f2620e = fArr2;
            this.f2621f = fArr3;
            this.f2622g = fArr4;
            this.f2623h = fArr5;
            this.i = iArr;
            this.j = iArr2;
            this.k = iArr3;
        }
    }

    private void g() {
        this.m.computeCurrentVelocity(1000, this.n);
        a(a(this.m.getXVelocity(this.f2619d), this.o, this.n), a(this.m.getYVelocity(this.f2619d), this.o, this.n));
    }

    private boolean g(int i2) {
        if (b(i2)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public void a() {
        this.f2619d = -1;
        f();
        VelocityTracker velocityTracker = this.m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.m = null;
        }
    }

    public void a(float f2) {
        this.o = f2;
    }

    public void a(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.m == null) {
            this.m = VelocityTracker.obtain();
        }
        this.m.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f2617b != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i3 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i3);
                            if (g(pointerId)) {
                                float x = motionEvent.getX(i3);
                                float y = motionEvent.getY(i3);
                                float f2 = x - this.f2620e[pointerId];
                                float f3 = y - this.f2621f[pointerId];
                                a(f2, f3, pointerId);
                                if (this.f2617b != 1) {
                                    View b2 = b((int) x, (int) y);
                                    if (a(b2, f2, f3) && b(b2, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i3++;
                        }
                    } else if (g(this.f2619d)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f2619d);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f2622g;
                        int i4 = this.f2619d;
                        int i5 = (int) (x2 - fArr[i4]);
                        int i6 = (int) (y2 - this.f2623h[i4]);
                        a(this.t.getLeft() + i5, this.t.getTop() + i6, i5, i6);
                    } else {
                        return;
                    }
                    c(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x3 = motionEvent.getX(actionIndex);
                        float y3 = motionEvent.getY(actionIndex);
                        b(x3, y3, pointerId2);
                        if (this.f2617b == 0) {
                            b(b((int) x3, (int) y3), pointerId2);
                            int i7 = this.i[pointerId2];
                            int i8 = this.q;
                            if ((i7 & i8) != 0) {
                                this.s.b(i7 & i8, pointerId2);
                                return;
                            }
                            return;
                        } else if (c((int) x3, (int) y3)) {
                            b(this.t, pointerId2);
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.f2617b == 1 && pointerId3 == this.f2619d) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i3 >= pointerCount2) {
                                    i2 = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i3);
                                if (pointerId4 != this.f2619d) {
                                    View b3 = b((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                                    View view = this.t;
                                    if (b3 == view && b(view, pointerId4)) {
                                        i2 = this.f2619d;
                                        break;
                                    }
                                }
                                i3++;
                            }
                            if (i2 == -1) {
                                g();
                            }
                        }
                        e(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.f2617b == 1) {
                    a(0.0f, 0.0f);
                }
            } else if (this.f2617b == 1) {
                g();
            }
            a();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View b4 = b((int) x4, (int) y4);
        b(x4, y4, pointerId5);
        b(b4, pointerId5);
        int i9 = this.i[pointerId5];
        int i10 = this.q;
        if ((i9 & i10) != 0) {
            this.s.b(i9 & i10, pointerId5);
        }
    }

    public void a(View view, int i2) {
        if (view.getParent() == this.v) {
            this.t = view;
            this.f2619d = i2;
            this.s.a(view, i2);
            c(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.v + ")");
    }

    public boolean a(int i2) {
        int length = this.f2620e.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (a(i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public boolean a(int i2, int i3) {
        if (!b(i3)) {
            return false;
        }
        boolean z = (i2 & 1) == 1;
        boolean z2 = (i2 & 2) == 2;
        float f2 = this.f2622g[i3] - this.f2620e[i3];
        float f3 = this.f2623h[i3] - this.f2621f[i3];
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.f2618c) : z2 && Math.abs(f3) > ((float) this.f2618c);
        }
        int i4 = this.f2618c;
        return (f2 * f2) + (f3 * f3) > ((float) (i4 * i4));
    }

    public boolean a(View view, int i2, int i3) {
        return view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom();
    }

    public boolean a(boolean z) {
        if (this.f2617b == 2) {
            boolean computeScrollOffset = this.r.computeScrollOffset();
            int currX = this.r.getCurrX();
            int currY = this.r.getCurrY();
            int left = currX - this.t.getLeft();
            int top = currY - this.t.getTop();
            if (left != 0) {
                y.b(this.t, left);
            }
            if (top != 0) {
                y.c(this.t, top);
            }
            if (!(left == 0 && top == 0)) {
                this.s.a(this.t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.r.getFinalX() && currY == this.r.getFinalY()) {
                this.r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.v.post(this.w);
                } else {
                    c(0);
                }
            }
        }
        return this.f2617b == 2;
    }

    public View b() {
        return this.t;
    }

    public View b(int i2, int i3) {
        for (int childCount = this.v.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.v;
            this.s.a(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public boolean b(int i2) {
        return ((1 << i2) & this.l) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.m
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.m = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.m
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.e(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.b((float) r7, (float) r1, (int) r2)
            int r3 = r0.f2617b
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.i
            r1 = r1[r2]
            int r3 = r0.q
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            b.j.b.g$a r4 = r0.s
            r1 = r1 & r3
            r4.b((int) r1, (int) r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.b((int) r3, (int) r1)
            android.view.View r3 = r0.t
            if (r1 != r3) goto L_0x0031
            r0.b((android.view.View) r1, (int) r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f2620e
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f2621f
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.g(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f2620e
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f2621f
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.b((int) r7, (int) r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.a((android.view.View) r7, (float) r9, (float) r10)
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            b.j.b.g$a r14 = r0.s
            int r12 = r14.a((android.view.View) r7, (int) r13, (int) r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            b.j.b.g$a r5 = r0.s
            int r5 = r5.b(r7, r15, r14)
            b.j.b.g$a r14 = r0.s
            int r14 = r14.a((android.view.View) r7)
            b.j.b.g$a r15 = r0.s
            int r15 = r15.b((android.view.View) r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.a((float) r9, (float) r10, (int) r4)
            int r5 = r0.f2617b
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.b((android.view.View) r7, (int) r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.c((android.view.MotionEvent) r17)
            goto L_0x0031
        L_0x00ff:
            r16.a()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.b((float) r2, (float) r3, (int) r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.b((int) r2, (int) r3)
            android.view.View r3 = r0.t
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f2617b
            if (r3 != r4) goto L_0x0125
            r0.b((android.view.View) r2, (int) r1)
        L_0x0125:
            int[] r2 = r0.i
            r2 = r2[r1]
            int r3 = r0.q
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            b.j.b.g$a r4 = r0.s
            r2 = r2 & r3
            r4.b((int) r2, (int) r1)
        L_0x0135:
            int r1 = r0.f2617b
            if (r1 != r6) goto L_0x013a
            r5 = 1
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.b.g.b(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean b(View view, int i2) {
        if (view == this.t && this.f2619d == i2) {
            return true;
        }
        if (view == null || !this.s.b(view, i2)) {
            return false;
        }
        this.f2619d = i2;
        a(view, i2);
        return true;
    }

    public boolean b(View view, int i2, int i3) {
        this.t = view;
        this.f2619d = -1;
        boolean b2 = b(i2, i3, 0, 0);
        if (!b2 && this.f2617b == 0 && this.t != null) {
            this.t = null;
        }
        return b2;
    }

    public int c() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public void c(int i2) {
        this.v.removeCallbacks(this.w);
        if (this.f2617b != i2) {
            this.f2617b = i2;
            this.s.c(i2);
            if (this.f2617b == 0) {
                this.t = null;
            }
        }
    }

    public boolean c(int i2, int i3) {
        return a(this.t, i2, i3);
    }

    public int d() {
        return this.f2618c;
    }

    public void d(int i2) {
        this.q = i2;
    }

    public boolean d(int i2, int i3) {
        if (this.u) {
            return b(i2, i3, (int) this.m.getXVelocity(this.f2619d), (int) this.m.getYVelocity(this.f2619d));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public int e() {
        return this.f2617b;
    }
}
