package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.ads.tW  reason: case insensitive filesystem */
public interface C2637tW {
    ExecutorService a(int i);

    ExecutorService a(int i, ThreadFactory threadFactory, int i2);

    ExecutorService a(ThreadFactory threadFactory, int i);

    ExecutorService b(int i);

    ExecutorService b(ThreadFactory threadFactory, int i);

    ScheduledExecutorService b(int i, ThreadFactory threadFactory, int i2);
}
