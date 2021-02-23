package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.ha;

public final class BT implements Xga<ha> {

    /* renamed from: a  reason: collision with root package name */
    private final C2989yT f6287a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2847wT> f6288b;

    private BT(C2989yT yTVar, C1876iha<C2847wT> iha) {
        this.f6287a = yTVar;
        this.f6288b = iha;
    }

    public static ha a(C2989yT yTVar, C2847wT wTVar) {
        ha haVar = wTVar.f12628b;
        C1452cha.a(haVar, "Cannot return null from a non-@Nullable @Provides method");
        return haVar;
    }

    public static BT a(C2989yT yTVar, C1876iha<C2847wT> iha) {
        return new BT(yTVar, iha);
    }

    public final /* synthetic */ Object get() {
        return a(this.f6287a, this.f6288b.get());
    }
}
