package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.jF  reason: case insensitive filesystem */
public final class C1911jF implements Xga<String> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f10890a;

    private C1911jF(C1876iha<Context> iha) {
        this.f10890a = iha;
    }

    public static C1911jF a(C1876iha<Context> iha) {
        return new C1911jF(iha);
    }

    public static String a(Context context) {
        String packageName = context.getPackageName();
        C1452cha.a(packageName, "Cannot return null from a non-@Nullable @Provides method");
        return packageName;
    }

    public final /* synthetic */ Object get() {
        return a(this.f10890a.get());
    }
}
