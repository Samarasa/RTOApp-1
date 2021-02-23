package c.b.b.a.a.c.a;

import android.database.sqlite.SQLiteDatabase;
import c.b.b.a.a.c.a.G;

final /* synthetic */ class F implements G.a {

    /* renamed from: a  reason: collision with root package name */
    private static final F f3733a = new F();

    private F() {
    }

    public static G.a a() {
        return f3733a;
    }

    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
