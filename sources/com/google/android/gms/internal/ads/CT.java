package com.google.android.gms.internal.ads;

public final class CT implements Xga<C0732Gk> {

    /* renamed from: a  reason: collision with root package name */
    private final C2989yT f6419a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2847wT> f6420b;

    private CT(C2989yT yTVar, C1876iha<C2847wT> iha) {
        this.f6419a = yTVar;
        this.f6420b = iha;
    }

    public static CT a(C2989yT yTVar, C1876iha<C2847wT> iha) {
        return new CT(yTVar, iha);
    }

    public final /* synthetic */ Object get() {
        C0732Gk gk = this.f6420b.get().f12629c;
        C1452cha.a(gk, "Cannot return null from a non-@Nullable @Provides method");
        return gk;
    }
}
