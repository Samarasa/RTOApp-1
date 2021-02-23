package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.q;

/* renamed from: com.google.android.gms.internal.ads.Dt  reason: case insensitive filesystem */
public final class C0663Dt implements Xga<C3108zx<q>> {

    /* renamed from: a  reason: collision with root package name */
    private final C2749ut f6654a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1052Ss> f6655b;

    private C0663Dt(C2749ut utVar, C1876iha<C1052Ss> iha) {
        this.f6654a = utVar;
        this.f6655b = iha;
    }

    public static C0663Dt a(C2749ut utVar, C1876iha<C1052Ss> iha) {
        return new C0663Dt(utVar, iha);
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f6655b.get(), C1252_k.f9704f);
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
