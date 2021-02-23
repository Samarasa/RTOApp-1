package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Sw  reason: case insensitive filesystem */
public final class C1056Sw implements Xga<Set<C3108zx<C1900iv>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1004Qw f8712a;

    private C1056Sw(C1004Qw qw) {
        this.f8712a = qw;
    }

    public static C1056Sw a(C1004Qw qw) {
        return new C1056Sw(qw);
    }

    public static Set<C3108zx<C1900iv>> b(C1004Qw qw) {
        Set<C3108zx<C1900iv>> emptySet = Collections.emptySet();
        C1452cha.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }

    public final /* synthetic */ Object get() {
        return b(this.f8712a);
    }
}
