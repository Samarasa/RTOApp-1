package androidx.work.impl;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.g;
import androidx.work.h;
import androidx.work.impl.c.B;
import androidx.work.impl.c.C0190b;
import androidx.work.impl.c.o;
import androidx.work.impl.utils.a.e;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    static final String f1942a = h.a("WorkerWrapper");

    /* renamed from: b  reason: collision with root package name */
    private Context f1943b;

    /* renamed from: c  reason: collision with root package name */
    private String f1944c;

    /* renamed from: d  reason: collision with root package name */
    private List<d> f1945d;

    /* renamed from: e  reason: collision with root package name */
    private WorkerParameters.a f1946e;

    /* renamed from: f  reason: collision with root package name */
    o f1947f;

    /* renamed from: g  reason: collision with root package name */
    ListenableWorker f1948g;

    /* renamed from: h  reason: collision with root package name */
    ListenableWorker.a f1949h = ListenableWorker.a.a();
    private b i;
    private androidx.work.impl.utils.b.a j;
    private WorkDatabase k;
    private androidx.work.impl.c.p l;
    private C0190b m;
    private B n;
    private List<String> o;
    private String p;
    private e<Boolean> q = e.d();
    c.b.c.a.a.a<ListenableWorker.a> r = null;
    private volatile boolean s;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        Context f1950a;

        /* renamed from: b  reason: collision with root package name */
        ListenableWorker f1951b;

        /* renamed from: c  reason: collision with root package name */
        androidx.work.impl.utils.b.a f1952c;

        /* renamed from: d  reason: collision with root package name */
        b f1953d;

        /* renamed from: e  reason: collision with root package name */
        WorkDatabase f1954e;

        /* renamed from: f  reason: collision with root package name */
        String f1955f;

        /* renamed from: g  reason: collision with root package name */
        List<d> f1956g;

        /* renamed from: h  reason: collision with root package name */
        WorkerParameters.a f1957h = new WorkerParameters.a();

        public a(Context context, b bVar, androidx.work.impl.utils.b.a aVar, WorkDatabase workDatabase, String str) {
            this.f1950a = context.getApplicationContext();
            this.f1952c = aVar;
            this.f1953d = bVar;
            this.f1954e = workDatabase;
            this.f1955f = str;
        }

        public a a(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f1957h = aVar;
            }
            return this;
        }

        public a a(List<d> list) {
            this.f1956g = list;
            return this;
        }

        public p a() {
            return new p(this);
        }
    }

    p(a aVar) {
        this.f1943b = aVar.f1950a;
        this.j = aVar.f1952c;
        this.f1944c = aVar.f1955f;
        this.f1945d = aVar.f1956g;
        this.f1946e = aVar.f1957h;
        this.f1948g = aVar.f1951b;
        this.i = aVar.f1953d;
        this.k = aVar.f1954e;
        this.l = this.k.r();
        this.m = this.k.l();
        this.n = this.k.s();
    }

    private String a(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f1944c);
        sb.append(", tags={ ");
        boolean z = true;
        for (String next : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(next);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    private void a(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            h.a().c(f1942a, String.format("Worker result SUCCESS for %s", new Object[]{this.p}), new Throwable[0]);
            if (!this.f1947f.d()) {
                h();
                return;
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            h.a().c(f1942a, String.format("Worker result RETRY for %s", new Object[]{this.p}), new Throwable[0]);
            d();
            return;
        } else {
            h.a().c(f1942a, String.format("Worker result FAILURE for %s", new Object[]{this.p}), new Throwable[0]);
            if (!this.f1947f.d()) {
                c();
                return;
            }
        }
        e();
    }

    private void a(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.l.c(str2) != androidx.work.o.CANCELLED) {
                this.l.a(androidx.work.o.FAILED, str2);
            }
            linkedList.addAll(this.m.a(str2));
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[Catch:{ all -> 0x0039 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(boolean r4) {
        /*
            r3 = this;
            androidx.work.impl.WorkDatabase r0 = r3.k
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r3.k     // Catch:{ all -> 0x0039 }
            androidx.work.impl.c.p r0 = r0.r()     // Catch:{ all -> 0x0039 }
            java.util.List r0 = r0.c()     // Catch:{ all -> 0x0039 }
            r1 = 0
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            if (r0 == 0) goto L_0x0025
            android.content.Context r0 = r3.f1943b     // Catch:{ all -> 0x0039 }
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r2 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            androidx.work.impl.utils.f.a(r0, r2, r1)     // Catch:{ all -> 0x0039 }
        L_0x0025:
            androidx.work.impl.WorkDatabase r0 = r3.k     // Catch:{ all -> 0x0039 }
            r0.k()     // Catch:{ all -> 0x0039 }
            androidx.work.impl.WorkDatabase r0 = r3.k
            r0.e()
            androidx.work.impl.utils.a.e<java.lang.Boolean> r0 = r3.q
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.b(r4)
            return
        L_0x0039:
            r4 = move-exception
            androidx.work.impl.WorkDatabase r0 = r3.k
            r0.e()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p.b(boolean):void");
    }

    private void d() {
        this.k.c();
        try {
            this.l.a(androidx.work.o.ENQUEUED, this.f1944c);
            this.l.b(this.f1944c, System.currentTimeMillis());
            this.l.a(this.f1944c, -1);
            this.k.k();
        } finally {
            this.k.e();
            b(true);
        }
    }

    private void e() {
        this.k.c();
        try {
            this.l.b(this.f1944c, System.currentTimeMillis());
            this.l.a(androidx.work.o.ENQUEUED, this.f1944c);
            this.l.e(this.f1944c);
            this.l.a(this.f1944c, -1);
            this.k.k();
        } finally {
            this.k.e();
            b(false);
        }
    }

    private void f() {
        androidx.work.o c2 = this.l.c(this.f1944c);
        if (c2 == androidx.work.o.RUNNING) {
            h.a().a(f1942a, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f1944c}), new Throwable[0]);
            b(true);
            return;
        }
        h.a().a(f1942a, String.format("Status for %s is %s; not doing any work", new Object[]{this.f1944c, c2}), new Throwable[0]);
        b(false);
    }

    private void g() {
        androidx.work.e a2;
        if (!i()) {
            this.k.c();
            try {
                this.f1947f = this.l.d(this.f1944c);
                if (this.f1947f == null) {
                    h.a().b(f1942a, String.format("Didn't find WorkSpec for id %s", new Object[]{this.f1944c}), new Throwable[0]);
                    b(false);
                } else if (this.f1947f.f1891d != androidx.work.o.ENQUEUED) {
                    f();
                    this.k.k();
                    h.a().a(f1942a, String.format("%s is not in ENQUEUED state. Nothing more to do.", new Object[]{this.f1947f.f1892e}), new Throwable[0]);
                    this.k.e();
                } else {
                    if (this.f1947f.d() || this.f1947f.c()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!(this.f1947f.p == 0) && currentTimeMillis < this.f1947f.a()) {
                            h.a().a(f1942a, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f1947f.f1892e}), new Throwable[0]);
                            b(true);
                            this.k.e();
                            return;
                        }
                    }
                    this.k.k();
                    this.k.e();
                    if (this.f1947f.d()) {
                        a2 = this.f1947f.f1894g;
                    } else {
                        g a3 = g.a(this.f1947f.f1893f);
                        if (a3 == null) {
                            h.a().b(f1942a, String.format("Could not create Input Merger %s", new Object[]{this.f1947f.f1893f}), new Throwable[0]);
                            c();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f1947f.f1894g);
                        arrayList.addAll(this.l.g(this.f1944c));
                        a2 = a3.a((List<androidx.work.e>) arrayList);
                    }
                    WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f1944c), a2, this.o, this.f1946e, this.f1947f.m, this.i.a(), this.j, this.i.g());
                    if (this.f1948g == null) {
                        this.f1948g = this.i.g().b(this.f1943b, this.f1947f.f1892e, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.f1948g;
                    if (listenableWorker == null) {
                        h.a().b(f1942a, String.format("Could not create Worker %s", new Object[]{this.f1947f.f1892e}), new Throwable[0]);
                        c();
                    } else if (listenableWorker.isUsed()) {
                        h.a().b(f1942a, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[]{this.f1947f.f1892e}), new Throwable[0]);
                        c();
                    } else {
                        this.f1948g.setUsed();
                        if (!j()) {
                            f();
                        } else if (!i()) {
                            e d2 = e.d();
                            this.j.a().execute(new n(this, d2));
                            d2.a((Runnable) new o(this, d2, this.p), this.j.b());
                        }
                    }
                }
            } finally {
                this.k.e();
            }
        }
    }

    private void h() {
        this.k.c();
        try {
            this.l.a(androidx.work.o.SUCCEEDED, this.f1944c);
            this.l.a(this.f1944c, ((ListenableWorker.a.c) this.f1949h).d());
            long currentTimeMillis = System.currentTimeMillis();
            for (String next : this.m.a(this.f1944c)) {
                if (this.l.c(next) == androidx.work.o.BLOCKED && this.m.b(next)) {
                    h.a().c(f1942a, String.format("Setting status to enqueued for %s", new Object[]{next}), new Throwable[0]);
                    this.l.a(androidx.work.o.ENQUEUED, next);
                    this.l.b(next, currentTimeMillis);
                }
            }
            this.k.k();
        } finally {
            this.k.e();
            b(false);
        }
    }

    private boolean i() {
        if (!this.s) {
            return false;
        }
        h.a().a(f1942a, String.format("Work interrupted for %s", new Object[]{this.p}), new Throwable[0]);
        androidx.work.o c2 = this.l.c(this.f1944c);
        if (c2 == null) {
            b(false);
        } else {
            b(!c2.a());
        }
        return true;
    }

    private boolean j() {
        this.k.c();
        try {
            boolean z = true;
            if (this.l.c(this.f1944c) == androidx.work.o.ENQUEUED) {
                this.l.a(androidx.work.o.RUNNING, this.f1944c);
                this.l.h(this.f1944c);
            } else {
                z = false;
            }
            this.k.k();
            return z;
        } finally {
            this.k.e();
        }
    }

    public c.b.c.a.a.a<Boolean> a() {
        return this.q;
    }

    public void a(boolean z) {
        this.s = true;
        i();
        c.b.c.a.a.a<ListenableWorker.a> aVar = this.r;
        if (aVar != null) {
            aVar.cancel(true);
        }
        ListenableWorker listenableWorker = this.f1948g;
        if (listenableWorker != null) {
            listenableWorker.stop();
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        boolean z = false;
        if (!i()) {
            this.k.c();
            try {
                androidx.work.o c2 = this.l.c(this.f1944c);
                if (c2 == null) {
                    b(false);
                    z = true;
                } else if (c2 == androidx.work.o.RUNNING) {
                    a(this.f1949h);
                    z = this.l.c(this.f1944c).a();
                } else if (!c2.a()) {
                    d();
                }
                this.k.k();
            } finally {
                this.k.e();
            }
        }
        List<d> list = this.f1945d;
        if (list != null) {
            if (z) {
                for (d a2 : list) {
                    a2.a(this.f1944c);
                }
            }
            e.a(this.i, this.k, this.f1945d);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.k.c();
        try {
            a(this.f1944c);
            this.l.a(this.f1944c, ((ListenableWorker.a.C0022a) this.f1949h).d());
            this.k.k();
        } finally {
            this.k.e();
            b(false);
        }
    }

    public void run() {
        this.o = this.n.a(this.f1944c);
        this.p = a(this.o);
        g();
    }
}
