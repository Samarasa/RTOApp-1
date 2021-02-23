package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import com.google.android.gms.common.util.e;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Qq  reason: case insensitive filesystem */
public final class C0998Qq implements Mna {

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f8393a;

    /* renamed from: b  reason: collision with root package name */
    private final e f8394b;

    /* renamed from: c  reason: collision with root package name */
    private ScheduledFuture<?> f8395c;

    /* renamed from: d  reason: collision with root package name */
    private long f8396d = -1;

    /* renamed from: e  reason: collision with root package name */
    private long f8397e = -1;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f8398f = null;

    /* renamed from: g  reason: collision with root package name */
    private boolean f8399g = false;

    public C0998Qq(ScheduledExecutorService scheduledExecutorService, e eVar) {
        this.f8393a = scheduledExecutorService;
        this.f8394b = eVar;
        p.f().a((Mna) this);
    }

    private final synchronized void a() {
        if (!this.f8399g) {
            if (this.f8395c == null || this.f8395c.isDone()) {
                this.f8397e = -1;
            } else {
                this.f8395c.cancel(true);
                this.f8397e = this.f8396d - this.f8394b.b();
            }
            this.f8399g = true;
        }
    }

    private final synchronized void b() {
        if (this.f8399g) {
            if (this.f8397e > 0 && this.f8395c != null && this.f8395c.isCancelled()) {
                this.f8395c = this.f8393a.schedule(this.f8398f, this.f8397e, TimeUnit.MILLISECONDS);
            }
            this.f8399g = false;
        }
    }

    public final synchronized void a(int i, Runnable runnable) {
        this.f8398f = runnable;
        long j = (long) i;
        this.f8396d = this.f8394b.b() + j;
        this.f8395c = this.f8393a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    public final void a(boolean z) {
        if (z) {
            b();
        } else {
            a();
        }
    }
}
