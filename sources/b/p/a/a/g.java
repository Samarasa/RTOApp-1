package b.p.a.a;

import android.database.sqlite.SQLiteStatement;
import b.p.a.f;

class g extends f implements f {

    /* renamed from: b  reason: collision with root package name */
    private final SQLiteStatement f2665b;

    g(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f2665b = sQLiteStatement;
    }

    public int c() {
        return this.f2665b.executeUpdateDelete();
    }

    public long d() {
        return this.f2665b.executeInsert();
    }
}
