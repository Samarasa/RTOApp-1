package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.pP  reason: case insensitive filesystem */
public final class C2347pP implements Xga<C2063lP> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2590sk> f11699a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Integer> f11700b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Context> f11701c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C2874wk> f11702d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<ScheduledExecutorService> f11703e;

    /* renamed from: f  reason: collision with root package name */
    private final C1876iha<Executor> f11704f;

    public C2347pP(C1876iha<C2590sk> iha, C1876iha<Integer> iha2, C1876iha<Context> iha3, C1876iha<C2874wk> iha4, C1876iha<ScheduledExecutorService> iha5, C1876iha<Executor> iha6) {
        this.f11699a = iha;
        this.f11700b = iha2;
        this.f11701c = iha3;
        this.f11702d = iha4;
        this.f11703e = iha5;
        this.f11704f = iha6;
    }

    public final /* synthetic */ Object get() {
        return new C2063lP(this.f11699a.get(), this.f11700b.get().intValue(), this.f11701c.get(), this.f11702d.get(), this.f11703e.get(), this.f11704f.get());
    }
}
