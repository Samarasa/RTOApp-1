package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* renamed from: com.google.android.gms.internal.ads.aZ  reason: case insensitive filesystem */
final class C1294aZ<V> extends C2923xY<V> implements RunnableFuture<V> {

    /* renamed from: h  reason: collision with root package name */
    private volatile KY<?> f9799h;

    C1294aZ(C2001kY<V> kYVar) {
        this.f9799h = new _Y(this, kYVar);
    }

    private C1294aZ(Callable<V> callable) {
        this.f9799h = new C1436cZ(this, callable);
    }

    static <V> C1294aZ<V> a(Runnable runnable, V v) {
        return new C1294aZ<>(Executors.callable(runnable, v));
    }

    static <V> C1294aZ<V> a(Callable<V> callable) {
        return new C1294aZ<>(callable);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        KY<?> ky;
        super.b();
        if (e() && (ky = this.f9799h) != null) {
            ky.a();
        }
        this.f9799h = null;
    }

    /* access modifiers changed from: protected */
    public final String d() {
        KY<?> ky = this.f9799h;
        if (ky == null) {
            return super.d();
        }
        String valueOf = String.valueOf(ky);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void run() {
        KY<?> ky = this.f9799h;
        if (ky != null) {
            ky.run();
        }
        this.f9799h = null;
    }
}
