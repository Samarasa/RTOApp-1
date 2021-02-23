package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class ZY<V> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private XY<V> f9556a;

    ZY(XY<V> xy) {
        this.f9556a = xy;
    }

    public final void run() {
        LY a2;
        String str;
        XY<V> xy = this.f9556a;
        if (xy != null && (a2 = xy.f9245h) != null) {
            this.f9556a = null;
            if (a2.isDone()) {
                xy.a((LY<? extends V>) a2);
                return;
            }
            try {
                ScheduledFuture b2 = xy.i;
                ScheduledFuture unused = xy.i = null;
                str = "Timed out";
                if (b2 != null) {
                    long abs = Math.abs(b2.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        StringBuilder sb = new StringBuilder(str.length() + 66);
                        sb.append(str);
                        sb.append(" (timeout delayed by ");
                        sb.append(abs);
                        sb.append(" ms after scheduled time)");
                        str = sb.toString();
                    }
                }
                String valueOf = String.valueOf(str);
                String valueOf2 = String.valueOf(a2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
                sb2.append(valueOf);
                sb2.append(": ");
                sb2.append(valueOf2);
                xy.a((Throwable) new YY(sb2.toString()));
                a2.cancel(true);
            } catch (Throwable th) {
                a2.cancel(true);
                throw th;
            }
        }
    }
}
