package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Qr  reason: case insensitive filesystem */
public final class C0999Qr implements Xga<C3108zx<C1900iv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0661Dr f8408a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2252ns> f8409b;

    public C0999Qr(C0661Dr dr, C1876iha<C2252ns> iha) {
        this.f8408a = dr;
        this.f8409b = iha;
    }

    public static C3108zx<C1900iv> a(C0661Dr dr, C2252ns nsVar) {
        C3108zx<C1900iv> zxVar = new C3108zx<>(nsVar, C1252_k.f9703e);
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }

    public final /* synthetic */ Object get() {
        return a(this.f8408a, this.f8409b.get());
    }
}
