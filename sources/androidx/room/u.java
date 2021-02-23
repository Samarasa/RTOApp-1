package androidx.room;

import android.database.Cursor;
import b.p.a.b;
import b.p.a.c;
import java.util.List;

public class u extends c.a {

    /* renamed from: b  reason: collision with root package name */
    private a f1604b;

    /* renamed from: c  reason: collision with root package name */
    private final a f1605c;

    /* renamed from: d  reason: collision with root package name */
    private final String f1606d;

    /* renamed from: e  reason: collision with root package name */
    private final String f1607e;

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f1608a;

        public a(int i) {
            this.f1608a = i;
        }

        /* access modifiers changed from: protected */
        public abstract void a(b bVar);

        /* access modifiers changed from: protected */
        public abstract void b(b bVar);

        /* access modifiers changed from: protected */
        public abstract void c(b bVar);

        /* access modifiers changed from: protected */
        public abstract void d(b bVar);

        /* access modifiers changed from: protected */
        public abstract void e(b bVar);

        /* access modifiers changed from: protected */
        public abstract void f(b bVar);

        /* access modifiers changed from: protected */
        public abstract void g(b bVar);
    }

    public u(a aVar, a aVar2, String str, String str2) {
        super(aVar2.f1608a);
        this.f1604b = aVar;
        this.f1605c = aVar2;
        this.f1606d = str;
        this.f1607e = str2;
    }

    private void e(b bVar) {
        String str = null;
        if (g(bVar)) {
            Cursor a2 = bVar.a(new b.p.a.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (a2.moveToFirst()) {
                    str = a2.getString(0);
                }
            } finally {
                a2.close();
            }
        }
        if (!this.f1606d.equals(str) && !this.f1607e.equals(str)) {
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
        }
    }

    private void f(b bVar) {
        bVar.b("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean g(b bVar) {
        Cursor d2 = bVar.d("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (d2.moveToFirst() && d2.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            d2.close();
        }
    }

    private void h(b bVar) {
        f(bVar);
        bVar.b(t.a(this.f1606d));
    }

    public void a(b bVar) {
        super.a(bVar);
    }

    public void a(b bVar, int i, int i2) {
        b(bVar, i, i2);
    }

    public void b(b bVar, int i, int i2) {
        boolean z;
        List<androidx.room.a.a> a2;
        a aVar = this.f1604b;
        if (aVar == null || (a2 = aVar.f1513d.a(i, i2)) == null) {
            z = false;
        } else {
            this.f1605c.f(bVar);
            for (androidx.room.a.a a3 : a2) {
                a3.a(bVar);
            }
            this.f1605c.g(bVar);
            this.f1605c.e(bVar);
            h(bVar);
            z = true;
        }
        if (!z) {
            a aVar2 = this.f1604b;
            if (aVar2 == null || aVar2.a(i, i2)) {
                throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.f1605c.b(bVar);
            this.f1605c.a(bVar);
        }
    }

    public void c(b bVar) {
        h(bVar);
        this.f1605c.a(bVar);
        this.f1605c.c(bVar);
    }

    public void d(b bVar) {
        super.d(bVar);
        e(bVar);
        this.f1605c.d(bVar);
        this.f1604b = null;
    }
}
