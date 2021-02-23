package com.google.android.gms.internal.ads;

public final class TB implements Xga<UB> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<String> f8730a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C3110zz> f8731b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C0877Lz> f8732c;

    private TB(C1876iha<String> iha, C1876iha<C3110zz> iha2, C1876iha<C0877Lz> iha3) {
        this.f8730a = iha;
        this.f8731b = iha2;
        this.f8732c = iha3;
    }

    public static TB a(C1876iha<String> iha, C1876iha<C3110zz> iha2, C1876iha<C0877Lz> iha3) {
        return new TB(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        return new UB(this.f8730a.get(), this.f8731b.get(), this.f8732c.get());
    }
}
