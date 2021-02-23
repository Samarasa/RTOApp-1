package com.google.android.gms.common.util.a;

import com.google.android.gms.common.internal.C0563t;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final String f6033a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6034b;

    /* renamed from: c  reason: collision with root package name */
    private final ThreadFactory f6035c;

    public a(String str) {
        this(str, 0);
    }

    private a(String str, int i) {
        this.f6035c = Executors.defaultThreadFactory();
        C0563t.a(str, (Object) "Name must not be null");
        this.f6033a = str;
        this.f6034b = 0;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f6035c.newThread(new b(runnable, 0));
        newThread.setName(this.f6033a);
        return newThread;
    }
}
