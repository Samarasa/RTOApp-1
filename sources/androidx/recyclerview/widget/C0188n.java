package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import b.h.j.y;

/* renamed from: androidx.recyclerview.widget.n  reason: case insensitive filesystem */
class C0188n extends RecyclerView.h implements RecyclerView.m {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f1466a = {16842919};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f1467b = new int[0];
    private final int[] A = new int[2];
    final ValueAnimator B = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    int C = 0;
    private final Runnable D = new C0186l(this);
    private final RecyclerView.n E = new C0187m(this);

    /* renamed from: c  reason: collision with root package name */
    private final int f1468c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1469d;

    /* renamed from: e  reason: collision with root package name */
    final StateListDrawable f1470e;

    /* renamed from: f  reason: collision with root package name */
    final Drawable f1471f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1472g;

    /* renamed from: h  reason: collision with root package name */
    private final int f1473h;
    private final StateListDrawable i;
    private final Drawable j;
    private final int k;
    private final int l;
    int m;
    int n;
    float o;
    int p;
    int q;
    float r;
    private int s = 0;
    private int t = 0;
    private RecyclerView u;
    private boolean v = false;
    private boolean w = false;
    private int x = 0;
    private int y = 0;
    private final int[] z = new int[2];

    /* renamed from: androidx.recyclerview.widget.n$a */
    private class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1474a = false;

        a() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f1474a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f1474a) {
                this.f1474a = false;
            } else if (((Float) C0188n.this.B.getAnimatedValue()).floatValue() == 0.0f) {
                C0188n nVar = C0188n.this;
                nVar.C = 0;
                nVar.b(0);
            } else {
                C0188n nVar2 = C0188n.this;
                nVar2.C = 2;
                nVar2.a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$b */
    private class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0188n.this.f1470e.setAlpha(floatValue);
            C0188n.this.f1471f.setAlpha(floatValue);
            C0188n.this.a();
        }
    }

    C0188n(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        this.f1470e = stateListDrawable;
        this.f1471f = drawable;
        this.i = stateListDrawable2;
        this.j = drawable2;
        this.f1472g = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f1473h = Math.max(i2, drawable.getIntrinsicWidth());
        this.k = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.l = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f1468c = i3;
        this.f1469d = i4;
        this.f1470e.setAlpha(255);
        this.f1471f.setAlpha(255);
        this.B.addListener(new a());
        this.B.addUpdateListener(new b());
        a(recyclerView);
    }

    private int a(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / ((float) i5)) * ((float) i6));
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    private void a(float f2) {
        int[] e2 = e();
        float max = Math.max((float) e2[0], Math.min((float) e2[1], f2));
        if (Math.abs(((float) this.q) - max) >= 2.0f) {
            int a2 = a(this.r, max, e2, this.u.computeHorizontalScrollRange(), this.u.computeHorizontalScrollOffset(), this.s);
            if (a2 != 0) {
                this.u.scrollBy(a2, 0);
            }
            this.r = max;
        }
    }

    private void a(Canvas canvas) {
        int i2 = this.t;
        int i3 = this.k;
        int i4 = i2 - i3;
        int i5 = this.q;
        int i6 = this.p;
        int i7 = i5 - (i6 / 2);
        this.i.setBounds(0, 0, i6, i3);
        this.j.setBounds(0, 0, this.s, this.l);
        canvas.translate(0.0f, (float) i4);
        this.j.draw(canvas);
        canvas.translate((float) i7, 0.0f);
        this.i.draw(canvas);
        canvas.translate((float) (-i7), (float) (-i4));
    }

    private void b(float f2) {
        int[] f3 = f();
        float max = Math.max((float) f3[0], Math.min((float) f3[1], f2));
        if (Math.abs(((float) this.n) - max) >= 2.0f) {
            int a2 = a(this.o, max, f3, this.u.computeVerticalScrollRange(), this.u.computeVerticalScrollOffset(), this.t);
            if (a2 != 0) {
                this.u.scrollBy(0, a2);
            }
            this.o = max;
        }
    }

    private void b(Canvas canvas) {
        int i2 = this.s;
        int i3 = this.f1472g;
        int i4 = i2 - i3;
        int i5 = this.n;
        int i6 = this.m;
        int i7 = i5 - (i6 / 2);
        this.f1470e.setBounds(0, 0, i3, i6);
        this.f1471f.setBounds(0, 0, this.f1473h, this.t);
        if (g()) {
            this.f1471f.draw(canvas);
            canvas.translate((float) this.f1472g, (float) i7);
            canvas.scale(-1.0f, 1.0f);
            this.f1470e.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i4 = this.f1472g;
        } else {
            canvas.translate((float) i4, 0.0f);
            this.f1471f.draw(canvas);
            canvas.translate(0.0f, (float) i7);
            this.f1470e.draw(canvas);
        }
        canvas.translate((float) (-i4), (float) (-i7));
    }

    private void c() {
        this.u.removeCallbacks(this.D);
    }

    private void c(int i2) {
        c();
        this.u.postDelayed(this.D, (long) i2);
    }

    private void d() {
        this.u.b((RecyclerView.h) this);
        this.u.b((RecyclerView.m) this);
        this.u.b(this.E);
        c();
    }

    private int[] e() {
        int[] iArr = this.A;
        int i2 = this.f1469d;
        iArr[0] = i2;
        iArr[1] = this.s - i2;
        return iArr;
    }

    private int[] f() {
        int[] iArr = this.z;
        int i2 = this.f1469d;
        iArr[0] = i2;
        iArr[1] = this.t - i2;
        return iArr;
    }

    private boolean g() {
        return y.m(this.u) == 1;
    }

    private void h() {
        this.u.a((RecyclerView.h) this);
        this.u.a((RecyclerView.m) this);
        this.u.a(this.E);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.u.invalidate();
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        int i3 = this.C;
        if (i3 == 1) {
            this.B.cancel();
        } else if (i3 != 2) {
            return;
        }
        this.C = 3;
        ValueAnimator valueAnimator = this.B;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.B.setDuration((long) i2);
        this.B.start();
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3) {
        int computeVerticalScrollRange = this.u.computeVerticalScrollRange();
        int i4 = this.t;
        this.v = computeVerticalScrollRange - i4 > 0 && i4 >= this.f1468c;
        int computeHorizontalScrollRange = this.u.computeHorizontalScrollRange();
        int i5 = this.s;
        this.w = computeHorizontalScrollRange - i5 > 0 && i5 >= this.f1468c;
        if (this.v || this.w) {
            if (this.v) {
                float f2 = (float) i4;
                this.n = (int) ((f2 * (((float) i3) + (f2 / 2.0f))) / ((float) computeVerticalScrollRange));
                this.m = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
            }
            if (this.w) {
                float f3 = (float) i5;
                this.q = (int) ((f3 * (((float) i2) + (f3 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.p = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
            }
            int i6 = this.x;
            if (i6 == 0 || i6 == 1) {
                b(1);
            }
        } else if (this.x != 0) {
            b(0);
        }
    }

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.u;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                d();
            }
            this.u = recyclerView;
            if (this.u != null) {
                h();
            }
        }
    }

    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.x != 0) {
            if (motionEvent.getAction() == 0) {
                boolean b2 = b(motionEvent.getX(), motionEvent.getY());
                boolean a2 = a(motionEvent.getX(), motionEvent.getY());
                if (b2 || a2) {
                    if (a2) {
                        this.y = 1;
                        this.r = (float) ((int) motionEvent.getX());
                    } else if (b2) {
                        this.y = 2;
                        this.o = (float) ((int) motionEvent.getY());
                    }
                    b(2);
                }
            } else if (motionEvent.getAction() == 1 && this.x == 2) {
                this.o = 0.0f;
                this.r = 0.0f;
                b(1);
                this.y = 0;
            } else if (motionEvent.getAction() == 2 && this.x == 2) {
                b();
                if (this.y == 1) {
                    a(motionEvent.getX());
                }
                if (this.y == 2) {
                    b(motionEvent.getY());
                }
            }
        }
    }

    public void a(boolean z2) {
    }

    /* access modifiers changed from: package-private */
    public boolean a(float f2, float f3) {
        if (f3 >= ((float) (this.t - this.k))) {
            int i2 = this.q;
            int i3 = this.p;
            return f2 >= ((float) (i2 - (i3 / 2))) && f2 <= ((float) (i2 + (i3 / 2)));
        }
    }

    public void b() {
        int i2 = this.C;
        if (i2 != 0) {
            if (i2 == 3) {
                this.B.cancel();
            } else {
                return;
            }
        }
        this.C = 1;
        ValueAnimator valueAnimator = this.B;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.B.setDuration(500);
        this.B.setStartDelay(0);
        this.B.start();
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        int i3;
        if (i2 == 2 && this.x != 2) {
            this.f1470e.setState(f1466a);
            c();
        }
        if (i2 == 0) {
            a();
        } else {
            b();
        }
        if (this.x != 2 || i2 == 2) {
            if (i2 == 1) {
                i3 = 1500;
            }
            this.x = i2;
        }
        this.f1470e.setState(f1467b);
        i3 = 1200;
        c(i3);
        this.x = i2;
    }

    public void b(Canvas canvas, RecyclerView recyclerView, RecyclerView.u uVar) {
        if (this.s != this.u.getWidth() || this.t != this.u.getHeight()) {
            this.s = this.u.getWidth();
            this.t = this.u.getHeight();
            b(0);
        } else if (this.C != 0) {
            if (this.v) {
                b(canvas);
            }
            if (this.w) {
                a(canvas);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(float f2, float f3) {
        if (!g() ? f2 >= ((float) (this.s - this.f1472g)) : f2 <= ((float) (this.f1472g / 2))) {
            int i2 = this.n;
            int i3 = this.m;
            return f3 >= ((float) (i2 - (i3 / 2))) && f3 <= ((float) (i2 + (i3 / 2)));
        }
    }

    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i2 = this.x;
        if (i2 != 1) {
            return i2 == 2;
        }
        boolean b2 = b(motionEvent.getX(), motionEvent.getY());
        boolean a2 = a(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!b2 && !a2) {
            return false;
        }
        if (a2) {
            this.y = 1;
            this.r = (float) ((int) motionEvent.getX());
        } else if (b2) {
            this.y = 2;
            this.o = (float) ((int) motionEvent.getY());
        }
        b(2);
    }
}