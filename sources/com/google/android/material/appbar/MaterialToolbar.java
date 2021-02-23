package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import b.h.j.y;
import c.b.b.c.b;
import c.b.b.c.j;
import c.b.b.c.o.e;
import com.google.android.material.internal.v;

public class MaterialToolbar extends Toolbar {
    private static final int P = j.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(v.a(context, attributeSet, i, P), attributeSet, i);
        a(getContext());
    }

    private void a(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            e eVar = new e();
            eVar.a(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            eVar.a(context);
            eVar.a(y.i(this));
            y.a((View) this, (Drawable) eVar);
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        if (getBackground() instanceof e) {
            ((e) getBackground()).a(f2);
        }
    }
}
