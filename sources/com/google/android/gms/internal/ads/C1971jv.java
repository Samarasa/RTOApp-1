package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h.a;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.jv  reason: case insensitive filesystem */
public final class C1971jv implements Xga<C1830hv> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Set<C3108zx<a>>> f11018a;

    private C1971jv(C1876iha<Set<C3108zx<a>>> iha) {
        this.f11018a = iha;
    }

    public static C1971jv a(C1876iha<Set<C3108zx<a>>> iha) {
        return new C1971jv(iha);
    }

    public final /* synthetic */ Object get() {
        return new C1830hv(this.f11018a.get());
    }
}
