package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class Qc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Bundle f13395a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Hc f13396b;

    Qc(Hc hc, Bundle bundle) {
        this.f13396b = hc;
        this.f13395a = bundle;
    }

    public final void run() {
        this.f13396b.d(this.f13395a);
    }
}
