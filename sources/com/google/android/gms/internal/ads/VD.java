package com.google.android.gms.internal.ads;

public final class VD implements Xga<WD> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C1486dE> f9010a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1981kE> f9011b;

    private VD(C1876iha<C1486dE> iha, C1876iha<C1981kE> iha2) {
        this.f9010a = iha;
        this.f9011b = iha2;
    }

    public static VD a(C1876iha<C1486dE> iha, C1876iha<C1981kE> iha2) {
        return new VD(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return new WD(this.f9010a.get(), this.f9011b.get());
    }
}
