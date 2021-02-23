package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Fu  reason: case insensitive filesystem */
public final class C0716Fu implements Xga<C0690Eu> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Set<C3108zx<C0768Hu>>> f6966a;

    private C0716Fu(C1876iha<Set<C3108zx<C0768Hu>>> iha) {
        this.f6966a = iha;
    }

    public static C0716Fu a(C1876iha<Set<C3108zx<C0768Hu>>> iha) {
        return new C0716Fu(iha);
    }

    public final /* synthetic */ Object get() {
        return new C0690Eu(this.f6966a.get());
    }
}
