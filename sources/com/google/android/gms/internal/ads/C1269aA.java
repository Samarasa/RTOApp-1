package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.aA  reason: case insensitive filesystem */
public final class C1269aA implements Xga<C0939Oj> {

    /* renamed from: a  reason: collision with root package name */
    private final C1189Xz f9753a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f9754b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<SS> f9755c;

    private C1269aA(C1189Xz xz, C1876iha<Context> iha, C1876iha<SS> iha2) {
        this.f9753a = xz;
        this.f9754b = iha;
        this.f9755c = iha2;
    }

    public static C1269aA a(C1189Xz xz, C1876iha<Context> iha, C1876iha<SS> iha2) {
        return new C1269aA(xz, iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C0939Oj oj = new C0939Oj(this.f9754b.get(), this.f9755c.get().f8620f);
        C1452cha.a(oj, "Cannot return null from a non-@Nullable @Provides method");
        return oj;
    }
}
