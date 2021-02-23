package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.cP  reason: case insensitive filesystem */
public final class C1426cP implements Xga<XO> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2590sk> f10028a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f10029b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<ScheduledExecutorService> f10030c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<Executor> f10031d;

    public C1426cP(C1876iha<C2590sk> iha, C1876iha<Context> iha2, C1876iha<ScheduledExecutorService> iha3, C1876iha<Executor> iha4) {
        this.f10028a = iha;
        this.f10029b = iha2;
        this.f10030c = iha3;
        this.f10031d = iha4;
    }

    public final /* synthetic */ Object get() {
        return new XO(this.f10028a.get(), this.f10029b.get(), this.f10030c.get(), this.f10031d.get());
    }
}
