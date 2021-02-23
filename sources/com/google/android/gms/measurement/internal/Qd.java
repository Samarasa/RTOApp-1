package com.google.android.gms.measurement.internal;

import android.content.Intent;

final /* synthetic */ class Qd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Nd f13397a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13398b;

    /* renamed from: c  reason: collision with root package name */
    private final Bb f13399c;

    /* renamed from: d  reason: collision with root package name */
    private final Intent f13400d;

    Qd(Nd nd, int i, Bb bb, Intent intent) {
        this.f13397a = nd;
        this.f13398b = i;
        this.f13399c = bb;
        this.f13400d = intent;
    }

    public final void run() {
        this.f13397a.a(this.f13398b, this.f13399c, this.f13400d);
    }
}
