package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import b.a.j;
import b.h.j.y;

/* renamed from: androidx.appcompat.widget.k  reason: case insensitive filesystem */
class C0130k {

    /* renamed from: a  reason: collision with root package name */
    private final View f666a;

    /* renamed from: b  reason: collision with root package name */
    private final C0142q f667b;

    /* renamed from: c  reason: collision with root package name */
    private int f668c = -1;

    /* renamed from: d  reason: collision with root package name */
    private ya f669d;

    /* renamed from: e  reason: collision with root package name */
    private ya f670e;

    /* renamed from: f  reason: collision with root package name */
    private ya f671f;

    C0130k(View view) {
        this.f666a = view;
        this.f667b = C0142q.b();
    }

    private boolean b(Drawable drawable) {
        if (this.f671f == null) {
            this.f671f = new ya();
        }
        ya yaVar = this.f671f;
        yaVar.a();
        ColorStateList e2 = y.e(this.f666a);
        if (e2 != null) {
            yaVar.f742d = true;
            yaVar.f739a = e2;
        }
        PorterDuff.Mode f2 = y.f(this.f666a);
        if (f2 != null) {
            yaVar.f741c = true;
            yaVar.f740b = f2;
        }
        if (!yaVar.f742d && !yaVar.f741c) {
            return false;
        }
        C0142q.a(drawable, yaVar, this.f666a.getDrawableState());
        return true;
    }

    private boolean d() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f669d != null : i == 21;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable background = this.f666a.getBackground();
        if (background == null) {
            return;
        }
        if (!d() || !b(background)) {
            ya yaVar = this.f670e;
            if (yaVar != null) {
                C0142q.a(background, yaVar, this.f666a.getDrawableState());
                return;
            }
            ya yaVar2 = this.f669d;
            if (yaVar2 != null) {
                C0142q.a(background, yaVar2, this.f666a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i) {
        this.f668c = i;
        C0142q qVar = this.f667b;
        a(qVar != null ? qVar.b(this.f666a.getContext(), i) : null);
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f669d == null) {
                this.f669d = new ya();
            }
            ya yaVar = this.f669d;
            yaVar.f739a = colorStateList;
            yaVar.f742d = true;
        } else {
            this.f669d = null;
        }
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        if (this.f670e == null) {
            this.f670e = new ya();
        }
        ya yaVar = this.f670e;
        yaVar.f740b = mode;
        yaVar.f741c = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(Drawable drawable) {
        this.f668c = -1;
        a((ColorStateList) null);
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(AttributeSet attributeSet, int i) {
        Aa a2 = Aa.a(this.f666a.getContext(), attributeSet, j.ViewBackgroundHelper, i, 0);
        try {
            if (a2.g(j.ViewBackgroundHelper_android_background)) {
                this.f668c = a2.g(j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b2 = this.f667b.b(this.f666a.getContext(), this.f668c);
                if (b2 != null) {
                    a(b2);
                }
            }
            if (a2.g(j.ViewBackgroundHelper_backgroundTint)) {
                y.a(this.f666a, a2.a(j.ViewBackgroundHelper_backgroundTint));
            }
            if (a2.g(j.ViewBackgroundHelper_backgroundTintMode)) {
                y.a(this.f666a, T.a(a2.d(j.ViewBackgroundHelper_backgroundTintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            a2.a();
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        ya yaVar = this.f670e;
        if (yaVar != null) {
            return yaVar.f739a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void b(ColorStateList colorStateList) {
        if (this.f670e == null) {
            this.f670e = new ya();
        }
        ya yaVar = this.f670e;
        yaVar.f739a = colorStateList;
        yaVar.f742d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        ya yaVar = this.f670e;
        if (yaVar != null) {
            return yaVar.f740b;
        }
        return null;
    }
}
