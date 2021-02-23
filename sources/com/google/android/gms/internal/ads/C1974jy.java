package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.jy  reason: case insensitive filesystem */
public final class C1974jy implements Xga<Set<C3108zx<C3107zw>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1762gy f11021a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1053St> f11022b;

    private C1974jy(C1762gy gyVar, C1876iha<C1053St> iha) {
        this.f11021a = gyVar;
        this.f11022b = iha;
    }

    public static C1974jy a(C1762gy gyVar, C1876iha<C1053St> iha) {
        return new C1974jy(gyVar, iha);
    }

    public final /* synthetic */ Object get() {
        Set singleton = Collections.singleton(C3108zx.a(this.f11022b.get(), C1252_k.f9704f));
        C1452cha.a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }
}
