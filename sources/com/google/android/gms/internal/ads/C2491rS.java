package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.rS  reason: case insensitive filesystem */
public final class C2491rS implements Xga<C2137mS> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<String> f11969a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1570eS> f11970b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Context> f11971c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<JR> f11972d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<NS> f11973e;

    public C2491rS(C1876iha<String> iha, C1876iha<C1570eS> iha2, C1876iha<Context> iha3, C1876iha<JR> iha4, C1876iha<NS> iha5) {
        this.f11969a = iha;
        this.f11970b = iha2;
        this.f11971c = iha3;
        this.f11972d = iha4;
        this.f11973e = iha5;
    }

    public final /* synthetic */ Object get() {
        return new C2137mS(this.f11969a.get(), this.f11970b.get(), this.f11971c.get(), this.f11972d.get(), this.f11973e.get());
    }
}
