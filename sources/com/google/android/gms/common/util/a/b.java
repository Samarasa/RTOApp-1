package com.google.android.gms.common.util.a;

import android.os.Process;

final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f6036a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6037b;

    public b(Runnable runnable, int i) {
        this.f6036a = runnable;
        this.f6037b = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f6037b);
        this.f6036a.run();
    }
}
