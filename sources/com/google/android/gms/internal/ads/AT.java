package com.google.android.gms.internal.ads;

public final class AT implements Xga<C2847wT> {

    /* renamed from: a  reason: collision with root package name */
    private final C2989yT f6115a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2705uT> f6116b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<String> f6117c;

    private AT(C2989yT yTVar, C1876iha<C2705uT> iha, C1876iha<String> iha2) {
        this.f6115a = yTVar;
        this.f6116b = iha;
        this.f6117c = iha2;
    }

    public static AT a(C2989yT yTVar, C1876iha<C2705uT> iha, C1876iha<String> iha2) {
        return new AT(yTVar, iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C2847wT a2 = this.f6116b.get().a(this.f6117c.get());
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
