package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class NO<T> implements Xga<MO<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Executor> f7959a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Set<JO<? extends KO<T>>>> f7960b;

    private NO(C1876iha<Executor> iha, C1876iha<Set<JO<? extends KO<T>>>> iha2) {
        this.f7959a = iha;
        this.f7960b = iha2;
    }

    public static <T> MO<T> a(Executor executor, Set<JO<? extends KO<T>>> set) {
        return new MO<>(executor, set);
    }

    public static <T> NO<T> a(C1876iha<Executor> iha, C1876iha<Set<JO<? extends KO<T>>>> iha2) {
        return new NO<>(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return a(this.f7959a.get(), this.f7960b.get());
    }
}
