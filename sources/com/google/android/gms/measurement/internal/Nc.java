package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class Nc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f13367a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f13368b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Hc f13369c;

    Nc(Hc hc, AtomicReference atomicReference, boolean z) {
        this.f13369c = hc;
        this.f13367a = atomicReference;
        this.f13368b = z;
    }

    public final void run() {
        this.f13369c.r().a((AtomicReference<List<re>>) this.f13367a, this.f13368b);
    }
}
