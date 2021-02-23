package c.b.b.a.a.c.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import c.b.b.a.a.d.b;
import c.b.b.a.a.k;
import c.b.b.a.a.l;
import c.b.b.a.a.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class B implements C0248d, c.b.b.a.a.d.b {

    /* renamed from: a  reason: collision with root package name */
    private static final c.b.b.a.b f3720a = c.b.b.a.b.a("proto");

    /* renamed from: b  reason: collision with root package name */
    private final G f3721b;

    /* renamed from: c  reason: collision with root package name */
    private final c.b.b.a.a.e.a f3722c;

    /* renamed from: d  reason: collision with root package name */
    private final c.b.b.a.a.e.a f3723d;

    /* renamed from: e  reason: collision with root package name */
    private final C0249e f3724e;

    interface a<T, U> {
        U apply(T t);
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        final String f3725a;

        /* renamed from: b  reason: collision with root package name */
        final String f3726b;

        private b(String str, String str2) {
            this.f3725a = str;
            this.f3726b = str2;
        }
    }

    interface c<T> {
        T a();
    }

    B(c.b.b.a.a.e.a aVar, c.b.b.a.a.e.a aVar2, C0249e eVar, G g2) {
        this.f3721b = g2;
        this.f3722c = aVar;
        this.f3723d = aVar2;
        this.f3724e = eVar;
    }

    private long a(SQLiteDatabase sQLiteDatabase, p pVar) {
        Long b2 = b(sQLiteDatabase, pVar);
        if (b2 != null) {
            return b2.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put("priority", Integer.valueOf(c.b.b.a.a.f.a.a(pVar.d())));
        contentValues.put("next_request_ms", 0);
        if (pVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    private SQLiteDatabase a() {
        G g2 = this.f3721b;
        g2.getClass();
        return (SQLiteDatabase) a(s.a(g2), u.a());
    }

    static /* synthetic */ Boolean a(B b2, p pVar, SQLiteDatabase sQLiteDatabase) {
        Long b3 = b2.b(sQLiteDatabase, pVar);
        if (b3 == null) {
            return false;
        }
        return (Boolean) a(b2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b3.toString()}), t.a());
    }

    static /* synthetic */ Long a(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0);
    }

    static /* synthetic */ Long a(B b2, p pVar, l lVar, SQLiteDatabase sQLiteDatabase) {
        if (b2.d()) {
            return -1L;
        }
        long a2 = b2.a(sQLiteDatabase, pVar);
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(a2));
        contentValues.put("transport_name", lVar.g());
        contentValues.put("timestamp_ms", Long.valueOf(lVar.e()));
        contentValues.put("uptime_ms", Long.valueOf(lVar.h()));
        contentValues.put("payload_encoding", lVar.d().b().a());
        contentValues.put("payload", lVar.d().a());
        contentValues.put("code", lVar.c());
        contentValues.put("num_attempts", 0);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        for (Map.Entry next : lVar.f().entrySet()) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("event_id", Long.valueOf(insert));
            contentValues2.put("name", (String) next.getKey());
            contentValues2.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues2);
        }
        return Long.valueOf(insert);
    }

    static /* synthetic */ Object a(long j, p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(c.b.b.a.a.f.a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", Integer.valueOf(c.b.b.a.a.f.a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    private static <T> T a(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private <T> T a(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase a2 = a();
        a2.beginTransaction();
        try {
            T apply = aVar.apply(a2);
            a2.setTransactionSuccessful();
            return apply;
        } finally {
            a2.endTransaction();
        }
    }

    private <T> T a(c<T> cVar, a<Throwable, T> aVar) {
        long a2 = this.f3723d.a();
        while (true) {
            try {
                return cVar.a();
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.f3723d.a() >= ((long) this.f3724e.b()) + a2) {
                    return aVar.apply(e2);
                }
                SystemClock.sleep(50);
            }
        }
    }

    static /* synthetic */ Object a(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 10").execute();
        return null;
    }

    static /* synthetic */ Object a(Throwable th) {
        throw new c.b.b.a.a.d.a("Timed out while trying to acquire the lock.", th);
    }

    static /* synthetic */ Object a(List list, p pVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            l.a a2 = l.a();
            a2.a(cursor.getString(1));
            a2.a(cursor.getLong(2));
            a2.b(cursor.getLong(3));
            a2.a(new k(b(cursor.getString(4)), cursor.getBlob(5)));
            if (!cursor.isNull(6)) {
                a2.a(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(i.a(j, pVar, a2.a()));
        }
        return null;
    }

    static /* synthetic */ Object a(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new b(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    private List<i> a(List<i> list, Map<Long, Set<b>> map) {
        ListIterator<i> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            i next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.b()))) {
                l.a i = next.a().i();
                for (b bVar : map.get(Long.valueOf(next.b()))) {
                    i.a(bVar.f3725a, bVar.f3726b);
                }
                listIterator.set(i.a(next.b(), next.c(), i.a()));
            }
        }
        return list;
    }

    private Map<Long, Set<b>> a(SQLiteDatabase sQLiteDatabase, List<i> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).b());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        a(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), o.a(hashMap));
        return hashMap;
    }

    private static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private long b() {
        return a().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    static /* synthetic */ SQLiteDatabase b(Throwable th) {
        throw new c.b.b.a.a.d.a("Timed out while trying to open db.", th);
    }

    private static c.b.b.a.b b(String str) {
        return str == null ? f3720a : c.b.b.a.b.a(str);
    }

    static /* synthetic */ Long b(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    private Long b(SQLiteDatabase sQLiteDatabase, p pVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{pVar.b(), String.valueOf(c.b.b.a.a.f.a.a(pVar.d()))}));
        if (pVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        }
        return (Long) a(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), w.a());
    }

    static /* synthetic */ List b(SQLiteDatabase sQLiteDatabase) {
        return (List) a(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), r.a());
    }

    static /* synthetic */ List b(B b2, p pVar, SQLiteDatabase sQLiteDatabase) {
        List<i> c2 = b2.c(sQLiteDatabase, pVar);
        b2.a(c2, b2.a(sQLiteDatabase, c2));
        return c2;
    }

    private long c() {
        return a().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private static String c(Iterable<i> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<i> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    static /* synthetic */ List c(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            p.a a2 = p.a();
            a2.a(cursor.getString(1));
            a2.a(c.b.b.a.a.f.a.a(cursor.getInt(2)));
            a2.a(a(cursor.getString(3)));
            arrayList.add(a2.a());
        }
        return arrayList;
    }

    private List<i> c(SQLiteDatabase sQLiteDatabase, p pVar) {
        ArrayList arrayList = new ArrayList();
        Long b2 = b(sQLiteDatabase, pVar);
        if (b2 == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        a(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code"}, "context_id = ?", new String[]{b2.toString()}, (String) null, (String) null, (String) null, String.valueOf(this.f3724e.d())), n.a(arrayList, pVar));
        return arrayList;
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        a(p.a(sQLiteDatabase), q.a());
    }

    private boolean d() {
        return b() * c() >= this.f3724e.e();
    }

    public i a(p pVar, l lVar) {
        c.b.b.a.a.a.a.a("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), lVar.g(), pVar.b());
        long longValue = ((Long) a(v.a(this, pVar, lVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return i.a(longValue, pVar, lVar);
    }

    public Iterable<i> a(p pVar) {
        return (Iterable) a(k.a(this, pVar));
    }

    public <T> T a(b.a<T> aVar) {
        SQLiteDatabase a2 = a();
        c(a2);
        try {
            T execute = aVar.execute();
            a2.setTransactionSuccessful();
            return execute;
        } finally {
            a2.endTransaction();
        }
    }

    public void a(p pVar, long j) {
        a(j.a(j, pVar));
    }

    public void a(Iterable<i> iterable) {
        if (iterable.iterator().hasNext()) {
            a().compileStatement("DELETE FROM events WHERE _id in " + c(iterable)).execute();
        }
    }

    public long b(p pVar) {
        return ((Long) a(a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(c.b.b.a.a.f.a.a(pVar.d()))}), y.a())).longValue();
    }

    public void b(Iterable<i> iterable) {
        if (iterable.iterator().hasNext()) {
            a(x.a("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + c(iterable)));
        }
    }

    public boolean c(p pVar) {
        return ((Boolean) a(z.a(this, pVar))).booleanValue();
    }

    public void close() {
        this.f3721b.close();
    }

    public int l() {
        return ((Integer) a(m.a(this.f3722c.a() - this.f3724e.c()))).intValue();
    }

    public Iterable<p> n() {
        return (Iterable) a(l.a());
    }
}
