package com.google.android.material.floatingactionbutton;

import android.util.Property;
import android.view.View;

class h extends Property<View, Float> {
    h(Class cls, String str) {
        super(cls, str);
    }

    /* renamed from: a */
    public Float get(View view) {
        return Float.valueOf(((ExtendedFloatingActionButton) view).getShapeAppearanceModel().h().a());
    }

    /* renamed from: a */
    public void set(View view, Float f2) {
        ((ExtendedFloatingActionButton) view).getShapeAppearanceModel().a((float) f2.intValue());
    }
}
