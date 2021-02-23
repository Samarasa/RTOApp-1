package c.b.b.b.b;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import c.b.b.b.c.b;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.Q;
import com.google.android.gms.common.internal.S;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.concurrent.Callable;

final class q {

    /* renamed from: a  reason: collision with root package name */
    private static volatile S f3895a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f3896b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static Context f3897c;

    static z a(String str, r rVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return b(str, rVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static final /* synthetic */ String a(boolean z, String str, r rVar) {
        boolean z2 = true;
        if (z || !b(str, rVar, true, false).f3911b) {
            z2 = false;
        }
        return z.a(str, rVar, z, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void a(android.content.Context r2) {
        /*
            java.lang.Class<c.b.b.b.b.q> r0 = c.b.b.b.b.q.class
            monitor-enter(r0)
            android.content.Context r1 = f3897c     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x0018
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x001a }
            f3897c = r2     // Catch:{ all -> 0x001a }
            monitor-exit(r0)
            return
        L_0x0011:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r1 = "GoogleCertificates has been initialized already"
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r0)
            return
        L_0x001a:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.b.q.a(android.content.Context):void");
    }

    private static z b(String str, r rVar, boolean z, boolean z2) {
        try {
            if (f3895a == null) {
                C0563t.a(f3897c);
                synchronized (f3896b) {
                    if (f3895a == null) {
                        f3895a = Q.a(DynamiteModule.a(f3897c, DynamiteModule.l, "com.google.android.gms.googlecertificates").a("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            C0563t.a(f3897c);
            try {
                return f3895a.a(new x(str, rVar, z, z2), b.a(f3897c.getPackageManager())) ? z.a() : z.a((Callable<String>) new s(z, str, rVar));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return z.a("module call", e2);
            }
        } catch (DynamiteModule.a e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            String valueOf = String.valueOf(e3.getMessage());
            return z.a(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e3);
        }
    }
}
