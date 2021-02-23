package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class XY<V> extends C2923xY<V> {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public LY<V> f9245h;
    /* access modifiers changed from: private */
    public ScheduledFuture<?> i;

    private XY(LY<V> ly) {
        C1434cX.a(ly);
        this.f9245h = ly;
    }

    static <V> LY<V> a(LY<V> ly, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        XY xy = new XY(ly);
        ZY zy = new ZY(xy);
        xy.i = scheduledExecutorService.schedule(zy, j, timeUnit);
        ly.a(zy, C2568sY.INSTANCE);
        return xy;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        a((Future<?>) this.f9245h);
        ScheduledFuture<?> scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f9245h = null;
        this.i = null;
    }

    /* access modifiers changed from: protected */
    public final String d() {
        LY<V> ly = this.f9245h;
        ScheduledFuture<?> scheduledFuture = this.i;
        if (ly == null) {
            return null;
        }
        String valueOf = String.valueOf(ly);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("inputFuture=[");
        sb.append(valueOf);
        sb.append("]");
        String sb2 = sb.toString();
        if (scheduledFuture == null) {
            return sb2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return sb2;
        }
        String valueOf2 = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 43);
        sb3.append(valueOf2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }
}
