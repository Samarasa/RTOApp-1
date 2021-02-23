package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.v;
import java.util.concurrent.Executor;

public final class SA implements Xga<C3108zx<v.a>> {

    /* renamed from: a  reason: collision with root package name */
    private final JA f8568a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2050lC> f8569b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Executor> f8570c;

    public SA(JA ja, C1876iha<C2050lC> iha, C1876iha<Executor> iha2) {
        this.f8568a = ja;
        this.f8569b = iha;
        this.f8570c = iha2;
    }

    public final /* synthetic */ Object get() {
        C3108zx zxVar = new C3108zx(this.f8569b.get(), this.f8570c.get());
        C1452cha.a(zxVar, "Cannot return null from a non-@Nullable @Provides method");
        return zxVar;
    }
}
