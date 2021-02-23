package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Pr  reason: case insensitive filesystem */
public final class C0973Pr implements Xga<Set<C3108zx<C2739una>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0661Dr f8280a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2394ps> f8281b;

    public C0973Pr(C0661Dr dr, C1876iha<C2394ps> iha) {
        this.f8280a = dr;
        this.f8281b = iha;
    }

    public final /* synthetic */ Object get() {
        Set singleton = Collections.singleton(new C3108zx(this.f8281b.get(), C1252_k.f9704f));
        C1452cha.a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }
}
