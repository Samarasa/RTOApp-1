package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class G {

    /* renamed from: a  reason: collision with root package name */
    final Intent f14515a;

    /* renamed from: b  reason: collision with root package name */
    private final BroadcastReceiver.PendingResult f14516b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14517c = false;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledFuture<?> f14518d;

    G(Intent intent, BroadcastReceiver.PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f14515a = intent;
        this.f14516b = pendingResult;
        this.f14518d = scheduledExecutorService.schedule(new F(this, intent), 9000, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        if (!this.f14517c) {
            this.f14516b.finish();
            this.f14518d.cancel(false);
            this.f14517c = true;
        }
    }
}
