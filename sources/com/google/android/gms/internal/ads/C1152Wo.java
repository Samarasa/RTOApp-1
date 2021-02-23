package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Wo  reason: case insensitive filesystem */
public final class C1152Wo implements Xga<C0704Fi> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f9173a;

    public C1152Wo(C1876iha<Context> iha) {
        this.f9173a = iha;
    }

    public final /* synthetic */ Object get() {
        Context context = this.f9173a.get();
        C0652Di di = new C0652Di(context, new C0756Hi(context).a());
        C1452cha.a(di, "Cannot return null from a non-@Nullable @Provides method");
        return di;
    }
}
