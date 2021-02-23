package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.cZ  reason: case insensitive filesystem */
final class C1436cZ extends KY<V> {

    /* renamed from: d  reason: collision with root package name */
    private final Callable<V> f10046d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C1294aZ f10047e;

    C1436cZ(C1294aZ aZVar, Callable<V> callable) {
        this.f10047e = aZVar;
        C1434cX.a(callable);
        this.f10046d = callable;
    }

    /* access modifiers changed from: package-private */
    public final void a(V v, Throwable th) {
        if (th == null) {
            this.f10047e.a(v);
        } else {
            this.f10047e.a(th);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.f10047e.isDone();
    }

    /* access modifiers changed from: package-private */
    public final V c() {
        return this.f10046d.call();
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        return this.f10046d.toString();
    }
}
