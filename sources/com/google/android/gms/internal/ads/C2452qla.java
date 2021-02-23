package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.qla  reason: case insensitive filesystem */
final class C2452qla implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ IOException f11882a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2168mla f11883b;

    C2452qla(C2168mla mla, IOException iOException) {
        this.f11883b = mla;
        this.f11882a = iOException;
    }

    public final void run() {
        this.f11883b.f11362e.a(this.f11882a);
    }
}
