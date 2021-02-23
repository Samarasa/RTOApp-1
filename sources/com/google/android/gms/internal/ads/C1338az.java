package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.az  reason: case insensitive filesystem */
public final class C1338az implements Xga<Set<String>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C1059Sz> f9863a;

    public C1338az(C1876iha<C1059Sz> iha) {
        this.f9863a = iha;
    }

    public static Set<String> a(C1059Sz sz) {
        Set<String> singleton = sz.d() != null ? Collections.singleton("banner") : Collections.emptySet();
        C1452cha.a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }

    public final /* synthetic */ Object get() {
        return a(this.f9863a.get());
    }
}
