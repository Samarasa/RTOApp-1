package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Nr  reason: case insensitive filesystem */
public final class C0921Nr implements Xga<C3108zx<C0872Lu>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0661Dr f8033a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2252ns> f8034b;

    public C0921Nr(C0661Dr dr, C1876iha<C2252ns> iha) {
        this.f8033a = dr;
        this.f8034b = iha;
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f8034b.get(), C1252_k.f9703e);
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
