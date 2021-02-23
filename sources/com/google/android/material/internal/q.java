package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import b.h.j.I;
import b.h.j.y;
import c.b.b.c.j;
import c.b.b.c.k;

public class q extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    Drawable f14098a;

    /* renamed from: b  reason: collision with root package name */
    Rect f14099b;

    /* renamed from: c  reason: collision with root package name */
    private Rect f14100c;

    public q(Context context) {
        this(context, (AttributeSet) null);
    }

    public q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14100c = new Rect();
        TypedArray a2 = v.a(context, attributeSet, k.ScrimInsetsFrameLayout, i, j.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f14098a = a2.getDrawable(k.ScrimInsetsFrameLayout_insetForeground);
        a2.recycle();
        setWillNotDraw(true);
        y.a((View) this, (b.h.j.q) new p(this));
    }

    /* access modifiers changed from: protected */
    public void a(I i) {
        throw null;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f14099b != null && this.f14098a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.f14100c.set(0, 0, width, this.f14099b.top);
            this.f14098a.setBounds(this.f14100c);
            this.f14098a.draw(canvas);
            this.f14100c.set(0, height - this.f14099b.bottom, width, height);
            this.f14098a.setBounds(this.f14100c);
            this.f14098a.draw(canvas);
            Rect rect = this.f14100c;
            Rect rect2 = this.f14099b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f14098a.setBounds(this.f14100c);
            this.f14098a.draw(canvas);
            Rect rect3 = this.f14100c;
            Rect rect4 = this.f14099b;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f14098a.setBounds(this.f14100c);
            this.f14098a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f14098a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f14098a;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }
}
