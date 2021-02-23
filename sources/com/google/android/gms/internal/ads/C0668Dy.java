package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Dy  reason: case insensitive filesystem */
public final class C0668Dy implements Xga<C3108zx<C2608su>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2540rx> f6659a;

    public C0668Dy(C1876iha<C2540rx> iha) {
        this.f6659a = iha;
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f6659a.get(), C1252_k.f9704f);
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
