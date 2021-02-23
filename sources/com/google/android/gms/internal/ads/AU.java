package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public final class AU implements Xga<ScheduledExecutorService> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<ThreadFactory> f6118a;

    public AU(C1876iha<ThreadFactory> iha) {
        this.f6118a = iha;
    }

    public final /* synthetic */ Object get() {
        ScheduledExecutorService b2 = C2850wW.a().b(1, this.f6118a.get(), BW.f6298b);
        C1452cha.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
