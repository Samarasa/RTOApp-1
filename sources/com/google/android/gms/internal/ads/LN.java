package com.google.android.gms.internal.ads;

public final class LN implements Xga<JN> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<PY> f7667a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2846wS> f7668b;

    private LN(C1876iha<PY> iha, C1876iha<C2846wS> iha2) {
        this.f7667a = iha;
        this.f7668b = iha2;
    }

    public static LN a(C1876iha<PY> iha, C1876iha<C2846wS> iha2) {
        return new LN(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return new JN(this.f7667a.get(), this.f7668b.get());
    }
}
