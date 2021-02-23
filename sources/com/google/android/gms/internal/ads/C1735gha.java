package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.gha  reason: case insensitive filesystem */
public final class C1735gha<T> {

    /* renamed from: a  reason: collision with root package name */
    private final List<C1876iha<T>> f10563a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C1876iha<Collection<T>>> f10564b;

    private C1735gha(int i, int i2) {
        this.f10563a = Wga.a(i);
        this.f10564b = Wga.a(i2);
    }

    public final C1593eha<T> a() {
        return new C1593eha<>(this.f10563a, this.f10564b);
    }

    public final C1735gha<T> a(C1876iha<? extends T> iha) {
        this.f10563a.add(iha);
        return this;
    }

    public final C1735gha<T> b(C1876iha<? extends Collection<? extends T>> iha) {
        this.f10564b.add(iha);
        return this;
    }
}
