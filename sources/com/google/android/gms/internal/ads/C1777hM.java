package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.hM  reason: case insensitive filesystem */
public final class C1777hM implements Xga<C1423cM> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<LY<String>> f10661a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f10662b;

    private C1777hM(C1876iha<LY<String>> iha, C1876iha<Executor> iha2) {
        this.f10661a = iha;
        this.f10662b = iha2;
    }

    public static C1777hM a(C1876iha<LY<String>> iha, C1876iha<Executor> iha2) {
        return new C1777hM(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return new C1423cM(this.f10661a.get(), this.f10662b.get());
    }
}
