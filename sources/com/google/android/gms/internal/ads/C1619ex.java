package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.b.a;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ex  reason: case insensitive filesystem */
public final class C1619ex implements Xga<Set<C3108zx<a>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1004Qw f10348a;

    private C1619ex(C1004Qw qw) {
        this.f10348a = qw;
    }

    public static C1619ex a(C1004Qw qw) {
        return new C1619ex(qw);
    }

    public final /* synthetic */ Object get() {
        Set<C3108zx<a>> f2 = this.f10348a.f();
        C1452cha.a(f2, "Cannot return null from a non-@Nullable @Provides method");
        return f2;
    }
}
