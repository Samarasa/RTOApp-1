package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Tp  reason: case insensitive filesystem */
public final class C1075Tp implements Xga<C1122Vk> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<String> f8834a;

    public C1075Tp(C1876iha<String> iha) {
        this.f8834a = iha;
    }

    public final /* synthetic */ Object get() {
        C1122Vk vk = new C1122Vk(this.f8834a.get());
        C1452cha.a(vk, "Cannot return null from a non-@Nullable @Provides method");
        return vk;
    }
}
