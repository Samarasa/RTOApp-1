package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.iV  reason: case insensitive filesystem */
public final class C1857iV implements Xga<C1644fV> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Executor> f10814a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1122Vk> f10815b;

    public C1857iV(C1876iha<Executor> iha, C1876iha<C1122Vk> iha2) {
        this.f10814a = iha;
        this.f10815b = iha2;
    }

    public final /* synthetic */ Object get() {
        return new C1644fV(this.f10814a.get(), this.f10815b.get());
    }
}
