package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Sr  reason: case insensitive filesystem */
public final class C1051Sr implements Xga<C0939Oj> {

    /* renamed from: a  reason: collision with root package name */
    private final C0661Dr f8699a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f8700b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<SS> f8701c;

    public C1051Sr(C0661Dr dr, C1876iha<Context> iha, C1876iha<SS> iha2) {
        this.f8699a = dr;
        this.f8700b = iha;
        this.f8701c = iha2;
    }

    public final /* synthetic */ Object get() {
        C0939Oj oj = new C0939Oj(this.f8700b.get(), this.f8701c.get().f8620f);
        C1452cha.a(oj, "Cannot return null from a non-@Nullable @Provides method");
        return oj;
    }
}
