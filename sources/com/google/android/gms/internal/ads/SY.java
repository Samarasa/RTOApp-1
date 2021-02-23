package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class SY<V> extends BY<V> implements LY<V>, ScheduledFuture<V> {

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledFuture<?> f8642b;

    public SY(LY<V> ly, ScheduledFuture<?> scheduledFuture) {
        super(ly);
        this.f8642b = scheduledFuture;
    }

    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.f8642b.cancel(z);
        }
        return cancel;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.f8642b.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.f8642b.getDelay(timeUnit);
    }
}
