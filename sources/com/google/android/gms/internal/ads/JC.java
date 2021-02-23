package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

final /* synthetic */ class JC implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final FC f7381a;

    JC(FC fc) {
        this.f7381a = fc;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f7381a.a(view, motionEvent);
    }
}
