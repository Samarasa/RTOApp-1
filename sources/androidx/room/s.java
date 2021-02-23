package androidx.room;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import b.e.j;
import b.p.a.c;
import b.p.a.e;
import b.p.a.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class s {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    protected volatile b.p.a.b f1583a;

    /* renamed from: b  reason: collision with root package name */
    private Executor f1584b;

    /* renamed from: c  reason: collision with root package name */
    private Executor f1585c;

    /* renamed from: d  reason: collision with root package name */
    private b.p.a.c f1586d;

    /* renamed from: e  reason: collision with root package name */
    private final g f1587e = d();

    /* renamed from: f  reason: collision with root package name */
    private boolean f1588f;

    /* renamed from: g  reason: collision with root package name */
    boolean f1589g;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    protected List<b> f1590h;
    private final ReentrantReadWriteLock i = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> j = new ThreadLocal<>();
    private final Map<String, Object> k = new ConcurrentHashMap();

    public static class a<T extends s> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f1591a;

        /* renamed from: b  reason: collision with root package name */
        private final String f1592b;

        /* renamed from: c  reason: collision with root package name */
        private final Context f1593c;

        /* renamed from: d  reason: collision with root package name */
        private ArrayList<b> f1594d;

        /* renamed from: e  reason: collision with root package name */
        private Executor f1595e;

        /* renamed from: f  reason: collision with root package name */
        private Executor f1596f;

        /* renamed from: g  reason: collision with root package name */
        private c.C0042c f1597g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f1598h;
        private c i = c.AUTOMATIC;
        private boolean j;
        private boolean k = true;
        private boolean l;
        private final d m = new d();
        private Set<Integer> n;
        private Set<Integer> o;

        a(Context context, Class<T> cls, String str) {
            this.f1593c = context;
            this.f1591a = cls;
            this.f1592b = str;
        }

        public a<T> a() {
            this.f1598h = true;
            return this;
        }

        public a<T> a(b bVar) {
            if (this.f1594d == null) {
                this.f1594d = new ArrayList<>();
            }
            this.f1594d.add(bVar);
            return this;
        }

        public a<T> a(Executor executor) {
            this.f1595e = executor;
            return this;
        }

        public a<T> a(androidx.room.a.a... aVarArr) {
            if (this.o == null) {
                this.o = new HashSet();
            }
            for (androidx.room.a.a aVar : aVarArr) {
                this.o.add(Integer.valueOf(aVar.f1518a));
                this.o.add(Integer.valueOf(aVar.f1519b));
            }
            this.m.a(aVarArr);
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
            if (r0 != null) goto L_0x0016;
         */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0069  */
        @android.annotation.SuppressLint({"RestrictedApi"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public T b() {
            /*
                r15 = this;
                android.content.Context r0 = r15.f1593c
                if (r0 == 0) goto L_0x00aa
                java.lang.Class<T> r0 = r15.f1591a
                if (r0 == 0) goto L_0x00a2
                java.util.concurrent.Executor r0 = r15.f1595e
                if (r0 != 0) goto L_0x0019
                java.util.concurrent.Executor r0 = r15.f1596f
                if (r0 != 0) goto L_0x0019
                java.util.concurrent.Executor r0 = b.b.a.a.c.b()
                r15.f1596f = r0
            L_0x0016:
                r15.f1595e = r0
                goto L_0x002d
            L_0x0019:
                java.util.concurrent.Executor r0 = r15.f1595e
                if (r0 == 0) goto L_0x0024
                java.util.concurrent.Executor r1 = r15.f1596f
                if (r1 != 0) goto L_0x0024
                r15.f1596f = r0
                goto L_0x002d
            L_0x0024:
                java.util.concurrent.Executor r0 = r15.f1595e
                if (r0 != 0) goto L_0x002d
                java.util.concurrent.Executor r0 = r15.f1596f
                if (r0 == 0) goto L_0x002d
                goto L_0x0016
            L_0x002d:
                java.util.Set<java.lang.Integer> r0 = r15.o
                if (r0 == 0) goto L_0x0065
                java.util.Set<java.lang.Integer> r1 = r15.n
                if (r1 == 0) goto L_0x0065
                java.util.Iterator r0 = r0.iterator()
            L_0x0039:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0065
                java.lang.Object r1 = r0.next()
                java.lang.Integer r1 = (java.lang.Integer) r1
                java.util.Set<java.lang.Integer> r2 = r15.n
                boolean r2 = r2.contains(r1)
                if (r2 != 0) goto L_0x004e
                goto L_0x0039
            L_0x004e:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x0065:
                b.p.a.c$c r0 = r15.f1597g
                if (r0 != 0) goto L_0x0070
                b.p.a.a.e r0 = new b.p.a.a.e
                r0.<init>()
                r15.f1597g = r0
            L_0x0070:
                androidx.room.a r0 = new androidx.room.a
                android.content.Context r2 = r15.f1593c
                java.lang.String r3 = r15.f1592b
                b.p.a.c$c r4 = r15.f1597g
                androidx.room.s$d r5 = r15.m
                java.util.ArrayList<androidx.room.s$b> r6 = r15.f1594d
                boolean r7 = r15.f1598h
                androidx.room.s$c r1 = r15.i
                androidx.room.s$c r8 = r1.a(r2)
                java.util.concurrent.Executor r9 = r15.f1595e
                java.util.concurrent.Executor r10 = r15.f1596f
                boolean r11 = r15.j
                boolean r12 = r15.k
                boolean r13 = r15.l
                java.util.Set<java.lang.Integer> r14 = r15.n
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                java.lang.Class<T> r1 = r15.f1591a
                java.lang.String r2 = "_Impl"
                java.lang.Object r1 = androidx.room.r.a(r1, (java.lang.String) r2)
                androidx.room.s r1 = (androidx.room.s) r1
                r1.b(r0)
                return r1
            L_0x00a2:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Must provide an abstract class that extends RoomDatabase"
                r0.<init>(r1)
                throw r0
            L_0x00aa:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Cannot provide null context for the database."
                r0.<init>(r1)
                goto L_0x00b3
            L_0x00b2:
                throw r0
            L_0x00b3:
                goto L_0x00b2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.s.a.b():androidx.room.s");
        }

        public a<T> c() {
            this.k = false;
            this.l = true;
            return this;
        }
    }

    public static abstract class b {
        public void a(b.p.a.b bVar) {
        }

        public void b(b.p.a.b bVar) {
        }
    }

    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
            r3 = (android.app.ActivityManager) r3.getSystemService("activity");
         */
        @android.annotation.SuppressLint({"NewApi"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.room.s.c a(android.content.Context r3) {
            /*
                r2 = this;
                androidx.room.s$c r0 = AUTOMATIC
                if (r2 == r0) goto L_0x0005
                return r2
            L_0x0005:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 < r1) goto L_0x001e
                java.lang.String r0 = "activity"
                java.lang.Object r3 = r3.getSystemService(r0)
                android.app.ActivityManager r3 = (android.app.ActivityManager) r3
                if (r3 == 0) goto L_0x001e
                boolean r3 = androidx.core.app.d.a(r3)
                if (r3 != 0) goto L_0x001e
                androidx.room.s$c r3 = WRITE_AHEAD_LOGGING
                return r3
            L_0x001e:
                androidx.room.s$c r3 = TRUNCATE
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.s.c.a(android.content.Context):androidx.room.s$c");
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private j<j<androidx.room.a.a>> f1603a = new j<>();

        private List<androidx.room.a.a> a(List<androidx.room.a.a> list, boolean z, int i, int i2) {
            boolean z2;
            int i3;
            int i4;
            int i5 = z ? -1 : 1;
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                } else if (i <= i2) {
                    return list;
                }
                j a2 = this.f1603a.a(i);
                if (a2 != null) {
                    int b2 = a2.b();
                    z2 = false;
                    if (z) {
                        i4 = b2 - 1;
                        i3 = -1;
                    } else {
                        i3 = b2;
                        i4 = 0;
                    }
                    while (true) {
                        if (i4 == i3) {
                            break;
                        }
                        int c2 = a2.c(i4);
                        if (!z ? !(c2 < i2 || c2 >= i) : !(c2 > i2 || c2 <= i)) {
                            list.add(a2.e(i4));
                            i = c2;
                            z2 = true;
                            continue;
                            break;
                        }
                        i4 += i5;
                    }
                } else {
                    return null;
                }
            } while (z2);
            return null;
        }

        private void a(androidx.room.a.a aVar) {
            int i = aVar.f1518a;
            int i2 = aVar.f1519b;
            j a2 = this.f1603a.a(i);
            if (a2 == null) {
                a2 = new j();
                this.f1603a.c(i, a2);
            }
            androidx.room.a.a aVar2 = (androidx.room.a.a) a2.a(i2);
            if (aVar2 != null) {
                Log.w("ROOM", "Overriding migration " + aVar2 + " with " + aVar);
            }
            a2.a(i2, aVar);
        }

        public List<androidx.room.a.a> a(int i, int i2) {
            if (i == i2) {
                return Collections.emptyList();
            }
            return a(new ArrayList(), i2 > i, i, i2);
        }

        public void a(androidx.room.a.a... aVarArr) {
            for (androidx.room.a.a a2 : aVarArr) {
                a(a2);
            }
        }
    }

    private static boolean l() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public Cursor a(e eVar) {
        a();
        b();
        return this.f1586d.a().a(eVar);
    }

    /* access modifiers changed from: protected */
    public abstract b.p.a.c a(a aVar);

    public f a(String str) {
        a();
        b();
        return this.f1586d.a().c(str);
    }

    public void a() {
        if (!this.f1588f && l()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* access modifiers changed from: protected */
    public void a(b.p.a.b bVar) {
        this.f1587e.a(bVar);
    }

    public void b() {
        if (!i() && this.j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void b(a aVar) {
        this.f1586d = a(aVar);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 16) {
            if (aVar.f1516g == c.WRITE_AHEAD_LOGGING) {
                z = true;
            }
            this.f1586d.a(z);
        }
        this.f1590h = aVar.f1514e;
        this.f1584b = aVar.f1517h;
        this.f1585c = new y(aVar.i);
        this.f1588f = aVar.f1515f;
        this.f1589g = z;
        if (aVar.j) {
            this.f1587e.a(aVar.f1511b, aVar.f1512c);
        }
    }

    @Deprecated
    public void c() {
        a();
        b.p.a.b a2 = this.f1586d.a();
        this.f1587e.b(a2);
        a2.k();
    }

    /* access modifiers changed from: protected */
    public abstract g d();

    @Deprecated
    public void e() {
        this.f1586d.a().p();
        if (!i()) {
            this.f1587e.b();
        }
    }

    /* access modifiers changed from: package-private */
    public Lock f() {
        return this.i.readLock();
    }

    public b.p.a.c g() {
        return this.f1586d;
    }

    public Executor h() {
        return this.f1584b;
    }

    public boolean i() {
        return this.f1586d.a().q();
    }

    public boolean j() {
        b.p.a.b bVar = this.f1583a;
        return bVar != null && bVar.isOpen();
    }

    @Deprecated
    public void k() {
        this.f1586d.a().o();
    }
}
