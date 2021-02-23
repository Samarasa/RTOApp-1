package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Cs  reason: case insensitive filesystem */
public final class C0636Cs<AdT> implements Xga<C0662Ds<AdT>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Map<String, C2480rH<AdT>>> f6485a;

    private C0636Cs(C1876iha<Map<String, C2480rH<AdT>>> iha) {
        this.f6485a = iha;
    }

    public static <AdT> C0636Cs<AdT> a(C1876iha<Map<String, C2480rH<AdT>>> iha) {
        return new C0636Cs<>(iha);
    }

    public final /* synthetic */ Object get() {
        return new C0662Ds(this.f6485a.get());
    }
}
