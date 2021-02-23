package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.py  reason: case insensitive filesystem */
public final class C2400py implements Xga<Set<C3108zx<C2608su>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1762gy f11805a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1053St> f11806b;

    private C2400py(C1762gy gyVar, C1876iha<C1053St> iha) {
        this.f11805a = gyVar;
        this.f11806b = iha;
    }

    public static C2400py a(C1762gy gyVar, C1876iha<C1053St> iha) {
        return new C2400py(gyVar, iha);
    }

    public final /* synthetic */ Object get() {
        Set<C3108zx<C2608su>> a2 = this.f11805a.a(this.f11806b.get());
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
