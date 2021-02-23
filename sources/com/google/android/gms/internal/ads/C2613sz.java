package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sz  reason: case insensitive filesystem */
public final class C2613sz implements Xga<C0981Pz> {

    /* renamed from: a  reason: collision with root package name */
    private final C2259nz f12160a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C0955Oz> f12161b;

    public C2613sz(C2259nz nzVar, C1876iha<C0955Oz> iha) {
        this.f12160a = nzVar;
        this.f12161b = iha;
    }

    public final /* synthetic */ Object get() {
        C0955Oz oz = this.f12161b.get();
        C1452cha.a(oz, "Cannot return null from a non-@Nullable @Provides method");
        return oz;
    }
}
