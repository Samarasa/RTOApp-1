package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eY  reason: case insensitive filesystem */
final class C1576eY<I, O> extends C1364bY<I, O, C2214nY<? super I, ? extends O>, LY<? extends O>> {
    C1576eY(LY<? extends I> ly, C2214nY<? super I, ? extends O> nYVar) {
        super(ly, nYVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        C2214nY nYVar = (C2214nY) obj;
        LY a2 = nYVar.a(obj2);
        C1434cX.a(a2, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", (Object) nYVar);
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Object obj) {
        a((LY) obj);
    }
}
