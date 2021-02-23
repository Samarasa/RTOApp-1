package com.google.firebase.remoteconfig.internal;

import java.util.concurrent.Executor;

final /* synthetic */ class d implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private static final d f14729a = new d();

    private d() {
    }

    public static Executor a() {
        return f14729a;
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
