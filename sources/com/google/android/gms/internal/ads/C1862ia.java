package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* renamed from: com.google.android.gms.internal.ads.ia  reason: case insensitive filesystem */
public final class C1862ia {

    /* renamed from: a  reason: collision with root package name */
    private MotionEvent f10821a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b  reason: collision with root package name */
    private MotionEvent f10822b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    public final MotionEvent a() {
        return this.f10821a;
    }

    public final void a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.f10821a.getEventTime()) {
            this.f10821a = MotionEvent.obtain(motionEvent);
        } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > this.f10822b.getEventTime()) {
            this.f10822b = MotionEvent.obtain(motionEvent);
        }
    }

    public final MotionEvent b() {
        return this.f10822b;
    }
}
