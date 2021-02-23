package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Nt  reason: case insensitive filesystem */
public final class C0923Nt implements Xga<C3108zx<C0795Iv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0949Ot f8037a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C0897Mt> f8038b;

    private C0923Nt(C0949Ot ot, C1876iha<C0897Mt> iha) {
        this.f8037a = ot;
        this.f8038b = iha;
    }

    public static C0923Nt a(C0949Ot ot, C1876iha<C0897Mt> iha) {
        return new C0923Nt(ot, iha);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f8038b.get(), C1252_k.f9704f);
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
