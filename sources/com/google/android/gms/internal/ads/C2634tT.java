package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tT  reason: case insensitive filesystem */
public final class C2634tT implements Xga<C3108zx<C2963xu>> {

    /* renamed from: a  reason: collision with root package name */
    private final C2422qT f12205a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2563sT> f12206b;

    private C2634tT(C2422qT qTVar, C1876iha<C2563sT> iha) {
        this.f12205a = qTVar;
        this.f12206b = iha;
    }

    public static C2634tT a(C2422qT qTVar, C1876iha<C2563sT> iha) {
        return new C2634tT(qTVar, iha);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f12206b.get(), C1252_k.f9704f);
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
