package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.jx  reason: case insensitive filesystem */
public final class C1973jx implements Xga<Set<C3108zx<C0771Hx>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1004Qw f11020a;

    private C1973jx(C1004Qw qw) {
        this.f11020a = qw;
    }

    public static C1973jx a(C1004Qw qw) {
        return new C1973jx(qw);
    }

    public final /* synthetic */ Object get() {
        Set emptySet = Collections.emptySet();
        C1452cha.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
