package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.v;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Xx  reason: case insensitive filesystem */
public final class C1187Xx implements Xga<C1031Rx> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Set<C3108zx<v.a>>> f9309a;

    private C1187Xx(C1876iha<Set<C3108zx<v.a>>> iha) {
        this.f9309a = iha;
    }

    public static C1187Xx a(C1876iha<Set<C3108zx<v.a>>> iha) {
        return new C1187Xx(iha);
    }

    public final /* synthetic */ Object get() {
        return new C1031Rx(this.f9309a.get());
    }
}
