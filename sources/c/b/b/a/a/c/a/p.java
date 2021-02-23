package c.b.b.a.a.c.a;

import android.database.sqlite.SQLiteDatabase;
import c.b.b.a.a.c.a.B;

final /* synthetic */ class p implements B.c {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f3766a;

    private p(SQLiteDatabase sQLiteDatabase) {
        this.f3766a = sQLiteDatabase;
    }

    public static B.c a(SQLiteDatabase sQLiteDatabase) {
        return new p(sQLiteDatabase);
    }

    public Object a() {
        return this.f3766a.beginTransaction();
    }
}
