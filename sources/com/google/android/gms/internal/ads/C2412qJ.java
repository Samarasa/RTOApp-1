package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.qJ  reason: case insensitive filesystem */
public final class C2412qJ implements Xga<C2270oJ> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f11833a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f11834b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C2617tC> f11835c;

    public C2412qJ(C1876iha<Context> iha, C1876iha<Executor> iha2, C1876iha<C2617tC> iha3) {
        this.f11833a = iha;
        this.f11834b = iha2;
        this.f11835c = iha3;
    }

    public final /* synthetic */ Object get() {
        return new C2270oJ(this.f11833a.get(), this.f11834b.get(), this.f11835c.get());
    }
}
