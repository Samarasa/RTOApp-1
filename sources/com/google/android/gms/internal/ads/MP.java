package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public final class MP implements Xga<KP> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C0677Eh> f7836a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<ScheduledExecutorService> f7837b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Context> f7838c;

    public MP(C1876iha<C0677Eh> iha, C1876iha<ScheduledExecutorService> iha2, C1876iha<Context> iha3) {
        this.f7836a = iha;
        this.f7837b = iha2;
        this.f7838c = iha3;
    }

    public final /* synthetic */ Object get() {
        return new KP(this.f7836a.get(), this.f7837b.get(), this.f7838c.get());
    }
}
