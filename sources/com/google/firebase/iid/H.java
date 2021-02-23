package com.google.firebase.iid;

import java.util.concurrent.Executor;

final /* synthetic */ class H implements Executor {

    /* renamed from: a  reason: collision with root package name */
    static final Executor f14519a = new H();

    private H() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
