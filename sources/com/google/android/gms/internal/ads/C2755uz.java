package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uz  reason: case insensitive filesystem */
public final class C2755uz implements Xga<VB> {

    /* renamed from: a  reason: collision with root package name */
    private final C2259nz f12456a;

    public C2755uz(C2259nz nzVar) {
        this.f12456a = nzVar;
    }

    public static VB a(C2259nz nzVar) {
        VB b2 = nzVar.b();
        C1452cha.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    public final /* synthetic */ Object get() {
        return a(this.f12456a);
    }
}
