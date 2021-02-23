package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cE  reason: case insensitive filesystem */
public final class C1415cE implements Xga<C1486dE> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C1981kE> f10001a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C0732Gk> f10002b;

    private C1415cE(C1876iha<C1981kE> iha, C1876iha<C0732Gk> iha2) {
        this.f10001a = iha;
        this.f10002b = iha2;
    }

    public static C1415cE a(C1876iha<C1981kE> iha, C1876iha<C0732Gk> iha2) {
        return new C1415cE(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return new C1486dE(this.f10001a.get(), this.f10002b.get());
    }
}
