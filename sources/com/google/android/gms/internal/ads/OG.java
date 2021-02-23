package com.google.android.gms.internal.ads;

public final class OG implements Xga<JG> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<HG> f8060a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<PY> f8061b;

    private OG(C1876iha<HG> iha, C1876iha<PY> iha2) {
        this.f8060a = iha;
        this.f8061b = iha2;
    }

    public static OG a(C1876iha<HG> iha, C1876iha<PY> iha2) {
        return new OG(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return new JG(this.f8060a.get(), this.f8061b.get());
    }
}
