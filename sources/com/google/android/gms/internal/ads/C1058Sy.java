package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Sy  reason: case insensitive filesystem */
public final class C1058Sy implements Xga<C0980Py> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C0924Nu> f8713a;

    private C1058Sy(C1876iha<C0924Nu> iha) {
        this.f8713a = iha;
    }

    public static C1058Sy a(C1876iha<C0924Nu> iha) {
        return new C1058Sy(iha);
    }

    public final /* synthetic */ Object get() {
        return new C0980Py(this.f8713a.get());
    }
}
