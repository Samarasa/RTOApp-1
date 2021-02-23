package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class x extends ImageButton {

    /* renamed from: a  reason: collision with root package name */
    private int f14119a;

    public x(Context context) {
        this(context, (AttributeSet) null);
    }

    public x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public x(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14119a = getVisibility();
    }

    public final void a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f14119a = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f14119a;
    }

    public void setVisibility(int i) {
        a(i, true);
    }
}
