package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.sc  reason: case insensitive filesystem */
final class C3214sc implements Callable<List<te>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ xe f13756a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C3150gc f13757b;

    C3214sc(C3150gc gcVar, xe xeVar) {
        this.f13757b = gcVar;
        this.f13756a = xeVar;
    }

    public final /* synthetic */ Object call() {
        this.f13757b.f13582a.r();
        return this.f13757b.f13582a.e().a(this.f13756a.f13822a);
    }
}
