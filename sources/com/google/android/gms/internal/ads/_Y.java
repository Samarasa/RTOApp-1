package com.google.android.gms.internal.ads;

final class _Y extends KY<LY<V>> {

    /* renamed from: d  reason: collision with root package name */
    private final C2001kY<V> f9666d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C1294aZ f9667e;

    _Y(C1294aZ aZVar, C2001kY<V> kYVar) {
        this.f9667e = aZVar;
        C1434cX.a(kYVar);
        this.f9666d = kYVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Object obj, Throwable th) {
        LY ly = (LY) obj;
        if (th == null) {
            this.f9667e.a(ly);
        } else {
            this.f9667e.a(th);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.f9667e.isDone();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object c() {
        LY<V> a2 = this.f9666d.a();
        C1434cX.a(a2, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", (Object) this.f9666d);
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        return this.f9666d.toString();
    }
}
