package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.gx  reason: case insensitive filesystem */
public final class C1761gx implements Xga<Set<C3108zx<C2739una>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1004Qw f10605a;

    private C1761gx(C1004Qw qw) {
        this.f10605a = qw;
    }

    public static C1761gx a(C1004Qw qw) {
        return new C1761gx(qw);
    }

    public final /* synthetic */ Object get() {
        Set emptySet = Collections.emptySet();
        C1452cha.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
