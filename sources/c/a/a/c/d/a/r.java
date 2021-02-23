package c.a.a.c.d.a;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import c.a.a.c.b;
import java.io.File;

final class r {

    /* renamed from: a  reason: collision with root package name */
    private static final File f3403a = new File("/proc/self/fd");

    /* renamed from: b  reason: collision with root package name */
    private static volatile r f3404b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f3405c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f3406d = true;

    private r() {
    }

    static r a() {
        if (f3404b == null) {
            synchronized (r.class) {
                if (f3404b == null) {
                    f3404b = new r();
                }
            }
        }
        return f3404b;
    }

    private synchronized boolean b() {
        int i = this.f3405c + 1;
        this.f3405c = i;
        if (i >= 50) {
            boolean z = false;
            this.f3405c = 0;
            int length = f3403a.list().length;
            if (length < 700) {
                z = true;
            }
            this.f3406d = z;
            if (!this.f3406d && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + 700);
            }
        }
        return this.f3406d;
    }

    /* access modifiers changed from: package-private */
    @TargetApi(26)
    public boolean a(int i, int i2, BitmapFactory.Options options, b bVar, boolean z, boolean z2) {
        if (!z || Build.VERSION.SDK_INT < 26 || z2) {
            return false;
        }
        boolean z3 = i >= 128 && i2 >= 128 && b();
        if (z3) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return z3;
    }
}
