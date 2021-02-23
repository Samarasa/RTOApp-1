package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.b.a;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.zE  reason: case insensitive filesystem */
public final class C3045zE implements Xga<Set<C3108zx<a>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C2619tE f13021a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<DE> f13022b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Executor> f13023c;

    private C3045zE(C2619tE tEVar, C1876iha<DE> iha, C1876iha<Executor> iha2) {
        this.f13021a = tEVar;
        this.f13022b = iha;
        this.f13023c = iha2;
    }

    public static C3045zE a(C2619tE tEVar, C1876iha<DE> iha, C1876iha<Executor> iha2) {
        return new C3045zE(tEVar, iha, iha2);
    }

    public final /* synthetic */ Object get() {
        Set<C3108zx<a>> b2 = C2619tE.b(this.f13022b.get(), this.f13023c.get());
        C1452cha.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
