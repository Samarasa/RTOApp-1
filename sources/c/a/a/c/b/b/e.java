package c.a.a.c.b.b;

import android.util.Log;
import c.a.a.a.b;
import c.a.a.c.b.b.a;
import c.a.a.c.h;
import java.io.File;
import java.io.IOException;

public class e implements a {

    /* renamed from: a  reason: collision with root package name */
    private final l f3081a;

    /* renamed from: b  reason: collision with root package name */
    private final File f3082b;

    /* renamed from: c  reason: collision with root package name */
    private final long f3083c;

    /* renamed from: d  reason: collision with root package name */
    private final c f3084d = new c();

    /* renamed from: e  reason: collision with root package name */
    private b f3085e;

    @Deprecated
    protected e(File file, long j) {
        this.f3082b = file;
        this.f3083c = j;
        this.f3081a = new l();
    }

    private synchronized b a() {
        if (this.f3085e == null) {
            this.f3085e = b.a(this.f3082b, 1, 1, this.f3083c);
        }
        return this.f3085e;
    }

    public static a a(File file, long j) {
        return new e(file, j);
    }

    public File a(h hVar) {
        String a2 = this.f3081a.a(hVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + a2 + " for for Key: " + hVar);
        }
        try {
            b.d f2 = a().f(a2);
            if (f2 != null) {
                return f2.a(0);
            }
            return null;
        } catch (IOException e2) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e2);
            return null;
        }
    }

    public void a(h hVar, a.b bVar) {
        b.C0044b e2;
        String a2 = this.f3081a.a(hVar);
        this.f3084d.a(a2);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + a2 + " for for Key: " + hVar);
            }
            try {
                b a3 = a();
                if (a3.f(a2) == null) {
                    e2 = a3.e(a2);
                    if (e2 != null) {
                        if (bVar.a(e2.a(0))) {
                            e2.c();
                        }
                        e2.b();
                        this.f3084d.b(a2);
                        return;
                    }
                    throw new IllegalStateException("Had two simultaneous puts for: " + a2);
                }
            } catch (IOException e3) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e3);
                }
            } catch (Throwable th) {
                e2.b();
                throw th;
            }
        } finally {
            this.f3084d.b(a2);
        }
    }
}
