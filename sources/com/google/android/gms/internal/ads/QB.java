package com.google.android.gms.internal.ads;

public final class QB implements Xga<MB> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<String> f8296a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C3110zz> f8297b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C0877Lz> f8298c;

    private QB(C1876iha<String> iha, C1876iha<C3110zz> iha2, C1876iha<C0877Lz> iha3) {
        this.f8296a = iha;
        this.f8297b = iha2;
        this.f8298c = iha3;
    }

    public static QB a(C1876iha<String> iha, C1876iha<C3110zz> iha2, C1876iha<C0877Lz> iha3) {
        return new QB(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        return new MB(this.f8296a.get(), this.f8297b.get(), this.f8298c.get());
    }
}
