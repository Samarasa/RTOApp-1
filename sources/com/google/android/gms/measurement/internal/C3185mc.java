package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.mc  reason: case insensitive filesystem */
final class C3185mc implements Callable<List<Ge>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f13671a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f13672b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f13673c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C3150gc f13674d;

    C3185mc(C3150gc gcVar, String str, String str2, String str3) {
        this.f13674d = gcVar;
        this.f13671a = str;
        this.f13672b = str2;
        this.f13673c = str3;
    }

    public final /* synthetic */ Object call() {
        this.f13674d.f13582a.r();
        return this.f13674d.f13582a.e().b(this.f13671a, this.f13672b, this.f13673c);
    }
}
