package com.google.firebase.iid;

import android.content.Intent;
import c.b.b.b.f.a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.y  reason: case insensitive filesystem */
public final class C3337y {

    /* renamed from: a  reason: collision with root package name */
    private static final long f14617a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b  reason: collision with root package name */
    private static final Object f14618b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static a f14619c;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName a(android.content.Context r4, android.content.Intent r5) {
        /*
            java.lang.Object r0 = f14618b
            monitor-enter(r0)
            c.b.b.b.f.a r1 = f14619c     // Catch:{ all -> 0x0032 }
            r2 = 1
            if (r1 != 0) goto L_0x0014
            c.b.b.b.f.a r1 = new c.b.b.b.f.a     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "wake:com.google.firebase.iid.WakeLockHolder"
            r1.<init>(r4, r2, r3)     // Catch:{ all -> 0x0032 }
            f14619c = r1     // Catch:{ all -> 0x0032 }
            r1.a((boolean) r2)     // Catch:{ all -> 0x0032 }
        L_0x0014:
            java.lang.String r1 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r3 = 0
            boolean r1 = r5.getBooleanExtra(r1, r3)     // Catch:{ all -> 0x0032 }
            a((android.content.Intent) r5, (boolean) r2)     // Catch:{ all -> 0x0032 }
            android.content.ComponentName r4 = r4.startService(r5)     // Catch:{ all -> 0x0032 }
            if (r4 != 0) goto L_0x0027
            r4 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r4
        L_0x0027:
            if (r1 != 0) goto L_0x0030
            c.b.b.b.f.a r5 = f14619c     // Catch:{ all -> 0x0032 }
            long r1 = f14617a     // Catch:{ all -> 0x0032 }
            r5.a((long) r1)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r4
        L_0x0032:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C3337y.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    public static void a(Intent intent) {
        synchronized (f14618b) {
            if (f14619c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                a(intent, false);
                f14619c.a();
            }
        }
    }

    private static void a(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }
}
