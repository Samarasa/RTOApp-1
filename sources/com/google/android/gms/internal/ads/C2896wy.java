package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.wy  reason: case insensitive filesystem */
public final class C2896wy implements Xga<Set<C3108zx<C2611sx>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C0980Py> f12723a;

    private C2896wy(C1876iha<C0980Py> iha) {
        this.f12723a = iha;
    }

    public static C2896wy a(C1876iha<C0980Py> iha) {
        return new C2896wy(iha);
    }

    public final /* synthetic */ Object get() {
        Set singleton = Collections.singleton(C3108zx.a(this.f12723a.get(), C1252_k.f9704f));
        C1452cha.a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }
}
