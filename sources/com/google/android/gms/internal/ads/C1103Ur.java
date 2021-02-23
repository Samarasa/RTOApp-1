package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ur  reason: case insensitive filesystem */
public final class C1103Ur implements Xga<C3108zx<C2610sw>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0661Dr f8973a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C0587Av> f8974b;

    public C1103Ur(C0661Dr dr, C1876iha<C0587Av> iha) {
        this.f8973a = dr;
        this.f8974b = iha;
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(new C0713Fr(this.f8974b.get()), C1252_k.f9704f);
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
