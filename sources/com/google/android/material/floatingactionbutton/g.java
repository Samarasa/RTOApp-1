package com.google.android.material.floatingactionbutton;

import android.util.Property;
import android.view.View;

class g extends Property<View, Float> {
    g(Class cls, String str) {
        super(cls, str);
    }

    /* renamed from: a */
    public Float get(View view) {
        return Float.valueOf((float) view.getLayoutParams().height);
    }

    /* renamed from: a */
    public void set(View view, Float f2) {
        view.getLayoutParams().height = f2.intValue();
        view.requestLayout();
    }
}
