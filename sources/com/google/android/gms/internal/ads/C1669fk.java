package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.fk  reason: case insensitive filesystem */
final class C1669fk implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f10448a = new AtomicInteger(1);

    C1669fk(C1017Rj rj) {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f10448a.getAndIncrement();
        StringBuilder sb = new StringBuilder(42);
        sb.append("AdWorker(SCION_TASK_EXECUTOR) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
