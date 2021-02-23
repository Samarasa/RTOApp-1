package com.google.android.gms.internal.ads;

import java.lang.Throwable;

/* renamed from: com.google.android.gms.internal.ads.aY  reason: case insensitive filesystem */
final class C1293aY<V, X extends Throwable> extends WX<V, X, UW<? super X, ? extends V>, V> {
    C1293aY(LY<? extends V> ly, Class<X> cls, UW<? super X, ? extends V> uw) {
        super(ly, cls, uw);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(Object obj, Throwable th) {
        return ((UW) obj).apply(th);
    }

    /* access modifiers changed from: package-private */
    public final void b(V v) {
        a(v);
    }
}
