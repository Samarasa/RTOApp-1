package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Iu  reason: case insensitive filesystem */
public final class C0794Iu implements Xga<C0586Au> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C0690Eu> f7365a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Set<C3108zx<C2892wu>>> f7366b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Executor> f7367c;

    private C0794Iu(C1876iha<C0690Eu> iha, C1876iha<Set<C3108zx<C2892wu>>> iha2, C1876iha<Executor> iha3) {
        this.f7365a = iha;
        this.f7366b = iha2;
        this.f7367c = iha3;
    }

    public static C0794Iu a(C1876iha<C0690Eu> iha, C1876iha<Set<C3108zx<C2892wu>>> iha2, C1876iha<Executor> iha3) {
        return new C0794Iu(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        return new C0586Au(this.f7365a.get(), this.f7366b.get(), this.f7367c.get());
    }
}
