package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* renamed from: com.google.android.gms.internal.ads.pba  reason: case insensitive filesystem */
final class C2361pba implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ MotionEvent f11734a;

    C2361pba(IX ix, MotionEvent motionEvent) {
        this.f11734a = motionEvent;
    }

    public final void run() {
        try {
            IX.u.a(this.f11734a);
        } catch (Exception e2) {
            IX.w.a(2022, -1, e2);
        }
    }
}
