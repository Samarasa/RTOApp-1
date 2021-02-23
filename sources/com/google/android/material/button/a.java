package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import b.h.j.y;
import c.b.b.c.b;
import c.b.b.c.k;
import c.b.b.c.l.c;
import c.b.b.c.o.e;
import c.b.b.c.o.h;
import com.google.android.material.internal.w;

class a {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f13971a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b  reason: collision with root package name */
    private final MaterialButton f13972b;

    /* renamed from: c  reason: collision with root package name */
    private h f13973c;

    /* renamed from: d  reason: collision with root package name */
    private int f13974d;

    /* renamed from: e  reason: collision with root package name */
    private int f13975e;

    /* renamed from: f  reason: collision with root package name */
    private int f13976f;

    /* renamed from: g  reason: collision with root package name */
    private int f13977g;

    /* renamed from: h  reason: collision with root package name */
    private int f13978h;
    private int i;
    private PorterDuff.Mode j;
    private ColorStateList k;
    private ColorStateList l;
    private ColorStateList m;
    private e n;
    private boolean o = false;
    private boolean p = false;
    private boolean q = false;
    private boolean r;
    private LayerDrawable s;

    a(MaterialButton materialButton, h hVar) {
        this.f13972b = materialButton;
        this.f13973c = hVar;
    }

    private InsetDrawable a(Drawable drawable) {
        return new InsetDrawable(drawable, this.f13974d, this.f13976f, this.f13975e, this.f13977g);
    }

    private void a(h hVar, float f2) {
        hVar.g().a(hVar.g().a() + f2);
        hVar.h().a(hVar.h().a() + f2);
        hVar.c().a(hVar.c().a() + f2);
        hVar.b().a(hVar.b().a() + f2);
    }

    private void b(h hVar) {
        if (c() != null) {
            c().a(hVar);
        }
        if (n() != null) {
            n().a(hVar);
        }
        if (b() != null) {
            b().a(hVar);
        }
    }

    private e c(boolean z) {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (e) (f13971a ? (LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable() : this.s).getDrawable(z ^ true ? 1 : 0);
    }

    private Drawable m() {
        e eVar = new e(this.f13973c);
        eVar.a(this.f13972b.getContext());
        androidx.core.graphics.drawable.a.a((Drawable) eVar, this.k);
        PorterDuff.Mode mode = this.j;
        if (mode != null) {
            androidx.core.graphics.drawable.a.a((Drawable) eVar, mode);
        }
        eVar.a((float) this.i, this.l);
        e eVar2 = new e(this.f13973c);
        eVar2.setTint(0);
        eVar2.a((float) this.i, this.o ? c.b.b.c.f.a.a((View) this.f13972b, b.colorSurface) : 0);
        this.n = new e(this.f13973c);
        if (f13971a) {
            if (this.i > 0) {
                h hVar = new h(this.f13973c);
                a(hVar, ((float) this.i) / 2.0f);
                eVar.a(hVar);
                eVar2.a(hVar);
                this.n.a(hVar);
            }
            androidx.core.graphics.drawable.a.b(this.n, -1);
            this.s = new RippleDrawable(c.b.b.c.m.a.a(this.m), a((Drawable) new LayerDrawable(new Drawable[]{eVar2, eVar})), this.n);
            return this.s;
        }
        androidx.core.graphics.drawable.a.a((Drawable) this.n, c.b.b.c.m.a.a(this.m));
        this.s = new LayerDrawable(new Drawable[]{eVar2, eVar, this.n});
        return a((Drawable) this.s);
    }

    private e n() {
        return c(true);
    }

    private void o() {
        e c2 = c();
        e n2 = n();
        if (c2 != null) {
            c2.a((float) this.i, this.l);
            if (n2 != null) {
                n2.a((float) this.i, this.o ? c.b.b.c.f.a.a((View) this.f13972b, b.colorSurface) : 0);
            }
            if (f13971a) {
                h hVar = new h(this.f13973c);
                a(hVar, ((float) this.i) / 2.0f);
                b(hVar);
                e eVar = this.n;
                if (eVar != null) {
                    eVar.a(hVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f13978h;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        if (c() != null) {
            c().setTint(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3) {
        e eVar = this.n;
        if (eVar != null) {
            eVar.setBounds(this.f13974d, this.f13976f, i3 - this.f13975e, i2 - this.f13977g);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            if (f13971a && (this.f13972b.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f13972b.getBackground()).setColor(c.b.b.c.m.a.a(colorStateList));
            } else if (!f13971a && b() != null) {
                androidx.core.graphics.drawable.a.a((Drawable) b(), c.b.b.c.m.a.a(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(TypedArray typedArray) {
        this.f13974d = typedArray.getDimensionPixelOffset(k.MaterialButton_android_insetLeft, 0);
        this.f13975e = typedArray.getDimensionPixelOffset(k.MaterialButton_android_insetRight, 0);
        this.f13976f = typedArray.getDimensionPixelOffset(k.MaterialButton_android_insetTop, 0);
        this.f13977g = typedArray.getDimensionPixelOffset(k.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(k.MaterialButton_cornerRadius)) {
            this.f13978h = typedArray.getDimensionPixelSize(k.MaterialButton_cornerRadius, -1);
            this.f13973c.a((float) this.f13978h);
            this.q = true;
        }
        this.i = typedArray.getDimensionPixelSize(k.MaterialButton_strokeWidth, 0);
        this.j = w.a(typedArray.getInt(k.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.k = c.a(this.f13972b.getContext(), typedArray, k.MaterialButton_backgroundTint);
        this.l = c.a(this.f13972b.getContext(), typedArray, k.MaterialButton_strokeColor);
        this.m = c.a(this.f13972b.getContext(), typedArray, k.MaterialButton_rippleColor);
        this.r = typedArray.getBoolean(k.MaterialButton_android_checkable, false);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(k.MaterialButton_elevation, 0);
        int q2 = y.q(this.f13972b);
        int paddingTop = this.f13972b.getPaddingTop();
        int p2 = y.p(this.f13972b);
        int paddingBottom = this.f13972b.getPaddingBottom();
        this.f13972b.setInternalBackground(m());
        e c2 = c();
        if (c2 != null) {
            c2.a((float) dimensionPixelSize);
        }
        y.a(this.f13972b, q2 + this.f13974d, paddingTop + this.f13976f, p2 + this.f13975e, paddingBottom + this.f13977g);
    }

    /* access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        if (this.j != mode) {
            this.j = mode;
            if (c() != null && this.j != null) {
                androidx.core.graphics.drawable.a.a((Drawable) c(), this.j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(h hVar) {
        this.f13973c = hVar;
        b(hVar);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        this.r = z;
    }

    public e b() {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (e) (this.s.getNumberOfLayers() > 2 ? this.s.getDrawable(2) : this.s.getDrawable(1));
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        if (!this.q || this.f13978h != i2) {
            this.f13978h = i2;
            this.q = true;
            this.f13973c.a(((float) i2) + (((float) this.i) / 2.0f));
            b(this.f13973c);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            o();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z) {
        this.o = z;
        o();
    }

    /* access modifiers changed from: package-private */
    public e c() {
        return c(false);
    }

    /* access modifiers changed from: package-private */
    public void c(int i2) {
        if (this.i != i2) {
            this.i = i2;
            o();
        }
    }

    /* access modifiers changed from: package-private */
    public void c(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            if (c() != null) {
                androidx.core.graphics.drawable.a.a((Drawable) c(), this.k);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList d() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public h e() {
        return this.f13973c;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList f() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList h() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode i() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.p = true;
        this.f13972b.setSupportBackgroundTintList(this.k);
        this.f13972b.setSupportBackgroundTintMode(this.j);
    }
}
