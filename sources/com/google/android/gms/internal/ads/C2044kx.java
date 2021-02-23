package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.v;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.kx  reason: case insensitive filesystem */
public final class C2044kx implements Xga<Set<C3108zx<v.a>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1004Qw f11126a;

    private C2044kx(C1004Qw qw) {
        this.f11126a = qw;
    }

    public static C2044kx a(C1004Qw qw) {
        return new C2044kx(qw);
    }

    public final /* synthetic */ Object get() {
        Set emptySet = Collections.emptySet();
        C1452cha.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
