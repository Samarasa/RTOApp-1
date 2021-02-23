package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.zD  reason: case insensitive filesystem */
public final class C3044zD implements Xga<Set<C3108zx<C1290aV>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Executor> f13019a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<QD> f13020b;

    private C3044zD(C1876iha<Executor> iha, C1876iha<QD> iha2) {
        this.f13019a = iha;
        this.f13020b = iha2;
    }

    public static C3044zD a(C1876iha<Executor> iha, C1876iha<QD> iha2) {
        return new C3044zD(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        Executor executor = this.f13019a.get();
        Set singleton = ((Boolean) Qqa.e().a(F.id)).booleanValue() ? Collections.singleton(new C3108zx(this.f13020b.get(), executor)) : Collections.emptySet();
        C1452cha.a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }
}
