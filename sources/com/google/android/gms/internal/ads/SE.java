package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class SE implements Xga<FE> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Executor> f8583a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f8584b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<WeakReference<Context>> f8585c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<Executor> f8586d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<C1555eD> f8587e;

    /* renamed from: f  reason: collision with root package name */
    private final C1876iha<ScheduledExecutorService> f8588f;

    /* renamed from: g  reason: collision with root package name */
    private final C1876iha<C2265oE> f8589g;

    /* renamed from: h  reason: collision with root package name */
    private final C1876iha<C1200Yk> f8590h;

    public SE(C1876iha<Executor> iha, C1876iha<Context> iha2, C1876iha<WeakReference<Context>> iha3, C1876iha<Executor> iha4, C1876iha<C1555eD> iha5, C1876iha<ScheduledExecutorService> iha6, C1876iha<C2265oE> iha7, C1876iha<C1200Yk> iha8) {
        this.f8583a = iha;
        this.f8584b = iha2;
        this.f8585c = iha3;
        this.f8586d = iha4;
        this.f8587e = iha5;
        this.f8588f = iha6;
        this.f8589g = iha7;
        this.f8590h = iha8;
    }

    public final /* synthetic */ Object get() {
        return new FE(this.f8583a.get(), this.f8584b.get(), this.f8585c.get(), this.f8586d.get(), this.f8587e.get(), this.f8588f.get(), this.f8589g.get(), this.f8590h.get());
    }
}
