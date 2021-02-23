package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.bl  reason: case insensitive filesystem */
final class C1388bl implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f9954a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f9955b;

    C1388bl(String str) {
        this.f9955b = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f9955b;
        int andIncrement = this.f9954a.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
