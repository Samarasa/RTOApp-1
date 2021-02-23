package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Uq  reason: case insensitive filesystem */
public final class C1102Uq implements Xga<Set<C3108zx<C1900iv>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1050Sq f8971a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2394ps> f8972b;

    public C1102Uq(C1050Sq sq, C1876iha<C2394ps> iha) {
        this.f8971a = sq;
        this.f8972b = iha;
    }

    public final /* synthetic */ Object get() {
        Set singleton = Collections.singleton(new C3108zx(this.f8972b.get(), C1252_k.f9704f));
        C1452cha.a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }
}
