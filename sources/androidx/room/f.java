package androidx.room;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.room.g;
import b.e.d;
import b.p.a.a;
import b.p.a.b;
import b.p.a.e;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;

class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f1546a;

    f(g gVar) {
        this.f1546a = gVar;
    }

    /* JADX INFO: finally extract failed */
    private Set<Integer> a() {
        d dVar = new d();
        Cursor a2 = this.f1546a.f1551e.a((e) new a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        while (a2.moveToNext()) {
            try {
                dVar.add(Integer.valueOf(a2.getInt(0)));
            } catch (Throwable th) {
                a2.close();
                throw th;
            }
        }
        a2.close();
        if (!dVar.isEmpty()) {
            this.f1546a.f1554h.c();
        }
        return dVar;
    }

    public void run() {
        b a2;
        Lock f2 = this.f1546a.f1551e.f();
        Set<Integer> set = null;
        try {
            f2.lock();
            if (!this.f1546a.a()) {
                f2.unlock();
            } else if (!this.f1546a.f1552f.compareAndSet(true, false)) {
                f2.unlock();
            } else if (this.f1546a.f1551e.i()) {
                f2.unlock();
            } else {
                if (this.f1546a.f1551e.f1589g) {
                    a2 = this.f1546a.f1551e.g().a();
                    a2.k();
                    set = a();
                    a2.o();
                    a2.p();
                } else {
                    set = a();
                }
                f2.unlock();
                if (set != null && !set.isEmpty()) {
                    synchronized (this.f1546a.k) {
                        Iterator<Map.Entry<g.b, g.c>> it = this.f1546a.k.iterator();
                        while (it.hasNext()) {
                            ((g.c) it.next().getValue()).a(set);
                        }
                    }
                }
            }
        } catch (SQLiteException | IllegalStateException e2) {
            try {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
            } catch (Throwable th) {
                f2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            a2.p();
            throw th2;
        }
    }
}
