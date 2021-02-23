package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Or  reason: case insensitive filesystem */
public final class C0947Or implements Xga<Set<C3108zx<C1900iv>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0661Dr f8164a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2394ps> f8165b;

    public C0947Or(C0661Dr dr, C1876iha<C2394ps> iha) {
        this.f8164a = dr;
        this.f8165b = iha;
    }

    public static Set<C3108zx<C1900iv>> a(C0661Dr dr, C2394ps psVar) {
        Set<C3108zx<C1900iv>> singleton = Collections.singleton(new C3108zx(psVar, C1252_k.f9704f));
        C1452cha.a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }

    public final /* synthetic */ Object get() {
        return a(this.f8164a, this.f8165b.get());
    }
}
