package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.C0518y;

/* renamed from: com.google.android.gms.internal.ads.Vp  reason: case insensitive filesystem */
public final class C1127Vp implements Xga<C0518y> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f9092a;

    public C1127Vp(C1876iha<Context> iha) {
        this.f9092a = iha;
    }

    public final /* synthetic */ Object get() {
        C0518y yVar = new C0518y(this.f9092a.get());
        C1452cha.a(yVar, "Cannot return null from a non-@Nullable @Provides method");
        return yVar;
    }
}
