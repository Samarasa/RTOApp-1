package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.ads.Zk  reason: case insensitive filesystem */
final class C1226Zk extends ScheduledThreadPoolExecutor {
    C1226Zk(int i, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }

    public final void execute(Runnable runnable) {
        AW.a().a(runnable);
        super.execute(runnable);
    }
}
