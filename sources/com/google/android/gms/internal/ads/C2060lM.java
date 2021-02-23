package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.lM  reason: case insensitive filesystem */
public final class C2060lM implements Xga<C1918jM> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<VM<QO>> f11162a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<SS> f11163b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Context> f11164c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C2874wk> f11165d;

    private C2060lM(C1876iha<VM<QO>> iha, C1876iha<SS> iha2, C1876iha<Context> iha3, C1876iha<C2874wk> iha4) {
        this.f11162a = iha;
        this.f11163b = iha2;
        this.f11164c = iha3;
        this.f11165d = iha4;
    }

    public static C2060lM a(C1876iha<VM<QO>> iha, C1876iha<SS> iha2, C1876iha<Context> iha3, C1876iha<C2874wk> iha4) {
        return new C2060lM(iha, iha2, iha3, iha4);
    }

    public final /* synthetic */ Object get() {
        return new C1918jM(this.f11162a.get(), this.f11163b.get(), this.f11164c.get(), this.f11165d.get());
    }
}
