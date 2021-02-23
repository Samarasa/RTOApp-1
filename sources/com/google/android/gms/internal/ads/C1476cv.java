package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.cv  reason: case insensitive filesystem */
public final class C1476cv implements Xga<C1080Tu> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Set<C3108zx<C2608su>>> f10102a;

    private C1476cv(C1876iha<Set<C3108zx<C2608su>>> iha) {
        this.f10102a = iha;
    }

    public static C1476cv a(C1876iha<Set<C3108zx<C2608su>>> iha) {
        return new C1476cv(iha);
    }

    public final /* synthetic */ Object get() {
        return new C1080Tu(this.f10102a.get());
    }
}
