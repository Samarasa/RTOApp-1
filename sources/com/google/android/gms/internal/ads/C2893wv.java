package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.q;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.wv  reason: case insensitive filesystem */
public final class C2893wv implements Xga<C2468qv> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Set<C3108zx<q>>> f12720a;

    private C2893wv(C1876iha<Set<C3108zx<q>>> iha) {
        this.f12720a = iha;
    }

    public static C2893wv a(C1876iha<Set<C3108zx<q>>> iha) {
        return new C2893wv(iha);
    }

    public final /* synthetic */ Object get() {
        return new C2468qv(this.f12720a.get());
    }
}
