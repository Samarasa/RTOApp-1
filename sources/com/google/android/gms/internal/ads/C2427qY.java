package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.qY  reason: case insensitive filesystem */
final class C2427qY extends C2639tY<V> {

    /* renamed from: f  reason: collision with root package name */
    private final Callable<V> f11855f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ C2497rY f11856g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2427qY(C2497rY rYVar, Callable<V> callable, Executor executor) {
        super(rYVar, executor);
        this.f11856g = rYVar;
        C1434cX.a(callable);
        this.f11855f = callable;
    }

    /* access modifiers changed from: package-private */
    public final void a(V v) {
        this.f11856g.a(v);
    }

    /* access modifiers changed from: package-private */
    public final V c() {
        return this.f11855f.call();
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        return this.f11855f.toString();
    }
}
