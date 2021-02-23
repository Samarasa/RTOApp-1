package com.google.firebase.iid;

import java.util.concurrent.ThreadFactory;

final /* synthetic */ class I implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    static final ThreadFactory f14520a = new I();

    private I() {
    }

    public final Thread newThread(Runnable runnable) {
        return C3315b.a(runnable);
    }
}
