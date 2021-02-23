package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.wx  reason: case insensitive filesystem */
public final class C2895wx implements Xga<C2824vx> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Set<C3108zx<C2611sx>>> f12722a;

    private C2895wx(C1876iha<Set<C3108zx<C2611sx>>> iha) {
        this.f12722a = iha;
    }

    public static C2895wx a(C1876iha<Set<C3108zx<C2611sx>>> iha) {
        return new C2895wx(iha);
    }

    public final /* synthetic */ Object get() {
        return new C2824vx(this.f12722a.get());
    }
}
