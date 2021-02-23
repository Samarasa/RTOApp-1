package com.google.android.gms.internal.ads;

public final class FD implements Xga<C2973yD> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Soa> f6804a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2845wR> f6805b;

    private FD(C1876iha<Soa> iha, C1876iha<C2845wR> iha2) {
        this.f6804a = iha;
        this.f6805b = iha2;
    }

    public static FD a(C1876iha<Soa> iha, C1876iha<C2845wR> iha2) {
        return new FD(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return new C2973yD(this.f6804a.get(), this.f6805b.get());
    }
}
