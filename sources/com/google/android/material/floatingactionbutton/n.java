package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import b.h.j.y;
import c.b.b.c.o.h;
import com.google.android.material.internal.s;
import java.util.ArrayList;
import java.util.Iterator;

class n {

    /* renamed from: a  reason: collision with root package name */
    static final TimeInterpolator f14043a = c.b.b.c.a.a.f4751c;

    /* renamed from: b  reason: collision with root package name */
    static final int[] f14044b = {16842919, 16842910};

    /* renamed from: c  reason: collision with root package name */
    static final int[] f14045c = {16843623, 16842908, 16842910};

    /* renamed from: d  reason: collision with root package name */
    static final int[] f14046d = {16842908, 16842910};

    /* renamed from: e  reason: collision with root package name */
    static final int[] f14047e = {16843623, 16842910};

    /* renamed from: f  reason: collision with root package name */
    static final int[] f14048f = {16842910};

    /* renamed from: g  reason: collision with root package name */
    static final int[] f14049g = new int[0];
    private int A;
    /* access modifiers changed from: private */
    public int B = 0;
    private ArrayList<Animator.AnimatorListener> C;
    private ArrayList<Animator.AnimatorListener> D;
    private ArrayList<d> E;
    final FloatingActionButton F;
    final c.b.b.c.n.b G;
    private final Rect H = new Rect();
    private final RectF I = new RectF();
    private final RectF J = new RectF();
    private final Matrix K = new Matrix();
    private ViewTreeObserver.OnPreDrawListener L;

    /* renamed from: h  reason: collision with root package name */
    h f14050h;
    c.b.b.c.o.e i;
    Drawable j;
    b k;
    Drawable l;
    boolean m;
    boolean n;
    float o;
    float p;
    float q;
    int r;
    private final s s;
    private c.b.b.c.a.h t;
    private c.b.b.c.a.h u;
    /* access modifiers changed from: private */
    public Animator v;
    private c.b.b.c.a.h w;
    private c.b.b.c.a.h x;
    private float y;
    /* access modifiers changed from: private */
    public float z = 1.0f;

    private class a extends g {
        a() {
            super(n.this, (j) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            return 0.0f;
        }
    }

    private class b extends g {
        b() {
            super(n.this, (j) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            n nVar = n.this;
            return nVar.o + nVar.p;
        }
    }

    private class c extends g {
        c() {
            super(n.this, (j) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            n nVar = n.this;
            return nVar.o + nVar.q;
        }
    }

    interface d {
        void a();

        void b();
    }

    interface e {
        void a();

        void b();
    }

    private class f extends g {
        f() {
            super(n.this, (j) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            return n.this.o;
        }
    }

    private abstract class g extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f14055a;

        /* renamed from: b  reason: collision with root package name */
        private float f14056b;

        /* renamed from: c  reason: collision with root package name */
        private float f14057c;

        private g() {
        }

        /* synthetic */ g(n nVar, j jVar) {
            this();
        }

        /* access modifiers changed from: protected */
        public abstract float a();

        public void onAnimationEnd(Animator animator) {
            n.this.e((float) ((int) this.f14057c));
            this.f14055a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f14055a) {
                c.b.b.c.o.e eVar = n.this.i;
                this.f14056b = eVar == null ? 0.0f : eVar.d();
                this.f14057c = a();
                this.f14055a = true;
            }
            n nVar = n.this;
            float f2 = this.f14056b;
            nVar.e((float) ((int) (f2 + ((this.f14057c - f2) * valueAnimator.getAnimatedFraction()))));
        }
    }

    n(FloatingActionButton floatingActionButton, c.b.b.c.n.b bVar) {
        this.F = floatingActionButton;
        this.G = bVar;
        this.s = new s();
        this.s.a(f14044b, a((g) new c()));
        this.s.a(f14045c, a((g) new b()));
        this.s.a(f14046d, a((g) new b()));
        this.s.a(f14047e, a((g) new b()));
        this.s.a(f14048f, a((g) new f()));
        this.s.a(f14049g, a((g) new a()));
        this.y = this.F.getRotation();
    }

    private c.b.b.c.a.h A() {
        if (this.t == null) {
            this.t = c.b.b.c.a.h.a(this.F.getContext(), c.b.b.c.a.design_fab_show_motion_spec);
        }
        c.b.b.c.a.h hVar = this.t;
        b.h.i.g.a(hVar);
        return hVar;
    }

    private ViewTreeObserver.OnPreDrawListener B() {
        if (this.L == null) {
            this.L = new m(this);
        }
        return this.L;
    }

    private boolean C() {
        return y.A(this.F) && !this.F.isInEditMode();
    }

    private AnimatorSet a(c.b.b.c.a.h hVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.F, View.ALPHA, new float[]{f2});
        hVar.b("opacity").a((Animator) ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.F, View.SCALE_X, new float[]{f3});
        hVar.b("scale").a((Animator) ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.F, View.SCALE_Y, new float[]{f3});
        hVar.b("scale").a((Animator) ofFloat3);
        arrayList.add(ofFloat3);
        a(f4, this.K);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.F, new c.b.b.c.a.f(), new l(this), new Matrix[]{new Matrix(this.K)});
        hVar.b("iconScale").a((Animator) ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        c.b.b.c.a.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private ValueAnimator a(g gVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f14043a);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(gVar);
        valueAnimator.addUpdateListener(gVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    private void a(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.F.getDrawable();
        if (drawable != null && this.A != 0) {
            RectF rectF = this.I;
            RectF rectF2 = this.J;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i2 = this.A;
            rectF2.set(0.0f, 0.0f, (float) i2, (float) i2);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i3 = this.A;
            matrix.postScale(f2, f2, ((float) i3) / 2.0f, ((float) i3) / 2.0f);
        }
    }

    private c.b.b.c.a.h z() {
        if (this.u == null) {
            this.u = c.b.b.c.a.h.a(this.F.getContext(), c.b.b.c.a.design_fab_hide_motion_spec);
        }
        c.b.b.c.a.h hVar = this.u;
        b.h.i.g.a(hVar);
        return hVar;
    }

    /* access modifiers changed from: package-private */
    public c.b.b.c.o.e a() {
        h hVar = this.f14050h;
        b.h.i.g.a(hVar);
        h hVar2 = hVar;
        if (this.m) {
            hVar2.a(((float) this.F.getSizeDimension()) / 2.0f);
        }
        return new c.b.b.c.o.e(hVar2);
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2) {
        if (this.o != f2) {
            this.o = f2;
            a(this.o, this.p, this.q);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(float f2, float f3, float f4) {
        x();
        e(f2);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (this.A != i2) {
            this.A = i2;
            w();
        }
    }

    public void a(Animator.AnimatorListener animatorListener) {
        if (this.D == null) {
            this.D = new ArrayList<>();
        }
        this.D.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        c.b.b.c.o.e eVar = this.i;
        if (eVar != null) {
            eVar.setTintList(colorStateList);
        }
        b bVar = this.k;
        if (bVar != null) {
            bVar.a(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        this.i = a();
        this.i.setTintList(colorStateList);
        if (mode != null) {
            this.i.setTintMode(mode);
        }
        this.i.a(-12303292);
        this.i.a(this.F.getContext());
        c.b.b.c.o.e a2 = a();
        a2.setTintList(c.b.b.c.m.a.a(colorStateList2));
        this.j = a2;
        c.b.b.c.o.e eVar = this.i;
        b.h.i.g.a(eVar);
        this.l = new LayerDrawable(new Drawable[]{eVar, a2});
    }

    /* access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        c.b.b.c.o.e eVar = this.i;
        if (eVar != null) {
            eVar.setTintMode(mode);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Rect rect) {
        int sizeDimension = this.n ? (this.r - this.F.getSizeDimension()) / 2 : 0;
        float c2 = c() + this.q;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) c2));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (c2 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* access modifiers changed from: package-private */
    public final void a(c.b.b.c.a.h hVar) {
        this.x = hVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(h hVar, boolean z2) {
        if (z2) {
            hVar.a((float) (this.F.getSizeDimension() / 2));
        }
        this.f14050h = hVar;
        this.m = z2;
        c.b.b.c.o.e eVar = this.i;
        if (eVar != null) {
            eVar.a(hVar);
        }
        Drawable drawable = this.j;
        if (drawable instanceof c.b.b.c.o.e) {
            ((c.b.b.c.o.e) drawable).a(hVar);
        }
        b bVar = this.k;
        if (bVar != null) {
            bVar.a(hVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(d dVar) {
        if (this.E == null) {
            this.E = new ArrayList<>();
        }
        this.E.add(dVar);
    }

    /* access modifiers changed from: package-private */
    public void a(e eVar, boolean z2) {
        if (!j()) {
            Animator animator = this.v;
            if (animator != null) {
                animator.cancel();
            }
            if (C()) {
                c.b.b.c.a.h hVar = this.x;
                if (hVar == null) {
                    hVar = z();
                }
                AnimatorSet a2 = a(hVar, 0.0f, 0.0f, 0.0f);
                a2.addListener(new j(this, z2, eVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.D;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a2.addListener(it.next());
                    }
                }
                a2.start();
                return;
            }
            this.F.a(z2 ? 8 : 4, z2);
            if (eVar != null) {
                eVar.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z2) {
        this.n = z2;
    }

    /* access modifiers changed from: package-private */
    public void a(int[] iArr) {
        this.s.a(iArr);
    }

    /* access modifiers changed from: package-private */
    public final Drawable b() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public final void b(float f2) {
        if (this.p != f2) {
            this.p = f2;
            a(this.o, this.p, this.q);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        this.r = i2;
    }

    /* access modifiers changed from: package-private */
    public void b(Animator.AnimatorListener animatorListener) {
        if (this.C == null) {
            this.C = new ArrayList<>();
        }
        this.C.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    public void b(ColorStateList colorStateList) {
        Drawable drawable = this.j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, c.b.b.c.m.a.a(colorStateList));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.graphics.drawable.InsetDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.graphics.drawable.InsetDrawable} */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.graphics.Rect r8) {
        /*
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.l
            java.lang.String r1 = "Didn't initialize content background"
            b.h.i.g.a(r0, r1)
            boolean r0 = r7.t()
            if (r0 == 0) goto L_0x0020
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            android.graphics.drawable.Drawable r2 = r7.l
            int r3 = r8.left
            int r4 = r8.top
            int r5 = r8.right
            int r6 = r8.bottom
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            c.b.b.c.n.b r8 = r7.G
            goto L_0x0024
        L_0x0020:
            c.b.b.c.n.b r8 = r7.G
            android.graphics.drawable.Drawable r0 = r7.l
        L_0x0024:
            r8.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.n.b(android.graphics.Rect):void");
    }

    /* access modifiers changed from: package-private */
    public final void b(c.b.b.c.a.h hVar) {
        this.w = hVar;
    }

    /* access modifiers changed from: package-private */
    public void b(e eVar, boolean z2) {
        if (!k()) {
            Animator animator = this.v;
            if (animator != null) {
                animator.cancel();
            }
            if (C()) {
                if (this.F.getVisibility() != 0) {
                    this.F.setAlpha(0.0f);
                    this.F.setScaleY(0.0f);
                    this.F.setScaleX(0.0f);
                    c(0.0f);
                }
                c.b.b.c.a.h hVar = this.w;
                if (hVar == null) {
                    hVar = A();
                }
                AnimatorSet a2 = a(hVar, 1.0f, 1.0f, 1.0f);
                a2.addListener(new k(this, z2, eVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.C;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a2.addListener(it.next());
                    }
                }
                a2.start();
                return;
            }
            this.F.a(0, z2);
            this.F.setAlpha(1.0f);
            this.F.setScaleY(1.0f);
            this.F.setScaleX(1.0f);
            c(1.0f);
            if (eVar != null) {
                eVar.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public final void c(float f2) {
        this.z = f2;
        Matrix matrix = this.K;
        a(f2, matrix);
        this.F.setImageMatrix(matrix);
    }

    /* access modifiers changed from: package-private */
    public final void d(float f2) {
        if (this.q != f2) {
            this.q = f2;
            a(this.o, this.p, this.q);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public final c.b.b.c.a.h e() {
        return this.x;
    }

    /* access modifiers changed from: package-private */
    public void e(float f2) {
        c.b.b.c.o.e eVar = this.i;
        if (eVar != null) {
            eVar.a(f2);
        }
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public float g() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public final h h() {
        return this.f14050h;
    }

    /* access modifiers changed from: package-private */
    public final c.b.b.c.a.h i() {
        return this.w;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return this.F.getVisibility() == 0 ? this.B == 1 : this.B != 2;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.F.getVisibility() != 0 ? this.B == 2 : this.B != 1;
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.s.a();
    }

    /* access modifiers changed from: package-private */
    public void m() {
        if (s()) {
            this.F.getViewTreeObserver().addOnPreDrawListener(B());
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
    }

    /* access modifiers changed from: package-private */
    public void o() {
        ViewTreeObserver viewTreeObserver = this.F.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.L;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.L = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        float rotation = this.F.getRotation();
        if (this.y != rotation) {
            this.y = rotation;
            v();
        }
    }

    /* access modifiers changed from: package-private */
    public void q() {
        ArrayList<d> arrayList = this.E;
        if (arrayList != null) {
            Iterator<d> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void r() {
        ArrayList<d> arrayList = this.E;
        if (arrayList != null) {
            Iterator<d> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean s() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean t() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean u() {
        return !this.n || this.F.getSizeDimension() >= this.r;
    }

    /* access modifiers changed from: package-private */
    public void v() {
        int i2;
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.y % 90.0f != 0.0f) {
                i2 = 1;
                if (this.F.getLayerType() != 1) {
                    floatingActionButton = this.F;
                }
            } else if (this.F.getLayerType() != 0) {
                floatingActionButton = this.F;
                i2 = 0;
            }
            floatingActionButton.setLayerType(i2, (Paint) null);
        }
        c.b.b.c.o.e eVar = this.i;
        if (eVar != null) {
            eVar.b((int) this.y);
        }
    }

    /* access modifiers changed from: package-private */
    public final void w() {
        c(this.z);
    }

    /* access modifiers changed from: package-private */
    public final void x() {
        Rect rect = this.H;
        a(rect);
        b(rect);
        this.G.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: package-private */
    public void y() {
        c.b.b.c.o.e eVar;
        if (this.m && (eVar = this.i) != null) {
            eVar.h().a(((float) this.F.getSizeDimension()) / 2.0f);
        }
    }
}
