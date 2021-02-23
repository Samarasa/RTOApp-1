package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.b  reason: case insensitive filesystem */
final class C3315b {

    /* renamed from: a  reason: collision with root package name */
    private static final Executor f14552a = H.f14519a;

    static final /* synthetic */ Thread a(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }

    static Executor a() {
        return f14552a;
    }

    static Executor b() {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), I.f14520a);
    }
}
