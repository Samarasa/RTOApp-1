package com.google.android.gms.internal.ads;

public final class EC implements Xga<C2480rH<C2405qC>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<VU> f6668a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<PY> f6669b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C2341pJ> f6670c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<PJ> f6671d;

    public EC(C1876iha<VU> iha, C1876iha<PY> iha2, C1876iha<C2341pJ> iha3, C1876iha<PJ> iha4) {
        this.f6668a = iha;
        this.f6669b = iha2;
        this.f6670c = iha3;
        this.f6671d = iha4;
    }

    public final /* synthetic */ Object get() {
        TJ tj = new TJ(this.f6668a.get(), this.f6669b.get(), this.f6671d.get(), this.f6670c.get());
        C1452cha.a(tj, "Cannot return null from a non-@Nullable @Provides method");
        return tj;
    }
}
