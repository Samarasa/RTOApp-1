package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.uha  reason: case insensitive filesystem */
final class C2727uha implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadFactory f12373a = Executors.defaultThreadFactory();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f12374b = new AtomicInteger(1);

    C2727uha() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f12373a.newThread(runnable);
        int andIncrement = this.f12374b.getAndIncrement();
        StringBuilder sb = new StringBuilder(16);
        sb.append("gads-");
        sb.append(andIncrement);
        newThread.setName(sb.toString());
        return newThread;
    }
}
