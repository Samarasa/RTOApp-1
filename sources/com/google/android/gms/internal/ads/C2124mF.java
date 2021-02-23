package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.mF  reason: case insensitive filesystem */
public final class C2124mF implements Xga<JF> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f11280a;

    private C2124mF(C1876iha<Context> iha) {
        this.f11280a = iha;
    }

    public static JF a(Context context) {
        JF jf = new JF(context);
        C1452cha.a(jf, "Cannot return null from a non-@Nullable @Provides method");
        return jf;
    }

    public static C2124mF a(C1876iha<Context> iha) {
        return new C2124mF(iha);
    }

    public final /* synthetic */ Object get() {
        return a(this.f11280a.get());
    }
}
