package com.google.android.gms.internal.ads;

public final class DM implements Xga<BM> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<String> f6531a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<String> f6532b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C2111lt> f6533c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C2563sT> f6534d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<SS> f6535e;

    private DM(C1876iha<String> iha, C1876iha<String> iha2, C1876iha<C2111lt> iha3, C1876iha<C2563sT> iha4, C1876iha<SS> iha5) {
        this.f6531a = iha;
        this.f6532b = iha2;
        this.f6533c = iha3;
        this.f6534d = iha4;
        this.f6535e = iha5;
    }

    public static DM a(C1876iha<String> iha, C1876iha<String> iha2, C1876iha<C2111lt> iha3, C1876iha<C2563sT> iha4, C1876iha<SS> iha5) {
        return new DM(iha, iha2, iha3, iha4, iha5);
    }

    public final /* synthetic */ Object get() {
        return new BM(this.f6531a.get(), this.f6532b.get(), this.f6533c.get(), this.f6534d.get(), this.f6535e.get());
    }
}
