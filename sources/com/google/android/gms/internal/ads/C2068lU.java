package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.lU  reason: case insensitive filesystem */
final class C2068lU implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f11176a = new AtomicInteger(1);

    C2068lU() {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f11176a.getAndIncrement();
        StringBuilder sb = new StringBuilder(25);
        sb.append("AdWorker(NG) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
