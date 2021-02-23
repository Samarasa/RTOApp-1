package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jt  reason: case insensitive filesystem */
public final class C0819Jt implements Xga<C3108zx<C1900iv>> {

    /* renamed from: a  reason: collision with root package name */
    private final C2749ut f7511a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1131Vt> f7512b;

    private C0819Jt(C2749ut utVar, C1876iha<C1131Vt> iha) {
        this.f7511a = utVar;
        this.f7512b = iha;
    }

    public static C0819Jt a(C2749ut utVar, C1876iha<C1131Vt> iha) {
        return new C0819Jt(utVar, iha);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f7512b.get(), C1252_k.f9704f);
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
