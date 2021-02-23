package com.google.android.material.picker;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.GridView;
import android.widget.ListAdapter;

final class MaterialCalendarGridView extends GridView {
    public MaterialCalendarGridView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public d getAdapter() {
        return (d) super.getAdapter();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getAdapter().f14136c.a(canvas, this);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof d) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), d.class.getCanonicalName()}));
        }
    }
}
