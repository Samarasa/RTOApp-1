package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.iO  reason: case insensitive filesystem */
public final class C1850iO implements Xga<C1708gO> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f10796a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<String> f10797b;

    private C1850iO(C1876iha<Context> iha, C1876iha<String> iha2) {
        this.f10796a = iha;
        this.f10797b = iha2;
    }

    public static C1708gO a(Context context, String str) {
        return new C1708gO(context, str);
    }

    public static C1850iO a(C1876iha<Context> iha, C1876iha<String> iha2) {
        return new C1850iO(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return a(this.f10796a.get(), this.f10797b.get());
    }
}
