package com.google.android.material.internal;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import b.h.j.C0195a;
import b.h.j.a.c;

class a extends C0195a {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CheckableImageButton f14062d;

    a(CheckableImageButton checkableImageButton) {
        this.f14062d = checkableImageButton;
    }

    public void a(View view, c cVar) {
        super.a(view, cVar);
        cVar.b(true);
        cVar.c(this.f14062d.isChecked());
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f14062d.isChecked());
    }
}
