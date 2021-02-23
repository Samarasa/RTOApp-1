package com.google.android.gms.internal.ads;

public final class OB implements Xga<KB> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<String> f8048a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C3110zz> f8049b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C0877Lz> f8050c;

    private OB(C1876iha<String> iha, C1876iha<C3110zz> iha2, C1876iha<C0877Lz> iha3) {
        this.f8048a = iha;
        this.f8049b = iha2;
        this.f8050c = iha3;
    }

    public static OB a(C1876iha<String> iha, C1876iha<C3110zz> iha2, C1876iha<C0877Lz> iha3) {
        return new OB(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        return new KB(this.f8048a.get(), this.f8049b.get(), this.f8050c.get());
    }
}
