package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.kc  reason: case insensitive filesystem */
final class C3174kc implements Callable<List<te>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f13633a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f13634b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f13635c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C3150gc f13636d;

    C3174kc(C3150gc gcVar, String str, String str2, String str3) {
        this.f13636d = gcVar;
        this.f13633a = str;
        this.f13634b = str2;
        this.f13635c = str3;
    }

    public final /* synthetic */ Object call() {
        this.f13636d.f13582a.r();
        return this.f13636d.f13582a.e().a(this.f13633a, this.f13634b, this.f13635c);
    }
}
