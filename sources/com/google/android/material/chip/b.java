package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

class b extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Chip f13993a;

    b(Chip chip) {
        this.f13993a = chip;
    }

    @TargetApi(21)
    public void getOutline(View view, Outline outline) {
        if (this.f13993a.f13981f != null) {
            this.f13993a.f13981f.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
