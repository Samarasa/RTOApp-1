package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;

/* renamed from: com.google.android.gms.internal.ads.kt  reason: case insensitive filesystem */
public final class C2040kt implements Xga<C2111lt> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<e> f11122a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2803vk> f11123b;

    private C2040kt(C1876iha<e> iha, C1876iha<C2803vk> iha2) {
        this.f11122a = iha;
        this.f11123b = iha2;
    }

    public static C2040kt a(C1876iha<e> iha, C1876iha<C2803vk> iha2) {
        return new C2040kt(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return new C2111lt(this.f11122a.get(), this.f11123b.get());
    }
}
