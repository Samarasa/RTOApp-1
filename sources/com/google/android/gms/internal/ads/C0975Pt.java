package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.C0502h;

/* renamed from: com.google.android.gms.internal.ads.Pt  reason: case insensitive filesystem */
public final class C0975Pt implements Xga<UW<C2988yS, C0502h>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f8285a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1200Yk> f8286b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<SS> f8287c;

    public C0975Pt(C1876iha<Context> iha, C1876iha<C1200Yk> iha2, C1876iha<SS> iha3) {
        this.f8285a = iha;
        this.f8286b = iha2;
        this.f8287c = iha3;
    }

    public final /* synthetic */ Object get() {
        C1001Qt qt = new C1001Qt(this.f8285a.get(), this.f8286b.get(), this.f8287c.get());
        C1452cha.a(qt, "Cannot return null from a non-@Nullable @Provides method");
        return qt;
    }
}
