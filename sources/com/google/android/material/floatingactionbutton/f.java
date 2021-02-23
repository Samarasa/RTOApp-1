package com.google.android.material.floatingactionbutton;

import android.util.Property;
import android.view.View;

class f extends Property<View, Float> {
    f(Class cls, String str) {
        super(cls, str);
    }

    /* renamed from: a */
    public Float get(View view) {
        return Float.valueOf((float) view.getLayoutParams().width);
    }

    /* renamed from: a */
    public void set(View view, Float f2) {
        view.getLayoutParams().width = f2.intValue();
        view.requestLayout();
    }
}
