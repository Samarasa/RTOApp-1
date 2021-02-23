package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Tw  reason: case insensitive filesystem */
public final class C1082Tw implements Xga<Set<C3108zx<C0950Ou>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1004Qw f8843a;

    private C1082Tw(C1004Qw qw) {
        this.f8843a = qw;
    }

    public static C1082Tw a(C1004Qw qw) {
        return new C1082Tw(qw);
    }

    public final /* synthetic */ Object get() {
        Set emptySet = Collections.emptySet();
        C1452cha.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
