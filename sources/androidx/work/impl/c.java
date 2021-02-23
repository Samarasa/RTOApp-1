package androidx.work.impl;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.h;
import androidx.work.impl.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1852a = h.a("Processor");

    /* renamed from: b  reason: collision with root package name */
    private Context f1853b;

    /* renamed from: c  reason: collision with root package name */
    private b f1854c;

    /* renamed from: d  reason: collision with root package name */
    private androidx.work.impl.utils.b.a f1855d;

    /* renamed from: e  reason: collision with root package name */
    private WorkDatabase f1856e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, p> f1857f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private List<d> f1858g;

    /* renamed from: h  reason: collision with root package name */
    private Set<String> f1859h;
    private final List<a> i;
    private final Object j;

    private static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private a f1868a;

        /* renamed from: b  reason: collision with root package name */
        private String f1869b;

        /* renamed from: c  reason: collision with root package name */
        private c.b.c.a.a.a<Boolean> f1870c;

        a(a aVar, String str, c.b.c.a.a.a<Boolean> aVar2) {
            this.f1868a = aVar;
            this.f1869b = str;
            this.f1870c = aVar2;
        }

        public void run() {
            boolean z;
            try {
                z = this.f1870c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f1868a.a(this.f1869b, z);
        }
    }

    public c(Context context, b bVar, androidx.work.impl.utils.b.a aVar, WorkDatabase workDatabase, List<d> list) {
        this.f1853b = context;
        this.f1854c = bVar;
        this.f1855d = aVar;
        this.f1856e = workDatabase;
        this.f1858g = list;
        this.f1859h = new HashSet();
        this.i = new ArrayList();
        this.j = new Object();
    }

    public void a(a aVar) {
        synchronized (this.j) {
            this.i.add(aVar);
        }
    }

    public void a(String str, boolean z) {
        synchronized (this.j) {
            this.f1857f.remove(str);
            h.a().a(f1852a, String.format("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z)}), new Throwable[0]);
            for (a a2 : this.i) {
                a2.a(str, z);
            }
        }
    }

    public boolean a(String str) {
        boolean contains;
        synchronized (this.j) {
            contains = this.f1859h.contains(str);
        }
        return contains;
    }

    public boolean a(String str, WorkerParameters.a aVar) {
        synchronized (this.j) {
            if (this.f1857f.containsKey(str)) {
                h.a().a(f1852a, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                return false;
            }
            p.a aVar2 = new p.a(this.f1853b, this.f1854c, this.f1855d, this.f1856e, str);
            aVar2.a(this.f1858g);
            aVar2.a(aVar);
            p a2 = aVar2.a();
            c.b.c.a.a.a<Boolean> a3 = a2.a();
            a3.a(new a(this, str, a3), this.f1855d.a());
            this.f1857f.put(str, a2);
            this.f1855d.b().execute(a2);
            h.a().a(f1852a, String.format("%s: processing %s", new Object[]{c.class.getSimpleName(), str}), new Throwable[0]);
            return true;
        }
    }

    public void b(a aVar) {
        synchronized (this.j) {
            this.i.remove(aVar);
        }
    }

    public boolean b(String str) {
        boolean containsKey;
        synchronized (this.j) {
            containsKey = this.f1857f.containsKey(str);
        }
        return containsKey;
    }

    public boolean c(String str) {
        return a(str, (WorkerParameters.a) null);
    }

    public boolean d(String str) {
        synchronized (this.j) {
            h.a().a(f1852a, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
            this.f1859h.add(str);
            p remove = this.f1857f.remove(str);
            if (remove != null) {
                remove.a(true);
                h.a().a(f1852a, String.format("WorkerWrapper cancelled for %s", new Object[]{str}), new Throwable[0]);
                return true;
            }
            h.a().a(f1852a, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
            return false;
        }
    }

    public boolean e(String str) {
        synchronized (this.j) {
            h.a().a(f1852a, String.format("Processor stopping %s", new Object[]{str}), new Throwable[0]);
            p remove = this.f1857f.remove(str);
            if (remove != null) {
                remove.a(false);
                h.a().a(f1852a, String.format("WorkerWrapper stopped for %s", new Object[]{str}), new Throwable[0]);
                return true;
            }
            h.a().a(f1852a, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
            return false;
        }
    }
}
