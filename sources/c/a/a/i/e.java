package c.a.a.i;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.SystemClock;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final double f3649a;

    static {
        double d2 = 1.0d;
        if (Build.VERSION.SDK_INT >= 17) {
            d2 = 1.0d / Math.pow(10.0d, 6.0d);
        }
        f3649a = d2;
    }

    public static double a(long j) {
        double a2 = (double) (a() - j);
        double d2 = f3649a;
        Double.isNaN(a2);
        return a2 * d2;
    }

    @TargetApi(17)
    public static long a() {
        return Build.VERSION.SDK_INT >= 17 ? SystemClock.elapsedRealtimeNanos() : SystemClock.uptimeMillis();
    }
}
