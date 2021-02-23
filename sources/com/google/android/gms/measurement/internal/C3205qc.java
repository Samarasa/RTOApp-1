package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.qc  reason: case insensitive filesystem */
final class C3205qc implements Callable<byte[]> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C3192o f13733a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f13734b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C3150gc f13735c;

    C3205qc(C3150gc gcVar, C3192o oVar, String str) {
        this.f13735c = gcVar;
        this.f13733a = oVar;
        this.f13734b = str;
    }

    public final /* synthetic */ Object call() {
        this.f13735c.f13582a.r();
        this.f13735c.f13582a.l().a(this.f13733a, this.f13734b);
        throw null;
    }
}
