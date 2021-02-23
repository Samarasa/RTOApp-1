package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

final class Paa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ int f8227a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f8228b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f8229c;

    Paa(IX ix, int i, int i2, int i3) {
        this.f8227a = i;
        this.f8228b = i2;
        this.f8229c = i3;
    }

    public final void run() {
        try {
            IX.u.a(MotionEvent.obtain(0, (long) this.f8227a, 0, (float) this.f8228b, (float) this.f8229c, 0));
        } catch (Exception e2) {
            IX.w.a(2022, -1, e2);
        }
    }
}
