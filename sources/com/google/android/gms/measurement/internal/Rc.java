package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class Rc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Bundle f13403a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Hc f13404b;

    Rc(Hc hc, Bundle bundle) {
        this.f13404b = hc;
        this.f13403a = bundle;
    }

    public final void run() {
        this.f13404b.c(this.f13403a);
    }
}
