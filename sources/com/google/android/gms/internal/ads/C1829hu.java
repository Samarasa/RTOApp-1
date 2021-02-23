package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.hu  reason: case insensitive filesystem */
public final class C1829hu implements Xga<Context> {

    /* renamed from: a  reason: collision with root package name */
    private final C1616eu f10751a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f10752b;

    private C1829hu(C1616eu euVar, C1876iha<Context> iha) {
        this.f10751a = euVar;
        this.f10752b = iha;
    }

    public static C1829hu a(C1616eu euVar, C1876iha<Context> iha) {
        return new C1829hu(euVar, iha);
    }

    public final /* synthetic */ Object get() {
        Context a2 = this.f10751a.a(this.f10752b.get());
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
