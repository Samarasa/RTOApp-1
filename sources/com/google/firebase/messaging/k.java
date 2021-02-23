package com.google.firebase.messaging;

import java.util.concurrent.Executor;

final /* synthetic */ class k implements Executor {

    /* renamed from: a  reason: collision with root package name */
    static final Executor f14661a = new k();

    private k() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
