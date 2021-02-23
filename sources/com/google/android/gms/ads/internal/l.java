package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

final class l implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ j f5471a;

    l(j jVar) {
        this.f5471a = jVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f5471a.f5470h == null) {
            return false;
        }
        this.f5471a.f5470h.a(motionEvent);
        return false;
    }
}
