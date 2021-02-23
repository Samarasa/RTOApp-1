package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import c.b.b.b.g.i;
import c.b.b.b.g.l;
import c.b.d.c.b;
import c.b.d.c.d;
import c.b.d.d.c;
import c.b.d.e;
import c.b.d.g.h;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FirebaseInstanceId {

    /* renamed from: a  reason: collision with root package name */
    private static final long f14500a = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: b  reason: collision with root package name */
    private static C3334v f14501b;

    /* renamed from: c  reason: collision with root package name */
    private static ScheduledExecutorService f14502c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f14503d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final e f14504e;

    /* renamed from: f  reason: collision with root package name */
    private final C3324k f14505f;

    /* renamed from: g  reason: collision with root package name */
    private final Q f14506g;

    /* renamed from: h  reason: collision with root package name */
    private final C3329p f14507h;
    private final C3338z i;
    private boolean j;
    private final a k;

    private class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f14508a;

        /* renamed from: b  reason: collision with root package name */
        private final d f14509b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f14510c;

        /* renamed from: d  reason: collision with root package name */
        private b<c.b.d.a> f14511d;

        /* renamed from: e  reason: collision with root package name */
        private Boolean f14512e;

        a(d dVar) {
            this.f14509b = dVar;
        }

        private final synchronized void b() {
            if (!this.f14510c) {
                this.f14508a = d();
                this.f14512e = c();
                if (this.f14512e == null && this.f14508a) {
                    this.f14511d = new P(this);
                    this.f14509b.a(c.b.d.a.class, this.f14511d);
                }
                this.f14510c = true;
            }
        }

        private final Boolean c() {
            ApplicationInfo applicationInfo;
            Context b2 = FirebaseInstanceId.this.f14504e.b();
            SharedPreferences sharedPreferences = b2.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = b2.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(b2.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        private final boolean d() {
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessaging");
                return true;
            } catch (ClassNotFoundException unused) {
                Context b2 = FirebaseInstanceId.this.f14504e.b();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(b2.getPackageName());
                ResolveInfo resolveService = b2.getPackageManager().resolveService(intent, 0);
                return (resolveService == null || resolveService.serviceInfo == null) ? false : true;
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
            return r1.f14508a && com.google.firebase.iid.FirebaseInstanceId.a(r1.f14513f).g();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized boolean a() {
            /*
                r1 = this;
                monitor-enter(r1)
                r1.b()     // Catch:{ all -> 0x0025 }
                java.lang.Boolean r0 = r1.f14512e     // Catch:{ all -> 0x0025 }
                if (r0 == 0) goto L_0x0010
                java.lang.Boolean r0 = r1.f14512e     // Catch:{ all -> 0x0025 }
                boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0025 }
                monitor-exit(r1)
                return r0
            L_0x0010:
                boolean r0 = r1.f14508a     // Catch:{ all -> 0x0025 }
                if (r0 == 0) goto L_0x0023
                com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.this     // Catch:{ all -> 0x0025 }
                c.b.d.e r0 = r0.f14504e     // Catch:{ all -> 0x0025 }
                boolean r0 = r0.g()     // Catch:{ all -> 0x0025 }
                if (r0 == 0) goto L_0x0023
                r0 = 1
            L_0x0021:
                monitor-exit(r1)
                return r0
            L_0x0023:
                r0 = 0
                goto L_0x0021
            L_0x0025:
                r0 = move-exception
                monitor-exit(r1)
                goto L_0x0029
            L_0x0028:
                throw r0
            L_0x0029:
                goto L_0x0028
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.a.a():boolean");
        }
    }

    FirebaseInstanceId(e eVar, d dVar, h hVar, c cVar) {
        this(eVar, new C3324k(eVar.b()), C3315b.b(), C3315b.b(), dVar, hVar, cVar);
    }

    private FirebaseInstanceId(e eVar, C3324k kVar, Executor executor, Executor executor2, d dVar, h hVar, c cVar) {
        this.j = false;
        if (C3324k.a(eVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (f14501b == null) {
                    f14501b = new C3334v(eVar.b());
                }
            }
            this.f14504e = eVar;
            this.f14505f = kVar;
            this.f14506g = new Q(eVar, kVar, executor, hVar, cVar);
            this.f14503d = executor2;
            this.i = new C3338z(f14501b);
            this.k = new a(dVar);
            this.f14507h = new C3329p(executor);
            executor2.execute(new M(this));
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    private final <T> T a(i<T> iVar) {
        try {
            return l.a(iVar, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    h();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e2);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    static void a(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (f14502c == null) {
                f14502c = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.a.a("FirebaseInstanceId"));
            }
            f14502c.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    private final i<C3314a> b(String str, String str2) {
        return l.a(null).b(this.f14503d, new L(this, str, c(str2)));
    }

    public static FirebaseInstanceId b() {
        return getInstance(e.c());
    }

    private static C3333u c(String str, String str2) {
        return f14501b.a(BuildConfig.FLAVOR, str, str2);
    }

    private static String c(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    static boolean g() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
        }
        return true;
    }

    @Keep
    public static FirebaseInstanceId getInstance(e eVar) {
        return (FirebaseInstanceId) eVar.a(FirebaseInstanceId.class);
    }

    /* access modifiers changed from: private */
    public final void l() {
        if (a(e()) || this.i.a()) {
            m();
        }
    }

    private final synchronized void m() {
        if (!this.j) {
            a(0);
        }
    }

    private static String n() {
        return f14501b.b(BuildConfig.FLAVOR).a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ i a(String str, String str2, i iVar) {
        String n = n();
        C3333u c2 = c(str, str2);
        return !a(c2) ? l.a(new aa(n, c2.f14605b)) : this.f14507h.a(str, str2, new O(this, n, str, str2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ i a(String str, String str2, String str3) {
        return this.f14506g.a(str, str2, str3).a(this.f14503d, new N(this, str2, str3, str));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ i a(String str, String str2, String str3, String str4) {
        f14501b.a(BuildConfig.FLAVOR, str, str2, str4, this.f14505f.b());
        return l.a(new aa(str3, str4));
    }

    public String a() {
        l();
        return n();
    }

    public String a(String str, String str2) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((C3314a) a(b(str, str2))).a();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(long j2) {
        a((Runnable) new C3336x(this, this.f14505f, this.i, Math.min(Math.max(30, j2 << 1), f14500a)), j2);
        this.j = true;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        C3333u e2 = e();
        if (!a(e2)) {
            a(this.f14506g.b(n(), e2.f14605b, str));
            return;
        }
        throw new IOException("token not available");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(boolean z) {
        this.j = z;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(C3333u uVar) {
        return uVar == null || uVar.b(this.f14505f.b());
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        C3333u e2 = e();
        if (!a(e2)) {
            a(this.f14506g.c(n(), e2.f14605b, str));
            return;
        }
        throw new IOException("token not available");
    }

    @Deprecated
    public String c() {
        C3333u e2 = e();
        if (a(e2)) {
            m();
        }
        return C3333u.a(e2);
    }

    /* access modifiers changed from: package-private */
    public final e d() {
        return this.f14504e;
    }

    /* access modifiers changed from: package-private */
    public final C3333u e() {
        return c(C3324k.a(this.f14504e), "*");
    }

    /* access modifiers changed from: package-private */
    public final String f() {
        return a(C3324k.a(this.f14504e), "*");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void h() {
        f14501b.b();
        if (this.k.a()) {
            m();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return this.f14505f.a() != 0;
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        f14501b.c(BuildConfig.FLAVOR);
        m();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void k() {
        if (this.k.a()) {
            l();
        }
    }
}
