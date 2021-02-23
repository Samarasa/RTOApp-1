package com.google.android.material.chip;

import android.graphics.Typeface;
import c.b.b.c.l.h;

class a extends h {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Chip f13992a;

    a(Chip chip) {
        this.f13992a = chip;
    }

    public void a(int i) {
    }

    public void a(Typeface typeface, boolean z) {
        Chip chip = this.f13992a;
        chip.setText(chip.f13981f.U() ? this.f13992a.f13981f.L() : this.f13992a.getText());
        this.f13992a.requestLayout();
        this.f13992a.invalidate();
    }
}
