package com.google.android.gms.internal.ads;

import java.lang.Throwable;

final class VX<V, X extends Throwable> extends WX<V, X, C2214nY<? super X, ? extends V>, LY<? extends V>> {
    VX(LY<? extends V> ly, Class<X> cls, C2214nY<? super X, ? extends V> nYVar) {
        super(ly, cls, nYVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(Object obj, Throwable th) {
        C2214nY nYVar = (C2214nY) obj;
        LY a2 = nYVar.a(th);
        C1434cX.a(a2, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", (Object) nYVar);
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Object obj) {
        a((LY) obj);
    }
}
