package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

final class Jd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ComponentName f13319a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Hd f13320b;

    Jd(Hd hd, ComponentName componentName) {
        this.f13320b = hd;
        this.f13319a = componentName;
    }

    public final void run() {
        this.f13320b.f13291c.a(this.f13319a);
    }
}
