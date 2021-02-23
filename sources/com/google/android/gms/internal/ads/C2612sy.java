package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.sy  reason: case insensitive filesystem */
public final class C2612sy implements Xga<C0939Oj> {

    /* renamed from: a  reason: collision with root package name */
    private final C1762gy f12157a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f12158b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<SS> f12159c;

    private C2612sy(C1762gy gyVar, C1876iha<Context> iha, C1876iha<SS> iha2) {
        this.f12157a = gyVar;
        this.f12158b = iha;
        this.f12159c = iha2;
    }

    public static C2612sy a(C1762gy gyVar, C1876iha<Context> iha, C1876iha<SS> iha2) {
        return new C2612sy(gyVar, iha, iha2);
    }

    public final /* synthetic */ Object get() {
        C0939Oj oj = new C0939Oj(this.f12158b.get(), this.f12159c.get().f8620f);
        C1452cha.a(oj, "Cannot return null from a non-@Nullable @Provides method");
        return oj;
    }
}
