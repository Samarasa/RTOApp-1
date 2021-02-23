package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Mu  reason: case insensitive filesystem */
public final class C0898Mu implements Xga<C0846Ku> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Set<C3108zx<C0872Lu>>> f7928a;

    private C0898Mu(C1876iha<Set<C3108zx<C0872Lu>>> iha) {
        this.f7928a = iha;
    }

    public static C0898Mu a(C1876iha<Set<C3108zx<C0872Lu>>> iha) {
        return new C0898Mu(iha);
    }

    public final /* synthetic */ Object get() {
        return new C0846Ku(this.f7928a.get());
    }
}
