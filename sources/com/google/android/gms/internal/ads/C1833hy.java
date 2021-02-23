package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.hy  reason: case insensitive filesystem */
public final class C1833hy implements Xga<Set<C3108zx<C0768Hu>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1762gy f10756a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1053St> f10757b;

    private C1833hy(C1762gy gyVar, C1876iha<C1053St> iha) {
        this.f10756a = gyVar;
        this.f10757b = iha;
    }

    public static C1833hy a(C1762gy gyVar, C1876iha<C1053St> iha) {
        return new C1833hy(gyVar, iha);
    }

    public final /* synthetic */ Object get() {
        Set singleton = Collections.singleton(C3108zx.a(this.f10757b.get(), C1252_k.f9704f));
        C1452cha.a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }
}
