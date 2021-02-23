package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.a;
import b.a.j;
import b.h.j.y;

class C extends C0149y {

    /* renamed from: d  reason: collision with root package name */
    private final SeekBar f422d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f423e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f424f = null;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f425g = null;

    /* renamed from: h  reason: collision with root package name */
    private boolean f426h = false;
    private boolean i = false;

    C(SeekBar seekBar) {
        super(seekBar);
        this.f422d = seekBar;
    }

    private void d() {
        if (this.f423e == null) {
            return;
        }
        if (this.f426h || this.i) {
            this.f423e = a.i(this.f423e.mutate());
            if (this.f426h) {
                a.a(this.f423e, this.f424f);
            }
            if (this.i) {
                a.a(this.f423e, this.f425g);
            }
            if (this.f423e.isStateful()) {
                this.f423e.setState(this.f422d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Canvas canvas) {
        if (this.f423e != null) {
            int max = this.f422d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f423e.getIntrinsicWidth();
                int intrinsicHeight = this.f423e.getIntrinsicHeight();
                int i3 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.f423e.setBounds(-i3, -i2, i3, i2);
                float width = ((float) ((this.f422d.getWidth() - this.f422d.getPaddingLeft()) - this.f422d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f422d.getPaddingLeft(), (float) (this.f422d.getHeight() / 2));
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f423e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Drawable drawable) {
        Drawable drawable2 = this.f423e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f423e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f422d);
            a.a(drawable, y.m(this.f422d));
            if (drawable.isStateful()) {
                drawable.setState(this.f422d.getDrawableState());
            }
            d();
        }
        this.f422d.invalidate();
    }

    /* access modifiers changed from: package-private */
    public void a(AttributeSet attributeSet, int i2) {
        super.a(attributeSet, i2);
        Aa a2 = Aa.a(this.f422d.getContext(), attributeSet, j.AppCompatSeekBar, i2, 0);
        Drawable c2 = a2.c(j.AppCompatSeekBar_android_thumb);
        if (c2 != null) {
            this.f422d.setThumb(c2);
        }
        a(a2.b(j.AppCompatSeekBar_tickMark));
        if (a2.g(j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f425g = T.a(a2.d(j.AppCompatSeekBar_tickMarkTintMode, -1), this.f425g);
            this.i = true;
        }
        if (a2.g(j.AppCompatSeekBar_tickMarkTint)) {
            this.f424f = a2.a(j.AppCompatSeekBar_tickMarkTint);
            this.f426h = true;
        }
        a2.a();
        d();
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Drawable drawable = this.f423e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f422d.getDrawableState())) {
            this.f422d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        Drawable drawable = this.f423e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
