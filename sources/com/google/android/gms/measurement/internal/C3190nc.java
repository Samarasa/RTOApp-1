package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.nc  reason: case insensitive filesystem */
final class C3190nc implements Callable<List<Ge>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ xe f13684a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f13685b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f13686c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C3150gc f13687d;

    C3190nc(C3150gc gcVar, xe xeVar, String str, String str2) {
        this.f13687d = gcVar;
        this.f13684a = xeVar;
        this.f13685b = str;
        this.f13686c = str2;
    }

    public final /* synthetic */ Object call() {
        this.f13687d.f13582a.r();
        return this.f13687d.f13582a.e().b(this.f13684a.f13822a, this.f13685b, this.f13686c);
    }
}
