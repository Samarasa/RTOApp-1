package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Uw  reason: case insensitive filesystem */
public final class C1108Uw implements Xga<Set<C3108zx<C2610sw>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1004Qw f8980a;

    private C1108Uw(C1004Qw qw) {
        this.f8980a = qw;
    }

    public static C1108Uw a(C1004Qw qw) {
        return new C1108Uw(qw);
    }

    public final /* synthetic */ Object get() {
        Set emptySet = Collections.emptySet();
        C1452cha.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
