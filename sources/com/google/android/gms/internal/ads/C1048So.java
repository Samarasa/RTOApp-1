package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.So  reason: case insensitive filesystem */
public final class C1048So implements Xga<C1855iT<VB>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C1767hC> f8687a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<PY> f8688b;

    public C1048So(C1876iha<C1767hC> iha, C1876iha<PY> iha2) {
        this.f8687a = iha;
        this.f8688b = iha2;
    }

    public final /* synthetic */ Object get() {
        C1855iT iTVar = new C1855iT(this.f8687a.get(), this.f8688b.get());
        C1452cha.a(iTVar, "Cannot return null from a non-@Nullable @Provides method");
        return iTVar;
    }
}
