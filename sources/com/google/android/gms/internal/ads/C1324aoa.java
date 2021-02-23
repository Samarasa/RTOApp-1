package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.aoa  reason: case insensitive filesystem */
final class C1324aoa implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Handler f9842a;

    C1324aoa(C3096zoa zoa, Handler handler) {
        this.f9842a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f9842a.post(runnable);
    }
}
