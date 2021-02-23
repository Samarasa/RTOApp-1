package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.C0144t;
import b.a.a;
import b.h.j.C0195a;
import b.h.j.y;

public class CheckableImageButton extends C0144t implements Checkable {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f14060c = {16842912};

    /* renamed from: d  reason: collision with root package name */
    private boolean f14061d;

    public CheckableImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        y.a((View) this, (C0195a) new a(this));
    }

    public boolean isChecked() {
        return this.f14061d;
    }

    public int[] onCreateDrawableState(int i) {
        return this.f14061d ? ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + f14060c.length), f14060c) : super.onCreateDrawableState(i);
    }

    public void setChecked(boolean z) {
        if (this.f14061d != z) {
            this.f14061d = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void toggle() {
        setChecked(!this.f14061d);
    }
}
