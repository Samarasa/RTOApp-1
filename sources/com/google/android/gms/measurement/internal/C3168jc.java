package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0563t;

/* renamed from: com.google.android.gms.measurement.internal.jc  reason: case insensitive filesystem */
final class C3168jc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ xe f13614a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C3150gc f13615b;

    C3168jc(C3150gc gcVar, xe xeVar) {
        this.f13615b = gcVar;
        this.f13614a = xeVar;
    }

    public final void run() {
        this.f13615b.f13582a.r();
        C3176ke a2 = this.f13615b.f13582a;
        xe xeVar = this.f13614a;
        a2.g().c();
        a2.p();
        C0563t.b(xeVar.f13822a);
        a2.c(xeVar);
    }
}
