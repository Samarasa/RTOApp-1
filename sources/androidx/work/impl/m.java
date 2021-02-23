package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.h;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.b.a;
import androidx.work.impl.utils.b.c;
import androidx.work.impl.utils.g;
import androidx.work.impl.utils.i;
import androidx.work.impl.utils.j;
import androidx.work.l;
import androidx.work.p;
import androidx.work.q;
import java.util.Arrays;
import java.util.List;

public class m extends p {

    /* renamed from: a  reason: collision with root package name */
    private static m f1929a;

    /* renamed from: b  reason: collision with root package name */
    private static m f1930b;

    /* renamed from: c  reason: collision with root package name */
    private static final Object f1931c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private Context f1932d;

    /* renamed from: e  reason: collision with root package name */
    private b f1933e;

    /* renamed from: f  reason: collision with root package name */
    private WorkDatabase f1934f;

    /* renamed from: g  reason: collision with root package name */
    private a f1935g;

    /* renamed from: h  reason: collision with root package name */
    private List<d> f1936h;
    private c i;
    private g j;
    private boolean k;
    private BroadcastReceiver.PendingResult l;

    public m(Context context, b bVar, a aVar) {
        this(context, bVar, aVar, context.getResources().getBoolean(androidx.work.m.workmanager_test_configuration));
    }

    public m(Context context, b bVar, a aVar, boolean z) {
        Context applicationContext = context.getApplicationContext();
        WorkDatabase a2 = WorkDatabase.a(applicationContext, bVar.f(), z);
        h.a((h) new h.a(bVar.e()));
        Context context2 = context;
        b bVar2 = bVar;
        a aVar2 = aVar;
        WorkDatabase workDatabase = a2;
        List<d> a3 = a(applicationContext, aVar);
        a(context2, bVar2, aVar2, workDatabase, a3, new c(context2, bVar2, aVar2, workDatabase, a3));
    }

    public static m a(Context context) {
        m c2;
        synchronized (f1931c) {
            c2 = c();
            if (c2 == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof b.C0023b) {
                    a(applicationContext, ((b.C0023b) applicationContext).a());
                    c2 = a(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return c2;
    }

    public static void a(Context context, b bVar) {
        synchronized (f1931c) {
            if (f1929a != null) {
                if (f1930b != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class levelJavadoc for more information.");
                }
            }
            if (f1929a == null) {
                Context applicationContext = context.getApplicationContext();
                if (f1930b == null) {
                    f1930b = new m(applicationContext, bVar, new c(bVar.f()));
                }
                f1929a = f1930b;
            }
        }
    }

    private void a(Context context, b bVar, a aVar, WorkDatabase workDatabase, List<d> list, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f1932d = applicationContext;
        this.f1933e = bVar;
        this.f1935g = aVar;
        this.f1934f = workDatabase;
        this.f1936h = list;
        this.i = cVar;
        this.j = new g(this.f1932d);
        this.k = false;
        this.f1935g.a(new ForceStopRunnable(applicationContext, this));
    }

    @Deprecated
    public static m c() {
        synchronized (f1931c) {
            if (f1929a != null) {
                m mVar = f1929a;
                return mVar;
            }
            m mVar2 = f1930b;
            return mVar2;
        }
    }

    public Context a() {
        return this.f1932d;
    }

    public l a(String str) {
        androidx.work.impl.utils.c a2 = androidx.work.impl.utils.c.a(str, this);
        this.f1935g.a(a2);
        return a2.a();
    }

    public l a(List<? extends q> list) {
        if (!list.isEmpty()) {
            return new f(this, list).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public List<d> a(Context context, a aVar) {
        return Arrays.asList(new d[]{e.a(context, this), new androidx.work.impl.a.a.a(context, aVar, this)});
    }

    public void a(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f1931c) {
            this.l = pendingResult;
            if (this.k) {
                this.l.finish();
                this.l = null;
            }
        }
    }

    public void a(String str, WorkerParameters.a aVar) {
        this.f1935g.a(new i(this, str, aVar));
    }

    public b b() {
        return this.f1933e;
    }

    public void b(String str) {
        a(str, (WorkerParameters.a) null);
    }

    public void c(String str) {
        this.f1935g.a(new j(this, str));
    }

    public g d() {
        return this.j;
    }

    public c e() {
        return this.i;
    }

    public List<d> f() {
        return this.f1936h;
    }

    public WorkDatabase g() {
        return this.f1934f;
    }

    public a h() {
        return this.f1935g;
    }

    public void i() {
        synchronized (f1931c) {
            this.k = true;
            if (this.l != null) {
                this.l.finish();
                this.l = null;
            }
        }
    }

    public void j() {
        if (Build.VERSION.SDK_INT >= 23) {
            androidx.work.impl.background.systemjob.c.a(a());
        }
        g().r().d();
        e.a(b(), g(), f());
    }
}
