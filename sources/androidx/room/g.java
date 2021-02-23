package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import b.e.d;
import b.p.a.f;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f1547a = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b  reason: collision with root package name */
    final b.e.b<String, Integer> f1548b;

    /* renamed from: c  reason: collision with root package name */
    final String[] f1549c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, Set<String>> f1550d;

    /* renamed from: e  reason: collision with root package name */
    final s f1551e;

    /* renamed from: f  reason: collision with root package name */
    AtomicBoolean f1552f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f1553g = false;

    /* renamed from: h  reason: collision with root package name */
    volatile f f1554h;
    private a i;
    private final e j;
    @SuppressLint({"RestrictedApi"})
    final b.b.a.b.b<b, c> k = new b.b.a.b.b<>();
    private o l;
    Runnable m = new f(this);

    static class a {

        /* renamed from: a  reason: collision with root package name */
        final long[] f1555a;

        /* renamed from: b  reason: collision with root package name */
        final boolean[] f1556b;

        /* renamed from: c  reason: collision with root package name */
        final int[] f1557c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1558d;

        /* renamed from: e  reason: collision with root package name */
        boolean f1559e;

        a(int i) {
            this.f1555a = new long[i];
            this.f1556b = new boolean[i];
            this.f1557c = new int[i];
            Arrays.fill(this.f1555a, 0);
            Arrays.fill(this.f1556b, false);
        }

        /* access modifiers changed from: package-private */
        public boolean a(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.f1555a[i];
                    this.f1555a[i] = 1 + j;
                    if (j == 0) {
                        this.f1558d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        public int[] a() {
            synchronized (this) {
                if (this.f1558d) {
                    if (!this.f1559e) {
                        int length = this.f1555a.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length) {
                                boolean z = this.f1555a[i] > 0;
                                if (z != this.f1556b[i]) {
                                    int[] iArr = this.f1557c;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.f1557c[i] = 0;
                                }
                                this.f1556b[i] = z;
                                i++;
                            } else {
                                this.f1559e = true;
                                this.f1558d = false;
                                int[] iArr2 = this.f1557c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            synchronized (this) {
                this.f1559e = false;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.f1555a[i];
                    this.f1555a[i] = j - 1;
                    if (j == 1) {
                        this.f1558d = true;
                        z = true;
                    }
                }
            }
            return z;
        }
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        final String[] f1560a;

        public b(String[] strArr) {
            this.f1560a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        public abstract void a(Set<String> set);

        /* access modifiers changed from: package-private */
        public boolean a() {
            return false;
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        final int[] f1561a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f1562b;

        /* renamed from: c  reason: collision with root package name */
        final b f1563c;

        /* renamed from: d  reason: collision with root package name */
        private final Set<String> f1564d;

        c(b bVar, int[] iArr, String[] strArr) {
            Set<String> set;
            this.f1563c = bVar;
            this.f1561a = iArr;
            this.f1562b = strArr;
            if (iArr.length == 1) {
                d dVar = new d();
                dVar.add(this.f1562b[0]);
                set = Collections.unmodifiableSet(dVar);
            } else {
                set = null;
            }
            this.f1564d = set;
        }

        /* access modifiers changed from: package-private */
        public void a(Set<Integer> set) {
            int length = this.f1561a.length;
            Set set2 = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(Integer.valueOf(this.f1561a[i]))) {
                    if (length == 1) {
                        set2 = this.f1564d;
                    } else {
                        if (set2 == null) {
                            set2 = new d(length);
                        }
                        set2.add(this.f1562b[i]);
                    }
                }
            }
            if (set2 != null) {
                this.f1563c.a(set2);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(String[] strArr) {
            Set<String> set = null;
            if (this.f1562b.length == 1) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr[i].equalsIgnoreCase(this.f1562b[0])) {
                        set = this.f1564d;
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                d dVar = new d();
                for (String str : strArr) {
                    String[] strArr2 = this.f1562b;
                    int length2 = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        String str2 = strArr2[i2];
                        if (str2.equalsIgnoreCase(str)) {
                            dVar.add(str2);
                            break;
                        }
                        i2++;
                    }
                }
                if (dVar.size() > 0) {
                    set = dVar;
                }
            }
            if (set != null) {
                this.f1563c.a(set);
            }
        }
    }

    public g(s sVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f1551e = sVar;
        this.i = new a(strArr.length);
        this.f1548b = new b.e.b<>();
        this.f1550d = map2;
        this.j = new e(this.f1551e);
        int length = strArr.length;
        this.f1549c = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String lowerCase = strArr[i2].toLowerCase(Locale.US);
            this.f1548b.put(lowerCase, Integer.valueOf(i2));
            String str = map.get(strArr[i2]);
            if (str != null) {
                this.f1549c[i2] = str.toLowerCase(Locale.US);
            } else {
                this.f1549c[i2] = lowerCase;
            }
        }
        for (Map.Entry next : map.entrySet()) {
            String lowerCase2 = ((String) next.getValue()).toLowerCase(Locale.US);
            if (this.f1548b.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) next.getKey()).toLowerCase(Locale.US);
                b.e.b<String, Integer> bVar = this.f1548b;
                bVar.put(lowerCase3, bVar.get(lowerCase2));
            }
        }
    }

    private void a(b.p.a.b bVar, int i2) {
        bVar.b("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i2 + ", 0)");
        String str = this.f1549c[i2];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f1547a) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            a(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i2);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.b(sb.toString());
        }
    }

    private static void a(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    private void b(b.p.a.b bVar, int i2) {
        String str = this.f1549c[i2];
        StringBuilder sb = new StringBuilder();
        for (String a2 : f1547a) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            a(sb, str, a2);
            bVar.b(sb.toString());
        }
    }

    private String[] b(String[] strArr) {
        d dVar = new d();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f1550d.containsKey(lowerCase)) {
                dVar.addAll(this.f1550d.get(lowerCase));
            } else {
                dVar.add(str);
            }
        }
        return (String[]) dVar.toArray(new String[dVar.size()]);
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, String str) {
        this.l = new o(context, str, this, this.f1551e.h());
    }

    @SuppressLint({"RestrictedApi"})
    public void a(b bVar) {
        c b2;
        String[] b3 = b(bVar.f1560a);
        int[] iArr = new int[b3.length];
        int length = b3.length;
        int i2 = 0;
        while (i2 < length) {
            Integer num = this.f1548b.get(b3[i2].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i2] = num.intValue();
                i2++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + b3[i2]);
            }
        }
        c cVar = new c(bVar, iArr, b3);
        synchronized (this.k) {
            b2 = this.k.b(bVar, cVar);
        }
        if (b2 == null && this.i.a(iArr)) {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(b.p.a.b bVar) {
        synchronized (this) {
            if (this.f1553g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            bVar.b("PRAGMA temp_store = MEMORY;");
            bVar.b("PRAGMA recursive_triggers='ON';");
            bVar.b("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            b(bVar);
            this.f1554h = bVar.c("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f1553g = true;
        }
    }

    public void a(String... strArr) {
        synchronized (this.k) {
            Iterator<Map.Entry<b, c>> it = this.k.iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                if (!((b) next.getKey()).a()) {
                    ((c) next.getValue()).a(strArr);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        if (!this.f1551e.j()) {
            return false;
        }
        if (!this.f1553g) {
            this.f1551e.g().a();
        }
        if (this.f1553g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public void b() {
        if (this.f1552f.compareAndSet(false, true)) {
            this.f1551e.h().execute(this.m);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void b(b bVar) {
        c remove;
        synchronized (this.k) {
            remove = this.k.remove(bVar);
        }
        if (remove != null && this.i.b(remove.f1561a)) {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(b.p.a.b bVar) {
        if (!bVar.q()) {
            while (true) {
                try {
                    Lock f2 = this.f1551e.f();
                    f2.lock();
                    try {
                        int[] a2 = this.i.a();
                        if (a2 == null) {
                            f2.unlock();
                            return;
                        }
                        int length = a2.length;
                        bVar.k();
                        for (int i2 = 0; i2 < length; i2++) {
                            int i3 = a2[i2];
                            if (i3 == 1) {
                                a(bVar, i2);
                            } else if (i3 == 2) {
                                b(bVar, i2);
                            }
                        }
                        bVar.o();
                        bVar.p();
                        this.i.b();
                        f2.unlock();
                    } catch (Throwable th) {
                        f2.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException e2) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (this.f1551e.j()) {
            b(this.f1551e.g().a());
        }
    }
}
