package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;

/* renamed from: com.google.android.gms.internal.ads.eN  reason: case insensitive filesystem */
public final class C1565eN implements Xga<VM<QO>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<PO> f10255a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<e> f10256b;

    public C1565eN(C1876iha<PO> iha, C1876iha<e> iha2) {
        this.f10255a = iha;
        this.f10256b = iha2;
    }

    public final /* synthetic */ Object get() {
        VM vm = new VM(this.f10255a.get(), C2783va.f12507a.a().longValue(), this.f10256b.get());
        C1452cha.a(vm, "Cannot return null from a non-@Nullable @Provides method");
        return vm;
    }
}
