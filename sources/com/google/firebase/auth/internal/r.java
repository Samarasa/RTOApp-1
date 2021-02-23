package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.Looper;
import c.b.b.b.d.d.Ha;
import java.util.concurrent.Executor;

public final class r implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private static r f14399a = new r();

    /* renamed from: b  reason: collision with root package name */
    private Handler f14400b = new Ha(Looper.getMainLooper());

    private r() {
    }

    public static r a() {
        return f14399a;
    }

    public final void execute(Runnable runnable) {
        this.f14400b.post(runnable);
    }
}
