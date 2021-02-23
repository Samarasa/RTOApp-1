package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.b.a;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Bw  reason: case insensitive filesystem */
public final class C0614Bw implements Xga<C3036yw> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Set<C3108zx<a>>> f6379a;

    private C0614Bw(C1876iha<Set<C3108zx<a>>> iha) {
        this.f6379a = iha;
    }

    public static C0614Bw a(C1876iha<Set<C3108zx<a>>> iha) {
        return new C0614Bw(iha);
    }

    public final /* synthetic */ Object get() {
        return new C3036yw(this.f6379a.get());
    }
}
