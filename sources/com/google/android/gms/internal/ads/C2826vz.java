package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vz  reason: case insensitive filesystem */
public final class C2826vz implements Xga<C3108zx<C0872Lu>> {

    /* renamed from: a  reason: collision with root package name */
    private final C2259nz f12602a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<EA> f12603b;

    public C2826vz(C2259nz nzVar, C1876iha<EA> iha) {
        this.f12602a = nzVar;
        this.f12603b = iha;
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f12603b.get(), C1252_k.f9704f);
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
