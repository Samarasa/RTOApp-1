package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.vE  reason: case insensitive filesystem */
public final class C2761vE implements Xga<Set<C3108zx<C2963xu>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C2619tE f12465a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<DE> f12466b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Executor> f12467c;

    private C2761vE(C2619tE tEVar, C1876iha<DE> iha, C1876iha<Executor> iha2) {
        this.f12465a = tEVar;
        this.f12466b = iha;
        this.f12467c = iha2;
    }

    public static C2761vE a(C2619tE tEVar, C1876iha<DE> iha, C1876iha<Executor> iha2) {
        return new C2761vE(tEVar, iha, iha2);
    }

    public final /* synthetic */ Object get() {
        Set<C3108zx<C2963xu>> d2 = C2619tE.d(this.f12466b.get(), this.f12467c.get());
        C1452cha.a(d2, "Cannot return null from a non-@Nullable @Provides method");
        return d2;
    }
}
