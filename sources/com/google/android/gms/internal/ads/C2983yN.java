package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yN  reason: case insensitive filesystem */
public final class C2983yN implements Xga<C2841wN> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<PY> f12902a;

    private C2983yN(C1876iha<PY> iha) {
        this.f12902a = iha;
    }

    public static C2983yN a(C1876iha<PY> iha) {
        return new C2983yN(iha);
    }

    public final /* synthetic */ Object get() {
        return new C2841wN(this.f12902a.get());
    }
}
