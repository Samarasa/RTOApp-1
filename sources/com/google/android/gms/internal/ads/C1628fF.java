package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* renamed from: com.google.android.gms.internal.ads.fF  reason: case insensitive filesystem */
public final class C1628fF implements Xga<ApplicationInfo> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f10366a;

    private C1628fF(C1876iha<Context> iha) {
        this.f10366a = iha;
    }

    public static ApplicationInfo a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        C1452cha.a(applicationInfo, "Cannot return null from a non-@Nullable @Provides method");
        return applicationInfo;
    }

    public static C1628fF a(C1876iha<Context> iha) {
        return new C1628fF(iha);
    }

    public final /* synthetic */ Object get() {
        return a(this.f10366a.get());
    }
}
