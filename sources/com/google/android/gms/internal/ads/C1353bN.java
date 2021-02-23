package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;

/* renamed from: com.google.android.gms.internal.ads.bN  reason: case insensitive filesystem */
public final class C1353bN implements Xga<VM<QM>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<PM> f9900a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<e> f9901b;

    public C1353bN(C1876iha<PM> iha, C1876iha<e> iha2) {
        this.f9900a = iha;
        this.f9901b = iha2;
    }

    public final /* synthetic */ Object get() {
        VM vm = new VM(this.f9900a.get(), 10000, this.f9901b.get());
        C1452cha.a(vm, "Cannot return null from a non-@Nullable @Provides method");
        return vm;
    }
}
