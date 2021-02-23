package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.mM  reason: case insensitive filesystem */
public final class C2131mM implements Xga<C1989kM> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Set<String>> f11293a;

    private C2131mM(C1876iha<Set<String>> iha) {
        this.f11293a = iha;
    }

    public static C1989kM a(Set<String> set) {
        return new C1989kM(set);
    }

    public static C2131mM a(C1876iha<Set<String>> iha) {
        return new C2131mM(iha);
    }

    public final /* synthetic */ Object get() {
        return a(this.f11293a.get());
    }
}
