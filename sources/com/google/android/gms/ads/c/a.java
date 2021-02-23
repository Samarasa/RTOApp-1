package com.google.android.gms.ads.c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import c.b.b.b.b.C0253a;
import c.b.b.b.b.f;
import c.b.b.b.b.g;
import c.b.b.b.b.j;
import c.b.b.b.d.a.d;
import c.b.b.b.d.a.e;
import com.google.android.gms.common.internal.C0563t;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private C0253a f5357a;

    /* renamed from: b  reason: collision with root package name */
    private d f5358b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5359c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f5360d;

    /* renamed from: e  reason: collision with root package name */
    private b f5361e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f5362f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f5363g;

    /* renamed from: h  reason: collision with root package name */
    private final long f5364h;

    /* renamed from: com.google.android.gms.ads.c.a$a  reason: collision with other inner class name */
    public static final class C0070a {

        /* renamed from: a  reason: collision with root package name */
        private final String f5365a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f5366b;

        public C0070a(String str, boolean z) {
            this.f5365a = str;
            this.f5366b = z;
        }

        public final String a() {
            return this.f5365a;
        }

        public final boolean b() {
            return this.f5366b;
        }

        public final String toString() {
            String str = this.f5365a;
            boolean z = this.f5366b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    static class b extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<a> f5367a;

        /* renamed from: b  reason: collision with root package name */
        private long f5368b;

        /* renamed from: c  reason: collision with root package name */
        CountDownLatch f5369c = new CountDownLatch(1);

        /* renamed from: d  reason: collision with root package name */
        boolean f5370d = false;

        public b(a aVar, long j) {
            this.f5367a = new WeakReference<>(aVar);
            this.f5368b = j;
            start();
        }

        private final void a() {
            a aVar = (a) this.f5367a.get();
            if (aVar != null) {
                aVar.a();
                this.f5370d = true;
            }
        }

        public final void run() {
            try {
                if (!this.f5369c.await(this.f5368b, TimeUnit.MILLISECONDS)) {
                    a();
                }
            } catch (InterruptedException unused) {
                a();
            }
        }
    }

    public a(Context context) {
        this(context, 30000, false, false);
    }

    private a(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.f5360d = new Object();
        C0563t.a(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f5362f = context;
        this.f5359c = false;
        this.f5364h = j;
        this.f5363g = z2;
    }

    private static C0253a a(Context context, boolean z) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int a2 = f.a().a(context, (int) j.f3888a);
            if (a2 == 0 || a2 == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                C0253a aVar = new C0253a();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    if (com.google.android.gms.common.stats.a.a().a(context, intent, aVar, 1)) {
                        return aVar;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new g(9);
        }
    }

    private static d a(Context context, C0253a aVar) {
        try {
            return e.a(aVar.a(10000, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    public static C0070a a(Context context) {
        c cVar = new c(context);
        boolean a2 = cVar.a("gads:ad_id_app_context:enabled", false);
        float a3 = cVar.a("gads:ad_id_app_context:ping_ratio", 0.0f);
        String a4 = cVar.a("gads:ad_id_use_shared_preference:experiment_id", BuildConfig.FLAVOR);
        a aVar = new a(context, -1, a2, cVar.a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.b(false);
            C0070a b2 = aVar.b();
            aVar.a(b2, a2, a3, SystemClock.elapsedRealtime() - elapsedRealtime, a4, (Throwable) null);
            aVar.a();
            return b2;
        } catch (Throwable th) {
            aVar.a();
            throw th;
        }
    }

    public static void a(boolean z) {
    }

    private final boolean a(C0070a aVar, boolean z, float f2, long j, String str, Throwable th) {
        if (Math.random() > ((double) f2)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", z ? str2 : "0");
        if (aVar != null) {
            if (!aVar.b()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
        }
        if (!(aVar == null || aVar.a() == null)) {
            hashMap.put("ad_id_size", Integer.toString(aVar.a().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new b(this, hashMap).start();
        return true;
    }

    private final void b(boolean z) {
        C0563t.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f5359c) {
                a();
            }
            this.f5357a = a(this.f5362f, this.f5363g);
            this.f5358b = a(this.f5362f, this.f5357a);
            this.f5359c = true;
            if (z) {
                d();
            }
        }
    }

    public static boolean b(Context context) {
        c cVar = new c(context);
        a aVar = new a(context, -1, cVar.a("gads:ad_id_app_context:enabled", false), cVar.a("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            aVar.b(false);
            return aVar.e();
        } finally {
            aVar.a();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void d() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f5360d
            monitor-enter(r0)
            com.google.android.gms.ads.c.a$b r1 = r6.f5361e     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0013
            com.google.android.gms.ads.c.a$b r1 = r6.f5361e     // Catch:{ all -> 0x0026 }
            java.util.concurrent.CountDownLatch r1 = r1.f5369c     // Catch:{ all -> 0x0026 }
            r1.countDown()     // Catch:{ all -> 0x0026 }
            com.google.android.gms.ads.c.a$b r1 = r6.f5361e     // Catch:{ InterruptedException -> 0x0013 }
            r1.join()     // Catch:{ InterruptedException -> 0x0013 }
        L_0x0013:
            long r1 = r6.f5364h     // Catch:{ all -> 0x0026 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0024
            com.google.android.gms.ads.c.a$b r1 = new com.google.android.gms.ads.c.a$b     // Catch:{ all -> 0x0026 }
            long r2 = r6.f5364h     // Catch:{ all -> 0x0026 }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x0026 }
            r6.f5361e = r1     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.c.a.d():void");
    }

    private final boolean e() {
        boolean l;
        C0563t.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f5359c) {
                synchronized (this.f5360d) {
                    if (this.f5361e == null || !this.f5361e.f5370d) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    b(false);
                    if (!this.f5359c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                } catch (Exception e3) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e3);
                }
            }
            C0563t.a(this.f5357a);
            C0563t.a(this.f5358b);
            l = this.f5358b.l();
        }
        d();
        return l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C0563t.c(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f5362f     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            c.b.b.b.b.a r0 = r3.f5357a     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.f5359c     // Catch:{ Throwable -> 0x001f }
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.a.a()     // Catch:{ Throwable -> 0x001f }
            android.content.Context r1 = r3.f5362f     // Catch:{ Throwable -> 0x001f }
            c.b.b.b.b.a r2 = r3.f5357a     // Catch:{ Throwable -> 0x001f }
            r0.a(r1, r2)     // Catch:{ Throwable -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.f5359c = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.f5358b = r0     // Catch:{ all -> 0x0033 }
            r3.f5357a = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.c.a.a():void");
    }

    public C0070a b() {
        C0070a aVar;
        C0563t.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f5359c) {
                synchronized (this.f5360d) {
                    if (this.f5361e == null || !this.f5361e.f5370d) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    b(false);
                    if (!this.f5359c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                } catch (Exception e3) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e3);
                }
            }
            C0563t.a(this.f5357a);
            C0563t.a(this.f5358b);
            aVar = new C0070a(this.f5358b.getId(), this.f5358b.a(true));
        }
        d();
        return aVar;
    }

    public void c() {
        b(true);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        a();
        super.finalize();
    }
}
