package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1718gY;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.rY  reason: case insensitive filesystem */
final class C2497rY<V> extends C1718gY<Object, V> {
    /* access modifiers changed from: private */
    public C2639tY<?> p;

    C2497rY(C2638tX<? extends LY<?>> tXVar, boolean z, Executor executor, Callable<V> callable) {
        super(tXVar, z, false);
        this.p = new C2427qY(this, callable, executor);
        k();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, Object obj) {
    }

    /* access modifiers changed from: package-private */
    public final void a(C1718gY.a aVar) {
        super.a(aVar);
        if (aVar == C1718gY.a.OUTPUT_FUTURE_DONE) {
            this.p = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        C2639tY<?> tYVar = this.p;
        if (tYVar != null) {
            tYVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        C2639tY<?> tYVar = this.p;
        if (tYVar != null) {
            tYVar.e();
        }
    }
}
