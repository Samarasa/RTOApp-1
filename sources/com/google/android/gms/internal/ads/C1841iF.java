package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.iF  reason: case insensitive filesystem */
public final class C1841iF implements Xga<List<String>> {
    public static C1841iF a() {
        return C1770hF.f10650a;
    }

    public static List<String> b() {
        List<String> a2 = F.a();
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
