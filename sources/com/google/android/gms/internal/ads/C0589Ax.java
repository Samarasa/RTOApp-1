package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Ax  reason: case insensitive filesystem */
public final class C0589Ax implements Xga<C3037yx> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f6231a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Set<C3108zx<C2739una>>> f6232b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C2988yS> f6233c;

    private C0589Ax(C1876iha<Context> iha, C1876iha<Set<C3108zx<C2739una>>> iha2, C1876iha<C2988yS> iha3) {
        this.f6231a = iha;
        this.f6232b = iha2;
        this.f6233c = iha3;
    }

    public static C0589Ax a(C1876iha<Context> iha, C1876iha<Set<C3108zx<C2739una>>> iha2, C1876iha<C2988yS> iha3) {
        return new C0589Ax(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        return new C3037yx(this.f6231a.get(), this.f6232b.get(), this.f6233c.get());
    }
}
