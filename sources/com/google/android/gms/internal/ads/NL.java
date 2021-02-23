package com.google.android.gms.internal.ads;

import java.util.Set;

public final class NL implements Xga<Set<String>> {

    /* renamed from: a  reason: collision with root package name */
    private final LL f7952a;

    public NL(LL ll) {
        this.f7952a = ll;
    }

    public final /* synthetic */ Object get() {
        Set<String> a2 = this.f7952a.a();
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
