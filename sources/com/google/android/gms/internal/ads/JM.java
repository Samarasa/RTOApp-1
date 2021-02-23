package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class JM implements Xga<FM> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f7401a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<ScheduledExecutorService> f7402b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Executor> f7403c;

    private JM(C1876iha<Context> iha, C1876iha<ScheduledExecutorService> iha2, C1876iha<Executor> iha3) {
        this.f7401a = iha;
        this.f7402b = iha2;
        this.f7403c = iha3;
    }

    public static JM a(C1876iha<Context> iha, C1876iha<ScheduledExecutorService> iha2, C1876iha<Executor> iha3) {
        return new JM(iha, iha2, iha3);
    }

    public final /* synthetic */ Object get() {
        return new FM(this.f7401a.get(), this.f7402b.get(), this.f7403c.get());
    }
}
