package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.ia;
import com.google.android.gms.ads.internal.util.oa;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.al  reason: case insensitive filesystem */
final class C1317al implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f9837a = new ia(Looper.getMainLooper());

    C1317al() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                p.c();
                oa.a(p.g().a(), th);
                throw th;
            }
        } else {
            this.f9837a.post(runnable);
        }
    }
}
