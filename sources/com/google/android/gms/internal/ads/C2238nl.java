package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* renamed from: com.google.android.gms.internal.ads.nl  reason: case insensitive filesystem */
public class C2238nl<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C1742gl<T> f11501a = new C1742gl<>();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f11502b = new AtomicInteger(0);

    public C2238nl() {
        DY.a(this.f11501a, new C2167ml(this), (Executor) C1252_k.f9704f);
    }

    @Deprecated
    public final int a() {
        return this.f11502b.get();
    }

    @Deprecated
    public final void a(C2025kl<T> klVar, C1883il ilVar) {
        DY.a(this.f11501a, new C2380pl(this, klVar, ilVar), (Executor) C1252_k.f9704f);
    }

    @Deprecated
    public final void a(T t) {
        this.f11501a.a(t);
    }

    @Deprecated
    public final void b() {
        this.f11501a.a((Throwable) new Exception());
    }
}
