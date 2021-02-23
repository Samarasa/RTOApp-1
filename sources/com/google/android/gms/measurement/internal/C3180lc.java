package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.lc  reason: case insensitive filesystem */
final class C3180lc implements Callable<List<te>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ xe f13662a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f13663b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f13664c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C3150gc f13665d;

    C3180lc(C3150gc gcVar, xe xeVar, String str, String str2) {
        this.f13665d = gcVar;
        this.f13662a = xeVar;
        this.f13663b = str;
        this.f13664c = str2;
    }

    public final /* synthetic */ Object call() {
        this.f13665d.f13582a.r();
        return this.f13665d.f13582a.e().a(this.f13662a.f13822a, this.f13663b, this.f13664c);
    }
}
