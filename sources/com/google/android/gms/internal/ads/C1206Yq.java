package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Yq  reason: case insensitive filesystem */
public final class C1206Yq implements Xga<Set<C3108zx<C2739una>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1050Sq f9500a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2394ps> f9501b;

    public C1206Yq(C1050Sq sq, C1876iha<C2394ps> iha) {
        this.f9500a = sq;
        this.f9501b = iha;
    }

    public final /* synthetic */ Object get() {
        Set singleton = Collections.singleton(new C3108zx(this.f9501b.get(), C1252_k.f9704f));
        C1452cha.a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }
}
